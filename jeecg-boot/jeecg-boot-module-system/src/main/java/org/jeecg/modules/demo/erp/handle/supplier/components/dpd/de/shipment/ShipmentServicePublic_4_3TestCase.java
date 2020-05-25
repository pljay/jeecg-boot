/**
 * ShipmentServicePublic_4_3TestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.io.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.Constants;
import org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.Login;
import sun.rmi.runtime.Log;

import javax.xml.soap.SOAPException;
import java.io.FileOutputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class ShipmentServicePublic_4_3TestCase extends junit.framework.TestCase {
    public ShipmentServicePublic_4_3TestCase(java.lang.String name) {
        super(name);
    }

    public void testShipmentServicePublic_4_3_SOAPWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3Locator().getShipmentServicePublic_4_3_SOAPAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3Locator().getServiceName());
        assertTrue(service != null);
    }

    public void test1ShipmentServicePublic_4_3_SOAPStoreOrders() throws Exception {
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
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            Login login = this.getAuth();
            StoreOrders storeOrders = this.setStoreOrders();
            binding=this.setSoapHeader(binding,login);
            org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StoreOrdersResponse value = null;
            value = binding.storeOrders(storeOrders);
            StoreOrdersResponseType myStoreOrdersResponseType = new StoreOrdersResponseType();
            myStoreOrdersResponseType = value.getOrderResult();

            List<ShipmentResponse> myShipmentResponseList = new ArrayList<ShipmentResponse>();
            myShipmentResponseList = Arrays.asList(value.getOrderResult().getShipmentResponses());
            if (myShipmentResponseList != null && myShipmentResponseList.size() > 0) {
                for (ShipmentResponse item : myShipmentResponseList) {
                    if (item.getFaults() != null) {
                        // Error Handling
                        for (FaultCodeType myFault : item.getFaults()) {
                            System.out.println("FAULT CODE Shipment Service 4.3: " + myFault.getFaultCode());
                            System.out.println("FAULT STRING Shipment Service 4.3: " + myFault.getMessage() + "\n\n");
                        }
                    }
                    {
                        // Label PDF
                        if (myStoreOrdersResponseType.getOutput() != null) {
                            Base64.decodeToFile(Base64.encode(myStoreOrdersResponseType.getOutput().getContent()), FileUtil.file("e://test//Test-PDF.pdf"));
                        }
                        log.info(Base64.encode(myStoreOrdersResponseType.getOutput().getContent()));
                        System.out.println("identificationNumber: " + item.getIdentificationNumber());
                        System.out.println("mpsId: " + item.getMpsId());
                        for (ParcelInformationType myParcelInformation : item.getParcelInformation()) {
                            System.out.println("parcelLabelNumber: " + myParcelInformation.getParcelLabelNumber());
                        }
                    }
                }
            }
        } catch (org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.AuthenticationFault e1) {
            throw new junit.framework.AssertionFailedError("AuthenticationFault Exception caught: " + e1);
        }
        // TBD - validate results
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
        assertNotNull("binding is null", binding);

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

    private StoreOrders setStoreOrders() {
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
        myGeneralShipmentData.setMpsCustomerReferenceNumber1("Article 123");
        myGeneralShipmentData.setMpsCustomerReferenceNumber2("Order 456");
        myGeneralShipmentData.setIdentificationNumber("Article 456");
        myGeneralShipmentData.setSendingDepot("0192");
        myGeneralShipmentData.setProduct(GeneralShipmentDataProduct.value1);
        myGeneralShipmentData.setMpsWeight(Long.valueOf(500));

        // ---------------------- sender
        Address mySender = new Address();
        mySender.setName1("test");
        mySender.setName2("pljay");
        mySender.setStreet("Am Bergsteig");
        mySender.setHouseNo("1");
        mySender.setState(null);
        mySender.setCountry("DE");
        mySender.setZipCode("92224");
        mySender.setCity("Amberg");
        mySender.setCustomerNumber("");
        mySender.setContact("");
        mySender.setPhone("6046558676");
        myGeneralShipmentData.setSender(mySender);

        // ---------------------- recipient
        Address myRecipient = new Address();
        myRecipient.setName1("DPD Deutschland GmbH");
        myRecipient.setName2("");
        myRecipient.setStreet("Wailandtstr.");
        myRecipient.setHouseNo("1");
        myRecipient.setState(null);
        myRecipient.setCountry("DE");
        myRecipient.setZipCode("63741");
        myRecipient.setCity("Aschaffenburg");
        myRecipient.setCustomerNumber("");
        myRecipient.setContact("");
        myRecipient.setPhone("");
        myGeneralShipmentData.setRecipient(myRecipient);

        DPDOrderDataList[0].setGeneralShipmentData(myGeneralShipmentData);

        // ----------- parcels
        Parcel[] myParcelList = new Parcel[2];
        Parcel myParcel = new Parcel();
        myParcel.setCustomerReferenceNumber1("Article 123");
        myParcel.setCustomerReferenceNumber2("Order 456");
        myParcel.setWeight(500);
        myParcel.setContent("Smartphones");
        myParcelList[0] = myParcel;
        myParcelList[1] = myParcel;
        DPDOrderDataList[0].setParcels(myParcelList);

        // ----------- productAndServiceData
        ProductAndServiceData myProductAndServiceData = new ProductAndServiceData();

        myProductAndServiceData.setOrderType(ProductAndServiceDataOrderType.value1);

        /*// ---------------------- pickup
        Pickup myPickup = new Pickup();
        myPickup.setTour(0);
        myPickup.setQuantity(1);
        myPickup.setDate(20200508);
        myPickup.setDay(5);
        myPickup.setFromTime1(1300);
        myPickup.setToTime1(1700);
        myPickup.setExtraPickup(1);

        // --------------------------------- collectionrequestaddress
        Address myCollectionRequestAddress = new Address();
        myCollectionRequestAddress.setName1("test");
        myCollectionRequestAddress.setName2("pljay");
        myCollectionRequestAddress.setStreet("Am Bergsteig");
        myCollectionRequestAddress.setHouseNo("1");
        myCollectionRequestAddress.setState(null);
        myCollectionRequestAddress.setCountry("DE");
        myCollectionRequestAddress.setZipCode("92224");
        myCollectionRequestAddress.setCity("Amberg");
        myCollectionRequestAddress.setCustomerNumber("");
        myCollectionRequestAddress.setContact("");
        myCollectionRequestAddress.setPhone("6046558676");
        myPickup.setCollectionRequestAddress(myCollectionRequestAddress);

        myProductAndServiceData.setPickup(myPickup);
