/**
 * GeneralShipmentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles general shipment data.
 */
public class GeneralShipmentData  implements java.io.Serializable {
    /* The shipment number for consignment data.
     * The shipment number is only accepted if the parcel label number is
     * allocated by customer.
     * It starts with one of "MPS", "EXP" or "B2C", the last eight ciphers
     * are the date in format yyyyMMdd. */
    private java.lang.String mpsId;

    /* User ID of the person who made the entry. */
    private java.lang.String cUser;

    /* Consignment customer reference number 1 (maximal length 35),
     * also customer reference number for collection request orders (maximal
     * length 50). */
    private java.lang.String mpsCustomerReferenceNumber1;

    /* Consignment customer reference number 2. */
    private java.lang.String mpsCustomerReferenceNumber2;

    /* Consignment customer reference number 3. */
    private java.lang.String mpsCustomerReferenceNumber3;

    /* Consignment customer reference number 4. */
    private java.lang.String mpsCustomerReferenceNumber4;

    /* Serves as unique alphanumeric key of the shipment used by customer. */
    private java.lang.String identificationNumber;

    /* Sending depot for consignment, ordering depot for collection
     * request, customer's depot for pickup information or creating/sending
     * depot for dangerous goods.
     * Four alphanumeric positions, including leading zeros, e.g. 0163. */
    private java.lang.String sendingDepot;

    /* Selection of product, exactly one per shipment, mandatory for
     * consignment data. Possible values are:
     * CL = DPD CLASSIC
     * E830 = DPD 8:30
     * E10 = DPD 10:00
     * E12 = DPD 12:00
     * E18 = DPD 18:00
     * IE2 = DPD EXPRESS
     * MAIL = DPD International Mail
     * MAX = DPD MAX
     * PL = DPD PARCELLetter
     * PL+ = DPD PARCELLetterPlus
     * PM4 = DPD Priority */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.GeneralShipmentDataProduct product;

    /* Specifies if this shipment should be sent as complete delivery.
     * Mandatory for COD. Default value is false. */
    private java.lang.Boolean mpsCompleteDelivery;

    /* Specifies if the label for complete delivery is printed for
     * pickup. Mandatory for COD. Default value is false. */
    private java.lang.Boolean mpsCompleteDeliveryLabel;

    /* Volume per consignment in cm3 (without positions after the
     * decimal point). */
    private java.lang.Long mpsVolume;

    /* Shipment weight in grams rounded in 10 gram units without decimal
     * point (e.g. 300 equals 3kg). */
    private java.lang.Long mpsWeight;

    /* Date when the shipment is expected to be transferred to the
     * system. Format is YYYYMMDD. */
    private java.lang.String mpsExpectedSendingDate;

    /* Time when the shipment is expected to be transferred to the
     * system. Format is HHMMSS. */
    private java.lang.String mpsExpectedSendingTime;

    /* Consignment sender's address, collection request customer's
     * address or pickup information customer's address. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address sender;

    /* Address of the recipient. For parcel shop delivery address
     * of the real recipient. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address recipient;

    public GeneralShipmentData() {
    }

    public GeneralShipmentData(
           java.lang.String mpsId,
           java.lang.String cUser,
           java.lang.String mpsCustomerReferenceNumber1,
           java.lang.String mpsCustomerReferenceNumber2,
           java.lang.String mpsCustomerReferenceNumber3,
           java.lang.String mpsCustomerReferenceNumber4,
           java.lang.String identificationNumber,
           java.lang.String sendingDepot,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.GeneralShipmentDataProduct product,
           java.lang.Boolean mpsCompleteDelivery,
           java.lang.Boolean mpsCompleteDeliveryLabel,
           java.lang.Long mpsVolume,
           java.lang.Long mpsWeight,
           java.lang.String mpsExpectedSendingDate,
           java.lang.String mpsExpectedSendingTime,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address sender,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address recipient) {
           this.mpsId = mpsId;
           this.cUser = cUser;
           this.mpsCustomerReferenceNumber1 = mpsCustomerReferenceNumber1;
           this.mpsCustomerReferenceNumber2 = mpsCustomerReferenceNumber2;
           this.mpsCustomerReferenceNumber3 = mpsCustomerReferenceNumber3;
           this.mpsCustomerReferenceNumber4 = mpsCustomerReferenceNumber4;
           this.identificationNumber = identificationNumber;
           this.sendingDepot = sendingDepot;
           this.product = product;
           this.mpsCompleteDelivery = mpsCompleteDelivery;
           this.mpsCompleteDeliveryLabel = mpsCompleteDeliveryLabel;
           this.mpsVolume = mpsVolume;
           this.mpsWeight = mpsWeight;
           this.mpsExpectedSendingDate = mpsExpectedSendingDate;
           this.mpsExpectedSendingTime = mpsExpectedSendingTime;
           this.sender = sender;
           this.recipient = recipient;
    }


    /**
     * Gets the mpsId value for this GeneralShipmentData.
     * 
     * @return mpsId   * The shipment number for consignment data.
     * The shipment number is only accepted if the parcel label number is
     * allocated by customer.
     * It starts with one of "MPS", "EXP" or "B2C", the last eight ciphers
     * are the date in format yyyyMMdd.
     */
    public java.lang.String getMpsId() {
        return mpsId;
    }


