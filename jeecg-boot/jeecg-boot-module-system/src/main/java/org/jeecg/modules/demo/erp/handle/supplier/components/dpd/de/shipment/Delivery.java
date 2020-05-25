/**
 * Delivery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles delivery data.
 */
public class Delivery  implements java.io.Serializable {
    /* Allowed delivery days in the week (0 = Sunday, 1 = Monday etc.).
     * Comma separated list of possible delivery days (e.g. "2,3,4,5"). */
    private java.lang.String day;

    /* Fixed delivery from date - format YYYYMMDD, e.g. 20080213. */
    private java.lang.Integer dateFrom;

    /* Fixed delivery to date - format YYYYMMDD, e.g. 20080213. */
    private java.lang.Integer dateTo;

    /* Time from which the consignee is available - format hhmm (local
     * time receipient country), e.g. 1400 or 0830. */
    private java.lang.Integer timeFrom;

    /* Time until the consignee is available - format hhmm (local
     * time receipient country), e.g. 1600 or 0930. */
    private java.lang.Integer timeTo;

    public Delivery() {
    }

    public Delivery(
           java.lang.String day,
           java.lang.Integer dateFrom,
           java.lang.Integer dateTo,
           java.lang.Integer timeFrom,
           java.lang.Integer timeTo) {
           this.day = day;
           this.dateFrom = dateFrom;
           this.dateTo = dateTo;
           this.timeFrom = timeFrom;
           this.timeTo = timeTo;
    }


    /**
     * Gets the day value for this Delivery.
     * 
     * @return day   * Allowed delivery days in the week (0 = Sunday, 1 = Monday etc.).
     * Comma separated list of possible delivery days (e.g. "2,3,4,5").
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this Delivery.
     * 
     * @param day   * Allowed delivery days in the week (0 = Sunday, 1 = Monday etc.).
     * Comma separated list of possible delivery days (e.g. "2,3,4,5").
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the dateFrom value for this Delivery.
     * 
     * @return dateFrom   * Fixed delivery from date - format YYYYMMDD, e.g. 20080213.
     */
    public java.lang.Integer getDateFrom() {
        return dateFrom;
    }


    /**
     * Sets the dateFrom value for this Delivery.
     * 
     * @param dateFrom   * Fixed delivery from date - format YYYYMMDD, e.g. 20080213.
     */
    public void setDateFrom(java.lang.Integer dateFrom) {
        this.dateFrom = dateFrom;
    }


    /**
     * Gets the dateTo value for this Delivery.
     * 
     * @return dateTo   * Fixed delivery to date - format YYYYMMDD, e.g. 20080213.
     */
    public java.lang.Integer getDateTo() {
        return dateTo;
    }


    /**
     * Sets the dateTo value for this Delivery.
     * 
     * @param dateTo   * Fixed delivery to date - format YYYYMMDD, e.g. 20080213.
     */
    public void setDateTo(java.lang.Integer dateTo) {
        this.dateTo = dateTo;
    }


    /**
     * Gets the timeFrom value for this Delivery.
     * 
     * @return timeFrom   * Time from which the consignee is available - format hhmm (local
     * time receipient country), e.g. 1400 or 0830.
     */
    public java.lang.Integer getTimeFrom() {
        return timeFrom;
    }


    /**
     * Sets the timeFrom value for this Delivery.
     * 
     * @param timeFrom   * Time from which the consignee is available - format hhmm (local
     * time receipient country), e.g. 1400 or 0830.
     */
    public void setTimeFrom(java.lang.Integer timeFrom) {
        this.timeFrom = timeFrom;
    }


    /**
     * Gets the timeTo value for this Delivery.
     * 
     * @return timeTo   * Time until the consignee is available - format hhmm (local
     * time receipient country), e.g. 1600 or 0930.
     */
    public java.lang.Integer getTimeTo() {
        return timeTo;
    }


    /**
     * Sets the timeTo value for this Delivery.
     * 
     * @param timeTo   * Time until the consignee is available - format hhmm (local
     * time receipient country), e.g. 1600 or 0930.
     */
    public void setTimeTo(java.lang.Integer timeTo) {
        this.timeTo = timeTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Delivery)) return false;
        Delivery other = (Delivery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.dateFrom==null && other.getDateFrom()==null) || 
             (this.dateFrom!=null &&
              this.dateFrom.equals(other.getDateFrom()))) &&
            ((this.dateTo==null && other.getDateTo()==null) || 
             (this.dateTo!=null &&
              this.dateTo.equals(other.getDateTo()))) &&
            ((this.timeFrom==null && other.getTimeFrom()==null) || 
             (this.timeFrom!=null &&
              this.timeFrom.equals(other.getTimeFrom()))) &&
            ((this.timeTo==null && other.getTimeTo()==null) || 
             (this.timeTo!=null &&
              this.timeTo.equals(other.getTimeTo())));
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
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getDateFrom() != null) {
            _hashCode += getDateFrom().hashCode();
        }
        if (getDateTo() != null) {
            _hashCode += getDateTo().hashCode();
        }
        if (getTimeFrom() != null) {
            _hashCode += getTimeFrom().hashCode();
        }
        if (getTimeTo() != null) {
            _hashCode += getTimeTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Delivery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "delivery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