*/
        // ---------------------- predict
        Notification myNotification = new Notification();
        myNotification.setChannel(NotificationChannel.value1);
        myNotification.setValue("m.mustermann@dpd.de");
        myNotification.setLanguage("DE");
        myProductAndServiceData.setPredict(myNotification);

        DPDOrderDataList[0].setProductAndServiceData(myProductAndServiceData);

        // storeOrders
        StoreOrders myStoreOrders = new StoreOrders();
        myStoreOrders.setPrintOptions(myPrintOptions);
        myStoreOrders.setOrder(DPDOrderDataList);
        return myStoreOrders;
    }

    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub setSoapHeader(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub soapStub, Login login) throws SOAPException {
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
        myDelisIDElement.setValue("sandboxdpd");
        header.addChild(myDelisIDElement);

        MessageElement myAuthTokenElement = new MessageElement();
        myAuthTokenElement.setName("authToken");
        myAuthTokenElement.setValue(login.getAuthToken());
        header.addChild(myAuthTokenElement);

        MessageElement myMessageLanguage = new MessageElement();
        myMessageLanguage.setName("messageLanguage");
        myMessageLanguage.setValue("de_DE");
        header.addChild(myMessageLanguage);

        header.setActor(null);
        soapStub.setHeader(header);
        return soapStub;
    }
}
