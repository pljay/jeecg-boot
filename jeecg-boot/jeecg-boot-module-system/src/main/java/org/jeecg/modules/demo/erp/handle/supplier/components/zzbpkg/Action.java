package org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.http.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.constant.LabelConstant;
import org.jeecg.common.constant.ShipmentStatusConstant;
import org.jeecg.common.entity.HkdBootConstant;
import org.jeecg.common.util.DateUtils;
import org.jeecg.common.util.UUIDGenerator;
import org.jeecg.common.util.jsonschema.JsSchemaUtil;
import org.jeecg.common.util.pdf.PdfUtil;
import org.jeecg.modules.demo.erp.entity.*;
import org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.lable.LabelRequest;
import org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.lable.LabelResponse;
import org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.shipment.ShipmentRequest;
import org.jeecg.modules.demo.erp.handle.supplier.components.zzbpkg.shipment.ShipmentResponse;
import org.jeecg.modules.demo.erp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.File;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @apiNote 服务商管道接口请求
 * @author PLJay
 * @date 2020年4月28日
 * @version v1.0
 */
@Component("ZZPCKAction")
@Slf4j
public class Action {


    @Autowired
    private IErpShipmentService iErpShipmentService;
    @Autowired
    private IErpChannelService iErpChannelService;
    @Autowired
    private IErpShipmentParcelService iErpShipmentParcelService;
    @Autowired
    private IErpShipmentProductService iErpShipmentProductService;
    @Autowired
    private IErpShipmentLogService iErpShipmentLogService;

    @Autowired
    private IErpShipmentLabelService iErpShipmentLabelService;
    @Autowired
    private PdfUtil pdfUtil;

    @Autowired
    private JsSchemaUtil jsSchemaUtil;


    /**
     * 创建
     * 格式化
     * 请求参数
     * @param id 订单id
     * @return ShipmentResponse
     */
    public Result<?> Create(String id){
        ErpShipment erpShipment = this.iErpShipmentService.getById(id);
        //获取用户渠道信息
        JSONObject jsonObject = iErpChannelService.getTokenContent(id);
        ShipmentRequest shipmentRequest = new ShipmentRequest();
        shipmentRequest.setValidation(this.validate(jsonObject));
        shipmentRequest.setShipment(this.shipment(jsonObject,erpShipment));
        HttpRequest httpRequest = HttpUtil.createPost(jsonObject.getString("createUrl"));
        httpRequest.setConnectionTimeout(4000);
        httpRequest.contentType(ContentType.build(ContentType.JSON.toString(), Charset.forName("utf-8")));
        String jsonParam=JSON.toJSON(shipmentRequest).toString();
        if(jsSchemaUtil.JsonSchemaValidate(jsonParam,ShipmentRequest.class)){
            HttpResponse httpResponse = httpRequest.body(jsonParam).execute();
            log.info("订单创建请求："+httpRequest);
            log.info("订单创建回执："+httpResponse);
            if(HttpStatus.HTTP_OK==httpResponse.getStatus()){
                ShipmentResponse shipmentResponse = JSON.parseObject(httpResponse.body(), ShipmentResponse.class);
                if(shipmentResponse.getStatus()==1){
                    ShipmentResponse.DataBean dataBean = shipmentResponse.getData();
                    //将订单外联单号更新
                    erpShipment.setShipmentOutboundId(dataBean.getShipment().getShipment_id());
                    this.iErpShipmentService.saveOrUpdate(erpShipment);
                    //存入订单日志表 创建订单成功
                    this.iErpShipmentLogService.createShipmentLog(erpShipment.getId(), ShipmentStatusConstant.STATUS_CT,"create","订单创建成功","create successfully");
                    this.getLabel(id,jsonObject);
                    return Result.ok(erpShipment);
                }else {
                    this.iErpShipmentLogService.createShipmentLog(erpShipment.getId(), ShipmentStatusConstant.STATUS_EX,"error",shipmentResponse.getInfo(),"create fail");
                    return Result.error(shipmentResponse.getInfo());
                }
            }else{
                this.iErpShipmentLogService.createShipmentLog(erpShipment.getId(), ShipmentStatusConstant.STATUS_EX,"error","网络异常","create fail");
                Result.error("网络异常");
            }
        }
        return  Result.ok();
    }

