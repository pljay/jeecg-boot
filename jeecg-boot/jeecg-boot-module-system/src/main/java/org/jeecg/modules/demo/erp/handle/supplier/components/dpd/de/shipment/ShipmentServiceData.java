/**
 * ShipmentServiceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles shipment service data.
 */
public class ShipmentServiceData  implements java.io.Serializable {
    /* Contains general data for a shipment. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.GeneralShipmentData generalShipmentData;

    /* Contains information for the parcels. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Parcel[] parcels;

    /* Contains special data for a shipment. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProductAndServiceData productAndServiceData;

    public ShipmentServiceData() {
    }

    public ShipmentServiceData(
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.GeneralShipmentData generalShipmentData,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Parcel[] parcels,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProductAndServiceData productAndServiceData) {
           this.generalShipmentData = generalShipmentData;
           this.parcels = parcels;
           this.productAndServiceData = productAndServiceData;
    }


    /**
     * Gets the generalShipmentData value for this ShipmentServiceData.
     * 
     * @return generalShipmentData   * Contains general data for a shipment.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.GeneralShipmentData getGeneralShipmentData() {
        return generalShipmentData;
    }


    /**
     * Sets the generalShipmentData value for this ShipmentServiceData.
     * 
     * @param generalShipmentData   * Contains general data for a shipment.
     */
    public void setGeneralShipmentData(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.GeneralShipmentData generalShipmentData) {
        this.generalShipmentData = generalShipmentData;
    }


    /**
     * Gets the parcels value for this ShipmentServiceData.
     * 
     * @return parcels   * Contains information for the parcels.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Parcel[] getParcels() {
        return parcels;
    }


    /**
     * Sets the parcels value for this ShipmentServiceData.
     * 
     * @param parcels   * Contains information for the parcels.
     */
    public void setParcels(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Parcel[] parcels) {
        this.parcels = parcels;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Parcel getParcels(int i) {
        return this.parcels[i];
    }

    public void setParcels(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Parcel _value) {
        this.parcels[i] = _value;
    }


    /**
     * Gets the productAndServiceData value for this ShipmentServiceData.
     * 
     * @return productAndServiceData   * Contains special data for a shipment.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProductAndServiceData getProductAndServiceData() {
        return productAndServiceData;
    }


    /**
     * Sets the productAndServiceData value for this ShipmentServiceData.
     * 
     * @param productAndServiceData   * Contains special data for a shipment.
     */
    public void setProductAndServiceData(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProductAndServiceData productAndServiceData) {
        this.productAndServiceData = productAndServiceData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentServiceData)) return false;
        ShipmentServiceData other = (ShipmentServiceData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.generalShipmentData==null && other.getGeneralShipmentData()==null) || 
             (this.generalShipmentData!=null &&
              this.generalShipmentData.equals(other.getGeneralShipmentData()))) &&
            ((this.parcels==null && other.getParcels()==null) || 
             (this.parcels!=null &&
              java.util.Arrays.equals(this.parcels, other.getParcels()))) &&
            ((this.productAndServiceData==null && other.getProductAndServiceData()==null) || 
             (this.productAndServiceData!=null &&
              this.productAndServiceData.equals(other.getProductAndServiceData())));
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
        if (getGeneralShipmentData() != null) {
            _hashCode += getGeneralShipmentData().hashCode();
        }
        if (getParcels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParcels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductAndServiceData() != null) {
            _hashCode += getProductAndServiceData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipmentServiceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "shipmentServiceData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generalShipmentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generalShipmentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "generalShipmentData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "parcel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productAndServiceData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productAndServiceData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "productAndServiceData"));
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