    /**
     * Sets the mpsId value for this GeneralShipmentData.
     * 
     * @param mpsId   * The shipment number for consignment data.
     * The shipment number is only accepted if the parcel label number is
     * allocated by customer.
     * It starts with one of "MPS", "EXP" or "B2C", the last eight ciphers
     * are the date in format yyyyMMdd.
     */
    public void setMpsId(java.lang.String mpsId) {
        this.mpsId = mpsId;
    }


    /**
     * Gets the cUser value for this GeneralShipmentData.
     * 
     * @return cUser   * User ID of the person who made the entry.
     */
    public java.lang.String getCUser() {
        return cUser;
    }


    /**
     * Sets the cUser value for this GeneralShipmentData.
     * 
     * @param cUser   * User ID of the person who made the entry.
     */
    public void setCUser(java.lang.String cUser) {
        this.cUser = cUser;
    }


    /**
     * Gets the mpsCustomerReferenceNumber1 value for this GeneralShipmentData.
     * 
     * @return mpsCustomerReferenceNumber1   * Consignment customer reference number 1 (maximal length 35),
     * also customer reference number for collection request orders (maximal
     * length 50).
     */
    public java.lang.String getMpsCustomerReferenceNumber1() {
        return mpsCustomerReferenceNumber1;
    }


    /**
     * Sets the mpsCustomerReferenceNumber1 value for this GeneralShipmentData.
     * 
     * @param mpsCustomerReferenceNumber1   * Consignment customer reference number 1 (maximal length 35),
     * also customer reference number for collection request orders (maximal
     * length 50).
     */
    public void setMpsCustomerReferenceNumber1(java.lang.String mpsCustomerReferenceNumber1) {
        this.mpsCustomerReferenceNumber1 = mpsCustomerReferenceNumber1;
    }


    /**
     * Gets the mpsCustomerReferenceNumber2 value for this GeneralShipmentData.
     * 
     * @return mpsCustomerReferenceNumber2   * Consignment customer reference number 2.
     */
    public java.lang.String getMpsCustomerReferenceNumber2() {
        return mpsCustomerReferenceNumber2;
    }


    /**
     * Sets the mpsCustomerReferenceNumber2 value for this GeneralShipmentData.
     * 
     * @param mpsCustomerReferenceNumber2   * Consignment customer reference number 2.
     */
    public void setMpsCustomerReferenceNumber2(java.lang.String mpsCustomerReferenceNumber2) {
        this.mpsCustomerReferenceNumber2 = mpsCustomerReferenceNumber2;
    }


    /**
     * Gets the mpsCustomerReferenceNumber3 value for this GeneralShipmentData.
     * 
     * @return mpsCustomerReferenceNumber3   * Consignment customer reference number 3.
     */
    public java.lang.String getMpsCustomerReferenceNumber3() {
        return mpsCustomerReferenceNumber3;
    }


    /**
     * Sets the mpsCustomerReferenceNumber3 value for this GeneralShipmentData.
     * 
     * @param mpsCustomerReferenceNumber3   * Consignment customer reference number 3.
     */
    public void setMpsCustomerReferenceNumber3(java.lang.String mpsCustomerReferenceNumber3) {
        this.mpsCustomerReferenceNumber3 = mpsCustomerReferenceNumber3;
    }


    /**
     * Gets the mpsCustomerReferenceNumber4 value for this GeneralShipmentData.
     * 
     * @return mpsCustomerReferenceNumber4   * Consignment customer reference number 4.
     */
    public java.lang.String getMpsCustomerReferenceNumber4() {
        return mpsCustomerReferenceNumber4;
    }


    /**
     * Sets the mpsCustomerReferenceNumber4 value for this GeneralShipmentData.
     * 
     * @param mpsCustomerReferenceNumber4   * Consignment customer reference number 4.
     */
    public void setMpsCustomerReferenceNumber4(java.lang.String mpsCustomerReferenceNumber4) {
        this.mpsCustomerReferenceNumber4 = mpsCustomerReferenceNumber4;
    }


