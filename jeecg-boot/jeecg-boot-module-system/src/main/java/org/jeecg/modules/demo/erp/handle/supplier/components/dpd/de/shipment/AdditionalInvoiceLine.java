/**
 * AdditionalInvoiceLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles information about an invoice position for international
 * parcels.
 */
public class AdditionalInvoiceLine  implements java.io.Serializable {
    /* Number of invoice position. */
    private java.lang.Integer customsInvoicePosition;

    /* Number of items. */
    private java.lang.Integer quantityItems;

    /* Content. */
    private java.lang.String customsContent;

    /* Customs tarif number. */
    private java.lang.String customsTarif;

    /* Value of invoice position (in invoice currency) with two decimal
     * digits without separator. */
    private java.lang.Long customsAmountLine;

    /* Country of invoice origin (ISO 3166). */
    private java.lang.Integer customsOrigin;

    /* Parcel net weight in gramm rounded in 10 gramm units without
     * decimal delimiter (e.g. 300 equals 3kg). */
    private java.lang.Integer customsNetWeight;

    /* Parcel gross weight in gramm rounded in 10 gramm units without
     * decimal delimiter (e.g. 300 equals 3kg). */
    private java.lang.Integer customsGrossWeight;

    public AdditionalInvoiceLine() {
    }

    public AdditionalInvoiceLine(
           java.lang.Integer customsInvoicePosition,
           java.lang.Integer quantityItems,
           java.lang.String customsContent,
           java.lang.String customsTarif,
           java.lang.Long customsAmountLine,
           java.lang.Integer customsOrigin,
           java.lang.Integer customsNetWeight,
           java.lang.Integer customsGrossWeight) {
           this.customsInvoicePosition = customsInvoicePosition;
           this.quantityItems = quantityItems;
           this.customsContent = customsContent;
           this.customsTarif = customsTarif;
           this.customsAmountLine = customsAmountLine;
           this.customsOrigin = customsOrigin;
           this.customsNetWeight = customsNetWeight;
           this.customsGrossWeight = customsGrossWeight;
    }


    /**
     * Gets the customsInvoicePosition value for this AdditionalInvoiceLine.
     * 
     * @return customsInvoicePosition   * Number of invoice position.
     */
    public java.lang.Integer getCustomsInvoicePosition() {
        return customsInvoicePosition;
    }


    /**
     * Sets the customsInvoicePosition value for this AdditionalInvoiceLine.
     * 
     * @param customsInvoicePosition   * Number of invoice position.
     */
    public void setCustomsInvoicePosition(java.lang.Integer customsInvoicePosition) {
        this.customsInvoicePosition = customsInvoicePosition;
    }


    /**
     * Gets the quantityItems value for this AdditionalInvoiceLine.
     * 
     * @return quantityItems   * Number of items.
     */
    public java.lang.Integer getQuantityItems() {
        return quantityItems;
    }


    /**
     * Sets the quantityItems value for this AdditionalInvoiceLine.
     * 
     * @param quantityItems   * Number of items.
     */
    public void setQuantityItems(java.lang.Integer quantityItems) {
        this.quantityItems = quantityItems;
    }


    /**
     * Gets the customsContent value for this AdditionalInvoiceLine.
     * 
     * @return customsContent   * Content.
     */
    public java.lang.String getCustomsContent() {
        return customsContent;
    }


    /**
     * Sets the customsContent value for this AdditionalInvoiceLine.
     * 
     * @param customsContent   * Content.
     */
    public void setCustomsContent(java.lang.String customsContent) {
        this.customsContent = customsContent;
    }


    /**
     * Gets the customsTarif value for this AdditionalInvoiceLine.
     * 
     * @return customsTarif   * Customs tarif number.
     */
    public java.lang.String getCustomsTarif() {
        return customsTarif;
    }


    /**
     * Sets the customsTarif value for this AdditionalInvoiceLine.
     * 
     * @param customsTarif   * Customs tarif number.
     */
    public void setCustomsTarif(java.lang.String customsTarif) {
        this.customsTarif = customsTarif;
    }


    /**
     * Gets the customsAmountLine value for this AdditionalInvoiceLine.
     * 
     * @return customsAmountLine   * Value of invoice position (in invoice currency) with two decimal
     * digits without separator.
     */
    public java.lang.Long getCustomsAmountLine() {
        return customsAmountLine;
    }


    /**
     * Sets the customsAmountLine value for this AdditionalInvoiceLine.
     * 
     * @param customsAmountLine   * Value of invoice position (in invoice currency) with two decimal
     * digits without separator.
     */
    public void setCustomsAmountLine(java.lang.Long customsAmountLine) {
        this.customsAmountLine = customsAmountLine;
    }


