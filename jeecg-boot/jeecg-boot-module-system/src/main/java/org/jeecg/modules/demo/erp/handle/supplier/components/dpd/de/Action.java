package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.io.FileUtil;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.Constants;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.commons.lang.StringUtils;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.constant.LabelConstant;
import org.jeecg.common.constant.ShipmentStatusConstant;
import org.jeecg.common.util.DateUtils;
import org.jeecg.common.util.UUIDGenerator;
import org.jeecg.common.util.pdf.PdfUtil;
import org.jeecg.modules.demo.erp.entity.ErpShipment;
import org.jeecg.modules.demo.erp.entity.ErpShipmentLabel;
import org.jeecg.modules.demo.erp.entity.ErpShipmentParcel;
import org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.Login;
import org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.*;
import org.jeecg.modules.demo.erp.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.soap.SOAPException;
import java.io.File;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @author PLJay
 * @date 2020年5月8日
 * @apiNote 德国dpd相关业务处理
 */
@Slf4j
@Component("DPDDEAction")
public class Action {

    @Autowired
    private IErpShipmentService iErpShipmentService;
    @Autowired
    private IErpChannelService iErpChannelService;
    @Autowired
    private IErpShipmentParcelService iErpShipmentParcelService;
    @Autowired
    private IErpShipmentLogService iErpShipmentLogService;
    @Autowired
    private IErpShipmentLabelService iErpShipmentLabelService;
    @Autowired
    private PdfUtil pdfUtil;

    private XmlMapper xmlMapper=new XmlMapper();

