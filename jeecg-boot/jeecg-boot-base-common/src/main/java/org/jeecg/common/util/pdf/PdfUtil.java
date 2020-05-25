package org.jeecg.common.util.pdf;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jeecg.common.entity.HkdBootConstant;
import org.jeecg.common.exception.JeecgBootException;
import org.jeecg.common.util.DateUtils;
import org.jeecg.common.util.UUIDGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.*;
import java.util.concurrent.Future;

/**
 * @apiNote pdf操作工具类
 * @author PLJay
 * @date 2020年5月6日
 */
@Slf4j
@Component
public class PdfUtil {
    public static void main(String[] args) {
        System.out.println(FileUtil.file("C:\\Users\\PLJay\\Desktop\\DPD_manifest_template2.pdf").getParentFile().getAbsolutePath());
    }
    @Value(value = "${jeecg.path.upload}")
    private String uploadPath;


    /**
     * 异步线程执行
     * 生成pdf
     * @param base64Str
     * @param url
     * @param filePath 父路径
     * @param fileName 文件名
     * @return
     */
    public String createPdfFromBase64OrUrl(String base64Str, String url, String filePath, String fileName){
        Date date = new Date();
        String ctxPath = uploadPath;
        //按日期生成文件夹
        File file = new File(ctxPath + File.separator + filePath+ File.separator );
        if (!file.exists()) {
            file.mkdirs();// 创建文件根目录
        }
        // 生成文件名
        String savePath = file.getPath() + File.separator + fileName;
        File saveFile = new File(savePath);
        if(!StringUtils.isEmpty(base64Str)){
            Base64.decodeToFile(base64Str,saveFile);
        }
        else if(!StringUtils.isEmpty(url)){
            HttpUtil.downloadFile(url,saveFile);
        }else{
            throw  new JeecgBootException("base64Str and url Cannot be empty at the same time!");
        }
        return savePath ;
    }

