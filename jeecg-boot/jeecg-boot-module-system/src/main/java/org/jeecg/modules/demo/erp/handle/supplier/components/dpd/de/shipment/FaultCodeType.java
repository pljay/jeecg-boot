/**
 * FaultCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles fault code type data.
 */
public class FaultCodeType  implements java.io.Serializable {
    /* Possible error codes are:
     * SHIPPING_1 - Pickup address is unknown for customer,
     * SHIPPING_2 - Parcel label print fails,
     * COMMON_1 - Unexpected runtime error,
     * COMMON_2 - Mandatory input field is empty,
     * COMMON_3 - Length of data for field does not fit,
     * COMMON_4 - Input data contains invalid special character,
     * COMMON_5 - A swap parcel is ordered, but there is more than one parcel,
     * COMMON_6 - Some input data field values result in an invalid combination,
     * COMMON_7 - Input data contains invalid value,
     * COMMON_8 - A field is to be stored in database, but there is not database
     * field mapped for it,
     * DATABASE_6 - Transfer state of order is to be changed but order is
     * already committed,
     * DATABASE_7 - Update fails on database level during order storing,
     * DATABASE_8 - Delete fails on database level during rollback after
     * some other error,
     * DATABASE_21 - Order is to be inserted in databse, but has already
     * a database id,
     * DATABASE_22 - Order is to be committed after inserting, but there
     * is no database id for update given,
     * DATABASE_24 - Feletion is necessary because of some other error, but
     * no database id for record is given,
     * MPSEXP_1 - Parcel label number is already in use,
     * ROUTING_1 - No route could be found for depot and feature,
     * ROUTING_2 - Invalid input data,
     * ROUTING_3 - The connection to the database failed,
     * ROUTING_4 - An internal failure occurs,
     * ROUTING_5 - No depot could be found,
     * ROUTING_6 - No pickup date was given,
     * ROUTING_7 - Internal extension rule error,
     * ROUTING_8 - Malformed zip code,
     * ROUTING_9 - Missing country code,
     * ROUTING_10 - Missing routing place,
     * ROUTING_11 - Missing service code,
     * ROUTING_12 - Routing place error,
     * ROUTING_13 - Sending date error,
     * ROUTING_14 - Service code error,
     * ROUTING_15 - Invalid relation of service codes,
     * ROUTING_16 - Unknown country code,
     * ROUTING_17 - Unknown destination depot,
     * ROUTING_18 - Unknown zip code,
     * ROUTING_19 - Unknown routing place,
     * ROUTING_20 - Unknown service code,
     * ROUTING_21 - Invalid service code,
     * ROUTING_21 - Parcel is labelled as return parcel but returns is not
     * possible,
     * ROUTING_22 - Missing allow,
     * ROUTING_23 - Missing routing place or destination depot. */
    private java.lang.String faultCode;

    /* Message with detailed information for the fault (e.g. incorrect
     * field). */
    private java.lang.String message;

    public FaultCodeType() {
    }

    public FaultCodeType(
           java.lang.String faultCode,
           java.lang.String message) {
           this.faultCode = faultCode;
           this.message = message;
    }


    /**
     * Gets the faultCode value for this FaultCodeType.
     * 
     * @return faultCode   * Possible error codes are:
     * SHIPPING_1 - Pickup address is unknown for customer,
     * SHIPPING_2 - Parcel label print fails,
     * COMMON_1 - Unexpected runtime error,
     * COMMON_2 - Mandatory input field is empty,
     * COMMON_3 - Length of data for field does not fit,
     * COMMON_4 - Input data contains invalid special character,
     * COMMON_5 - A swap parcel is ordered, but there is more than one parcel,
     * COMMON_6 - Some input data field values result in an invalid combination,
     * COMMON_7 - Input data contains invalid value,
     * COMMON_8 - A field is to be stored in database, but there is not database
     * field mapped for it,
     * DATABASE_6 - Transfer state of order is to be changed but order is
     * already committed,
     * DATABASE_7 - Update fails on database level during order storing,
     * DATABASE_8 - Delete fails on database level during rollback after
     * some other error,
     * DATABASE_21 - Order is to be inserted in databse, but has already
     * a database id,
     * DATABASE_22 - Order is to be committed after inserting, but there
     * is no database id for update given,
     * DATABASE_24 - Feletion is necessary because of some other error, but
     * no database id for record is given,
     * MPSEXP_1 - Parcel label number is already in use,
     * ROUTING_1 - No route could be found for depot and feature,
     * ROUTING_2 - Invalid input data,
     * ROUTING_3 - The connection to the database failed,
     * ROUTING_4 - An internal failure occurs,
     * ROUTING_5 - No depot could be found,
     * ROUTING_6 - No pickup date was given,
     * ROUTING_7 - Internal extension rule error,
     * ROUTING_8 - Malformed zip code,
     * ROUTING_9 - Missing country code,
     * ROUTING_10 - Missing routing place,
     * ROUTING_11 - Missing service code,
     * ROUTING_12 - Routing place error,
     * ROUTING_13 - Sending date error,
     * ROUTING_14 - Service code error,
     * ROUTING_15 - Invalid relation of service codes,
     * ROUTING_16 - Unknown country code,
     * ROUTING_17 - Unknown destination depot,
     * ROUTING_18 - Unknown zip code,
     * ROUTING_19 - Unknown routing place,
     * ROUTING_20 - Unknown service code,
     * ROUTING_21 - Invalid service code,
     * ROUTING_21 - Parcel is labelled as return parcel but returns is not
     * possible,
     * ROUTING_22 - Missing allow,
     * ROUTING_23 - Missing routing place or destination depot.
     */
    public java.lang.String getFaultCode() {
        return faultCode;
    }


