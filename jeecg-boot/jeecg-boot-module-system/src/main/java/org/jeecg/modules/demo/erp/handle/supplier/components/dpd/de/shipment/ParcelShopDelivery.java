/**
 * ParcelShopDelivery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles parcel shop delivery data.
 */
public class ParcelShopDelivery  implements java.io.Serializable {
    /* Parcel shop ID for parcel shop delivery.
     * Can be obtained from parcel shop finder. Assumes that parameter type
     * of
     * personal delivery is filled with a value from 3 to 5,
     * which means parcel shop delivery. Mandatory in this case. */
    private long parcelShopId;

    /* Contains data for personal notification for parcel shop consignments. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification parcelShopNotification;

    public ParcelShopDelivery() {
    }

    public ParcelShopDelivery(
           long parcelShopId,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification parcelShopNotification) {
           this.parcelShopId = parcelShopId;
           this.parcelShopNotification = parcelShopNotification;
    }


    /**
     * Gets the parcelShopId value for this ParcelShopDelivery.
     * 
     * @return parcelShopId   * Parcel shop ID for parcel shop delivery.
     * Can be obtained from parcel shop finder. Assumes that parameter type
     * of
     * personal delivery is filled with a value from 3 to 5,
     * which means parcel shop delivery. Mandatory in this case.
     */
    public long getParcelShopId() {
        return parcelShopId;
    }


    /**
     * Sets the parcelShopId value for this ParcelShopDelivery.
     * 
     * @param parcelShopId   * Parcel shop ID for parcel shop delivery.
     * Can be obtained from parcel shop finder. Assumes that parameter type
     * of
     * personal delivery is filled with a value from 3 to 5,
     * which means parcel shop delivery. Mandatory in this case.
     */
    public void setParcelShopId(long parcelShopId) {
        this.parcelShopId = parcelShopId;
    }


    /**
     * Gets the parcelShopNotification value for this ParcelShopDelivery.
     * 
     * @return parcelShopNotification   * Contains data for personal notification for parcel shop consignments.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification getParcelShopNotification() {
        return parcelShopNotification;
    }


    /**
     * Sets the parcelShopNotification value for this ParcelShopDelivery.
     * 
     * @param parcelShopNotification   * Contains data for personal notification for parcel shop consignments.
     */
    public void setParcelShopNotification(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification parcelShopNotification) {
        this.parcelShopNotification = parcelShopNotification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelShopDelivery)) return false;
        ParcelShopDelivery other = (ParcelShopDelivery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.parcelShopId == other.getParcelShopId() &&
            ((this.parcelShopNotification==null && other.getParcelShopNotification()==null) || 
             (this.parcelShopNotification!=null &&
              this.parcelShopNotification.equals(other.getParcelShopNotification())));
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
        _hashCode += new Long(getParcelShopId()).hashCode();
        if (getParcelShopNotification() != null) {
            _hashCode += getParcelShopNotification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParcelShopDelivery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "parcelShopDelivery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelShopId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelShopId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelShopNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelShopNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "notification"));
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