    /**
     * 获取单号及其面单
     * @param   id 订单id
     * @param   jsonObject 配置信息
     * @return
     * @throws Exception
     */
    public Result<?> getLabel(String id, JSONObject jsonObject) {
        ErpShipment erpShipment = this.iErpShipmentService.getById(id);
        String labelsUrl =jsonObject.getString("labelUrl");
        String accessToken =jsonObject.getString("accessToken");
        LabelRequest labelRequest = new LabelRequest();
        LabelRequest.ValidationBean validationBean = new LabelRequest.ValidationBean();
        validationBean.setAccess_token(accessToken);
        labelRequest.setValidation(validationBean);
        LabelRequest.ShipmentBean shipmentBean = new LabelRequest.ShipmentBean();
        shipmentBean.setShipment_id(erpShipment.getShipmentOutboundId());
        labelRequest.setShipment(shipmentBean);
        HttpRequest httpRequest = HttpUtil.createPost(labelsUrl);
        httpRequest.setConnectionTimeout(4000);
        httpRequest.contentType(ContentType.build(ContentType.JSON.toString(), Charset.forName("utf-8")));
        HttpResponse httpResponse = httpRequest.body(JSON.toJSON(labelRequest).toString()).execute();
        log.info("面单单号抓取请求："+httpRequest);
        log.info("面单单号抓取回执："+httpResponse);
        if(HttpStatus.HTTP_OK==httpResponse.getStatus()){
            try
            {
                //暂停五秒继续执行
                Thread.sleep(5000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            LabelResponse labelResponse = JSON.parseObject(httpResponse.body(), LabelResponse.class);
            if(labelResponse.getStatus()==1){
                LabelResponse.DataBean.ShipmentBean shipment = labelResponse.getData().getShipment();
                String filePath= DateUtils.date_file_path.get().format(new Date());
                String fileName= UUIDGenerator.generate()+ File.separator+ LabelConstant.PDF_TYPE;
                //所有面单合并 url
                String singlePdf = shipment.getSingle_pdf();
                //主单号
                String trackingNumber = shipment.getTracking_number();
                pdfUtil.createPdfFromBase64OrUrl(null,singlePdf,filePath,fileName);
                ErpShipmentLabel erpShipmentLabel = new ErpShipmentLabel();
                erpShipmentLabel.setContent(filePath+File.separator+fileName);
                erpShipmentLabel.setLabelType(LabelConstant.PDF_TYPE_LABELS);
                erpShipmentLabel.setShipmentId(id);
                erpShipmentLabel.setTrackNumber(trackingNumber);
                this.iErpShipmentLabelService.save(erpShipmentLabel);
                List <LabelResponse.DataBean.ShipmentBean.ParcelsBean> parcels = shipment.getParcels();
                if(!CollectionUtil.isEmpty(parcels)){
                    List <ErpShipmentLabel> labels = new ArrayList <>();
                    List <ErpShipmentParcel> erpShipmentParcels = this.iErpShipmentParcelService.selectByMainId(id);
                    int i=0;
                    for (LabelResponse.DataBean.ShipmentBean.ParcelsBean parcelsBean:parcels) {
                        erpShipmentLabel=new ErpShipmentLabel();
                        //单号
                        String number = parcelsBean.getTracking_number();
                        //单个面单
                        String labelUrl = parcelsBean.getLabel_url();
                        fileName= UUIDGenerator.generate()+ File.separator+ LabelConstant.PDF_TYPE;
                        pdfUtil.createPdfFromBase64OrUrl(null,labelUrl,filePath,fileName);
                        erpShipmentLabel.setTrackNumber(number);
                        erpShipmentLabel.setContent(filePath+File.separator+fileName);
                        erpShipmentLabel.setLabelType(LabelConstant.PDF_TYPE_LABEL);
                        erpShipmentLabel.setShipmentId(id);
                        erpShipmentLabel.setParcelId(erpShipmentParcels.get(i).getId());
                        labels.add(erpShipmentLabel);
;                        i++;
                    }
                    //批量保存面单信息
                    this.iErpShipmentLabelService.saveBatch(labels);
                }
            }else{
                return Result.error(labelResponse.getInfo());
            }
        }else {
            return Result.error("网络错误");
        }
        return Result.ok();
    }


    /**
     * 创建validate
     * @param jsonObject
     * @return
     */
    private ShipmentRequest.ValidationBean validate(JSONObject jsonObject){
        ShipmentRequest.ValidationBean validationBean = new ShipmentRequest.ValidationBean();
        validationBean.setAccess_token(jsonObject.getString("accessToken"));
        return validationBean;
    }

    /**
     * 创建shipment
     * @param jsonObject 渠道配置信息
     * @param erpShipment 订单信息
     * @return
     */
    private ShipmentRequest.ShipmentBean shipment(JSONObject jsonObject,ErpShipment erpShipment){
        ShipmentRequest.ShipmentBean shipmentBean = new ShipmentRequest.ShipmentBean();
        shipmentBean.setService(jsonObject.getString("service"));
        shipmentBean.setClient_reference(erpShipment.getCustomerReference());
        shipmentBean.setStore_id(null);
        shipmentBean.setAttrs(null);
        shipmentBean.setExport_scc(0);
        shipmentBean.setImport_scc(0);
        shipmentBean.setRemark("test");
        //发件人信息
        ShipmentRequest.ShipmentBean.FromAddressBean from_address =new  ShipmentRequest.ShipmentBean.FromAddressBean();
        from_address.setName(erpShipment.getShipperName());
        from_address.setCompany(erpShipment.getShipperCompany());
        from_address.setMobile(erpShipment.getShipperMobile());
        from_address.setTel(erpShipment.getShipperTelephone());
        from_address.setEmail(erpShipment.getShipperEmail());
        from_address.setCountry(erpShipment.getShipperCountry());
        from_address.setState(erpShipment.getShipperState());
        from_address.setState_code(null);
        from_address.setCity(erpShipment.getShipperCity());
        from_address.setPostcode(erpShipment.getShipperPostcode());
        from_address.setAddress_1(erpShipment.getShipperAddress());
        from_address.setAddress_2(erpShipment.getShipperStreet());
        from_address.setAddress_3(null);
        shipmentBean.setFrom_address(from_address);
        //收件人信息
        ShipmentRequest.ShipmentBean.ToAddressBean to_address = new ShipmentRequest.ShipmentBean.ToAddressBean();
        to_address.setName(erpShipment.getConsigneeName());
        to_address.setCompany(erpShipment.getConsigneeCompany());
        to_address.setMobile(erpShipment.getConsigneeMobile());
        to_address.setTel(erpShipment.getConsigneeTelephone());
        to_address.setEmail(erpShipment.getConsigneeEmail());
        to_address.setCountry(erpShipment.getConsigneeCountry());
        to_address.setState(erpShipment.getConsigneeState());
        to_address.setState_code(null);
        to_address.setCity(erpShipment.getConsigneeCity());
        to_address.setPostcode(erpShipment.getConsigneePostcode());
        to_address.setAddress_1(erpShipment.getConsigneeAddress1());
        to_address.setAddress_2(erpShipment.getConsigneeAddress2());
        to_address.setAddress_3(erpShipment.getConsigneeStreet()+","+erpShipment.getConsigneeHouse());
        shipmentBean.setTo_address(to_address);
        //货箱信息
        List<ShipmentRequest.ShipmentBean.ParcelsBean> parcels = new ArrayList <>();
        List <ErpShipmentParcel> erpShipmentParcels = iErpShipmentParcelService.selectByMainId(erpShipment.getId());
        for (ErpShipmentParcel erpShipmentParcel:erpShipmentParcels
        ) {
            ShipmentRequest.ShipmentBean.ParcelsBean parcelsBean = new ShipmentRequest.ShipmentBean.ParcelsBean();
            parcelsBean.setClient_height(erpShipmentParcel.getHeight().toPlainString());
            parcelsBean.setClient_length(erpShipmentParcel.getLength().toPlainString());
            parcelsBean.setClient_width(erpShipmentParcel.getWidth().toPlainString());
            parcelsBean.setClient_weight(erpShipmentParcel.getWeight().toPlainString());
            parcelsBean.setNumber(erpShipmentParcel.getParcelReference());
            parcels.add(parcelsBean);
        }
        shipmentBean.setParcels(parcels);
        //产品信息
        List <ShipmentRequest.ShipmentBean.DeclarationsBean> declarations = new ArrayList <>();
        List <ErpShipmentProduct> erpShipmentProducts = iErpShipmentProductService.selectByMainId(erpShipment.getId());
        for (ErpShipmentProduct erpShipmentProduct:erpShipmentProducts
        ) {
            ShipmentRequest.ShipmentBean.DeclarationsBean declarationsBean = new ShipmentRequest.ShipmentBean.DeclarationsBean();
            declarationsBean.setAsin(null);
            declarationsBean.setBrand(erpShipmentProduct.getEnBrand());
            declarationsBean.setDuty_rate(null);
            declarationsBean.setFnsku(erpShipmentProduct.getFgnSku());
            declarationsBean.setHscode(erpShipmentProduct.getHscode());
            declarationsBean.setMaterial(erpShipmentProduct.getEnMaterial());
            declarationsBean.setName_en(erpShipmentProduct.getEnName());
            declarationsBean.setName_zh(erpShipmentProduct.getCnName());
            declarationsBean.setParcel_number(erpShipmentProduct.getParcelReference());
            declarationsBean.setPhoto_url(null);
            declarationsBean.setPhotos(null);
            declarationsBean.setQty(erpShipmentProduct.getQuantity());
            declarationsBean.setSale_price(erpShipmentProduct.getUnitPrice());
            declarationsBean.setSize(null);
            declarationsBean.setSku(erpShipmentProduct.getSku());
            declarationsBean.setUnit_value(erpShipmentProduct.getUnitPrice());
            declarationsBean.setUsage(erpShipmentProduct.getEnUsage());
            declarationsBean.setWeight(erpShipmentProduct.getUnitWeight().multiply(new BigDecimal(erpShipmentProduct.getQuantity())));
            declarations.add(declarationsBean);
        }
        shipmentBean.setDeclarations(declarations);
        shipmentBean.setParcel_count(parcels.size());
        return shipmentBean;
    }

}