    /**
     * Gets the identificationNumber value for this GeneralShipmentData.
     * 
     * @return identificationNumber   * Serves as unique alphanumeric key of the shipment used by customer.
     */
    public java.lang.String getIdentificationNumber() {
        return identificationNumber;
    }


    /**
     * Sets the identificationNumber value for this GeneralShipmentData.
     * 
     * @param identificationNumber   * Serves as unique alphanumeric key of the shipment used by customer.
     */
    public void setIdentificationNumber(java.lang.String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }


    /**
     * Gets the sendingDepot value for this GeneralShipmentData.
     * 
     * @return sendingDepot   * Sending depot for consignment, ordering depot for collection
     * request, customer's depot for pickup information or creating/sending
     * depot for dangerous goods.
     * Four alphanumeric positions, including leading zeros, e.g. 0163.
     */
    public java.lang.String getSendingDepot() {
        return sendingDepot;
    }


    /**
     * Sets the sendingDepot value for this GeneralShipmentData.
     * 
     * @param sendingDepot   * Sending depot for consignment, ordering depot for collection
     * request, customer's depot for pickup information or creating/sending
     * depot for dangerous goods.
     * Four alphanumeric positions, including leading zeros, e.g. 0163.
     */
    public void setSendingDepot(java.lang.String sendingDepot) {
        this.sendingDepot = sendingDepot;
    }


    /**
     * Gets the product value for this GeneralShipmentData.
     * 
     * @return product   * Selection of product, exactly one per shipment, mandatory for
     * consignment data. Possible values are:
     * CL = DPD CLASSIC
     * E830 = DPD 8:30
     * E10 = DPD 10:00
     * E12 = DPD 12:00
     * E18 = DPD 18:00
     * IE2 = DPD EXPRESS
     * MAIL = DPD International Mail
     * MAX = DPD MAX
     * PL = DPD PARCELLetter
     * PL+ = DPD PARCELLetterPlus
     * PM4 = DPD Priority
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.GeneralShipmentDataProduct getProduct() {
        return product;
    }


    /**
     * Sets the product value for this GeneralShipmentData.
     * 
     * @param product   * Selection of product, exactly one per shipment, mandatory for
     * consignment data. Possible values are:
     * CL = DPD CLASSIC
     * E830 = DPD 8:30
     * E10 = DPD 10:00
     * E12 = DPD 12:00
     * E18 = DPD 18:00
     * IE2 = DPD EXPRESS
     * MAIL = DPD International Mail
     * MAX = DPD MAX
     * PL = DPD PARCELLetter
     * PL+ = DPD PARCELLetterPlus
     * PM4 = DPD Priority
     */
    public void setProduct(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.GeneralShipmentDataProduct product) {
        this.product = product;
    }


    /**
     * Gets the mpsCompleteDelivery value for this GeneralShipmentData.
     * 
     * @return mpsCompleteDelivery   * Specifies if this shipment should be sent as complete delivery.
     * Mandatory for COD. Default value is false.
     */
    public java.lang.Boolean getMpsCompleteDelivery() {
        return mpsCompleteDelivery;
    }


    /**
     * Sets the mpsCompleteDelivery value for this GeneralShipmentData.
     * 
     * @param mpsCompleteDelivery   * Specifies if this shipment should be sent as complete delivery.
     * Mandatory for COD. Default value is false.
     */
    public void setMpsCompleteDelivery(java.lang.Boolean mpsCompleteDelivery) {
        this.mpsCompleteDelivery = mpsCompleteDelivery;
    }


    /**
     * Gets the mpsCompleteDeliveryLabel value for this GeneralShipmentData.
     * 
     * @return mpsCompleteDeliveryLabel   * Specifies if the label for complete delivery is printed for
     * pickup. Mandatory for COD. Default value is false.
     */
    public java.lang.Boolean getMpsCompleteDeliveryLabel() {
        return mpsCompleteDeliveryLabel;
    }


    /**
     * Sets the mpsCompleteDeliveryLabel value for this GeneralShipmentData.
     * 
     * @param mpsCompleteDeliveryLabel   * Specifies if the label for complete delivery is printed for
     * pickup. Mandatory for COD. Default value is false.
     */
    public void setMpsCompleteDeliveryLabel(java.lang.Boolean mpsCompleteDeliveryLabel) {
        this.mpsCompleteDeliveryLabel = mpsCompleteDeliveryLabel;
    }


