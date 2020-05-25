/**
 * Hazardous.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles hazardous materials data.
 */
public class Hazardous  implements java.io.Serializable {
    /* Defines UN number of hazardous substance. UN numbers range
     * between 0004 and 9004. */
    private java.lang.String identificationUnNo;

    /* Declares class of hazardous substance. Possible values range
     * from 1 to 9. Subclasses are specified as position after decimal point
     * (e.g. class 1 is "explosives", class 1.6 is "extremely insensitive
     * explosives"). */
    private java.lang.String identificationClass;

    /* Declares classification code of hazardous substance. */
    private java.lang.String classificationCode;

    /* Declares packing group of hazardous substance. Valid values
     * are "I", "II" and "III". */
    private java.lang.String packingGroup;

    /* Declares packing code.
     * Possible values are:
     * 0A = Thin sheet packing,
     * 0A1 = Thin sheet packing with non removable head,
     * 0A2 = Thin sheet packing with removable head,
     * 1A = Steel barrel,
     * 1A1 = Steel barrel with non removable head,
     * 1A2 = Steel barrel with removable head,
     * 1B = Aluminium barrel,
     * 1B1 = Aluminium barrel with non removable head,
     * 1B2 = Aluminium barrel with removable head,
     * 1H = Plastics barrel,
     * 1H1 = Plastics barrel with non removable head,
     * 1H2 = Plastics barrel with removable head,
     * 3A = Steel canister,
     * 3A1 = Steel canister with non removable head,
     * 3A2 = Steel canister with removable head,
     * 3B = Aluminium canister,
     * 3B1 = Aluminium canister with non removable head,
     * 3B2 = Aluminium canister with removable head,
     * 3H = Plastics canister,
     * 3H1 = Plastics canister with non removable head,
     * 3H2 = Plastics canister with removable head,
     * 4A = Steel crates,
     * 4B = Aluminium crate,
     * 4D = Plywood crate,
     * 4G = Cardboard crate,
     * 4H = Plastics crate,
     * 4H1 = Plastics crate plastics expanded,
     * 4H2 = Plastics crate plastics solid,
     * 5H = Plastics bags,
     * 5M = Paper bags,
     * 6H = Combination packings. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HazardousPackingCode packingCode;

    /* Description of hazardous substance (redundant). */
    private java.lang.String description;

    /* Subsidiary risk of hazardous substance (redundant). */
    private java.lang.String subsidiaryRisk;

    /* Tunnel restriction code of hazardous substance. Possible values
     * are "A", "B", "C", "D" or "E". */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HazardousTunnelRestrictionCode tunnelRestrictionCode;

    /* Weight of hazardous substance with up to 4 pre-decimal point
     * positions and 2 decimal digits with separator. */
    private java.math.BigDecimal hazardousWeight;

    /* Net weight of hazardous substance with up to 4 pre-decimal
     * point positions and 2 decimal point positions. */
    private java.math.BigDecimal netWeight;

    /* Factor of hazardous substance, 999 means unlimited. */
    private int factor;

    /* A not otherwise specified text which is mandatory for some
     * substances. */
    private java.lang.String notOtherwiseSpecified;

    public Hazardous() {
    }

    public Hazardous(
           java.lang.String identificationUnNo,
           java.lang.String identificationClass,
           java.lang.String classificationCode,
           java.lang.String packingGroup,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HazardousPackingCode packingCode,
           java.lang.String description,
           java.lang.String subsidiaryRisk,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HazardousTunnelRestrictionCode tunnelRestrictionCode,
           java.math.BigDecimal hazardousWeight,
           java.math.BigDecimal netWeight,
           int factor,
           java.lang.String notOtherwiseSpecified) {
           this.identificationUnNo = identificationUnNo;
           this.identificationClass = identificationClass;
           this.classificationCode = classificationCode;
           this.packingGroup = packingGroup;
           this.packingCode = packingCode;
           this.description = description;
           this.subsidiaryRisk = subsidiaryRisk;
           this.tunnelRestrictionCode = tunnelRestrictionCode;
           this.hazardousWeight = hazardousWeight;
           this.netWeight = netWeight;
           this.factor = factor;
           this.notOtherwiseSpecified = notOtherwiseSpecified;
    }


