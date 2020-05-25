/**
 * Parcel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles parcel data.
 */
public class Parcel  implements java.io.Serializable {
    /* Parcel label number. Number range and validity are checked. */
    private java.lang.String parcelLabelNumber;

    /* Parcel customer reference number 1. */
    private java.lang.String customerReferenceNumber1;

    /* Parcel customer reference number 2. */
    private java.lang.String customerReferenceNumber2;

    /* Parcel customer reference number 3. */
    private java.lang.String customerReferenceNumber3;

    /* Parcel customer reference number 4. */
    private java.lang.String customerReferenceNumber4;

    /* Specifies if this parcel is a consignment swap parcel. Default
     * value is false. */
    private java.lang.Boolean swap;

    /* Volume of the single parcel (length/width/height in format
     * LLLWWWHHH) in cm without separators. */
    private java.lang.Integer volume;

    /* Parcel weight in grams rounded in 10 gram units without decimal
     * point (e.g. 300 equals 3kg).
     * Consignment allows 8-digit values, collection requests 7-digit and
     * dangerous goods 6-digit. */
    private java.lang.Integer weight;

    /* Specifies if this parcel is a limited quantities hazardous
     * goods parcel. Default value is false. */
    private java.lang.Boolean hazardousLimitedQuantities;

    /* Specifies if this parcel has increased insurance value. Default
     * value is false. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HigherInsurance higherInsurance;

    /* Content of this parcel, mandatory for increased insurance.
     * For collection requests maximum length is 50, for consignment it is
     * 35. */
    private java.lang.String content;

    /* Additional service.
     * Possible values are:
     * 1 = Delivery information,
     * 2 = Documents return,
     * 3 = Written permission to deposit goods by sender. */
    private java.lang.Integer addService;

    /* Message number for consignment shipper information. Default
     * value is 1. */
    private java.lang.Integer messageNumber;

    /* Blockable functions.
     * Possible values are:
     * LOCKDZB = Delivery to a third party with notification of delivery,
     * LOCKASG = Written permission to deposit goods,
     * LOCKEVM = Delivery with non-recurring authority,
     * LOCKSHOP = Parcel shop,
     * LOCKTV = Appointment. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelFunction function;

    /* Free text for blockable functions. */
    private java.lang.String parameter;

    /* Contains COD data for COD consignments. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Cod cod;

    /* Contains data for consignments across customs borders. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.International international;

    /* Contains packing and substance data for dangerous goods. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Hazardous[] hazardous;

    /* Flag for determining if content of parameter info1 will be
     * added on the label of a collection request parcel. Default value is
     * false. */
    private java.lang.Boolean printInfo1OnParcelLabel;

    /* Information text 1. This will be printed on the parcel label
     * if the flag printInfo1OnParcellabel is set to true. */
    private java.lang.String info1;

    /* Information text 2. This will not be printed on the parcel
     * label. */
    private java.lang.String info2;

    /* Specifies if parcel is a return parcel.
     * The return parcel must always be next in order to the corresponding
     * outbound parcel. Default value is false. */
    private java.lang.Boolean returns;

    /* Parcel class. See Parcelclass in MPSEXPDATA specification for
     * valid values. */
    private java.lang.String parcelClass;

    public Parcel() {
    }