    /**
     * Gets the customsOrigin value for this AdditionalInvoiceLine.
     * 
     * @return customsOrigin   * Country of invoice origin (ISO 3166).
     */
    public java.lang.Integer getCustomsOrigin() {
        return customsOrigin;
    }


    /**
     * Sets the customsOrigin value for this AdditionalInvoiceLine.
     * 
     * @param customsOrigin   * Country of invoice origin (ISO 3166).
     */
    public void setCustomsOrigin(java.lang.Integer customsOrigin) {
        this.customsOrigin = customsOrigin;
    }


    /**
     * Gets the customsNetWeight value for this AdditionalInvoiceLine.
     * 
     * @return customsNetWeight   * Parcel net weight in gramm rounded in 10 gramm units without
     * decimal delimiter (e.g. 300 equals 3kg).
     */
    public java.lang.Integer getCustomsNetWeight() {
        return customsNetWeight;
    }


    /**
     * Sets the customsNetWeight value for this AdditionalInvoiceLine.
     * 
     * @param customsNetWeight   * Parcel net weight in gramm rounded in 10 gramm units without
     * decimal delimiter (e.g. 300 equals 3kg).
     */
    public void setCustomsNetWeight(java.lang.Integer customsNetWeight) {
        this.customsNetWeight = customsNetWeight;
    }


    /**
     * Gets the customsGrossWeight value for this AdditionalInvoiceLine.
     * 
     * @return customsGrossWeight   * Parcel gross weight in gramm rounded in 10 gramm units without
     * decimal delimiter (e.g. 300 equals 3kg).
     */
    public java.lang.Integer getCustomsGrossWeight() {
        return customsGrossWeight;
    }


    /**
     * Sets the customsGrossWeight value for this AdditionalInvoiceLine.
     * 
     * @param customsGrossWeight   * Parcel gross weight in gramm rounded in 10 gramm units without
     * decimal delimiter (e.g. 300 equals 3kg).
     */
    public void setCustomsGrossWeight(java.lang.Integer customsGrossWeight) {
        this.customsGrossWeight = customsGrossWeight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdditionalInvoiceLine)) return false;
        AdditionalInvoiceLine other = (AdditionalInvoiceLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customsInvoicePosition==null && other.getCustomsInvoicePosition()==null) || 
             (this.customsInvoicePosition!=null &&
              this.customsInvoicePosition.equals(other.getCustomsInvoicePosition()))) &&
            ((this.quantityItems==null && other.getQuantityItems()==null) || 
             (this.quantityItems!=null &&
              this.quantityItems.equals(other.getQuantityItems()))) &&
            ((this.customsContent==null && other.getCustomsContent()==null) || 
             (this.customsContent!=null &&
              this.customsContent.equals(other.getCustomsContent()))) &&
            ((this.customsTarif==null && other.getCustomsTarif()==null) || 
             (this.customsTarif!=null &&
              this.customsTarif.equals(other.getCustomsTarif()))) &&
            ((this.customsAmountLine==null && other.getCustomsAmountLine()==null) || 
             (this.customsAmountLine!=null &&
              this.customsAmountLine.equals(other.getCustomsAmountLine()))) &&
            ((this.customsOrigin==null && other.getCustomsOrigin()==null) || 
             (this.customsOrigin!=null &&
              this.customsOrigin.equals(other.getCustomsOrigin()))) &&
            ((this.customsNetWeight==null && other.getCustomsNetWeight()==null) || 
             (this.customsNetWeight!=null &&
              this.customsNetWeight.equals(other.getCustomsNetWeight()))) &&
            ((this.customsGrossWeight==null && other.getCustomsGrossWeight()==null) || 
             (this.customsGrossWeight!=null &&
              this.customsGrossWeight.equals(other.getCustomsGrossWeight())));
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
        if (getCustomsInvoicePosition() != null) {
            _hashCode += getCustomsInvoicePosition().hashCode();
        }
        if (getQuantityItems() != null) {
            _hashCode += getQuantityItems().hashCode();
        }
        if (getCustomsContent() != null) {
            _hashCode += getCustomsContent().hashCode();
        }
        if (getCustomsTarif() != null) {
            _hashCode += getCustomsTarif().hashCode();
        }
        if (getCustomsAmountLine() != null) {
            _hashCode += getCustomsAmountLine().hashCode();
        }
        if (getCustomsOrigin() != null) {
            _hashCode += getCustomsOrigin().hashCode();
        }
        if (getCustomsNetWeight() != null) {
            _hashCode += getCustomsNetWeight().hashCode();
        }
        if (getCustomsGrossWeight() != null) {
            _hashCode += getCustomsGrossWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdditionalInvoiceLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "additionalInvoiceLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsInvoicePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsInvoicePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantityItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsTarif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsTarif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsAmountLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsAmountLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsNetWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsNetWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsGrossWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsGrossWeight"));
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
