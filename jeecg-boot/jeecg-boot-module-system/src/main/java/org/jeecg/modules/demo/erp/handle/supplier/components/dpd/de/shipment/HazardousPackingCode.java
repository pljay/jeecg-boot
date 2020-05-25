/**
 * HazardousPackingCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;

public class HazardousPackingCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HazardousPackingCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "0A";
    public static final java.lang.String _value2 = "0A1";
    public static final java.lang.String _value3 = "0A2";
    public static final java.lang.String _value4 = "1A";
    public static final java.lang.String _value5 = "1A1";
    public static final java.lang.String _value6 = "1A2";
    public static final java.lang.String _value7 = "1B";
    public static final java.lang.String _value8 = "1B1";
    public static final java.lang.String _value9 = "1B2";
    public static final java.lang.String _value10 = "1H";
    public static final java.lang.String _value11 = "1H1";
    public static final java.lang.String _value12 = "1H2";
    public static final java.lang.String _value13 = "3A";
    public static final java.lang.String _value14 = "3A1";
    public static final java.lang.String _value15 = "3A2";
    public static final java.lang.String _value16 = "3B";
    public static final java.lang.String _value17 = "3B1";
    public static final java.lang.String _value18 = "3B2";
    public static final java.lang.String _value19 = "3H";
    public static final java.lang.String _value20 = "3H1";
    public static final java.lang.String _value21 = "3H2";
    public static final java.lang.String _value22 = "4A";
    public static final java.lang.String _value23 = "4B";
    public static final java.lang.String _value24 = "4D";
    public static final java.lang.String _value25 = "4G";
    public static final java.lang.String _value26 = "4H";
    public static final java.lang.String _value27 = "4H1";
    public static final java.lang.String _value28 = "4H2";
    public static final java.lang.String _value29 = "5H";
    public static final java.lang.String _value30 = "5M";
    public static final java.lang.String _value31 = "6H";
    public static final HazardousPackingCode value1 = new HazardousPackingCode(_value1);
    public static final HazardousPackingCode value2 = new HazardousPackingCode(_value2);
    public static final HazardousPackingCode value3 = new HazardousPackingCode(_value3);
    public static final HazardousPackingCode value4 = new HazardousPackingCode(_value4);
    public static final HazardousPackingCode value5 = new HazardousPackingCode(_value5);
    public static final HazardousPackingCode value6 = new HazardousPackingCode(_value6);
    public static final HazardousPackingCode value7 = new HazardousPackingCode(_value7);
    public static final HazardousPackingCode value8 = new HazardousPackingCode(_value8);
    public static final HazardousPackingCode value9 = new HazardousPackingCode(_value9);
    public static final HazardousPackingCode value10 = new HazardousPackingCode(_value10);
    public static final HazardousPackingCode value11 = new HazardousPackingCode(_value11);
    public static final HazardousPackingCode value12 = new HazardousPackingCode(_value12);
    public static final HazardousPackingCode value13 = new HazardousPackingCode(_value13);
    public static final HazardousPackingCode value14 = new HazardousPackingCode(_value14);
    public static final HazardousPackingCode value15 = new HazardousPackingCode(_value15);
    public static final HazardousPackingCode value16 = new HazardousPackingCode(_value16);
    public static final HazardousPackingCode value17 = new HazardousPackingCode(_value17);
    public static final HazardousPackingCode value18 = new HazardousPackingCode(_value18);
    public static final HazardousPackingCode value19 = new HazardousPackingCode(_value19);
    public static final HazardousPackingCode value20 = new HazardousPackingCode(_value20);
    public static final HazardousPackingCode value21 = new HazardousPackingCode(_value21);
    public static final HazardousPackingCode value22 = new HazardousPackingCode(_value22);
    public static final HazardousPackingCode value23 = new HazardousPackingCode(_value23);
    public static final HazardousPackingCode value24 = new HazardousPackingCode(_value24);
    public static final HazardousPackingCode value25 = new HazardousPackingCode(_value25);
    public static final HazardousPackingCode value26 = new HazardousPackingCode(_value26);
    public static final HazardousPackingCode value27 = new HazardousPackingCode(_value27);
    public static final HazardousPackingCode value28 = new HazardousPackingCode(_value28);
    public static final HazardousPackingCode value29 = new HazardousPackingCode(_value29);
    public static final HazardousPackingCode value30 = new HazardousPackingCode(_value30);
    public static final HazardousPackingCode value31 = new HazardousPackingCode(_value31);
    public java.lang.String getValue() { return _value_;}
    public static HazardousPackingCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HazardousPackingCode enumeration = (HazardousPackingCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HazardousPackingCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HazardousPackingCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">hazardous>packingCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