    public Result<?> Create(String id){
        ErpShipment erpShipment = this.iErpShipmentService.getById(id);
        //获取用户渠道信息
        JSONObject jsonObject = iErpChannelService.getTokenContent(id);

        org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub binding;
        try {
            binding = (org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub)
                    new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3Locator().getShipmentServicePublic_4_3_SOAP();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null) {
                jre.getLinkedCause().printStackTrace();
            }
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            Login login = this.getAuth();
            StoreOrders storeOrders = this.setStoreOrders(erpShipment,jsonObject);
            binding=this.setSoapHeader(binding,login,jsonObject);
            org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StoreOrdersResponse value = null;
            log.info("请求报文："+xmlMapper.writeValueAsString(storeOrders));
            value = binding.storeOrders(storeOrders);
            log.info("回执报文："+xmlMapper.writeValueAsString(value));
            StoreOrdersResponseType myStoreOrdersResponseType = value.getOrderResult();
            List<ShipmentResponse> myShipmentResponseList = Arrays.asList(value.getOrderResult().getShipmentResponses());
            if (myShipmentResponseList != null && myShipmentResponseList.size() > 0) {
                for (ShipmentResponse item : myShipmentResponseList) {
                    if (item.getFaults() != null) {
                        // Error Handling
                        List<String> msgList=new ArrayList <>();
                        for (FaultCodeType myFault : item.getFaults()) {
                            msgList.add(myFault.getMessage());
                        }
                        //存入日志表
                        this.iErpShipmentLogService.createShipmentLog(erpShipment.getId(), ShipmentStatusConstant.STATUS_EX,"error","订单提交至管道供应商问题"+StringUtils.join(msgList.toArray(),"&"),StringUtils.join(msgList.toArray(),"&"));
                        return  Result.error("订单提交至管道供应商遇到问题"+StringUtils.join(msgList.toArray(),"&"));
                    }else{
                        //存在日志表
                        this.iErpShipmentLogService.createShipmentLog(erpShipment.getId(), ShipmentStatusConstant.STATUS_CT,"create","订单创建成功","create successfully");
                        // Label PDF
                        String filePath= DateUtils.date_file_path.get().format(new Date());
                        String fileName= UUIDGenerator.generate()+ "."+ LabelConstant.PDF_TYPE;
                        if (myStoreOrdersResponseType.getOutput() != null) {
                            //整张面单
                            String future = pdfUtil.createPdfFromBase64OrUrl(Base64.encode(myStoreOrdersResponseType.getOutput().getContent()), null, filePath, fileName);
                            ErpShipmentLabel erpShipmentLabel = new ErpShipmentLabel();
                            erpShipmentLabel.setContent(filePath+ File.separator+fileName);
                            erpShipmentLabel.setLabelType(LabelConstant.PDF_TYPE_LABEL);
                            erpShipmentLabel.setShipmentId(id);
                            erpShipmentLabel.setTrackNumber(item.getMpsId());
                            this.iErpShipmentLabelService.save(erpShipmentLabel);
                            //拆分面单
                            List <String> fileNames;
                            fileNames = pdfUtil.splitExistFile(filePath, fileName, 1);
                            List <ErpShipmentParcel> erpShipmentParcels = this.iErpShipmentParcelService.selectByMainId(id);
                            int i=0;
                            for (ParcelInformationType myParcelInformation : item.getParcelInformation()) {
                                System.out.println("parcelLabelNumber: " + myParcelInformation.getParcelLabelNumber());
                                erpShipmentLabel = new ErpShipmentLabel();
                                erpShipmentLabel.setContent(filePath+ File.separator+fileNames.get(i));
                                erpShipmentLabel.setLabelType(LabelConstant.PDF_TYPE_LABELS);
                                erpShipmentLabel.setShipmentId(id);
                                erpShipmentLabel.setParcelId(erpShipmentParcels.get(i).getId());
                                erpShipmentLabel.setTrackNumber(myParcelInformation.getParcelLabelNumber());
                                this.iErpShipmentLabelService.save(erpShipmentLabel);
                                i++;
                            }
                            return Result.ok(erpShipment);
                        }

                    }
                }
            }
        } catch (JsonProcessingException | RemoteException | SOAPException e1) {
            this.iErpShipmentLogService.createShipmentLog(erpShipment.getId(), ShipmentStatusConstant.STATUS_EX,"error","订单提交至管道供应商遇到问题"+e1.getMessage(),e1.getMessage());
            return  Result.error("订单提交至管道供应商遇到问题"+e1.getMessage());
        }
        // TBD - validate results
        return null;
    }

    public Result<?> Track(String id){
        return null;
    }


    private Login getAuth() throws RemoteException {
        org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService_2_0_SOAPStub binding;
        try {
            binding = (org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService_2_0_SOAPStub)
                    new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginServicePublic_2_0Locator().getLoginService_2_0_SOAP();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
            {
                jre.getLinkedCause().printStackTrace();
            }
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            return binding.getAuth("sandboxdpd", "xMmshh1", "en_EN");
        }
        catch (org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.AuthenticationFault e1) {
            throw new junit.framework.AssertionFailedError("AuthenticationFault Exception caught: " + e1);
        }
    }

    private StoreOrders setStoreOrders(ErpShipment erpShipment ,JSONObject jsonObject) {

        // printOptions
        PrintOption[] myPrintOptionList = new PrintOption[1];
        PrintOption myPrintOption = new PrintOption();
        myPrintOption.setPaperFormat(PrintOptionPaperFormat.A6);
        myPrintOption.setOutputFormat(OutputFormatType.PDF);
        myPrintOptionList[0] = myPrintOption;

        PrintOptions myPrintOptions = new PrintOptions();
        myPrintOptions.setSplitByParcel(false);
        myPrintOptions.setPrintOption(myPrintOptionList);

        // order (1-30)
        ShipmentServiceData[] DPDOrderDataList = new ShipmentServiceData[1];
        DPDOrderDataList[0] = new ShipmentServiceData();

        // ----------- generalShipmentData
        GeneralShipmentData myGeneralShipmentData = new GeneralShipmentData();
        myGeneralShipmentData.setMpsCustomerReferenceNumber1(erpShipment.getCustomerReference());
        myGeneralShipmentData.setMpsCustomerReferenceNumber2(erpShipment.getShipmentNo());
        myGeneralShipmentData.setIdentificationNumber(erpShipment.getShipmentNo());
        myGeneralShipmentData.setSendingDepot(jsonObject.getString("depot"));
        myGeneralShipmentData.setProduct(GeneralShipmentDataProduct.value1);
        //单位 /10g
        myGeneralShipmentData.setMpsWeight(erpShipment.getShipmentWeight().multiply(new BigDecimal("100")).longValue());

        // ---------------------- sender
        Address mySender = new Address();
        mySender.setName1(erpShipment.getShipperName());
        if(!StringUtils.isEmpty(erpShipment.getShipperCompany())){
            mySender.setName2(erpShipment.getShipperCompany());
        }
        mySender.setStreet(erpShipment.getShipperStreet());
        mySender.setState(null);
        mySender.setCountry(erpShipment.getShipperCountry());
        mySender.setZipCode(erpShipment.getShipperPostcode());
        mySender.setCity(erpShipment.getShipperCity());
        mySender.setCustomerNumber("");
        mySender.setContact("");
        mySender.setPhone(erpShipment.getShipperTelephone());
        myGeneralShipmentData.setSender(mySender);

        // ---------------------- recipient
        Address myRecipient = new Address();
        myRecipient.setName1(erpShipment.getConsigneeName());
        if(!StringUtils.isEmpty(erpShipment.getConsigneeName())){
            myRecipient.setName2(erpShipment.getConsigneeName());
        }
        myRecipient.setStreet(erpShipment.getShipperStreet());
        myRecipient.setHouseNo(erpShipment.getConsigneeHouse());
        myRecipient.setState(null);
        myRecipient.setCountry(erpShipment.getConsigneeCountry());
        myRecipient.setZipCode(erpShipment.getConsigneePostcode());
        myRecipient.setCity(erpShipment.getConsigneeCity());
        myRecipient.setCustomerNumber("");
        myRecipient.setContact("");
        myRecipient.setPhone(erpShipment.getConsigneeTelephone());
        myGeneralShipmentData.setRecipient(myRecipient);

        DPDOrderDataList[0].setGeneralShipmentData(myGeneralShipmentData);

        // ----------- parcels
        List <ErpShipmentParcel> erpShipmentParcels = this.iErpShipmentParcelService.selectByMainId(erpShipment.getId());

        Parcel[] myParcelList = new Parcel[erpShipmentParcels.size()];
        int i=0;
        for (ErpShipmentParcel erpShipmentParcel:erpShipmentParcels) {
            Parcel myParcel = new Parcel();
            myParcel.setCustomerReferenceNumber1(erpShipmentParcel.getParcelReference());
            myParcel.setCustomerReferenceNumber2(erpShipmentParcel.getParcelNo());
            myParcel.setWeight(erpShipmentParcel.getWeight().multiply(new BigDecimal("100")).intValue());
            myParcelList[i] = myParcel;
            i++;
        }
        DPDOrderDataList[0].setParcels(myParcelList);

        // ----------- productAndServiceData
        ProductAndServiceData myProductAndServiceData = new ProductAndServiceData();

        myProductAndServiceData.setOrderType(ProductAndServiceDataOrderType.value1);

        // ---------------------- predict
        Notification myNotification = new Notification();
        myNotification.setChannel(NotificationChannel.value1);
        myNotification.setValue("pljay@outlook.com");
        myNotification.setLanguage("DE");
        myProductAndServiceData.setPredict(myNotification);

        DPDOrderDataList[0].setProductAndServiceData(myProductAndServiceData);

        // storeOrders
        StoreOrders myStoreOrders = new StoreOrders();
        myStoreOrders.setPrintOptions(myPrintOptions);
        myStoreOrders.setOrder(DPDOrderDataList);
        log.info("{}",myStoreOrders);
        return myStoreOrders;
    }

    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub setSoapHeader(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub soapStub, Login login,JSONObject jsonObject) throws SOAPException {
        SOAPHeaderElement header = new SOAPHeaderElement("http://dpd.com/common/service/types/Authentication/2.0",
                "authentication") {
            /**
             *
             */
            private static final long serialVersionUID = 1L;

            @Override
            public void setAttribute(String namespace, String localName, String value) {
                if (!Constants.ATTR_MUST_UNDERSTAND.equals(localName)) {
                    super.setAttribute(namespace, localName, value);
                }
            }
        };

        MessageElement myDelisIDElement = new MessageElement();
        myDelisIDElement.setName("delisId");
        myDelisIDElement.setValue(login.getDelisId());
        header.addChild(myDelisIDElement);

        MessageElement myAuthTokenElement = new MessageElement();
        myAuthTokenElement.setName("authToken");
        myAuthTokenElement.setValue(login.getAuthToken());
        header.addChild(myAuthTokenElement);

        MessageElement myMessageLanguage = new MessageElement();
        myMessageLanguage.setName("messageLanguage");
        myMessageLanguage.setValue(jsonObject.getString("messageLanguage"));
        header.addChild(myMessageLanguage);

        header.setActor(null);
        soapStub.setHeader(header);
        return soapStub;
    }
}
