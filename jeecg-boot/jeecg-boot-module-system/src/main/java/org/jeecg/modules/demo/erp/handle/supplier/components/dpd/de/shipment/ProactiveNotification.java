/**
 * ProactiveNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles proactive notification data.
 */
public class ProactiveNotification  implements java.io.Serializable {
    /* Declares type of proactive notification.
     * Possible values are:
     * 1 = Email,
     * 2 = Telephone,
     * 3 = SMS,
     * 6 = FAX,
     * 7 = Postcard. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotificationChannel channel;

    /* Data for proactive notification, e.g. telephone number, email
     * address, etc.
     * The data format for the proactive message types SMS, phone and FAX
     * is as follows:
     * +international country number#phone number
     * Examples:
     * +49#1725673423
     * +49#01725673423 */
    private java.lang.String value;

    /* Specifies for which events a notification is to be issued.
     * Each event has a certain integer value. By adding the different values,
     * it is possible to build combinations of events, e.g. notification
     * for pick-up and delivery is 5.
     * The different values are:
     * 1 = Pick-up,
     * 2 = Non-delivery,
     * 4 = Delivery,
     * 8 = Inbound,
     * 16 = Out for delivery.
     * So maximum value can be 31. */
    private int rule;

    /* Language of the proactive notification in ISO-3166-1 alpha-2
     * format (e.g. 'DE'). */
    private java.lang.String language;

    public ProactiveNotification() {
    }

    public ProactiveNotification(
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotificationChannel channel,
           java.lang.String value,
           int rule,
           java.lang.String language) {
           this.channel = channel;
           this.value = value;
           this.rule = rule;
           this.language = language;
    }


    /**
     * Gets the channel value for this ProactiveNotification.
     * 
     * @return channel   * Declares type of proactive notification.
     * Possible values are:
     * 1 = Email,
     * 2 = Telephone,
     * 3 = SMS,
     * 6 = FAX,
     * 7 = Postcard.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotificationChannel getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this ProactiveNotification.
     * 
     * @param channel   * Declares type of proactive notification.
     * Possible values are:
     * 1 = Email,
     * 2 = Telephone,
     * 3 = SMS,
     * 6 = FAX,
     * 7 = Postcard.
     */
    public void setChannel(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotificationChannel channel) {
        this.channel = channel;
    }


    /**
     * Gets the value value for this ProactiveNotification.
     * 
     * @return value   * Data for proactive notification, e.g. telephone number, email
     * address, etc.
     * The data format for the proactive message types SMS, phone and FAX
     * is as follows:
     * +international country number#phone number
     * Examples:
     * +49#1725673423
     * +49#01725673423
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ProactiveNotification.
     * 
     * @param value   * Data for proactive notification, e.g. telephone number, email
     * address, etc.
     * The data format for the proactive message types SMS, phone and FAX
     * is as follows:
     * +international country number#phone number
     * Examples:
     * +49#1725673423
     * +49#01725673423
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the rule value for this ProactiveNotification.
     * 
     * @return rule   * Specifies for which events a notification is to be issued.
     * Each event has a certain integer value. By adding the different values,
     * it is possible to build combinations of events, e.g. notification
     * for pick-up and delivery is 5.
     * The different values are:
     * 1 = Pick-up,
     * 2 = Non-delivery,
     * 4 = Delivery,
     * 8 = Inbound,
     * 16 = Out for delivery.
     * So maximum value can be 31.
     */
    public int getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this ProactiveNotification.
     * 
     * @param rule   * Specifies for which events a notification is to be issued.
     * Each event has a certain integer value. By adding the different values,
     * it is possible to build combinations of events, e.g. notification
     * for pick-up and delivery is 5.
     * The different values are:
     * 1 = Pick-up,
     * 2 = Non-delivery,
     * 4 = Delivery,
     * 8 = Inbound,
     * 16 = Out for delivery.
     * So maximum value can be 31.
     */
    public void setRule(int rule) {
        this.rule = rule;
    }


    /**
     * Gets the language value for this ProactiveNotification.
     * 
     * @return language   * Language of the proactive notification in ISO-3166-1 alpha-2
     * format (e.g. 'DE').
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this ProactiveNotification.
     * 
     * @param language   * Language of the proactive notification in ISO-3166-1 alpha-2
     * format (e.g. 'DE').
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProactiveNotification)) return false;
        ProactiveNotification other = (ProactiveNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            this.rule == other.getRule() &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage())));
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
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        _hashCode += getRule();
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProactiveNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "proactiveNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">proactiveNotification>channel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
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