    /**
     * Gets the identificationUnNo value for this Hazardous.
     * 
     * @return identificationUnNo   * Defines UN number of hazardous substance. UN numbers range
     * between 0004 and 9004.
     */
    public java.lang.String getIdentificationUnNo() {
        return identificationUnNo;
    }


    /**
     * Sets the identificationUnNo value for this Hazardous.
     * 
     * @param identificationUnNo   * Defines UN number of hazardous substance. UN numbers range
     * between 0004 and 9004.
     */
    public void setIdentificationUnNo(java.lang.String identificationUnNo) {
        this.identificationUnNo = identificationUnNo;
    }


    /**
     * Gets the identificationClass value for this Hazardous.
     * 
     * @return identificationClass   * Declares class of hazardous substance. Possible values range
     * from 1 to 9. Subclasses are specified as position after decimal point
     * (e.g. class 1 is "explosives", class 1.6 is "extremely insensitive
     * explosives").
     */
    public java.lang.String getIdentificationClass() {
        return identificationClass;
    }


    /**
     * Sets the identificationClass value for this Hazardous.
     * 
     * @param identificationClass   * Declares class of hazardous substance. Possible values range
     * from 1 to 9. Subclasses are specified as position after decimal point
     * (e.g. class 1 is "explosives", class 1.6 is "extremely insensitive
     * explosives").
     */
    public void setIdentificationClass(java.lang.String identificationClass) {
        this.identificationClass = identificationClass;
    }


    /**
     * Gets the classificationCode value for this Hazardous.
     * 
     * @return classificationCode   * Declares classification code of hazardous substance.
     */
    public java.lang.String getClassificationCode() {
        return classificationCode;
    }


    /**
     * Sets the classificationCode value for this Hazardous.
     * 
     * @param classificationCode   * Declares classification code of hazardous substance.
     */
    public void setClassificationCode(java.lang.String classificationCode) {
        this.classificationCode = classificationCode;
    }


    /**
     * Gets the packingGroup value for this Hazardous.
     * 
     * @return packingGroup   * Declares packing group of hazardous substance. Valid values
     * are "I", "II" and "III".
     */
    public java.lang.String getPackingGroup() {
        return packingGroup;
    }


    /**
     * Sets the packingGroup value for this Hazardous.
     * 
     * @param packingGroup   * Declares packing group of hazardous substance. Valid values
     * are "I", "II" and "III".
     */
    public void setPackingGroup(java.lang.String packingGroup) {
        this.packingGroup = packingGroup;
    }


    /**
     * Gets the packingCode value for this Hazardous.
     * 
     * @return packingCode   * Declares packing code.
     * Possible values are:
     * 0A = Thin sheet packing,
     * 0A1 = Thin sheet packing with non removable head,
     * 0A2 = Thin sheet packing with removable head,
     * 1A = Steel barrel,
     * 1A1 = Steel barrel with non removable head,
     * 1A2 = Steel barrel with removable head,
     * 1B = Aluminium barrel,
     * 1B1 = Aluminium barrel with non removable head,
     * 1B2 = Aluminium barrel with removable head,
     * 1H = Plastics barrel,
     * 1H1 = Plastics barrel with non removable head,
     * 1H2 = Plastics barrel with removable head,
     * 3A = Steel canister,
     * 3A1 = Steel canister with non removable head,
     * 3A2 = Steel canister with removable head,
     * 3B = Aluminium canister,
     * 3B1 = Aluminium canister with non removable head,
     * 3B2 = Aluminium canister with removable head,
     * 3H = Plastics canister,
     * 3H1 = Plastics canister with non removable head,
     * 3H2 = Plastics canister with removable head,
     * 4A = Steel crates,
     * 4B = Aluminium crate,
     * 4D = Plywood crate,
     * 4G = Cardboard crate,
     * 4H = Plastics crate,
     * 4H1 = Plastics crate plastics expanded,
     * 4H2 = Plastics crate plastics solid,
     * 5H = Plastics bags,
     * 5M = Paper bags,
     * 6H = Combination packings.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HazardousPackingCode getPackingCode() {
        return packingCode;
    }


    /**
     * Sets the packingCode value for this Hazardous.
     * 
     * @param packingCode   * Declares packing code.
     * Possible values are:
     * 0A = Thin sheet packing,
     * 0A1 = Thin sheet packing with non removable head,
     * 0A2 = Thin sheet packing with removable head,
     * 1A = Steel barrel,
     * 1A1 = Steel barrel with non removable head,
     * 1A2 = Steel barrel with removable head,
     * 1B = Aluminium barrel,
     * 1B1 = Aluminium barrel with non removable head,
     * 1B2 = Aluminium barrel with removable head,
     * 1H = Plastics barrel,
     * 1H1 = Plastics barrel with non removable head,
     * 1H2 = Plastics barrel with removable head,
     * 3A = Steel canister,
     * 3A1 = Steel canister with non removable head,
     * 3A2 = Steel canister with removable head,
     * 3B = Aluminium canister,
     * 3B1 = Aluminium canister with non removable head,
     * 3B2 = Aluminium canister with removable head,
     * 3H = Plastics canister,
     * 3H1 = Plastics canister with non removable head,
     * 3H2 = Plastics canister with removable head,
     * 4A = Steel crates,
     * 4B = Aluminium crate,
     * 4D = Plywood crate,
     * 4G = Cardboard crate,
     * 4H = Plastics crate,
     * 4H1 = Plastics crate plastics expanded,
     * 4H2 = Plastics crate plastics solid,
     * 5H = Plastics bags,
     * 5M = Paper bags,
     * 6H = Combination packings.
     */
    public void setPackingCode(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HazardousPackingCode packingCode) {
        this.packingCode = packingCode;
    }


