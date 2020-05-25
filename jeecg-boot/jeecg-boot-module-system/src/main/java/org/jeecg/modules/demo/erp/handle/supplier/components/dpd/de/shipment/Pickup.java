/**
 * Pickup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles pickup data.
 */
public class Pickup  implements java.io.Serializable {
    /* Tour number (between 000 and 999). */
    private java.lang.Integer tour;

    /* Quantity of pickup parcels. Mandatory for consignment. */
    private int quantity;

    /* Pickup date in consignments and collection requests. The collection
     * day for advice customers. The from date for pickup information. Format
     * is YYYYMMDD.
     * It can also be used as pickup date for collection requests, then format
     * is YYMMDD. Mandatory for consignment. */
    private int date;

    /* Pickup day of week for consignments and pickup information.
     * Allowed values are 0..6 (0=Sunday, 1=Monday, etc.). Mandatory for
     * consignment. */
    private int day;

    /* From time 1 for consignments and pickup information. Format
     * is hhmm. Mandatory for consignment and variable consignor address. */
    private java.lang.Integer fromTime1;

    /* Until time 1 for consignments and pickup information. Format
     * is hhmm. Mandatory for consignment and variable consignor address. */
    private java.lang.Integer toTime1;

    /* From time 2 for consignments and pickup information. Format
     * is hhmm. */
    private java.lang.Integer fromTime2;

    /* Until time 2 for consignments and pickup information. Format
     * is hhmm. */
    private java.lang.Integer toTime2;

    /* Detemines whether an extra pickup tour is created for this
     * shipment with express service.
     * Possible values are:
     * 1: Extra pickup without express service
     * 2: Extra pickup with express service */
    private java.lang.Integer extraPickup;

    /* The ID of the parcel box. */
    private java.lang.String boxId;

    /* The TAN of the parcel box for this order. */
    private java.lang.String boxTan;

    /* Contains pickup address information for consignments and collection
     * requests. Mandatory for consignment. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address collectionRequestAddress;

    public Pickup() {
    }

    public Pickup(
           java.lang.Integer tour,
           int quantity,
           int date,
           int day,
           java.lang.Integer fromTime1,
           java.lang.Integer toTime1,
           java.lang.Integer fromTime2,
           java.lang.Integer toTime2,
           java.lang.Integer extraPickup,
           java.lang.String boxId,
           java.lang.String boxTan,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address collectionRequestAddress) {
           this.tour = tour;
           this.quantity = quantity;
           this.date = date;
           this.day = day;
           this.fromTime1 = fromTime1;
           this.toTime1 = toTime1;
           this.fromTime2 = fromTime2;
           this.toTime2 = toTime2;
           this.extraPickup = extraPickup;
           this.boxId = boxId;
           this.boxTan = boxTan;
           this.collectionRequestAddress = collectionRequestAddress;
    }


    /**
     * Gets the tour value for this Pickup.
     * 
     * @return tour   * Tour number (between 000 and 999).
     */
    public java.lang.Integer getTour() {
        return tour;
    }


    /**
     * Sets the tour value for this Pickup.
     * 
     * @param tour   * Tour number (between 000 and 999).
     */
    public void setTour(java.lang.Integer tour) {
        this.tour = tour;
    }


    /**
     * Gets the quantity value for this Pickup.
     * 
     * @return quantity   * Quantity of pickup parcels. Mandatory for consignment.
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Pickup.
     * 
     * @param quantity   * Quantity of pickup parcels. Mandatory for consignment.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the date value for this Pickup.
     * 
     * @return date   * Pickup date in consignments and collection requests. The collection
     * day for advice customers. The from date for pickup information. Format
     * is YYYYMMDD.
     * It can also be used as pickup date for collection requests, then format
     * is YYMMDD. Mandatory for consignment.
     */
    public int getDate() {
        return date;
    }


    /**
     * Sets the date value for this Pickup.
     * 
     * @param date   * Pickup date in consignments and collection requests. The collection
     * day for advice customers. The from date for pickup information. Format
     * is YYYYMMDD.
     * It can also be used as pickup date for collection requests, then format
     * is YYMMDD. Mandatory for consignment.
     */
    public void setDate(int date) {
        this.date = date;
    }


