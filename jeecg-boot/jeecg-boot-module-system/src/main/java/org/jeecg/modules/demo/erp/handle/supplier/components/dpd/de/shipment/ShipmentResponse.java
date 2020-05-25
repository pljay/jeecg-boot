/**
 * ShipmentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles shipment response data.
 */
public class ShipmentResponse  implements java.io.Serializable {
    /* Serves as unique alphanumeric key of the shipment used by customer. */
    private java.lang.String identificationNumber;

    /* The shipment number for consignment data. If ordertype is pickup
     * information, the shipment number is an internal database id, which
     * is necessary for technical support requests at DPD. */
    private java.lang.String mpsId;

    /* Contains information about the single parcels. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelInformationType[] parcelInformation;

    /* Contains information about errors during shipment order processing. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.FaultCodeType[] faults;

    public ShipmentResponse() {
    }

    public ShipmentResponse(
           java.lang.String identificationNumber,
           java.lang.String mpsId,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelInformationType[] parcelInformation,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.FaultCodeType[] faults) {
           this.identificationNumber = identificationNumber;
           this.mpsId = mpsId;
           this.parcelInformation = parcelInformation;
           this.faults = faults;
    }


    /**
     * Gets the identificationNumber value for this ShipmentResponse.
     * 
     * @return identificationNumber   * Serves as unique alphanumeric key of the shipment used by customer.
     */
    public java.lang.String getIdentificationNumber() {
        return identificationNumber;
    }


    /**
     * Sets the identificationNumber value for this ShipmentResponse.
     * 
     * @param identificationNumber   * Serves as unique alphanumeric key of the shipment used by customer.
     */
    public void setIdentificationNumber(java.lang.String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }


    /**
     * Gets the mpsId value for this ShipmentResponse.
     * 
     * @return mpsId   * The shipment number for consignment data. If ordertype is pickup
     * information, the shipment number is an internal database id, which
     * is necessary for technical support requests at DPD.
     */
    public java.lang.String getMpsId() {
        return mpsId;
    }


    /**
     * Sets the mpsId value for this ShipmentResponse.
     * 
     * @param mpsId   * The shipment number for consignment data. If ordertype is pickup
     * information, the shipment number is an internal database id, which
     * is necessary for technical support requests at DPD.
     */
    public void setMpsId(java.lang.String mpsId) {
        this.mpsId = mpsId;
    }


    /**
     * Gets the parcelInformation value for this ShipmentResponse.
     * 
     * @return parcelInformation   * Contains information about the single parcels.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelInformationType[] getParcelInformation() {
        return parcelInformation;
    }


    /**
     * Sets the parcelInformation value for this ShipmentResponse.
     * 
     * @param parcelInformation   * Contains information about the single parcels.
     */
    public void setParcelInformation(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelInformationType[] parcelInformation) {
        this.parcelInformation = parcelInformation;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelInformationType getParcelInformation(int i) {
        return this.parcelInformation[i];
    }

    public void setParcelInformation(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelInformationType _value) {
        this.parcelInformation[i] = _value;
    }


    /**
     * Gets the faults value for this ShipmentResponse.
     * 
     * @return faults   * Contains information about errors during shipment order processing.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.FaultCodeType[] getFaults() {
        return faults;
    }


    /**
     * Sets the faults value for this ShipmentResponse.
     * 
     * @param faults   * Contains information about errors during shipment order processing.
     */
    public void setFaults(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.FaultCodeType[] faults) {
        this.faults = faults;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.FaultCodeType getFaults(int i) {
        return this.faults[i];
    }

    public void setFaults(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.FaultCodeType _value) {
        this.faults[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipmentResponse)) return false;
        ShipmentResponse other = (ShipmentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificationNumber==null && other.getIdentificationNumber()==null) || 
             (this.identificationNumber!=null &&
              this.identificationNumber.equals(other.getIdentificationNumber()))) &&
            ((this.mpsId==null && other.getMpsId()==null) || 
             (this.mpsId!=null &&
              this.mpsId.equals(other.getMpsId()))) &&
            ((this.parcelInformation==null && other.getParcelInformation()==null) || 
             (this.parcelInformation!=null &&
              java.util.Arrays.equals(this.parcelInformation, other.getParcelInformation()))) &&
            ((this.faults==null && other.getFaults()==null) || 
             (this.faults!=null &&
              java.util.Arrays.equals(this.faults, other.getFaults())));
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
        if (getIdentificationNumber() != null) {
            _hashCode += getIdentificationNumber().hashCode();
        }
        if (getMpsId() != null) {
            _hashCode += getMpsId().hashCode();
        }
        if (getParcelInformation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParcelInformation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParcelInformation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaults(), i);
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
        new org.apache.axis.description.TypeDesc(ShipmentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "shipmentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "parcelInformationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faults");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "faultCodeType"));
        elemField.setMinOccurs(0);
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