    public Parcel(
           java.lang.String parcelLabelNumber,
           java.lang.String customerReferenceNumber1,
           java.lang.String customerReferenceNumber2,
           java.lang.String customerReferenceNumber3,
           java.lang.String customerReferenceNumber4,
           java.lang.Boolean swap,
           java.lang.Integer volume,
           java.lang.Integer weight,
           java.lang.Boolean hazardousLimitedQuantities,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HigherInsurance higherInsurance,
           java.lang.String content,
           java.lang.Integer addService,
           java.lang.Integer messageNumber,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelFunction function,
           java.lang.String parameter,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Cod cod,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.International international,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Hazardous[] hazardous,
           java.lang.Boolean printInfo1OnParcelLabel,
           java.lang.String info1,
           java.lang.String info2,
           java.lang.Boolean returns,
           java.lang.String parcelClass) {
           this.parcelLabelNumber = parcelLabelNumber;
           this.customerReferenceNumber1 = customerReferenceNumber1;
           this.customerReferenceNumber2 = customerReferenceNumber2;
           this.customerReferenceNumber3 = customerReferenceNumber3;
           this.customerReferenceNumber4 = customerReferenceNumber4;
           this.swap = swap;
           this.volume = volume;
           this.weight = weight;
           this.hazardousLimitedQuantities = hazardousLimitedQuantities;
           this.higherInsurance = higherInsurance;
           this.content = content;
           this.addService = addService;
           this.messageNumber = messageNumber;
           this.function = function;
           this.parameter = parameter;
           this.cod = cod;
           this.international = international;
           this.hazardous = hazardous;
           this.printInfo1OnParcelLabel = printInfo1OnParcelLabel;
           this.info1 = info1;
           this.info2 = info2;
           this.returns = returns;
           this.parcelClass = parcelClass;
    }


    /**
     * Gets the parcelLabelNumber value for this Parcel.
     * 
     * @return parcelLabelNumber   * Parcel label number. Number range and validity are checked.
     */
    public java.lang.String getParcelLabelNumber() {
        return parcelLabelNumber;
    }


    /**
     * Sets the parcelLabelNumber value for this Parcel.
     * 
     * @param parcelLabelNumber   * Parcel label number. Number range and validity are checked.
     */
    public void setParcelLabelNumber(java.lang.String parcelLabelNumber) {
        this.parcelLabelNumber = parcelLabelNumber;
    }


    /**
     * Gets the customerReferenceNumber1 value for this Parcel.
     * 
     * @return customerReferenceNumber1   * Parcel customer reference number 1.
     */
    public java.lang.String getCustomerReferenceNumber1() {
        return customerReferenceNumber1;
    }


    /**
     * Sets the customerReferenceNumber1 value for this Parcel.
     * 
     * @param customerReferenceNumber1   * Parcel customer reference number 1.
     */
    public void setCustomerReferenceNumber1(java.lang.String customerReferenceNumber1) {
        this.customerReferenceNumber1 = customerReferenceNumber1;
    }


    /**
     * Gets the customerReferenceNumber2 value for this Parcel.
     * 
     * @return customerReferenceNumber2   * Parcel customer reference number 2.
     */
    public java.lang.String getCustomerReferenceNumber2() {
        return customerReferenceNumber2;
    }


    /**
     * Sets the customerReferenceNumber2 value for this Parcel.
     * 
     * @param customerReferenceNumber2   * Parcel customer reference number 2.
     */
    public void setCustomerReferenceNumber2(java.lang.String customerReferenceNumber2) {
        this.customerReferenceNumber2 = customerReferenceNumber2;
    }


    /**
     * Gets the customerReferenceNumber3 value for this Parcel.
     * 
     * @return customerReferenceNumber3   * Parcel customer reference number 3.
     */
    public java.lang.String getCustomerReferenceNumber3() {
        return customerReferenceNumber3;
    }


    /**
     * Sets the customerReferenceNumber3 value for this Parcel.
     * 
     * @param customerReferenceNumber3   * Parcel customer reference number 3.
     */
    public void setCustomerReferenceNumber3(java.lang.String customerReferenceNumber3) {
        this.customerReferenceNumber3 = customerReferenceNumber3;
    }


    /**
     * Gets the customerReferenceNumber4 value for this Parcel.
     * 
     * @return customerReferenceNumber4   * Parcel customer reference number 4.
     */
    public java.lang.String getCustomerReferenceNumber4() {
        return customerReferenceNumber4;
    }


    /**
     * Sets the customerReferenceNumber4 value for this Parcel.
     * 
     * @param customerReferenceNumber4   * Parcel customer reference number 4.
     */
    public void setCustomerReferenceNumber4(java.lang.String customerReferenceNumber4) {
        this.customerReferenceNumber4 = customerReferenceNumber4;
    }


    /**
     * Gets the swap value for this Parcel.
     * 
     * @return swap   * Specifies if this parcel is a consignment swap parcel. Default
     * value is false.
     */
    public java.lang.Boolean getSwap() {
        return swap;
    }