    /**
     * 指定面单大小拼接
     * width height 为0 默认为A4
     * @param streamOfPDFFiles
     * @param outputStream
     * @param paginate 是否显示页码
     * @param width	pdf宽
     * @param height pdf长
     * @throws IOException
     */
    public  void concatPdf(List<InputStream> streamOfPDFFiles, OutputStream outputStream, boolean paginate,
                                 int width, int height) throws IOException {
        Document document ;
        List<InputStream> pdfs = streamOfPDFFiles;
        if (width > 0 && height > 0) {
            document = new Document(new Rectangle(0, 0, width, height), 0, 0, 0, 0);
        } else {
            document = new Document();
        }
        try {
            pdfs = streamOfPDFFiles;
            List<PdfReader> readers = new ArrayList<PdfReader>();
            int totalPages = 0;
            Iterator<InputStream> iteratorPDFs = pdfs.iterator();
            // Create Readers for the pdfs.
            while (iteratorPDFs.hasNext()) {
                InputStream pdf = iteratorPDFs.next();
                PdfReader pdfReader = new PdfReader(pdf);
                readers.add(pdfReader);
                totalPages += pdfReader.getNumberOfPages();
            }
            // Create a writer for the outputstream
            PdfWriter writer = PdfWriter.getInstance(document, outputStream);

            document.open();
            BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
            // Holds the PDF
            PdfContentByte cb = writer.getDirectContent();
            // data
            PdfImportedPage page;
            int currentPageNumber = 0;
            int pageOfCurrentReaderPDF = 0;
            Iterator<PdfReader> iteratorPDFReader = readers.iterator();

            // Loop through the PDF files and add to the output.
            while (iteratorPDFReader.hasNext()) {
                PdfReader pdfReader = iteratorPDFReader.next();

                // Create a new page in the target for each source page.
                while (pageOfCurrentReaderPDF < pdfReader.getNumberOfPages()) {
                    document.newPage();
                    pageOfCurrentReaderPDF++;
                    currentPageNumber++;
                    page = writer.getImportedPage(pdfReader, pageOfCurrentReaderPDF);
                    cb.addTemplate(page, 0, 0);

                    // Code for pagination.
                    if (paginate) {
                        cb.beginText();
                        cb.setFontAndSize(bf, 9);
                        cb.showTextAligned(PdfContentByte.ALIGN_CENTER, "" + currentPageNumber + " of " + totalPages,
                                520, 5, 0);
                        cb.endText();
                    }
                }
                pageOfCurrentReaderPDF = 0;
            }
            outputStream.flush();
            document.close();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document.isOpen())
            {
                document.close();
            }
            try {
                if (outputStream != null)
                {
                    outputStream.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

    /**
     * 根据面单实际大小进行拼接
     * @param streamOfPDFFiles
     * @param outputStream
     * @throws IOException
     * @throws DocumentException
     */
    public  void concatPdf(List<InputStream> streamOfPDFFiles, OutputStream outputStream) throws IOException, DocumentException {
        List<InputStream> pdfs = streamOfPDFFiles;
        // step 1
        Document document = new Document();
        // step 2
        PdfSmartCopy copy = new PdfSmartCopy(document,outputStream);
        // step 3
        document.open();
        // step 4
        PdfReader reader;
        int n;
        // loop over the documents you want to concatenate
        for (int i = 0; i < pdfs.size(); i++) {
            reader = new PdfReader(pdfs.get(i));
            // loop over the pages in that document
            n = reader.getNumberOfPages();
            for (int page = 0; page < n; ) {
                copy.addPage(copy.getImportedPage(reader, ++page));
            }

            copy.freeReader(reader);
            reader.close();
        }
        copy.setCompressionLevel(9);

        // step 5
        document.close();

    }

    /**
     *
     * @param path 源文件路径
     * @param pdfFileName 文件名
     * @param filePageSize 拆分页数
     */
    public  List<String> splitExistFile(String path,String pdfFileName,int filePageSize) {
        String ctxPath = uploadPath;
        List<String> namelist = new ArrayList<>();
        // 待拆分文件的总页数
        int totalPage;
        // 拆分后的文件数量
        int splitFileNum;
        int pageIndex = 1;
        PdfReader reader = null;
        try {
            String orignName = pdfFileName.split("\\.")[0];
            reader = new PdfReader(ctxPath +File.separator + path +File.separator  + pdfFileName);
            totalPage = reader.getNumberOfPages();
            splitFileNum = totalPage % filePageSize == 0 ? totalPage / filePageSize : totalPage / filePageSize + 1;
            for (int i = 0; i < splitFileNum; i++) {
                String newFileName = orignName + "_" + (i + 1) + ".pdf";

                // 新建一个PDF文件
                Document document = null;
                try {
                    document = new Document();
                    PdfSmartCopy copy = new PdfSmartCopy(document,new FileOutputStream(ctxPath +File.separator + path+File.separator+newFileName));
                    document.open();
                    for (int j = 0; j < filePageSize; j++) {
                        document.newPage();
                        copy.addPage(copy.getImportedPage(reader, pageIndex));
                        pageIndex ++;
                        if (pageIndex > totalPage){
                            break;
                        }

                    }
                    namelist.add(newFileName);
                }  catch (IOException e) {
                    e.printStackTrace();
                } catch (DocumentException e) {
                    e.printStackTrace();
                }catch (Exception e) {
                    e.printStackTrace();
                }finally {

                    //这个地方要特别注意资源关闭的顺序
                    if (document != null){
                        document.close();
                    }
                }
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if(reader!=null) {
                reader.close();
            }
        }
        return namelist;

    }

    /**
     *
     * @param invPath 模板路径
     * @param invFromPath 输出路径
     * @param data 数据
     * @param subSize 分页大小
     * @throws IOException
     * @throws DocumentException
     */
    public  void createPdf(String invFromPath,String invPath,Map<String, Object> data,int subSize) throws IOException, DocumentException {
        String parentPath = FileUtil.file(invPath).getParentFile().getAbsolutePath();
        String pdfPath="";
        ArrayList<InputStream> pdfList = new ArrayList<>();
        List<Map<String, Object>> list = (List<Map<String, Object>>) data.get("items");
        int subCount = list.size();
        int subPageTotal = (subCount / subSize) + ((subCount % subSize > 0) ? 1 : 0);
        // 根据页码取数据
        for (int i = 0, len = subPageTotal - 1; i <= len; i++) {
            // 分页计算
            int fromIndex = i * subSize;
            int toIndex = ((i == len) ? subCount : ((i + 1) * subSize));
            List<Map<String, Object>> subList = list.subList(fromIndex, toIndex);
            //此页数据
            data.put("items", subList);
            //总页数
            data.put("pages", subPageTotal);
            //页码
            data.put("cur", i+1);
            pdfPath=parentPath+File.separator+ UUIDGenerator.generate() +".pdf";
            //生成单页pdf
            createPdf(invFromPath, pdfPath, data);

            pdfList.add(new FileInputStream(pdfPath));
        }
        //拼接pdf
        this.concatPdf(pdfList, FileUtil.getOutputStream(invPath));
        PdfReader pdfReader = new PdfReader(invPath);
        pdfReader.createFakeFontSubsets();
        pdfReader.removeAnnotations();
        pdfReader.removeFields();
        pdfReader.removeUnusedObjects();
        pdfReader.removeUsageRights();
        pdfReader.eliminateSharedStreams();
        pdfReader.close();
    }



    /**
     * 按照模板生成单页pdf
     * @param invFromPath 模板路径
     * @param invPath 输出路径
     * @param data
     * @throws IOException
     * @throws DocumentException
     */
    public  void createPdf(String invFromPath,String invPath, Map<String , Object> data) throws IOException, DocumentException {
        // TODO Auto-generated method stub
        //读取pdf
        PdfReader reader = new PdfReader(invFromPath);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        //将要生成的目标PDF文件名称
        PdfStamper ps = new PdfStamper(reader, bos);
        //设置中文字体
        BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H",BaseFont.NOT_EMBEDDED);

        ArrayList<BaseFont> fontList = new ArrayList<BaseFont>();

        fontList.add(bf);

        //取出报表模板中的所有字段
        AcroFields fields = ps.getAcroFields();
        fields.setSubstitutionFonts(fontList);
        //对表单数据进行赋值
        fillData(fields, ps, data);
        //必须要调用这个，否则文档不会生成的
        ps.setFreeTextFlattening(true);
        ps.setFormFlattening(true);
        ps.setFullCompression();
        ps.close();
        BufferedOutputStream fos = FileUtil.getOutputStream(invPath);

        fos.write(bos.toByteArray());

        fos.flush();

        fos.close();

        bos.close();

    }

    /**
     *
     * @param fields
     * @param ps
     * @param data
     * @throws IOException
     * @throws DocumentException
     */
    private  void fillData(AcroFields fields, PdfStamper ps, Map<String, Object> data) throws IOException, DocumentException {
        // 为字段赋值,注意字段名称是区分大小写的
        for (String key : data.keySet()) {
            if(StringUtils.equals("items", key)) {
                List<Map<String, Object>> items = (List<Map<String, Object>>) data.get(key);
                int i=1;
                for (Map<String, Object> item : items) {
                    for(String key2:item.keySet()) {
                        String value = item.get(key2).toString();
                        fields.setField(key2+i, value);
                    }
                    i++;

                }
            }else {
                String value = data.get(key).toString();
                fields.setField(key, value);
            }

        }

    }


}