    /**
     * Gets the day value for this Pickup.
     * 
     * @return day   * Pickup day of week for consignments and pickup information.
     * Allowed values are 0..6 (0=Sunday, 1=Monday, etc.). Mandatory for
     * consignment.
     */
    public int getDay() {
        return day;
    }


    /**
     * Sets the day value for this Pickup.
     * 
     * @param day   * Pickup day of week for consignments and pickup information.
     * Allowed values are 0..6 (0=Sunday, 1=Monday, etc.). Mandatory for
     * consignment.
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * Gets the fromTime1 value for this Pickup.
     * 
     * @return fromTime1   * From time 1 for consignments and pickup information. Format
     * is hhmm. Mandatory for consignment and variable consignor address.
     */
    public java.lang.Integer getFromTime1() {
        return fromTime1;
    }


    /**
     * Sets the fromTime1 value for this Pickup.
     * 
     * @param fromTime1   * From time 1 for consignments and pickup information. Format
     * is hhmm. Mandatory for consignment and variable consignor address.
     */
    public void setFromTime1(java.lang.Integer fromTime1) {
        this.fromTime1 = fromTime1;
    }


    /**
     * Gets the toTime1 value for this Pickup.
     * 
     * @return toTime1   * Until time 1 for consignments and pickup information. Format
     * is hhmm. Mandatory for consignment and variable consignor address.
     */
    public java.lang.Integer getToTime1() {
        return toTime1;
    }


    /**
     * Sets the toTime1 value for this Pickup.
     * 
     * @param toTime1   * Until time 1 for consignments and pickup information. Format
     * is hhmm. Mandatory for consignment and variable consignor address.
     */
    public void setToTime1(java.lang.Integer toTime1) {
        this.toTime1 = toTime1;
    }


    /**
     * Gets the fromTime2 value for this Pickup.
     * 
     * @return fromTime2   * From time 2 for consignments and pickup information. Format
     * is hhmm.
     */
    public java.lang.Integer getFromTime2() {
        return fromTime2;
    }


    /**
     * Sets the fromTime2 value for this Pickup.
     * 
     * @param fromTime2   * From time 2 for consignments and pickup information. Format
     * is hhmm.
     */
    public void setFromTime2(java.lang.Integer fromTime2) {
        this.fromTime2 = fromTime2;
    }


    /**
     * Gets the toTime2 value for this Pickup.
     * 
     * @return toTime2   * Until time 2 for consignments and pickup information. Format
     * is hhmm.
     */
    public java.lang.Integer getToTime2() {
        return toTime2;
    }


    /**
     * Sets the toTime2 value for this Pickup.
     * 
     * @param toTime2   * Until time 2 for consignments and pickup information. Format
     * is hhmm.
     */
    public void setToTime2(java.lang.Integer toTime2) {
        this.toTime2 = toTime2;
    }


    /**
     * Gets the extraPickup value for this Pickup.
     * 
     * @return extraPickup   * Detemines whether an extra pickup tour is created for this
     * shipment with express service.
     * Possible values are:
     * 1: Extra pickup without express service
     * 2: Extra pickup with express service
     */
    public java.lang.Integer getExtraPickup() {
        return extraPickup;
    }


    /**
     * Sets the extraPickup value for this Pickup.
     * 
     * @param extraPickup   * Detemines whether an extra pickup tour is created for this
     * shipment with express service.
     * Possible values are:
     * 1: Extra pickup without express service
     * 2: Extra pickup with express service
     */
    public void setExtraPickup(java.lang.Integer extraPickup) {
        this.extraPickup = extraPickup;
    }


    /**
     * Gets the boxId value for this Pickup.
     * 
     * @return boxId   * The ID of the parcel box.
     */
    public java.lang.String getBoxId() {
        return boxId;
    }