    /**
     * Gets the description value for this Hazardous.
     * 
     * @return description   * Description of hazardous substance (redundant).
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Hazardous.
     * 
     * @param description   * Description of hazardous substance (redundant).
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the subsidiaryRisk value for this Hazardous.
     * 
     * @return subsidiaryRisk   * Subsidiary risk of hazardous substance (redundant).
     */
    public java.lang.String getSubsidiaryRisk() {
        return subsidiaryRisk;
    }


    /**
     * Sets the subsidiaryRisk value for this Hazardous.
     * 
     * @param subsidiaryRisk   * Subsidiary risk of hazardous substance (redundant).
     */
    public void setSubsidiaryRisk(java.lang.String subsidiaryRisk) {
        this.subsidiaryRisk = subsidiaryRisk;
    }


    /**
     * Gets the tunnelRestrictionCode value for this Hazardous.
     * 
     * @return tunnelRestrictionCode   * Tunnel restriction code of hazardous substance. Possible values
     * are "A", "B", "C", "D" or "E".
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HazardousTunnelRestrictionCode getTunnelRestrictionCode() {
        return tunnelRestrictionCode;
    }


    /**
     * Sets the tunnelRestrictionCode value for this Hazardous.
     * 
     * @param tunnelRestrictionCode   * Tunnel restriction code of hazardous substance. Possible values
     * are "A", "B", "C", "D" or "E".
     */
    public void setTunnelRestrictionCode(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HazardousTunnelRestrictionCode tunnelRestrictionCode) {
        this.tunnelRestrictionCode = tunnelRestrictionCode;
    }


    /**
     * Gets the hazardousWeight value for this Hazardous.
     * 
     * @return hazardousWeight   * Weight of hazardous substance with up to 4 pre-decimal point
     * positions and 2 decimal digits with separator.
     */
    public java.math.BigDecimal getHazardousWeight() {
        return hazardousWeight;
    }


    /**
     * Sets the hazardousWeight value for this Hazardous.
     * 
     * @param hazardousWeight   * Weight of hazardous substance with up to 4 pre-decimal point
     * positions and 2 decimal digits with separator.
     */
    public void setHazardousWeight(java.math.BigDecimal hazardousWeight) {
        this.hazardousWeight = hazardousWeight;
    }


    /**
     * Gets the netWeight value for this Hazardous.
     * 
     * @return netWeight   * Net weight of hazardous substance with up to 4 pre-decimal
     * point positions and 2 decimal point positions.
     */
    public java.math.BigDecimal getNetWeight() {
        return netWeight;
    }


    /**
     * Sets the netWeight value for this Hazardous.
     * 
     * @param netWeight   * Net weight of hazardous substance with up to 4 pre-decimal
     * point positions and 2 decimal point positions.
     */
    public void setNetWeight(java.math.BigDecimal netWeight) {
        this.netWeight = netWeight;
    }


    /**
     * Gets the factor value for this Hazardous.
     * 
     * @return factor   * Factor of hazardous substance, 999 means unlimited.
     */
    public int getFactor() {
        return factor;
    }