    /**
     * Sets the swap value for this Parcel.
     * 
     * @param swap   * Specifies if this parcel is a consignment swap parcel. Default
     * value is false.
     */
    public void setSwap(java.lang.Boolean swap) {
        this.swap = swap;
    }


    /**
     * Gets the volume value for this Parcel.
     * 
     * @return volume   * Volume of the single parcel (length/width/height in format
     * LLLWWWHHH) in cm without separators.
     */
    public java.lang.Integer getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this Parcel.
     * 
     * @param volume   * Volume of the single parcel (length/width/height in format
     * LLLWWWHHH) in cm without separators.
     */
    public void setVolume(java.lang.Integer volume) {
        this.volume = volume;
    }


    /**
     * Gets the weight value for this Parcel.
     * 
     * @return weight   * Parcel weight in grams rounded in 10 gram units without decimal
     * point (e.g. 300 equals 3kg).
     * Consignment allows 8-digit values, collection requests 7-digit and
     * dangerous goods 6-digit.
     */
    public java.lang.Integer getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Parcel.
     * 
     * @param weight   * Parcel weight in grams rounded in 10 gram units without decimal
     * point (e.g. 300 equals 3kg).
     * Consignment allows 8-digit values, collection requests 7-digit and
     * dangerous goods 6-digit.
     */
    public void setWeight(java.lang.Integer weight) {
        this.weight = weight;
    }


    /**
     * Gets the hazardousLimitedQuantities value for this Parcel.
     * 
     * @return hazardousLimitedQuantities   * Specifies if this parcel is a limited quantities hazardous
     * goods parcel. Default value is false.
     */
    public java.lang.Boolean getHazardousLimitedQuantities() {
        return hazardousLimitedQuantities;
    }


    /**
     * Sets the hazardousLimitedQuantities value for this Parcel.
     * 
     * @param hazardousLimitedQuantities   * Specifies if this parcel is a limited quantities hazardous
     * goods parcel. Default value is false.
     */
    public void setHazardousLimitedQuantities(java.lang.Boolean hazardousLimitedQuantities) {
        this.hazardousLimitedQuantities = hazardousLimitedQuantities;
    }


    /**
     * Gets the higherInsurance value for this Parcel.
     * 
     * @return higherInsurance   * Specifies if this parcel has increased insurance value. Default
     * value is false.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HigherInsurance getHigherInsurance() {
        return higherInsurance;
    }


    /**
     * Sets the higherInsurance value for this Parcel.
     * 
     * @param higherInsurance   * Specifies if this parcel has increased insurance value. Default
     * value is false.
     */
    public void setHigherInsurance(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.HigherInsurance higherInsurance) {
        this.higherInsurance = higherInsurance;
    }


    /**
     * Gets the content value for this Parcel.
     * 
     * @return content   * Content of this parcel, mandatory for increased insurance.
     * For collection requests maximum length is 50, for consignment it is
     * 35.
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this Parcel.
     * 
     * @param content   * Content of this parcel, mandatory for increased insurance.
     * For collection requests maximum length is 50, for consignment it is
     * 35.
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the addService value for this Parcel.
     * 
     * @return addService   * Additional service.
     * Possible values are:
     * 1 = Delivery information,
     * 2 = Documents return,
     * 3 = Written permission to deposit goods by sender.
     */
    public java.lang.Integer getAddService() {
        return addService;
    }


    /**
     * Sets the addService value for this Parcel.
     * 
     * @param addService   * Additional service.
     * Possible values are:
     * 1 = Delivery information,
     * 2 = Documents return,
     * 3 = Written permission to deposit goods by sender.
     */
    public void setAddService(java.lang.Integer addService) {
        this.addService = addService;
    }


    /**
     * Gets the messageNumber value for this Parcel.
     * 
     * @return messageNumber   * Message number for consignment shipper information. Default
     * value is 1.
     */
    public java.lang.Integer getMessageNumber() {
        return messageNumber;
    }