    /**
     * Sets the boxId value for this Pickup.
     * 
     * @param boxId   * The ID of the parcel box.
     */
    public void setBoxId(java.lang.String boxId) {
        this.boxId = boxId;
    }


    /**
     * Gets the boxTan value for this Pickup.
     * 
     * @return boxTan   * The TAN of the parcel box for this order.
     */
    public java.lang.String getBoxTan() {
        return boxTan;
    }


    /**
     * Sets the boxTan value for this Pickup.
     * 
     * @param boxTan   * The TAN of the parcel box for this order.
     */
    public void setBoxTan(java.lang.String boxTan) {
        this.boxTan = boxTan;
    }


    /**
     * Gets the collectionRequestAddress value for this Pickup.
     * 
     * @return collectionRequestAddress   * Contains pickup address information for consignments and collection
     * requests. Mandatory for consignment.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address getCollectionRequestAddress() {
        return collectionRequestAddress;
    }


    /**
     * Sets the collectionRequestAddress value for this Pickup.
     * 
     * @param collectionRequestAddress   * Contains pickup address information for consignments and collection
     * requests. Mandatory for consignment.
     */
    public void setCollectionRequestAddress(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address collectionRequestAddress) {
        this.collectionRequestAddress = collectionRequestAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pickup)) return false;
        Pickup other = (Pickup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tour==null && other.getTour()==null) || 
             (this.tour!=null &&
              this.tour.equals(other.getTour()))) &&
            this.quantity == other.getQuantity() &&
            this.date == other.getDate() &&
            this.day == other.getDay() &&
            ((this.fromTime1==null && other.getFromTime1()==null) || 
             (this.fromTime1!=null &&
              this.fromTime1.equals(other.getFromTime1()))) &&
            ((this.toTime1==null && other.getToTime1()==null) || 
             (this.toTime1!=null &&
              this.toTime1.equals(other.getToTime1()))) &&
            ((this.fromTime2==null && other.getFromTime2()==null) || 
             (this.fromTime2!=null &&
              this.fromTime2.equals(other.getFromTime2()))) &&
            ((this.toTime2==null && other.getToTime2()==null) || 
             (this.toTime2!=null &&
              this.toTime2.equals(other.getToTime2()))) &&
            ((this.extraPickup==null && other.getExtraPickup()==null) || 
             (this.extraPickup!=null &&
              this.extraPickup.equals(other.getExtraPickup()))) &&
            ((this.boxId==null && other.getBoxId()==null) || 
             (this.boxId!=null &&
              this.boxId.equals(other.getBoxId()))) &&
            ((this.boxTan==null && other.getBoxTan()==null) || 
             (this.boxTan!=null &&
              this.boxTan.equals(other.getBoxTan()))) &&
            ((this.collectionRequestAddress==null && other.getCollectionRequestAddress()==null) || 
             (this.collectionRequestAddress!=null &&
              this.collectionRequestAddress.equals(other.getCollectionRequestAddress())));
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
        if (getTour() != null) {
            _hashCode += getTour().hashCode();
        }
        _hashCode += getQuantity();
        _hashCode += getDate();
        _hashCode += getDay();
        if (getFromTime1() != null) {
            _hashCode += getFromTime1().hashCode();
        }
        if (getToTime1() != null) {
            _hashCode += getToTime1().hashCode();
        }
        if (getFromTime2() != null) {
            _hashCode += getFromTime2().hashCode();
        }
        if (getToTime2() != null) {
            _hashCode += getToTime2().hashCode();
        }
        if (getExtraPickup() != null) {
            _hashCode += getExtraPickup().hashCode();
        }
        if (getBoxId() != null) {
            _hashCode += getBoxId().hashCode();
        }
        if (getBoxTan() != null) {
            _hashCode += getBoxTan().hashCode();
        }
        if (getCollectionRequestAddress() != null) {
            _hashCode += getCollectionRequestAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pickup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "pickup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromTime1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromTime1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toTime1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toTime1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromTime2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromTime2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toTime2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toTime2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraPickup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraPickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boxId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boxTan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boxTan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionRequestAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectionRequestAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "address"));
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
