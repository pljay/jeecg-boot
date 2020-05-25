/**
 * Cod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles cash on delivery data.
 */
public class Cod  implements java.io.Serializable {
    /* COD amount in the currency of the destination country. The
     * amount is specified as integer value e.g. 300.00 becomes 30000.
     * Please note the national ceilings for cod in the corresponding relations. */
    private long amount;

    /* ISO 4217 alpha-3 currency code (destination country). */
    private java.lang.String currency;

    /* Declares type of collection.
     * Possible values are:
     * 0 = Cash,
     * 1 = Crossed cheque. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.CodInkasso inkasso;

    /* Purpose of use. */
    private java.lang.String purpose;

    /* Bank code. If this value is filled, parameters for bankName,
     * bankAccountNumber and bankAccountHolder must also be filled. */
    private java.lang.String bankCode;

    /* Bank name. If this value is filled, parameters for bankCode,
     * bankAccountNumber and bankAccountHolder must also be filled. */
    private java.lang.String bankName;

    /* Bank account number. If this value is filled, parameters for
     * bankCode, bankName and bankAccountHolder must also be filled. */
    private java.lang.String bankAccountNumber;

    /* Account holder. If this value is filled, parameters for bankCode,
     * bankName and bankAccountNumber must also be filled. */
    private java.lang.String bankAccountHolder;

    /* International account number.
     * If this value is filled, parameters for bankCode, bankName, bankAccountNumber
     * and bankAccountHolder must also be filled. */
    private java.lang.String iban;

    /* Bank identifier code.
     * If this value is filled, parameters for bankCode, bankName, bankAccountNumber
     * and bankAccountHolder must also be filled. */
    private java.lang.String bic;

    public Cod() {
    }

    public Cod(
           long amount,
           java.lang.String currency,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.CodInkasso inkasso,
           java.lang.String purpose,
           java.lang.String bankCode,
           java.lang.String bankName,
           java.lang.String bankAccountNumber,
           java.lang.String bankAccountHolder,
           java.lang.String iban,
           java.lang.String bic) {
           this.amount = amount;
           this.currency = currency;
           this.inkasso = inkasso;
           this.purpose = purpose;
           this.bankCode = bankCode;
           this.bankName = bankName;
           this.bankAccountNumber = bankAccountNumber;
           this.bankAccountHolder = bankAccountHolder;
           this.iban = iban;
           this.bic = bic;
    }


    /**
     * Gets the amount value for this Cod.
     * 
     * @return amount   * COD amount in the currency of the destination country. The
     * amount is specified as integer value e.g. 300.00 becomes 30000.
     * Please note the national ceilings for cod in the corresponding relations.
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Cod.
     * 
     * @param amount   * COD amount in the currency of the destination country. The
     * amount is specified as integer value e.g. 300.00 becomes 30000.
     * Please note the national ceilings for cod in the corresponding relations.
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this Cod.
     * 
     * @return currency   * ISO 4217 alpha-3 currency code (destination country).
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Cod.
     * 
     * @param currency   * ISO 4217 alpha-3 currency code (destination country).
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the inkasso value for this Cod.
     * 
     * @return inkasso   * Declares type of collection.
     * Possible values are:
     * 0 = Cash,
     * 1 = Crossed cheque.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.CodInkasso getInkasso() {
        return inkasso;
    }


    /**
     * Sets the inkasso value for this Cod.
     * 
     * @param inkasso   * Declares type of collection.
     * Possible values are:
     * 0 = Cash,
     * 1 = Crossed cheque.
     */
    public void setInkasso(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.CodInkasso inkasso) {
        this.inkasso = inkasso;
    }


    /**
     * Gets the purpose value for this Cod.
     * 
     * @return purpose   * Purpose of use.
     */
    public java.lang.String getPurpose() {
        return purpose;
    }


    /**
     * Sets the purpose value for this Cod.
     * 
     * @param purpose   * Purpose of use.
     */
    public void setPurpose(java.lang.String purpose) {
        this.purpose = purpose;
    }


