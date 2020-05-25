/**
 * StoreOrdersResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles storeOrders response data.
 */
public class StoreOrdersResponseType  implements java.io.Serializable {
    /* Contains parcel label data in bytes. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType output;

    /* Contains response data for every shipment order. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentResponse[] shipmentResponses;

    public StoreOrdersResponseType() {
    }

    public StoreOrdersResponseType(
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType output,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentResponse[] shipmentResponses) {
           this.output = output;
           this.shipmentResponses = shipmentResponses;
    }


    /**
     * Gets the output value for this StoreOrdersResponseType.
     * 
     * @return output   * Contains parcel label data in bytes.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType getOutput() {
        return output;
    }


    /**
     * Sets the output value for this StoreOrdersResponseType.
     * 
     * @param output   * Contains parcel label data in bytes.
     */
    public void setOutput(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType output) {
        this.output = output;
    }


    /**
     * Gets the shipmentResponses value for this StoreOrdersResponseType.
     * 
     * @return shipmentResponses   * Contains response data for every shipment order.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentResponse[] getShipmentResponses() {
        return shipmentResponses;
    }


    /**
     * Sets the shipmentResponses value for this StoreOrdersResponseType.
     * 
     * @param shipmentResponses   * Contains response data for every shipment order.
     */
    public void setShipmentResponses(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentResponse[] shipmentResponses) {
        this.shipmentResponses = shipmentResponses;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentResponse getShipmentResponses(int i) {
        return this.shipmentResponses[i];
    }

    public void setShipmentResponses(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentResponse _value) {
        this.shipmentResponses[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoreOrdersResponseType)) return false;
        StoreOrdersResponseType other = (StoreOrdersResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              this.output.equals(other.getOutput()))) &&
            ((this.shipmentResponses==null && other.getShipmentResponses()==null) || 
             (this.shipmentResponses!=null &&
              java.util.Arrays.equals(this.shipmentResponses, other.getShipmentResponses())));
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
        if (getOutput() != null) {
            _hashCode += getOutput().hashCode();
        }
        if (getShipmentResponses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentResponses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentResponses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoreOrdersResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "storeOrdersResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "OutputType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipmentResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "shipmentResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