    /**
     * Gets the mpsVolume value for this GeneralShipmentData.
     * 
     * @return mpsVolume   * Volume per consignment in cm3 (without positions after the
     * decimal point).
     */
    public java.lang.Long getMpsVolume() {
        return mpsVolume;
    }


    /**
     * Sets the mpsVolume value for this GeneralShipmentData.
     * 
     * @param mpsVolume   * Volume per consignment in cm3 (without positions after the
     * decimal point).
     */
    public void setMpsVolume(java.lang.Long mpsVolume) {
        this.mpsVolume = mpsVolume;
    }


    /**
     * Gets the mpsWeight value for this GeneralShipmentData.
     * 
     * @return mpsWeight   * Shipment weight in grams rounded in 10 gram units without decimal
     * point (e.g. 300 equals 3kg).
     */
    public java.lang.Long getMpsWeight() {
        return mpsWeight;
    }


    /**
     * Sets the mpsWeight value for this GeneralShipmentData.
     * 
     * @param mpsWeight   * Shipment weight in grams rounded in 10 gram units without decimal
     * point (e.g. 300 equals 3kg).
     */
    public void setMpsWeight(java.lang.Long mpsWeight) {
        this.mpsWeight = mpsWeight;
    }


    /**
     * Gets the mpsExpectedSendingDate value for this GeneralShipmentData.
     * 
     * @return mpsExpectedSendingDate   * Date when the shipment is expected to be transferred to the
     * system. Format is YYYYMMDD.
     */
    public java.lang.String getMpsExpectedSendingDate() {
        return mpsExpectedSendingDate;
    }


    /**
     * Sets the mpsExpectedSendingDate value for this GeneralShipmentData.
     * 
     * @param mpsExpectedSendingDate   * Date when the shipment is expected to be transferred to the
     * system. Format is YYYYMMDD.
     */
    public void setMpsExpectedSendingDate(java.lang.String mpsExpectedSendingDate) {
        this.mpsExpectedSendingDate = mpsExpectedSendingDate;
    }


    /**
     * Gets the mpsExpectedSendingTime value for this GeneralShipmentData.
     * 
     * @return mpsExpectedSendingTime   * Time when the shipment is expected to be transferred to the
     * system. Format is HHMMSS.
     */
    public java.lang.String getMpsExpectedSendingTime() {
        return mpsExpectedSendingTime;
    }


    /**
     * Sets the mpsExpectedSendingTime value for this GeneralShipmentData.
     * 
     * @param mpsExpectedSendingTime   * Time when the shipment is expected to be transferred to the
     * system. Format is HHMMSS.
     */
    public void setMpsExpectedSendingTime(java.lang.String mpsExpectedSendingTime) {
        this.mpsExpectedSendingTime = mpsExpectedSendingTime;
    }


    /**
     * Gets the sender value for this GeneralShipmentData.
     * 
     * @return sender   * Consignment sender's address, collection request customer's
     * address or pickup information customer's address.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this GeneralShipmentData.
     * 
     * @param sender   * Consignment sender's address, collection request customer's
     * address or pickup information customer's address.
     */
    public void setSender(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address sender) {
        this.sender = sender;
    }