    /**
     * Sets the factor value for this Hazardous.
     * 
     * @param factor   * Factor of hazardous substance, 999 means unlimited.
     */
    public void setFactor(int factor) {
        this.factor = factor;
    }


    /**
     * Gets the notOtherwiseSpecified value for this Hazardous.
     * 
     * @return notOtherwiseSpecified   * A not otherwise specified text which is mandatory for some
     * substances.
     */
    public java.lang.String getNotOtherwiseSpecified() {
        return notOtherwiseSpecified;
    }


    /**
     * Sets the notOtherwiseSpecified value for this Hazardous.
     * 
     * @param notOtherwiseSpecified   * A not otherwise specified text which is mandatory for some
     * substances.
     */
    public void setNotOtherwiseSpecified(java.lang.String notOtherwiseSpecified) {
        this.notOtherwiseSpecified = notOtherwiseSpecified;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hazardous)) return false;
        Hazardous other = (Hazardous) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificationUnNo==null && other.getIdentificationUnNo()==null) || 
             (this.identificationUnNo!=null &&
              this.identificationUnNo.equals(other.getIdentificationUnNo()))) &&
            ((this.identificationClass==null && other.getIdentificationClass()==null) || 
             (this.identificationClass!=null &&
              this.identificationClass.equals(other.getIdentificationClass()))) &&
            ((this.classificationCode==null && other.getClassificationCode()==null) || 
             (this.classificationCode!=null &&
              this.classificationCode.equals(other.getClassificationCode()))) &&
            ((this.packingGroup==null && other.getPackingGroup()==null) || 
             (this.packingGroup!=null &&
              this.packingGroup.equals(other.getPackingGroup()))) &&
            ((this.packingCode==null && other.getPackingCode()==null) || 
             (this.packingCode!=null &&
              this.packingCode.equals(other.getPackingCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.subsidiaryRisk==null && other.getSubsidiaryRisk()==null) || 
             (this.subsidiaryRisk!=null &&
              this.subsidiaryRisk.equals(other.getSubsidiaryRisk()))) &&
            ((this.tunnelRestrictionCode==null && other.getTunnelRestrictionCode()==null) || 
             (this.tunnelRestrictionCode!=null &&
              this.tunnelRestrictionCode.equals(other.getTunnelRestrictionCode()))) &&
            ((this.hazardousWeight==null && other.getHazardousWeight()==null) || 
             (this.hazardousWeight!=null &&
              this.hazardousWeight.equals(other.getHazardousWeight()))) &&
            ((this.netWeight==null && other.getNetWeight()==null) || 
             (this.netWeight!=null &&
              this.netWeight.equals(other.getNetWeight()))) &&
            this.factor == other.getFactor() &&
            ((this.notOtherwiseSpecified==null && other.getNotOtherwiseSpecified()==null) || 
             (this.notOtherwiseSpecified!=null &&
              this.notOtherwiseSpecified.equals(other.getNotOtherwiseSpecified())));
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
        if (getIdentificationUnNo() != null) {
            _hashCode += getIdentificationUnNo().hashCode();
        }
        if (getIdentificationClass() != null) {
            _hashCode += getIdentificationClass().hashCode();
        }
        if (getClassificationCode() != null) {
            _hashCode += getClassificationCode().hashCode();
        }
        if (getPackingGroup() != null) {
            _hashCode += getPackingGroup().hashCode();
        }
        if (getPackingCode() != null) {
            _hashCode += getPackingCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSubsidiaryRisk() != null) {
            _hashCode += getSubsidiaryRisk().hashCode();
        }
        if (getTunnelRestrictionCode() != null) {
            _hashCode += getTunnelRestrictionCode().hashCode();
        }
        if (getHazardousWeight() != null) {
            _hashCode += getHazardousWeight().hashCode();
        }
        if (getNetWeight() != null) {
            _hashCode += getNetWeight().hashCode();
        }
        _hashCode += getFactor();
        if (getNotOtherwiseSpecified() != null) {
            _hashCode += getNotOtherwiseSpecified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Hazardous.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "hazardous"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationUnNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificationUnNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identificationClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">hazardous>packingCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryRisk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subsidiaryRisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunnelRestrictionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tunnelRestrictionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">hazardous>tunnelRestrictionCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardousWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hazardousWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "factor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notOtherwiseSpecified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notOtherwiseSpecified"));
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
