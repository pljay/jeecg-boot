/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles address data.
 */
public class Address  implements java.io.Serializable {
    /* Name of address owner. For dangerous goods the maximum length
     * is 50, otherwise always 35. */
    private java.lang.String name1;

    /* Second name of address owner. */
    private java.lang.String name2;

    /* Street of address owner. For dangerous goods the maximum length
     * is 50, otherwise always 35. */
    private java.lang.String street;

    /* House number of address owner. */
    private java.lang.String houseNo;

    /* State of address owner in ISO 3166-2 code (e.g. BY = Bayern). */
    private java.lang.String state;

    /* Country of address owner in ISO 3166-1 alpha-2 format (e.g.
     * 'DE'). */
    private java.lang.String country;

    /* Zip code of address owner. */
    private java.lang.String zipCode;

    /* City/town of address owner. For dangerous goods the maximum
     * length is 50, otherwise always 35. */
    private java.lang.String city;

    /* International location number of address owner. */
    private java.lang.Long gln;

    /* Customer number of address owner. Maximum length is 17 for
     * consignment and pickup information, 11 for collection request.
     * Mandatory for sender's address. */
    private java.lang.String customerNumber;

    /* Contact person of address owner. */
    private java.lang.String contact;

    /* Phone number of address owner. Mandatory if phone is the chosen
     * notification channel.
     * If SMS notification is chosen, either mobile or phone must be filled. */
    private java.lang.String phone;

    /* Mobile phone number of address owner. If SMS notification is
     * chosen, either mobile or phone must be filled. */
    private java.lang.String mobile;

    /* Fax number of address owner. No required data format. */
    private java.lang.String fax;

    /* The email address including at minimum one "@" character as
     * a delimiter between addresser and domain. The domain must include
     * at minimum one "." as a delimiter between domain-name and domain-country. */
    private java.lang.String email;

    /* Comment on address owner. */
    private java.lang.String comment;

    /* Account allocation or cost center (for VTG) of invoice data
     * for consignments. */
    private java.lang.String iaccount;

    public Address() {
    }

    public Address(
           java.lang.String name1,
           java.lang.String name2,
           java.lang.String street,
           java.lang.String houseNo,
           java.lang.String state,
           java.lang.String country,
           java.lang.String zipCode,
           java.lang.String city,
           java.lang.Long gln,
           java.lang.String customerNumber,
           java.lang.String contact,
           java.lang.String phone,
           java.lang.String mobile,
           java.lang.String fax,
           java.lang.String email,
           java.lang.String comment,
           java.lang.String iaccount) {
           this.name1 = name1;
           this.name2 = name2;
           this.street = street;
           this.houseNo = houseNo;
           this.state = state;
           this.country = country;
           this.zipCode = zipCode;
           this.city = city;
           this.gln = gln;
           this.customerNumber = customerNumber;
           this.contact = contact;
           this.phone = phone;
           this.mobile = mobile;
           this.fax = fax;
           this.email = email;
           this.comment = comment;
           this.iaccount = iaccount;
    }


    /**
     * Gets the name1 value for this Address.
     * 
     * @return name1   * Name of address owner. For dangerous goods the maximum length
     * is 50, otherwise always 35.
     */
    public java.lang.String getName1() {
        return name1;
    }


    /**
     * Sets the name1 value for this Address.
     * 
     * @param name1   * Name of address owner. For dangerous goods the maximum length
     * is 50, otherwise always 35.
     */
    public void setName1(java.lang.String name1) {
        this.name1 = name1;
    }


    /**
     * Gets the name2 value for this Address.
     * 
     * @return name2   * Second name of address owner.
     */
    public java.lang.String getName2() {
        return name2;
    }


    /**
     * Sets the name2 value for this Address.
     * 
     * @param name2   * Second name of address owner.
     */
    public void setName2(java.lang.String name2) {
        this.name2 = name2;
    }


    /**
     * Gets the street value for this Address.
     * 
     * @return street   * Street of address owner. For dangerous goods the maximum length
     * is 50, otherwise always 35.
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this Address.
     * 
     * @param street   * Street of address owner. For dangerous goods the maximum length
     * is 50, otherwise always 35.
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the houseNo value for this Address.
     * 
     * @return houseNo   * House number of address owner.
     */
    public java.lang.String getHouseNo() {
        return houseNo;
    }


    /**
     * Sets the houseNo value for this Address.
     * 
     * @param houseNo   * House number of address owner.
     */
    public void setHouseNo(java.lang.String houseNo) {
        this.houseNo = houseNo;
    }