    /**
     * Sets the messageNumber value for this Parcel.
     * 
     * @param messageNumber   * Message number for consignment shipper information. Default
     * value is 1.
     */
    public void setMessageNumber(java.lang.Integer messageNumber) {
        this.messageNumber = messageNumber;
    }


    /**
     * Gets the function value for this Parcel.
     * 
     * @return function   * Blockable functions.
     * Possible values are:
     * LOCKDZB = Delivery to a third party with notification of delivery,
     * LOCKASG = Written permission to deposit goods,
     * LOCKEVM = Delivery with non-recurring authority,
     * LOCKSHOP = Parcel shop,
     * LOCKTV = Appointment.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelFunction getFunction() {
        return function;
    }


    /**
     * Sets the function value for this Parcel.
     * 
     * @param function   * Blockable functions.
     * Possible values are:
     * LOCKDZB = Delivery to a third party with notification of delivery,
     * LOCKASG = Written permission to deposit goods,
     * LOCKEVM = Delivery with non-recurring authority,
     * LOCKSHOP = Parcel shop,
     * LOCKTV = Appointment.
     */
    public void setFunction(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelFunction function) {
        this.function = function;
    }


    /**
     * Gets the parameter value for this Parcel.
     * 
     * @return parameter   * Free text for blockable functions.
     */
    public java.lang.String getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this Parcel.
     * 
     * @param parameter   * Free text for blockable functions.
     */
    public void setParameter(java.lang.String parameter) {
        this.parameter = parameter;
    }


    /**
     * Gets the cod value for this Parcel.
     * 
     * @return cod   * Contains COD data for COD consignments.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Cod getCod() {
        return cod;
    }


    /**
     * Sets the cod value for this Parcel.
     * 
     * @param cod   * Contains COD data for COD consignments.
     */
    public void setCod(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Cod cod) {
        this.cod = cod;
    }


    /**
     * Gets the international value for this Parcel.
     * 
     * @return international   * Contains data for consignments across customs borders.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.International getInternational() {
        return international;
    }


    /**
     * Sets the international value for this Parcel.
     * 
     * @param international   * Contains data for consignments across customs borders.
     */
    public void setInternational(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.International international) {
        this.international = international;
    }