    /**
     * Gets the bankCode value for this Cod.
     * 
     * @return bankCode   * Bank code. If this value is filled, parameters for bankName,
     * bankAccountNumber and bankAccountHolder must also be filled.
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this Cod.
     * 
     * @param bankCode   * Bank code. If this value is filled, parameters for bankName,
     * bankAccountNumber and bankAccountHolder must also be filled.
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankName value for this Cod.
     * 
     * @return bankName   * Bank name. If this value is filled, parameters for bankCode,
     * bankAccountNumber and bankAccountHolder must also be filled.
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this Cod.
     * 
     * @param bankName   * Bank name. If this value is filled, parameters for bankCode,
     * bankAccountNumber and bankAccountHolder must also be filled.
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the bankAccountNumber value for this Cod.
     * 
     * @return bankAccountNumber   * Bank account number. If this value is filled, parameters for
     * bankCode, bankName and bankAccountHolder must also be filled.
     */
    public java.lang.String getBankAccountNumber() {
        return bankAccountNumber;
    }


    /**
     * Sets the bankAccountNumber value for this Cod.
     * 
     * @param bankAccountNumber   * Bank account number. If this value is filled, parameters for
     * bankCode, bankName and bankAccountHolder must also be filled.
     */
    public void setBankAccountNumber(java.lang.String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }


    /**
     * Gets the bankAccountHolder value for this Cod.
     * 
     * @return bankAccountHolder   * Account holder. If this value is filled, parameters for bankCode,
     * bankName and bankAccountNumber must also be filled.
     */
    public java.lang.String getBankAccountHolder() {
        return bankAccountHolder;
    }


    /**
     * Sets the bankAccountHolder value for this Cod.
     * 
     * @param bankAccountHolder   * Account holder. If this value is filled, parameters for bankCode,
     * bankName and bankAccountNumber must also be filled.
     */
    public void setBankAccountHolder(java.lang.String bankAccountHolder) {
        this.bankAccountHolder = bankAccountHolder;
    }


    /**
     * Gets the iban value for this Cod.
     * 
     * @return iban   * International account number.
     * If this value is filled, parameters for bankCode, bankName, bankAccountNumber
     * and bankAccountHolder must also be filled.
     */
    public java.lang.String getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this Cod.
     * 
     * @param iban   * International account number.
     * If this value is filled, parameters for bankCode, bankName, bankAccountNumber
     * and bankAccountHolder must also be filled.
     */
    public void setIban(java.lang.String iban) {
        this.iban = iban;
    }


    /**
     * Gets the bic value for this Cod.
     * 
     * @return bic   * Bank identifier code.
     * If this value is filled, parameters for bankCode, bankName, bankAccountNumber
     * and bankAccountHolder must also be filled.
     */
    public java.lang.String getBic() {
        return bic;
    }


    /**
     * Sets the bic value for this Cod.
     * 
     * @param bic   * Bank identifier code.
     * If this value is filled, parameters for bankCode, bankName, bankAccountNumber
     * and bankAccountHolder must also be filled.
     */
    public void setBic(java.lang.String bic) {
        this.bic = bic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cod)) return false;
        Cod other = (Cod) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.inkasso==null && other.getInkasso()==null) || 
             (this.inkasso!=null &&
              this.inkasso.equals(other.getInkasso()))) &&
            ((this.purpose==null && other.getPurpose()==null) || 
             (this.purpose!=null &&
              this.purpose.equals(other.getPurpose()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.bankAccountNumber==null && other.getBankAccountNumber()==null) || 
             (this.bankAccountNumber!=null &&
              this.bankAccountNumber.equals(other.getBankAccountNumber()))) &&
            ((this.bankAccountHolder==null && other.getBankAccountHolder()==null) || 
             (this.bankAccountHolder!=null &&
              this.bankAccountHolder.equals(other.getBankAccountHolder()))) &&
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban()))) &&
            ((this.bic==null && other.getBic()==null) || 
             (this.bic!=null &&
              this.bic.equals(other.getBic())));
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
        _hashCode += new Long(getAmount()).hashCode();
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getInkasso() != null) {
            _hashCode += getInkasso().hashCode();
        }
        if (getPurpose() != null) {
            _hashCode += getPurpose().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getBankAccountNumber() != null) {
            _hashCode += getBankAccountNumber().hashCode();
        }
        if (getBankAccountHolder() != null) {
            _hashCode += getBankAccountHolder().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        if (getBic() != null) {
            _hashCode += getBic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cod.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "cod"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inkasso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inkasso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">cod>inkasso"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purpose");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purpose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankAccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankAccountHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bic"));
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
