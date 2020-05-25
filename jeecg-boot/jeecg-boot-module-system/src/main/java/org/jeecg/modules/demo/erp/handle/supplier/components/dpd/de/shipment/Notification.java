/**
 * Notification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles notification data.
 */
public class Notification  implements java.io.Serializable {
    /* Declares channel of notification.
     * Possible values are:
     * 1 = Email,
     * 2 = Telephone,
     * 3 = SMS. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.NotificationChannel channel;

    /* Value for the chosen channel, i.e. the phone number or the
     * e-mail address. */
    private java.lang.String value;

    /* Language of the notification in ISO 3166-1 alpha-2 format (e.g.
     * 'DE'). */
    private java.lang.String language;

    public Notification() {
    }

    public Notification(
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.NotificationChannel channel,
           java.lang.String value,
           java.lang.String language) {
           this.channel = channel;
           this.value = value;
           this.language = language;
    }


    /**
     * Gets the channel value for this Notification.
     * 
     * @return channel   * Declares channel of notification.
     * Possible values are:
     * 1 = Email,
     * 2 = Telephone,
     * 3 = SMS.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.NotificationChannel getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this Notification.
     * 
     * @param channel   * Declares channel of notification.
     * Possible values are:
     * 1 = Email,
     * 2 = Telephone,
     * 3 = SMS.
     */
    public void setChannel(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.NotificationChannel channel) {
        this.channel = channel;
    }


    /**
     * Gets the value value for this Notification.
     * 
     * @return value   * Value for the chosen channel, i.e. the phone number or the
     * e-mail address.
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Notification.
     * 
     * @param value   * Value for the chosen channel, i.e. the phone number or the
     * e-mail address.
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the language value for this Notification.
     * 
     * @return language   * Language of the notification in ISO 3166-1 alpha-2 format (e.g.
     * 'DE').
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Notification.
     * 
     * @param language   * Language of the notification in ISO 3166-1 alpha-2 format (e.g.
     * 'DE').
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Notification)) return false;
        Notification other = (Notification) obj;
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
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Notification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "notification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">notification>channel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
