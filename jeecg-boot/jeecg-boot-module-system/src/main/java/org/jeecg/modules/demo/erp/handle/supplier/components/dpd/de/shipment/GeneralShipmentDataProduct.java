/**
 * GeneralShipmentDataProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;

public class GeneralShipmentDataProduct implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GeneralShipmentDataProduct(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "CL";
    public static final java.lang.String _value2 = "E830";
    public static final java.lang.String _value3 = "E10";
    public static final java.lang.String _value4 = "E12";
    public static final java.lang.String _value5 = "E18";
    public static final java.lang.String _value6 = "IE2";
    public static final java.lang.String _value7 = "MAIL";
    public static final java.lang.String _value8 = "MAX";
    public static final java.lang.String _value9 = "PL";
    public static final java.lang.String _value10 = "PL+";
    public static final java.lang.String _value11 = "PM4";
    public static final GeneralShipmentDataProduct value1 = new GeneralShipmentDataProduct(_value1);
    public static final GeneralShipmentDataProduct value2 = new GeneralShipmentDataProduct(_value2);
    public static final GeneralShipmentDataProduct value3 = new GeneralShipmentDataProduct(_value3);
    public static final GeneralShipmentDataProduct value4 = new GeneralShipmentDataProduct(_value4);
    public static final GeneralShipmentDataProduct value5 = new GeneralShipmentDataProduct(_value5);
    public static final GeneralShipmentDataProduct value6 = new GeneralShipmentDataProduct(_value6);
    public static final GeneralShipmentDataProduct value7 = new GeneralShipmentDataProduct(_value7);
    public static final GeneralShipmentDataProduct value8 = new GeneralShipmentDataProduct(_value8);
    public static final GeneralShipmentDataProduct value9 = new GeneralShipmentDataProduct(_value9);
    public static final GeneralShipmentDataProduct value10 = new GeneralShipmentDataProduct(_value10);
    public static final GeneralShipmentDataProduct value11 = new GeneralShipmentDataProduct(_value11);
    public java.lang.String getValue() { return _value_;}
    public static GeneralShipmentDataProduct fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GeneralShipmentDataProduct enumeration = (GeneralShipmentDataProduct)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GeneralShipmentDataProduct fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GeneralShipmentDataProduct.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">generalShipmentData>product"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