    /**
     * Gets the hazardous value for this Parcel.
     * 
     * @return hazardous   * Contains packing and substance data for dangerous goods.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Hazardous[] getHazardous() {
        return hazardous;
    }


    /**
     * Sets the hazardous value for this Parcel.
     * 
     * @param hazardous   * Contains packing and substance data for dangerous goods.
     */
    public void setHazardous(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Hazardous[] hazardous) {
        this.hazardous = hazardous;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Hazardous getHazardous(int i) {
        return this.hazardous[i];
    }

    public void setHazardous(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Hazardous _value) {
        this.hazardous[i] = _value;
    }


    /**
     * Gets the printInfo1OnParcelLabel value for this Parcel.
     * 
     * @return printInfo1OnParcelLabel   * Flag for determining if content of parameter info1 will be
     * added on the label of a collection request parcel. Default value is
     * false.
     */
    public java.lang.Boolean getPrintInfo1OnParcelLabel() {
        return printInfo1OnParcelLabel;
    }


    /**
     * Sets the printInfo1OnParcelLabel value for this Parcel.
     * 
     * @param printInfo1OnParcelLabel   * Flag for determining if content of parameter info1 will be
     * added on the label of a collection request parcel. Default value is
     * false.
     */
    public void setPrintInfo1OnParcelLabel(java.lang.Boolean printInfo1OnParcelLabel) {
        this.printInfo1OnParcelLabel = printInfo1OnParcelLabel;
    }


    /**
     * Gets the info1 value for this Parcel.
     * 
     * @return info1   * Information text 1. This will be printed on the parcel label
     * if the flag printInfo1OnParcellabel is set to true.
     */
    public java.lang.String getInfo1() {
        return info1;
    }


    /**
     * Sets the info1 value for this Parcel.
     * 
     * @param info1   * Information text 1. This will be printed on the parcel label
     * if the flag printInfo1OnParcellabel is set to true.
     */
    public void setInfo1(java.lang.String info1) {
        this.info1 = info1;
    }


    /**
     * Gets the info2 value for this Parcel.
     * 
     * @return info2   * Information text 2. This will not be printed on the parcel
     * label.
     */
    public java.lang.String getInfo2() {
        return info2;
    }


    /**
     * Sets the info2 value for this Parcel.
     * 
     * @param info2   * Information text 2. This will not be printed on the parcel
     * label.
     */
    public void setInfo2(java.lang.String info2) {
        this.info2 = info2;
    }


    /**
     * Gets the returns value for this Parcel.
     * 
     * @return returns   * Specifies if parcel is a return parcel.
     * The return parcel must always be next in order to the corresponding
     * outbound parcel. Default value is false.
     */
    public java.lang.Boolean getReturns() {
        return returns;
    }


    /**
     * Sets the returns value for this Parcel.
     * 
     * @param returns   * Specifies if parcel is a return parcel.
     * The return parcel must always be next in order to the corresponding
     * outbound parcel. Default value is false.
     */
    public void setReturns(java.lang.Boolean returns) {
        this.returns = returns;
    }


    /**
     * Gets the parcelClass value for this Parcel.
     * 
     * @return parcelClass   * Parcel class. See Parcelclass in MPSEXPDATA specification for
     * valid values.
     */
    public java.lang.String getParcelClass() {
        return parcelClass;
    }


    /**
     * Sets the parcelClass value for this Parcel.
     * 
     * @param parcelClass   * Parcel class. See Parcelclass in MPSEXPDATA specification for
     * valid values.
     */
    public void setParcelClass(java.lang.String parcelClass) {
        this.parcelClass = parcelClass;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Parcel)) return false;
        Parcel other = (Parcel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parcelLabelNumber==null && other.getParcelLabelNumber()==null) || 
             (this.parcelLabelNumber!=null &&
              this.parcelLabelNumber.equals(other.getParcelLabelNumber()))) &&
            ((this.customerReferenceNumber1==null && other.getCustomerReferenceNumber1()==null) || 
             (this.customerReferenceNumber1!=null &&
              this.customerReferenceNumber1.equals(other.getCustomerReferenceNumber1()))) &&
            ((this.customerReferenceNumber2==null && other.getCustomerReferenceNumber2()==null) || 
             (this.customerReferenceNumber2!=null &&
              this.customerReferenceNumber2.equals(other.getCustomerReferenceNumber2()))) &&
            ((this.customerReferenceNumber3==null && other.getCustomerReferenceNumber3()==null) || 
             (this.customerReferenceNumber3!=null &&
              this.customerReferenceNumber3.equals(other.getCustomerReferenceNumber3()))) &&
            ((this.customerReferenceNumber4==null && other.getCustomerReferenceNumber4()==null) || 
             (this.customerReferenceNumber4!=null &&
              this.customerReferenceNumber4.equals(other.getCustomerReferenceNumber4()))) &&
            ((this.swap==null && other.getSwap()==null) || 
             (this.swap!=null &&
              this.swap.equals(other.getSwap()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              this.volume.equals(other.getVolume()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.hazardousLimitedQuantities==null && other.getHazardousLimitedQuantities()==null) || 
             (this.hazardousLimitedQuantities!=null &&
              this.hazardousLimitedQuantities.equals(other.getHazardousLimitedQuantities()))) &&
            ((this.higherInsurance==null && other.getHigherInsurance()==null) || 
             (this.higherInsurance!=null &&
              this.higherInsurance.equals(other.getHigherInsurance()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.addService==null && other.getAddService()==null) || 
             (this.addService!=null &&
              this.addService.equals(other.getAddService()))) &&
            ((this.messageNumber==null && other.getMessageNumber()==null) || 
             (this.messageNumber!=null &&
              this.messageNumber.equals(other.getMessageNumber()))) &&
            ((this.function==null && other.getFunction()==null) || 
             (this.function!=null &&
              this.function.equals(other.getFunction()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              this.parameter.equals(other.getParameter()))) &&
            ((this.cod==null && other.getCod()==null) || 
             (this.cod!=null &&
              this.cod.equals(other.getCod()))) &&
            ((this.international==null && other.getInternational()==null) || 
             (this.international!=null &&
              this.international.equals(other.getInternational()))) &&
            ((this.hazardous==null && other.getHazardous()==null) || 
             (this.hazardous!=null &&
              java.util.Arrays.equals(this.hazardous, other.getHazardous()))) &&
            ((this.printInfo1OnParcelLabel==null && other.getPrintInfo1OnParcelLabel()==null) || 
             (this.printInfo1OnParcelLabel!=null &&
              this.printInfo1OnParcelLabel.equals(other.getPrintInfo1OnParcelLabel()))) &&
            ((this.info1==null && other.getInfo1()==null) || 
             (this.info1!=null &&
              this.info1.equals(other.getInfo1()))) &&
            ((this.info2==null && other.getInfo2()==null) || 
             (this.info2!=null &&
              this.info2.equals(other.getInfo2()))) &&
            ((this.returns==null && other.getReturns()==null) || 
             (this.returns!=null &&
              this.returns.equals(other.getReturns()))) &&
            ((this.parcelClass==null && other.getParcelClass()==null) || 
             (this.parcelClass!=null &&
              this.parcelClass.equals(other.getParcelClass())));
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
        if (getParcelLabelNumber() != null) {
            _hashCode += getParcelLabelNumber().hashCode();
        }
        if (getCustomerReferenceNumber1() != null) {
            _hashCode += getCustomerReferenceNumber1().hashCode();
        }
        if (getCustomerReferenceNumber2() != null) {
            _hashCode += getCustomerReferenceNumber2().hashCode();
        }
        if (getCustomerReferenceNumber3() != null) {
            _hashCode += getCustomerReferenceNumber3().hashCode();
        }
        if (getCustomerReferenceNumber4() != null) {
            _hashCode += getCustomerReferenceNumber4().hashCode();
        }
        if (getSwap() != null) {
            _hashCode += getSwap().hashCode();
        }
        if (getVolume() != null) {
            _hashCode += getVolume().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getHazardousLimitedQuantities() != null) {
            _hashCode += getHazardousLimitedQuantities().hashCode();
        }
        if (getHigherInsurance() != null) {
            _hashCode += getHigherInsurance().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getAddService() != null) {
            _hashCode += getAddService().hashCode();
        }
        if (getMessageNumber() != null) {
            _hashCode += getMessageNumber().hashCode();
        }
        if (getFunction() != null) {
            _hashCode += getFunction().hashCode();
        }
        if (getParameter() != null) {
            _hashCode += getParameter().hashCode();
        }
        if (getCod() != null) {
            _hashCode += getCod().hashCode();
        }
        if (getInternational() != null) {
            _hashCode += getInternational().hashCode();
        }
        if (getHazardous() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHazardous());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHazardous(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrintInfo1OnParcelLabel() != null) {
            _hashCode += getPrintInfo1OnParcelLabel().hashCode();
        }
        if (getInfo1() != null) {
            _hashCode += getInfo1().hashCode();
        }
        if (getInfo2() != null) {
            _hashCode += getInfo2().hashCode();
        }
        if (getReturns() != null) {
            _hashCode += getReturns().hashCode();
        }
        if (getParcelClass() != null) {
            _hashCode += getParcelClass().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Parcel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "parcel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelLabelNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelLabelNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReferenceNumber1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerReferenceNumber1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReferenceNumber2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerReferenceNumber2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReferenceNumber3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerReferenceNumber3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReferenceNumber4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerReferenceNumber4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardousLimitedQuantities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hazardousLimitedQuantities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("higherInsurance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "higherInsurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "higherInsurance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function");
        elemField.setXmlName(new javax.xml.namespace.QName("", "function"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">parcel>function"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "cod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("international");
        elemField.setXmlName(new javax.xml.namespace.QName("", "international"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "international"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardous");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hazardous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "hazardous"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printInfo1OnParcelLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printInfo1OnParcelLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("info2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "info2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelClass"));
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
