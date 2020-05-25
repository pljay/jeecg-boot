/**
 * ParcelInformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles parcel information type data.
 */
public class ParcelInformationType  implements java.io.Serializable {
    /* The parcel label number of the corresponding parcel. */
    private java.lang.String parcelLabelNumber;

    /* The DPD reference for this parcel. */
    private java.lang.String dpdReference;

    /* The content for the parcel. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType[] output;

    public ParcelInformationType() {
    }

    public ParcelInformationType(
           java.lang.String parcelLabelNumber,
           java.lang.String dpdReference,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType[] output) {
           this.parcelLabelNumber = parcelLabelNumber;
           this.dpdReference = dpdReference;
           this.output = output;
    }


    /**
     * Gets the parcelLabelNumber value for this ParcelInformationType.
     * 
     * @return parcelLabelNumber   * The parcel label number of the corresponding parcel.
     */
    public java.lang.String getParcelLabelNumber() {
        return parcelLabelNumber;
    }


    /**
     * Sets the parcelLabelNumber value for this ParcelInformationType.
     * 
     * @param parcelLabelNumber   * The parcel label number of the corresponding parcel.
     */
    public void setParcelLabelNumber(java.lang.String parcelLabelNumber) {
        this.parcelLabelNumber = parcelLabelNumber;
    }


    /**
     * Gets the dpdReference value for this ParcelInformationType.
     * 
     * @return dpdReference   * The DPD reference for this parcel.
     */
    public java.lang.String getDpdReference() {
        return dpdReference;
    }


    /**
     * Sets the dpdReference value for this ParcelInformationType.
     * 
     * @param dpdReference   * The DPD reference for this parcel.
     */
    public void setDpdReference(java.lang.String dpdReference) {
        this.dpdReference = dpdReference;
    }


    /**
     * Gets the output value for this ParcelInformationType.
     * 
     * @return output   * The content for the parcel.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType[] getOutput() {
        return output;
    }


    /**
     * Sets the output value for this ParcelInformationType.
     * 
     * @param output   * The content for the parcel.
     */
    public void setOutput(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType[] output) {
        this.output = output;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType getOutput(int i) {
        return this.output[i];
    }

    public void setOutput(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputType _value) {
        this.output[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParcelInformationType)) return false;
        ParcelInformationType other = (ParcelInformationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parcelLabelNumber==null && other.getParcelLabelNumber()==null) || 
             (this.parcelLabelNumber!=null &&
              this.parcelLabelNumber.equals(other.getParcelLabelNumber()))) &&
            ((this.dpdReference==null && other.getDpdReference()==null) || 
             (this.dpdReference!=null &&
              this.dpdReference.equals(other.getDpdReference()))) &&
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              java.util.Arrays.equals(this.output, other.getOutput())));
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
        if (getParcelLabelNumber() != null) {
            _hashCode += getParcelLabelNumber().hashCode();
        }
        if (getDpdReference() != null) {
            _hashCode += getDpdReference().hashCode();
        }
        if (getOutput() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutput());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutput(), i);
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
        new org.apache.axis.description.TypeDesc(ParcelInformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "parcelInformationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelLabelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelLabelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpdReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpdReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "OutputType"));
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
