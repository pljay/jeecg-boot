/**
 * StoreOrders.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Stores up to 30 shipments and creates corresponding shipment documents.
 */
public class StoreOrders  implements java.io.Serializable {
    /* The Options which should be used for parcel printing. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOptions printOptions;

    /* Contains the whole data for the shipments. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServiceData[] order;

    public StoreOrders() {
    }

    public StoreOrders(
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOptions printOptions,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServiceData[] order) {
           this.printOptions = printOptions;
           this.order = order;
    }


    /**
     * Gets the printOptions value for this StoreOrders.
     * 
     * @return printOptions   * The Options which should be used for parcel printing.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOptions getPrintOptions() {
        return printOptions;
    }


    /**
     * Sets the printOptions value for this StoreOrders.
     * 
     * @param printOptions   * The Options which should be used for parcel printing.
     */
    public void setPrintOptions(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOptions printOptions) {
        this.printOptions = printOptions;
    }


    /**
     * Gets the order value for this StoreOrders.
     * 
     * @return order   * Contains the whole data for the shipments.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServiceData[] getOrder() {
        return order;
    }


    /**
     * Sets the order value for this StoreOrders.
     * 
     * @param order   * Contains the whole data for the shipments.
     */
    public void setOrder(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServiceData[] order) {
        this.order = order;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServiceData getOrder(int i) {
        return this.order[i];
    }

    public void setOrder(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServiceData _value) {
        this.order[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoreOrders)) return false;
        StoreOrders other = (StoreOrders) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printOptions==null && other.getPrintOptions()==null) || 
             (this.printOptions!=null &&
              this.printOptions.equals(other.getPrintOptions()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              java.util.Arrays.equals(this.order, other.getOrder())));
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
        if (getPrintOptions() != null) {
            _hashCode += getPrintOptions().hashCode();
        }
        if (getOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrder(), i);
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
        new org.apache.axis.description.TypeDesc(StoreOrders.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "storeOrders"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "printOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "shipmentServiceData"));
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
