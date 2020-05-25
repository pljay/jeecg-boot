/**
 * OutputFormatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;

public class OutputFormatType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OutputFormatType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PDF = "PDF";
    public static final java.lang.String _ZPL = "ZPL";
    public static final java.lang.String _DPL = "DPL";
    public static final java.lang.String _PDL = "PDL";
    public static final java.lang.String _BARCODE_IMAGE = "BARCODE_IMAGE";
    public static final java.lang.String _MULTIPAGE_IMAGE = "MULTIPAGE_IMAGE";
    public static final OutputFormatType PDF = new OutputFormatType(_PDF);
    public static final OutputFormatType ZPL = new OutputFormatType(_ZPL);
    public static final OutputFormatType DPL = new OutputFormatType(_DPL);
    public static final OutputFormatType PDL = new OutputFormatType(_PDL);
    public static final OutputFormatType BARCODE_IMAGE = new OutputFormatType(_BARCODE_IMAGE);
    public static final OutputFormatType MULTIPAGE_IMAGE = new OutputFormatType(_MULTIPAGE_IMAGE);
    public java.lang.String getValue() { return _value_;}
    public static OutputFormatType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OutputFormatType enumeration = (OutputFormatType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OutputFormatType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutputFormatType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "OutputFormatType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
