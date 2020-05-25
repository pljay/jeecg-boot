/**
 * PrintOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Options how to return the parcel labels
 */
public class PrintOptions  implements java.io.Serializable {
    /* The formats in which the parcel labels should be returned.
     *  If more than one format is set, the option splitByParcel is set implicitly. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOption[] printOption;

    /* Determines whether a complete parcel label sheet will be created
     * or a single one for each parcel.
     * If format is BARCODE_IMAGE then this is set implicitly. */
    private java.lang.Boolean splitByParcel;

    public PrintOptions() {
    }

    public PrintOptions(
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOption[] printOption,
           java.lang.Boolean splitByParcel) {
           this.printOption = printOption;
           this.splitByParcel = splitByParcel;
    }


    /**
     * Gets the printOption value for this PrintOptions.
     *
     * @return printOption   * The formats in which the parcel labels should be returned.
     *  If more than one format is set, the option splitByParcel is set implicitly.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOption[] getPrintOption() {
        return printOption;
    }


    /**
     * Sets the printOption value for this PrintOptions.
     *
     * @param printOption   * The formats in which the parcel labels should be returned.
     *  If more than one format is set, the option splitByParcel is set implicitly.
     */
    public void setPrintOption(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOption[] printOption) {
        this.printOption = printOption;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOption getPrintOption(int i) {
        return this.printOption[i];
    }

    public void setPrintOption(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOption _value) {
        this.printOption[i] = _value;
    }


    /**
     * Gets the splitByParcel value for this PrintOptions.
     *
     * @return splitByParcel   * Determines whether a complete parcel label sheet will be created
     * or a single one for each parcel.
     * If format is BARCODE_IMAGE then this is set implicitly.
     */
    public java.lang.Boolean getSplitByParcel() {
        return splitByParcel;
    }


    /**
     * Sets the splitByParcel value for this PrintOptions.
     *
     * @param splitByParcel   * Determines whether a complete parcel label sheet will be created
     * or a single one for each parcel.
     * If format is BARCODE_IMAGE then this is set implicitly.
     */
    public void setSplitByParcel(java.lang.Boolean splitByParcel) {
        this.splitByParcel = splitByParcel;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintOptions)) return false;
        PrintOptions other = (PrintOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.printOption==null && other.getPrintOption()==null) ||
             (this.printOption!=null &&
              java.util.Arrays.equals(this.printOption, other.getPrintOption()))) &&
            ((this.splitByParcel==null && other.getSplitByParcel()==null) ||
             (this.splitByParcel!=null &&
              this.splitByParcel.equals(other.getSplitByParcel())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPrintOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrintOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSplitByParcel() != null) {
            _hashCode += getSplitByParcel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "printOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "printOption"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitByParcel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "splitByParcel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
