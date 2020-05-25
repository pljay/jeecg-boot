/**
 * ShipmentService_4_3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;

public interface ShipmentService_4_3 extends java.rmi.Remote {

    /**
     * Stores up to 30 shipments and creates corresponding shipment
     * documents.
     * 
     * Sample request:
     * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
     * xmlns:ns="http://dpd.com/common/service/types/Authentication/2.0"
     * xmlns:ns1="http://dpd.com/common/service/types/ShipmentService/4.3">
     * <soapenv:Header>
     *       <ns:authentication>
     *          <delisId><your delisId></delisId>
     *          <authToken><your authToken></authToken>
     *          <messageLanguage>de_DE</messageLanguage>
     *       </ns:authentication>
     *    </soapenv:Header>
     *    <soapenv:Body>
     *       <ns1:storeOrders>
     *          <printOptions>
     *             <printOption>
     *                <outputFormat>PDF</outputFormat>
     *                <paperFormat>A4</paperFormat>
     *             </printOption>
     *          </printOptions>
     *          <order>
     *             <generalShipmentData>
     *                 <identificationNumber>77777</identificationNumber>
     * 	<sendingDepot>0163</sendingDepot>
     *                	<product>CL</product>
     *                	<mpsCompleteDelivery>0</mpsCompleteDelivery>
     *                	<sender>
     * 	               <name1>Abholer1</name1>
     * 	               <street>Strasse 1</street>
     * 	               <country>DE</country>
     * 	               <zipCode>11111</zipCode>
     * 	               <city>Ort1</city>
     * 	               <customerNumber>12345679</customerNumber>
     *                	</sender>
     *                	<recipient>
     * 	               <name1>Test-Empfaenger</name1>
     * 	               <street>Test-Strasse</street>
     * 	               <state>BY</state>
     * 	               <country>DE</country>
     * 	               <zipCode>63741</zipCode>
     * 	               <city>Aschaffenburg</city>
     *                	</recipient>
     *             </generalShipmentData>
     *            	<parcels>
     *                <parcelLabelNumber><your parcelLabelNumber></parcelLabelNumber>
     * 	</parcels>
     *            	<productAndServiceData>
     *                <orderType>consignment</orderType>
     *            	</productAndServiceData>
     *          </order>
     *       </ns1:storeOrders>
     *    </soapenv:Body>
     * </soapenv:Envelope>
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StoreOrdersResponse storeOrders(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StoreOrders parameters) throws java.rmi.RemoteException, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.AuthenticationFault;
}