    /**
     * Sets the faultCode value for this FaultCodeType.
     * 
     * @param faultCode   * Possible error codes are:
     * SHIPPING_1 - Pickup address is unknown for customer,
     * SHIPPING_2 - Parcel label print fails,
     * COMMON_1 - Unexpected runtime error,
     * COMMON_2 - Mandatory input field is empty,
     * COMMON_3 - Length of data for field does not fit,
     * COMMON_4 - Input data contains invalid special character,
     * COMMON_5 - A swap parcel is ordered, but there is more than one parcel,
     * COMMON_6 - Some input data field values result in an invalid combination,
     * COMMON_7 - Input data contains invalid value,
     * COMMON_8 - A field is to be stored in database, but there is not database
     * field mapped for it,
     * DATABASE_6 - Transfer state of order is to be changed but order is
     * already committed,
     * DATABASE_7 - Update fails on database level during order storing,
     * DATABASE_8 - Delete fails on database level during rollback after
     * some other error,
     * DATABASE_21 - Order is to be inserted in databse, but has already
     * a database id,
     * DATABASE_22 - Order is to be committed after inserting, but there
     * is no database id for update given,
     * DATABASE_24 - Feletion is necessary because of some other error, but
     * no database id for record is given,
     * MPSEXP_1 - Parcel label number is already in use,
     * ROUTING_1 - No route could be found for depot and feature,
     * ROUTING_2 - Invalid input data,
     * ROUTING_3 - The connection to the database failed,
     * ROUTING_4 - An internal failure occurs,
     * ROUTING_5 - No depot could be found,
     * ROUTING_6 - No pickup date was given,
     * ROUTING_7 - Internal extension rule error,
     * ROUTING_8 - Malformed zip code,
     * ROUTING_9 - Missing country code,
     * ROUTING_10 - Missing routing place,
     * ROUTING_11 - Missing service code,
     * ROUTING_12 - Routing place error,
     * ROUTING_13 - Sending date error,
     * ROUTING_14 - Service code error,
     * ROUTING_15 - Invalid relation of service codes,
     * ROUTING_16 - Unknown country code,
     * ROUTING_17 - Unknown destination depot,
     * ROUTING_18 - Unknown zip code,
     * ROUTING_19 - Unknown routing place,
     * ROUTING_20 - Unknown service code,
     * ROUTING_21 - Invalid service code,
     * ROUTING_21 - Parcel is labelled as return parcel but returns is not
     * possible,
     * ROUTING_22 - Missing allow,
     * ROUTING_23 - Missing routing place or destination depot.
     */
    public void setFaultCode(java.lang.String faultCode) {
        this.faultCode = faultCode;
    }


    /**
     * Gets the message value for this FaultCodeType.
     * 
     * @return message   * Message with detailed information for the fault (e.g. incorrect
     * field).
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this FaultCodeType.
     * 
     * @param message   * Message with detailed information for the fault (e.g. incorrect
     * field).
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaultCodeType)) return false;
        FaultCodeType other = (FaultCodeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultCode==null && other.getFaultCode()==null) || 
             (this.faultCode!=null &&
              this.faultCode.equals(other.getFaultCode()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getFaultCode() != null) {
            _hashCode += getFaultCode().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FaultCodeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "faultCodeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
