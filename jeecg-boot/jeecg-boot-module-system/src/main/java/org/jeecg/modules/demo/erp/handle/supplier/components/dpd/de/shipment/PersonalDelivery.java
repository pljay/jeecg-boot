/**
 * PersonalDelivery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles personal delivery data.
 */
public class PersonalDelivery  implements java.io.Serializable {
    /* Declares type of personal delivery.
     * Possible values are:
     * 1 = Department delivery (without personal identification),
     * 2 = Personal delivery with personal identification (ID-Check),
     * 3 = Personal delivery without personal identification at drop point
     * (e.g. parcel shop),
     * 4 = Personal delivery with personal identification at drop point (e.g.
     * parcel shop),
     * 5 = Personal delivery with personal identification at drop point plus
     * ID-Check (e.g. parcel shop).
     * 
     * For parcel shop delivery the parcel shop id must be declared in productAndServiceData.
     * It can be obtained from parcel shop finder. */
    private int type;

    /* Floor where the personal delivery shall take place. This field
     * is only used for department delivery. */
    private java.lang.String floor;

    /* Building where the personal delivery shall take place. This
     * field is only used for department delivery (type 1). */
    private java.lang.String building;

    /* Department where the personal delivery shall take place. This
     * field is only used for department delivery (type 1). */
    private java.lang.String department;

    /* Name of the person authorised to accept the consignment. This
     * field is only used for delivery with ID-Check (types 2 and 5). */
    private java.lang.String name;

    /* Telephone number of the person authorised to accept the consignment.
     * This field is only used for delivery with ID-Check (types 2 and 5). */
    private java.lang.String phone;

    /* Personal identification number of the person authorised to
     * accept the consignment. This field is only used for delivery with
     * ID-Check (types 2 and 5). */
    private java.lang.String personId;

    public PersonalDelivery() {
    }

    public PersonalDelivery(
           int type,
           java.lang.String floor,
           java.lang.String building,
           java.lang.String department,
           java.lang.String name,
           java.lang.String phone,
           java.lang.String personId) {
           this.type = type;
           this.floor = floor;
           this.building = building;
           this.department = department;
           this.name = name;
           this.phone = phone;
           this.personId = personId;
    }


    /**
     * Gets the type value for this PersonalDelivery.
     * 
     * @return type   * Declares type of personal delivery.
     * Possible values are:
     * 1 = Department delivery (without personal identification),
     * 2 = Personal delivery with personal identification (ID-Check),
     * 3 = Personal delivery without personal identification at drop point
     * (e.g. parcel shop),
     * 4 = Personal delivery with personal identification at drop point (e.g.
     * parcel shop),
     * 5 = Personal delivery with personal identification at drop point plus
     * ID-Check (e.g. parcel shop).
     * 
     * For parcel shop delivery the parcel shop id must be declared in productAndServiceData.
     * It can be obtained from parcel shop finder.
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this PersonalDelivery.
     * 
     * @param type   * Declares type of personal delivery.
     * Possible values are:
     * 1 = Department delivery (without personal identification),
     * 2 = Personal delivery with personal identification (ID-Check),
     * 3 = Personal delivery without personal identification at drop point
     * (e.g. parcel shop),
     * 4 = Personal delivery with personal identification at drop point (e.g.
     * parcel shop),
     * 5 = Personal delivery with personal identification at drop point plus
     * ID-Check (e.g. parcel shop).
     * 
     * For parcel shop delivery the parcel shop id must be declared in productAndServiceData.
     * It can be obtained from parcel shop finder.
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the floor value for this PersonalDelivery.
     * 
     * @return floor   * Floor where the personal delivery shall take place. This field
     * is only used for department delivery.
     */
    public java.lang.String getFloor() {
        return floor;
    }


    /**
     * Sets the floor value for this PersonalDelivery.
     * 
     * @param floor   * Floor where the personal delivery shall take place. This field
     * is only used for department delivery.
     */
    public void setFloor(java.lang.String floor) {
        this.floor = floor;
    }


    /**
     * Gets the building value for this PersonalDelivery.
     * 
     * @return building   * Building where the personal delivery shall take place. This
     * field is only used for department delivery (type 1).
     */
    public java.lang.String getBuilding() {
        return building;
    }


    /**
     * Sets the building value for this PersonalDelivery.
     * 
     * @param building   * Building where the personal delivery shall take place. This
     * field is only used for department delivery (type 1).
     */
    public void setBuilding(java.lang.String building) {
        this.building = building;
    }


    /**
     * Gets the department value for this PersonalDelivery.
     * 
     * @return department   * Department where the personal delivery shall take place. This
     * field is only used for department delivery (type 1).
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PersonalDelivery.
     * 
     * @param department   * Department where the personal delivery shall take place. This
     * field is only used for department delivery (type 1).
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the name value for this PersonalDelivery.
     * 
     * @return name   * Name of the person authorised to accept the consignment. This
     * field is only used for delivery with ID-Check (types 2 and 5).
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PersonalDelivery.
     * 
     * @param name   * Name of the person authorised to accept the consignment. This
     * field is only used for delivery with ID-Check (types 2 and 5).
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the phone value for this PersonalDelivery.
     * 
     * @return phone   * Telephone number of the person authorised to accept the consignment.
     * This field is only used for delivery with ID-Check (types 2 and 5).
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PersonalDelivery.
     * 
     * @param phone   * Telephone number of the person authorised to accept the consignment.
     * This field is only used for delivery with ID-Check (types 2 and 5).
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the personId value for this PersonalDelivery.
     * 
     * @return personId   * Personal identification number of the person authorised to
     * accept the consignment. This field is only used for delivery with
     * ID-Check (types 2 and 5).
     */
    public java.lang.String getPersonId() {
        return personId;
    }


    /**
     * Sets the personId value for this PersonalDelivery.
     * 
     * @param personId   * Personal identification number of the person authorised to
     * accept the consignment. This field is only used for delivery with
     * ID-Check (types 2 and 5).
     */
    public void setPersonId(java.lang.String personId) {
        this.personId = personId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonalDelivery)) return false;
        PersonalDelivery other = (PersonalDelivery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.type == other.getType() &&
            ((this.floor==null && other.getFloor()==null) || 
             (this.floor!=null &&
              this.floor.equals(other.getFloor()))) &&
            ((this.building==null && other.getBuilding()==null) || 
             (this.building!=null &&
              this.building.equals(other.getBuilding()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.personId==null && other.getPersonId()==null) || 
             (this.personId!=null &&
              this.personId.equals(other.getPersonId())));
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
        _hashCode += getType();
        if (getFloor() != null) {
            _hashCode += getFloor().hashCode();
        }
        if (getBuilding() != null) {
            _hashCode += getBuilding().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPersonId() != null) {
            _hashCode += getPersonId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonalDelivery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "personalDelivery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "floor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("building");
        elemField.setXmlName(new javax.xml.namespace.QName("", "building"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personId"));
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
