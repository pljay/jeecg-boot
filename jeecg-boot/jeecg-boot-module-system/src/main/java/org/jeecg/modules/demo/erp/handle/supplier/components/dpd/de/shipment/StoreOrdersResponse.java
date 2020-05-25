/**
 * StoreOrdersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Contains return object.
 */
public class StoreOrdersResponse  implements java.io.Serializable {
    /* Contains return object. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StoreOrdersResponseType orderResult;

    public StoreOrdersResponse() {
    }

    public StoreOrdersResponse(
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StoreOrdersResponseType orderResult) {
           this.orderResult = orderResult;
    }


    /**
     * Gets the orderResult value for this StoreOrdersResponse.
     * 
     * @return orderResult   * Contains return object.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StoreOrdersResponseType getOrderResult() {
        return orderResult;
    }


    /**
     * Sets the orderResult value for this StoreOrdersResponse.
     * 
     * @param orderResult   * Contains return object.
     */
    public void setOrderResult(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StoreOrdersResponseType orderResult) {
        this.orderResult = orderResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoreOrdersResponse)) return false;
        StoreOrdersResponse other = (StoreOrdersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderResult==null && other.getOrderResult()==null) || 
             (this.orderResult!=null &&
              this.orderResult.equals(other.getOrderResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOrderResult() != null) {
            _hashCode += getOrderResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoreOrdersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "storeOrdersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "storeOrdersResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