    /**
     * Gets the recipient value for this GeneralShipmentData.
     * 
     * @return recipient   * Address of the recipient. For parcel shop delivery address
     * of the real recipient.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this GeneralShipmentData.
     * 
     * @param recipient   * Address of the recipient. For parcel shop delivery address
     * of the real recipient.
     */
    public void setRecipient(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address recipient) {
        this.recipient = recipient;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneralShipmentData)) return false;
        GeneralShipmentData other = (GeneralShipmentData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mpsId==null && other.getMpsId()==null) || 
             (this.mpsId!=null &&
              this.mpsId.equals(other.getMpsId()))) &&
            ((this.cUser==null && other.getCUser()==null) || 
             (this.cUser!=null &&
              this.cUser.equals(other.getCUser()))) &&
            ((this.mpsCustomerReferenceNumber1==null && other.getMpsCustomerReferenceNumber1()==null) || 
             (this.mpsCustomerReferenceNumber1!=null &&
              this.mpsCustomerReferenceNumber1.equals(other.getMpsCustomerReferenceNumber1()))) &&
            ((this.mpsCustomerReferenceNumber2==null && other.getMpsCustomerReferenceNumber2()==null) || 
             (this.mpsCustomerReferenceNumber2!=null &&
              this.mpsCustomerReferenceNumber2.equals(other.getMpsCustomerReferenceNumber2()))) &&
            ((this.mpsCustomerReferenceNumber3==null && other.getMpsCustomerReferenceNumber3()==null) || 
             (this.mpsCustomerReferenceNumber3!=null &&
              this.mpsCustomerReferenceNumber3.equals(other.getMpsCustomerReferenceNumber3()))) &&
            ((this.mpsCustomerReferenceNumber4==null && other.getMpsCustomerReferenceNumber4()==null) || 
             (this.mpsCustomerReferenceNumber4!=null &&
              this.mpsCustomerReferenceNumber4.equals(other.getMpsCustomerReferenceNumber4()))) &&
            ((this.identificationNumber==null && other.getIdentificationNumber()==null) || 
             (this.identificationNumber!=null &&
              this.identificationNumber.equals(other.getIdentificationNumber()))) &&
            ((this.sendingDepot==null && other.getSendingDepot()==null) || 
             (this.sendingDepot!=null &&
              this.sendingDepot.equals(other.getSendingDepot()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.mpsCompleteDelivery==null && other.getMpsCompleteDelivery()==null) || 
             (this.mpsCompleteDelivery!=null &&
              this.mpsCompleteDelivery.equals(other.getMpsCompleteDelivery()))) &&
            ((this.mpsCompleteDeliveryLabel==null && other.getMpsCompleteDeliveryLabel()==null) || 
             (this.mpsCompleteDeliveryLabel!=null &&
              this.mpsCompleteDeliveryLabel.equals(other.getMpsCompleteDeliveryLabel()))) &&
            ((this.mpsVolume==null && other.getMpsVolume()==null) || 
             (this.mpsVolume!=null &&
              this.mpsVolume.equals(other.getMpsVolume()))) &&
            ((this.mpsWeight==null && other.getMpsWeight()==null) || 
             (this.mpsWeight!=null &&
              this.mpsWeight.equals(other.getMpsWeight()))) &&
            ((this.mpsExpectedSendingDate==null && other.getMpsExpectedSendingDate()==null) || 
             (this.mpsExpectedSendingDate!=null &&
              this.mpsExpectedSendingDate.equals(other.getMpsExpectedSendingDate()))) &&
            ((this.mpsExpectedSendingTime==null && other.getMpsExpectedSendingTime()==null) || 
             (this.mpsExpectedSendingTime!=null &&
              this.mpsExpectedSendingTime.equals(other.getMpsExpectedSendingTime()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient())));
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
        if (getMpsId() != null) {
            _hashCode += getMpsId().hashCode();
        }
        if (getCUser() != null) {
            _hashCode += getCUser().hashCode();
        }
        if (getMpsCustomerReferenceNumber1() != null) {
            _hashCode += getMpsCustomerReferenceNumber1().hashCode();
        }
        if (getMpsCustomerReferenceNumber2() != null) {
            _hashCode += getMpsCustomerReferenceNumber2().hashCode();
        }
        if (getMpsCustomerReferenceNumber3() != null) {
            _hashCode += getMpsCustomerReferenceNumber3().hashCode();
        }
        if (getMpsCustomerReferenceNumber4() != null) {
            _hashCode += getMpsCustomerReferenceNumber4().hashCode();
        }
        if (getIdentificationNumber() != null) {
            _hashCode += getIdentificationNumber().hashCode();
        }
        if (getSendingDepot() != null) {
            _hashCode += getSendingDepot().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getMpsCompleteDelivery() != null) {
            _hashCode += getMpsCompleteDelivery().hashCode();
        }
        if (getMpsCompleteDeliveryLabel() != null) {
            _hashCode += getMpsCompleteDeliveryLabel().hashCode();
        }
        if (getMpsVolume() != null) {
            _hashCode += getMpsVolume().hashCode();
        }
        if (getMpsWeight() != null) {
            _hashCode += getMpsWeight().hashCode();
        }
        if (getMpsExpectedSendingDate() != null) {
            _hashCode += getMpsExpectedSendingDate().hashCode();
        }
        if (getMpsExpectedSendingTime() != null) {
            _hashCode += getMpsExpectedSendingTime().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneralShipmentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "generalShipmentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsCustomerReferenceNumber1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsCustomerReferenceNumber1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsCustomerReferenceNumber2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsCustomerReferenceNumber2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsCustomerReferenceNumber3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsCustomerReferenceNumber3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsCustomerReferenceNumber4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsCustomerReferenceNumber4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendingDepot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendingDepot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">generalShipmentData>product"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsCompleteDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsCompleteDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsCompleteDeliveryLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsCompleteDeliveryLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsExpectedSendingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsExpectedSendingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpsExpectedSendingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mpsExpectedSendingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "address"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "address"));
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
