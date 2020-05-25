/**
 * ParcelFunction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;

public class ParcelFunction implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ParcelFunction(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LOCKDZB = "LOCKDZB";
    public static final java.lang.String _LOCKASG = "LOCKASG";
    public static final java.lang.String _LOCKEVM = "LOCKEVM";
    public static final java.lang.String _LOCKSHOP = "LOCKSHOP";
    public static final java.lang.String _LOCKTV = "LOCKTV";
    public static final ParcelFunction LOCKDZB = new ParcelFunction(_LOCKDZB);
    public static final ParcelFunction LOCKASG = new ParcelFunction(_LOCKASG);
    public static final ParcelFunction LOCKEVM = new ParcelFunction(_LOCKEVM);
    public static final ParcelFunction LOCKSHOP = new ParcelFunction(_LOCKSHOP);
    public static final ParcelFunction LOCKTV = new ParcelFunction(_LOCKTV);
    public java.lang.String getValue() { return _value_;}
    public static ParcelFunction fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ParcelFunction enumeration = (ParcelFunction)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ParcelFunction fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ParcelFunction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">parcel>function"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