    /**
     * Gets the state value for this Address.
     * 
     * @return state   * State of address owner in ISO 3166-2 code (e.g. BY = Bayern).
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Address.
     * 
     * @param state   * State of address owner in ISO 3166-2 code (e.g. BY = Bayern).
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the country value for this Address.
     * 
     * @return country   * Country of address owner in ISO 3166-1 alpha-2 format (e.g.
     * 'DE').
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Address.
     * 
     * @param country   * Country of address owner in ISO 3166-1 alpha-2 format (e.g.
     * 'DE').
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the zipCode value for this Address.
     * 
     * @return zipCode   * Zip code of address owner.
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this Address.
     * 
     * @param zipCode   * Zip code of address owner.
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the city value for this Address.
     * 
     * @return city   * City/town of address owner. For dangerous goods the maximum
     * length is 50, otherwise always 35.
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Address.
     * 
     * @param city   * City/town of address owner. For dangerous goods the maximum
     * length is 50, otherwise always 35.
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the gln value for this Address.
     * 
     * @return gln   * International location number of address owner.
     */
    public java.lang.Long getGln() {
        return gln;
    }


    /**
     * Sets the gln value for this Address.
     * 
     * @param gln   * International location number of address owner.
     */
    public void setGln(java.lang.Long gln) {
        this.gln = gln;
    }


    /**
     * Gets the customerNumber value for this Address.
     * 
     * @return customerNumber   * Customer number of address owner. Maximum length is 17 for
     * consignment and pickup information, 11 for collection request.
     * Mandatory for sender's address.
     */
    public java.lang.String getCustomerNumber() {
        return customerNumber;
    }


    /**
     * Sets the customerNumber value for this Address.
     * 
     * @param customerNumber   * Customer number of address owner. Maximum length is 17 for
     * consignment and pickup information, 11 for collection request.
     * Mandatory for sender's address.
     */
    public void setCustomerNumber(java.lang.String customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     * Gets the contact value for this Address.
     * 
     * @return contact   * Contact person of address owner.
     */
    public java.lang.String getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this Address.
     * 
     * @param contact   * Contact person of address owner.
     */
    public void setContact(java.lang.String contact) {
        this.contact = contact;
    }


    /**
     * Gets the phone value for this Address.
     * 
     * @return phone   * Phone number of address owner. Mandatory if phone is the chosen
     * notification channel.
     * If SMS notification is chosen, either mobile or phone must be filled.
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Address.
     * 
     * @param phone   * Phone number of address owner. Mandatory if phone is the chosen
     * notification channel.
     * If SMS notification is chosen, either mobile or phone must be filled.
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the mobile value for this Address.
     * 
     * @return mobile   * Mobile phone number of address owner. If SMS notification is
     * chosen, either mobile or phone must be filled.
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this Address.
     * 
     * @param mobile   * Mobile phone number of address owner. If SMS notification is
     * chosen, either mobile or phone must be filled.
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the fax value for this Address.
     * 
     * @return fax   * Fax number of address owner. No required data format.
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Address.
     * 
     * @param fax   * Fax number of address owner. No required data format.
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the email value for this Address.
     * 
     * @return email   * The email address including at minimum one "@" character as
     * a delimiter between addresser and domain. The domain must include
     * at minimum one "." as a delimiter between domain-name and domain-country.
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Address.
     * 
     * @param email   * The email address including at minimum one "@" character as
     * a delimiter between addresser and domain. The domain must include
     * at minimum one "." as a delimiter between domain-name and domain-country.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the comment value for this Address.
     * 
     * @return comment   * Comment on address owner.
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Address.
     * 
     * @param comment   * Comment on address owner.
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the iaccount value for this Address.
     * 
     * @return iaccount   * Account allocation or cost center (for VTG) of invoice data
     * for consignments.
     */
    public java.lang.String getIaccount() {
        return iaccount;
    }


    /**
     * Sets the iaccount value for this Address.
     * 
     * @param iaccount   * Account allocation or cost center (for VTG) of invoice data
     * for consignments.
     */
    public void setIaccount(java.lang.String iaccount) {
        this.iaccount = iaccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name1==null && other.getName1()==null) || 
             (this.name1!=null &&
              this.name1.equals(other.getName1()))) &&
            ((this.name2==null && other.getName2()==null) || 
             (this.name2!=null &&
              this.name2.equals(other.getName2()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.houseNo==null && other.getHouseNo()==null) || 
             (this.houseNo!=null &&
              this.houseNo.equals(other.getHouseNo()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.gln==null && other.getGln()==null) || 
             (this.gln!=null &&
              this.gln.equals(other.getGln()))) &&
            ((this.customerNumber==null && other.getCustomerNumber()==null) || 
             (this.customerNumber!=null &&
              this.customerNumber.equals(other.getCustomerNumber()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.iaccount==null && other.getIaccount()==null) || 
             (this.iaccount!=null &&
              this.iaccount.equals(other.getIaccount())));
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
        if (getName1() != null) {
            _hashCode += getName1().hashCode();
        }
        if (getName2() != null) {
            _hashCode += getName2().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHouseNo() != null) {
            _hashCode += getHouseNo().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getGln() != null) {
            _hashCode += getGln().hashCode();
        }
        if (getCustomerNumber() != null) {
            _hashCode += getCustomerNumber().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getIaccount() != null) {
            _hashCode += getIaccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "houseNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gln");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gln"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact"));
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
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iaccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iaccount"));
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
