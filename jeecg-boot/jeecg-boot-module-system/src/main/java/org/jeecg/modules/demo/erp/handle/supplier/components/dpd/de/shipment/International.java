/**
 * International.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles express international data.
 */
public class International  implements java.io.Serializable {
    /* Specifies if the type of parcel is "documents" (allowed for
     * air based destination only). Default value is false. */
    private boolean parcelType;

    /* Declared customs amount (in invoice currency) in total with
     * two decimal digits without separator (e.g. 14.00 = 1400),
     * for "documents" it is 0. */
    private long customsAmount;

    /* Parcel value (in invoice currency) with two decimal digits
     * without separator. */
    private java.lang.Long customsAmountParcel;

    /* Invoice currency code in ISO 4217 alpha-3 format. */
    private java.lang.String customsCurrency;

    /* Converted customs amount (in export currency) in total with
     * two decimal digits without separator (14,00 = 1400),
     * for "documents" it is set to 0. */
    private java.lang.Long customsAmountExport;

    /* Export currency code in ISO 4217 alpha-3 format. */
    private java.lang.String customsCurrencyExport;

    /* Declares the customs terms.
     * Possible values are:
     * 01 = DAP, cleared,
     * 02 = DDP, delivered duty paid (incl. duties and excl. taxes),
     * 03 = DDP, delivered duty paid (incl. duties and taxes),
     * 05 = ex works (EXW),
     * 06 = DAP. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.InternationalCustomsTerms customsTerms;

    /* Declares the content of the parcel. */
    private java.lang.String customsContent;

    /* Declares the customs tarif number. */
    private java.lang.String customsTarif;

    /* Declares accompanying documents without separator (e.g. "ABG"),
     * composed by following values:
     * A = Commercial invoice,
     * B = Pro forma invoice,
     * C = Export declaration,
     * D = EUR1,
     * E = EUR2,
     * F = ATR,
     * G = Delivery note,
     * H = Third party billing,
     * I = T1 document. */
    private java.lang.String customsPaper;

    /* Specifies if the accompanying documents are at the parcel or
     * not. Default value is false. */
    private java.lang.Boolean customsEnclosure;

    /* Declares the invoice number. */
    private java.lang.String customsInvoice;

    /* Declares the invoice date in format YYYYMMDD. */
    private java.lang.Integer customsInvoiceDate;

    /* Origin country in ISO 3166-1 alpha-2 format (e.g. DE, EN). */
    private java.lang.String customsOrigin;

    /* Central customs order number for collective customs clearance. */
    private java.lang.String customsOrder;

    /* Declares mode of line haul, possible values are "AI" for air
     * or "RO" for road. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.InternationalLinehaul linehaul;

    /* Movement reference number of the electronical export declaration. */
    private java.lang.String shipMrn;

    /* Flag for determining collective customs clearance. Default
     * value is false. */
    private java.lang.Boolean collectiveCustomsClearance;

    /* Declares the invoice position. */
    private java.lang.Integer invoicePosition;

    /* Comment. */
    private java.lang.String comment1;

    /* Second comment. */
    private java.lang.String comment2;

    /* Declares the commercial invoice consignee VAT number. */
    private java.lang.String commercialInvoiceConsigneeVatNumber;

    /* Contains address data of commercial invoice consignee. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address commercialInvoiceConsignee;

    /* Declares the commercial invoice consignor VAT number. */
    private java.lang.String commercialInvoiceConsignorVatNumber;

    /* Contains address data of commercial invoice consignor. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address commercialInvoiceConsignor;

    /* Contains additional invoice lines. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.AdditionalInvoiceLine[] additionalInvoiceLines;

    public International() {
    }

    public International(
           boolean parcelType,
           long customsAmount,
           java.lang.Long customsAmountParcel,
           java.lang.String customsCurrency,
           java.lang.Long customsAmountExport,
           java.lang.String customsCurrencyExport,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.InternationalCustomsTerms customsTerms,
           java.lang.String customsContent,
           java.lang.String customsTarif,
           java.lang.String customsPaper,
           java.lang.Boolean customsEnclosure,
           java.lang.String customsInvoice,
           java.lang.Integer customsInvoiceDate,
           java.lang.String customsOrigin,
           java.lang.String customsOrder,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.InternationalLinehaul linehaul,
           java.lang.String shipMrn,
           java.lang.Boolean collectiveCustomsClearance,
           java.lang.Integer invoicePosition,
           java.lang.String comment1,
           java.lang.String comment2,
           java.lang.String commercialInvoiceConsigneeVatNumber,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address commercialInvoiceConsignee,
           java.lang.String commercialInvoiceConsignorVatNumber,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address commercialInvoiceConsignor,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.AdditionalInvoiceLine[] additionalInvoiceLines) {
           this.parcelType = parcelType;
           this.customsAmount = customsAmount;
           this.customsAmountParcel = customsAmountParcel;
           this.customsCurrency = customsCurrency;
           this.customsAmountExport = customsAmountExport;
           this.customsCurrencyExport = customsCurrencyExport;
           this.customsTerms = customsTerms;
           this.customsContent = customsContent;
           this.customsTarif = customsTarif;
           this.customsPaper = customsPaper;
           this.customsEnclosure = customsEnclosure;
           this.customsInvoice = customsInvoice;
           this.customsInvoiceDate = customsInvoiceDate;
           this.customsOrigin = customsOrigin;
           this.customsOrder = customsOrder;
           this.linehaul = linehaul;
           this.shipMrn = shipMrn;
           this.collectiveCustomsClearance = collectiveCustomsClearance;
           this.invoicePosition = invoicePosition;
           this.comment1 = comment1;
           this.comment2 = comment2;
           this.commercialInvoiceConsigneeVatNumber = commercialInvoiceConsigneeVatNumber;
           this.commercialInvoiceConsignee = commercialInvoiceConsignee;
           this.commercialInvoiceConsignorVatNumber = commercialInvoiceConsignorVatNumber;
           this.commercialInvoiceConsignor = commercialInvoiceConsignor;
           this.additionalInvoiceLines = additionalInvoiceLines;
    }


    /**
     * Gets the parcelType value for this International.
     * 
     * @return parcelType   * Specifies if the type of parcel is "documents" (allowed for
     * air based destination only). Default value is false.
     */
    public boolean isParcelType() {
        return parcelType;
    }


    /**
     * Sets the parcelType value for this International.
     * 
     * @param parcelType   * Specifies if the type of parcel is "documents" (allowed for
     * air based destination only). Default value is false.
     */
    public void setParcelType(boolean parcelType) {
        this.parcelType = parcelType;
    }


    /**
     * Gets the customsAmount value for this International.
     * 
     * @return customsAmount   * Declared customs amount (in invoice currency) in total with
     * two decimal digits without separator (e.g. 14.00 = 1400),
     * for "documents" it is 0.
     */
    public long getCustomsAmount() {
        return customsAmount;
    }


    /**
     * Sets the customsAmount value for this International.
     * 
     * @param customsAmount   * Declared customs amount (in invoice currency) in total with
     * two decimal digits without separator (e.g. 14.00 = 1400),
     * for "documents" it is 0.
     */
    public void setCustomsAmount(long customsAmount) {
        this.customsAmount = customsAmount;
    }


    /**
     * Gets the customsAmountParcel value for this International.
     * 
     * @return customsAmountParcel   * Parcel value (in invoice currency) with two decimal digits
     * without separator.
     */
    public java.lang.Long getCustomsAmountParcel() {
        return customsAmountParcel;
    }


    /**
     * Sets the customsAmountParcel value for this International.
     * 
     * @param customsAmountParcel   * Parcel value (in invoice currency) with two decimal digits
     * without separator.
     */
    public void setCustomsAmountParcel(java.lang.Long customsAmountParcel) {
        this.customsAmountParcel = customsAmountParcel;
    }


    /**
     * Gets the customsCurrency value for this International.
     * 
     * @return customsCurrency   * Invoice currency code in ISO 4217 alpha-3 format.
     */
    public java.lang.String getCustomsCurrency() {
        return customsCurrency;
    }


    /**
     * Sets the customsCurrency value for this International.
     * 
     * @param customsCurrency   * Invoice currency code in ISO 4217 alpha-3 format.
     */
    public void setCustomsCurrency(java.lang.String customsCurrency) {
        this.customsCurrency = customsCurrency;
    }


    /**
     * Gets the customsAmountExport value for this International.
     * 
     * @return customsAmountExport   * Converted customs amount (in export currency) in total with
     * two decimal digits without separator (14,00 = 1400),
     * for "documents" it is set to 0.
     */
    public java.lang.Long getCustomsAmountExport() {
        return customsAmountExport;
    }


    /**
     * Sets the customsAmountExport value for this International.
     * 
     * @param customsAmountExport   * Converted customs amount (in export currency) in total with
     * two decimal digits without separator (14,00 = 1400),
     * for "documents" it is set to 0.
     */
    public void setCustomsAmountExport(java.lang.Long customsAmountExport) {
        this.customsAmountExport = customsAmountExport;
    }


    /**
     * Gets the customsCurrencyExport value for this International.
     * 
     * @return customsCurrencyExport   * Export currency code in ISO 4217 alpha-3 format.
     */
    public java.lang.String getCustomsCurrencyExport() {
        return customsCurrencyExport;
    }


    /**
     * Sets the customsCurrencyExport value for this International.
     * 
     * @param customsCurrencyExport   * Export currency code in ISO 4217 alpha-3 format.
     */
    public void setCustomsCurrencyExport(java.lang.String customsCurrencyExport) {
        this.customsCurrencyExport = customsCurrencyExport;
    }


    /**
     * Gets the customsTerms value for this International.
     * 
     * @return customsTerms   * Declares the customs terms.
     * Possible values are:
     * 01 = DAP, cleared,
     * 02 = DDP, delivered duty paid (incl. duties and excl. taxes),
     * 03 = DDP, delivered duty paid (incl. duties and taxes),
     * 05 = ex works (EXW),
     * 06 = DAP.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.InternationalCustomsTerms getCustomsTerms() {
        return customsTerms;
    }


    /**
     * Sets the customsTerms value for this International.
     * 
     * @param customsTerms   * Declares the customs terms.
     * Possible values are:
     * 01 = DAP, cleared,
     * 02 = DDP, delivered duty paid (incl. duties and excl. taxes),
     * 03 = DDP, delivered duty paid (incl. duties and taxes),
     * 05 = ex works (EXW),
     * 06 = DAP.
     */
    public void setCustomsTerms(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.InternationalCustomsTerms customsTerms) {
        this.customsTerms = customsTerms;
    }


    /**
     * Gets the customsContent value for this International.
     * 
     * @return customsContent   * Declares the content of the parcel.
     */
    public java.lang.String getCustomsContent() {
        return customsContent;
    }


    /**
     * Sets the customsContent value for this International.
     * 
     * @param customsContent   * Declares the content of the parcel.
     */
    public void setCustomsContent(java.lang.String customsContent) {
        this.customsContent = customsContent;
    }


    /**
     * Gets the customsTarif value for this International.
     * 
     * @return customsTarif   * Declares the customs tarif number.
     */
    public java.lang.String getCustomsTarif() {
        return customsTarif;
    }


    /**
     * Sets the customsTarif value for this International.
     * 
     * @param customsTarif   * Declares the customs tarif number.
     */
    public void setCustomsTarif(java.lang.String customsTarif) {
        this.customsTarif = customsTarif;
    }


    /**
     * Gets the customsPaper value for this International.
     * 
     * @return customsPaper   * Declares accompanying documents without separator (e.g. "ABG"),
     * composed by following values:
     * A = Commercial invoice,
     * B = Pro forma invoice,
     * C = Export declaration,
     * D = EUR1,
     * E = EUR2,
     * F = ATR,
     * G = Delivery note,
     * H = Third party billing,
     * I = T1 document.
     */
    public java.lang.String getCustomsPaper() {
        return customsPaper;
    }


    /**
     * Sets the customsPaper value for this International.
     * 
     * @param customsPaper   * Declares accompanying documents without separator (e.g. "ABG"),
     * composed by following values:
     * A = Commercial invoice,
     * B = Pro forma invoice,
     * C = Export declaration,
     * D = EUR1,
     * E = EUR2,
     * F = ATR,
     * G = Delivery note,
     * H = Third party billing,
     * I = T1 document.
     */
    public void setCustomsPaper(java.lang.String customsPaper) {
        this.customsPaper = customsPaper;
    }


    /**
     * Gets the customsEnclosure value for this International.
     * 
     * @return customsEnclosure   * Specifies if the accompanying documents are at the parcel or
     * not. Default value is false.
     */
    public java.lang.Boolean getCustomsEnclosure() {
        return customsEnclosure;
    }


    /**
     * Sets the customsEnclosure value for this International.
     * 
     * @param customsEnclosure   * Specifies if the accompanying documents are at the parcel or
     * not. Default value is false.
     */
    public void setCustomsEnclosure(java.lang.Boolean customsEnclosure) {
        this.customsEnclosure = customsEnclosure;
    }


    /**
     * Gets the customsInvoice value for this International.
     * 
     * @return customsInvoice   * Declares the invoice number.
     */
    public java.lang.String getCustomsInvoice() {
        return customsInvoice;
    }


    /**
     * Sets the customsInvoice value for this International.
     * 
     * @param customsInvoice   * Declares the invoice number.
     */
    public void setCustomsInvoice(java.lang.String customsInvoice) {
        this.customsInvoice = customsInvoice;
    }


    /**
     * Gets the customsInvoiceDate value for this International.
     * 
     * @return customsInvoiceDate   * Declares the invoice date in format YYYYMMDD.
     */
    public java.lang.Integer getCustomsInvoiceDate() {
        return customsInvoiceDate;
    }


    /**
     * Sets the customsInvoiceDate value for this International.
     * 
     * @param customsInvoiceDate   * Declares the invoice date in format YYYYMMDD.
     */
    public void setCustomsInvoiceDate(java.lang.Integer customsInvoiceDate) {
        this.customsInvoiceDate = customsInvoiceDate;
    }


    /**
     * Gets the customsOrigin value for this International.
     * 
     * @return customsOrigin   * Origin country in ISO 3166-1 alpha-2 format (e.g. DE, EN).
     */
    public java.lang.String getCustomsOrigin() {
        return customsOrigin;
    }


    /**
     * Sets the customsOrigin value for this International.
     * 
     * @param customsOrigin   * Origin country in ISO 3166-1 alpha-2 format (e.g. DE, EN).
     */
    public void setCustomsOrigin(java.lang.String customsOrigin) {
        this.customsOrigin = customsOrigin;
    }


    /**
     * Gets the customsOrder value for this International.
     * 
     * @return customsOrder   * Central customs order number for collective customs clearance.
     */
    public java.lang.String getCustomsOrder() {
        return customsOrder;
    }


    /**
     * Sets the customsOrder value for this International.
     * 
     * @param customsOrder   * Central customs order number for collective customs clearance.
     */
    public void setCustomsOrder(java.lang.String customsOrder) {
        this.customsOrder = customsOrder;
    }


    /**
     * Gets the linehaul value for this International.
     * 
     * @return linehaul   * Declares mode of line haul, possible values are "AI" for air
     * or "RO" for road.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.InternationalLinehaul getLinehaul() {
        return linehaul;
    }


    /**
     * Sets the linehaul value for this International.
     * 
     * @param linehaul   * Declares mode of line haul, possible values are "AI" for air
     * or "RO" for road.
     */
    public void setLinehaul(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.InternationalLinehaul linehaul) {
        this.linehaul = linehaul;
    }


    /**
     * Gets the shipMrn value for this International.
     * 
     * @return shipMrn   * Movement reference number of the electronical export declaration.
     */
    public java.lang.String getShipMrn() {
        return shipMrn;
    }


    /**
     * Sets the shipMrn value for this International.
     * 
     * @param shipMrn   * Movement reference number of the electronical export declaration.
     */
    public void setShipMrn(java.lang.String shipMrn) {
        this.shipMrn = shipMrn;
    }


    /**
     * Gets the collectiveCustomsClearance value for this International.
     * 
     * @return collectiveCustomsClearance   * Flag for determining collective customs clearance. Default
     * value is false.
     */
    public java.lang.Boolean getCollectiveCustomsClearance() {
        return collectiveCustomsClearance;
    }


    /**
     * Sets the collectiveCustomsClearance value for this International.
     * 
     * @param collectiveCustomsClearance   * Flag for determining collective customs clearance. Default
     * value is false.
     */
    public void setCollectiveCustomsClearance(java.lang.Boolean collectiveCustomsClearance) {
        this.collectiveCustomsClearance = collectiveCustomsClearance;
    }


    /**
     * Gets the invoicePosition value for this International.
     * 
     * @return invoicePosition   * Declares the invoice position.
     */
    public java.lang.Integer getInvoicePosition() {
        return invoicePosition;
    }


    /**
     * Sets the invoicePosition value for this International.
     * 
     * @param invoicePosition   * Declares the invoice position.
     */
    public void setInvoicePosition(java.lang.Integer invoicePosition) {
        this.invoicePosition = invoicePosition;
    }


    /**
     * Gets the comment1 value for this International.
     * 
     * @return comment1   * Comment.
     */
    public java.lang.String getComment1() {
        return comment1;
    }


    /**
     * Sets the comment1 value for this International.
     * 
     * @param comment1   * Comment.
     */
    public void setComment1(java.lang.String comment1) {
        this.comment1 = comment1;
    }


    /**
     * Gets the comment2 value for this International.
     * 
     * @return comment2   * Second comment.
     */
    public java.lang.String getComment2() {
        return comment2;
    }


    /**
     * Sets the comment2 value for this International.
     * 
     * @param comment2   * Second comment.
     */
    public void setComment2(java.lang.String comment2) {
        this.comment2 = comment2;
    }


    /**
     * Gets the commercialInvoiceConsigneeVatNumber value for this International.
     * 
     * @return commercialInvoiceConsigneeVatNumber   * Declares the commercial invoice consignee VAT number.
     */
    public java.lang.String getCommercialInvoiceConsigneeVatNumber() {
        return commercialInvoiceConsigneeVatNumber;
    }


    /**
     * Sets the commercialInvoiceConsigneeVatNumber value for this International.
     * 
     * @param commercialInvoiceConsigneeVatNumber   * Declares the commercial invoice consignee VAT number.
     */
    public void setCommercialInvoiceConsigneeVatNumber(java.lang.String commercialInvoiceConsigneeVatNumber) {
        this.commercialInvoiceConsigneeVatNumber = commercialInvoiceConsigneeVatNumber;
    }


    /**
     * Gets the commercialInvoiceConsignee value for this International.
     * 
     * @return commercialInvoiceConsignee   * Contains address data of commercial invoice consignee.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address getCommercialInvoiceConsignee() {
        return commercialInvoiceConsignee;
    }


    /**
     * Sets the commercialInvoiceConsignee value for this International.
     * 
     * @param commercialInvoiceConsignee   * Contains address data of commercial invoice consignee.
     */
    public void setCommercialInvoiceConsignee(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address commercialInvoiceConsignee) {
        this.commercialInvoiceConsignee = commercialInvoiceConsignee;
    }


    /**
     * Gets the commercialInvoiceConsignorVatNumber value for this International.
     * 
     * @return commercialInvoiceConsignorVatNumber   * Declares the commercial invoice consignor VAT number.
     */
    public java.lang.String getCommercialInvoiceConsignorVatNumber() {
        return commercialInvoiceConsignorVatNumber;
    }


    /**
     * Sets the commercialInvoiceConsignorVatNumber value for this International.
     * 
     * @param commercialInvoiceConsignorVatNumber   * Declares the commercial invoice consignor VAT number.
     */
    public void setCommercialInvoiceConsignorVatNumber(java.lang.String commercialInvoiceConsignorVatNumber) {
        this.commercialInvoiceConsignorVatNumber = commercialInvoiceConsignorVatNumber;
    }


    /**
     * Gets the commercialInvoiceConsignor value for this International.
     * 
     * @return commercialInvoiceConsignor   * Contains address data of commercial invoice consignor.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address getCommercialInvoiceConsignor() {
        return commercialInvoiceConsignor;
    }


    /**
     * Sets the commercialInvoiceConsignor value for this International.
     * 
     * @param commercialInvoiceConsignor   * Contains address data of commercial invoice consignor.
     */
    public void setCommercialInvoiceConsignor(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address commercialInvoiceConsignor) {
        this.commercialInvoiceConsignor = commercialInvoiceConsignor;
    }


    /**
     * Gets the additionalInvoiceLines value for this International.
     * 
     * @return additionalInvoiceLines   * Contains additional invoice lines.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.AdditionalInvoiceLine[] getAdditionalInvoiceLines() {
        return additionalInvoiceLines;
    }


    /**
     * Sets the additionalInvoiceLines value for this International.
     * 
     * @param additionalInvoiceLines   * Contains additional invoice lines.
     */
    public void setAdditionalInvoiceLines(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.AdditionalInvoiceLine[] additionalInvoiceLines) {
        this.additionalInvoiceLines = additionalInvoiceLines;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.AdditionalInvoiceLine getAdditionalInvoiceLines(int i) {
        return this.additionalInvoiceLines[i];
    }

    public void setAdditionalInvoiceLines(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.AdditionalInvoiceLine _value) {
        this.additionalInvoiceLines[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof International)) return false;
        International other = (International) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.parcelType == other.isParcelType() &&
            this.customsAmount == other.getCustomsAmount() &&
            ((this.customsAmountParcel==null && other.getCustomsAmountParcel()==null) || 
             (this.customsAmountParcel!=null &&
              this.customsAmountParcel.equals(other.getCustomsAmountParcel()))) &&
            ((this.customsCurrency==null && other.getCustomsCurrency()==null) || 
             (this.customsCurrency!=null &&
              this.customsCurrency.equals(other.getCustomsCurrency()))) &&
            ((this.customsAmountExport==null && other.getCustomsAmountExport()==null) || 
             (this.customsAmountExport!=null &&
              this.customsAmountExport.equals(other.getCustomsAmountExport()))) &&
            ((this.customsCurrencyExport==null && other.getCustomsCurrencyExport()==null) || 
             (this.customsCurrencyExport!=null &&
              this.customsCurrencyExport.equals(other.getCustomsCurrencyExport()))) &&
            ((this.customsTerms==null && other.getCustomsTerms()==null) || 
             (this.customsTerms!=null &&
              this.customsTerms.equals(other.getCustomsTerms()))) &&
            ((this.customsContent==null && other.getCustomsContent()==null) || 
             (this.customsContent!=null &&
              this.customsContent.equals(other.getCustomsContent()))) &&
            ((this.customsTarif==null && other.getCustomsTarif()==null) || 
             (this.customsTarif!=null &&
              this.customsTarif.equals(other.getCustomsTarif()))) &&
            ((this.customsPaper==null && other.getCustomsPaper()==null) || 
             (this.customsPaper!=null &&
              this.customsPaper.equals(other.getCustomsPaper()))) &&
            ((this.customsEnclosure==null && other.getCustomsEnclosure()==null) || 
             (this.customsEnclosure!=null &&
              this.customsEnclosure.equals(other.getCustomsEnclosure()))) &&
            ((this.customsInvoice==null && other.getCustomsInvoice()==null) || 
             (this.customsInvoice!=null &&
              this.customsInvoice.equals(other.getCustomsInvoice()))) &&
            ((this.customsInvoiceDate==null && other.getCustomsInvoiceDate()==null) || 
             (this.customsInvoiceDate!=null &&
              this.customsInvoiceDate.equals(other.getCustomsInvoiceDate()))) &&
            ((this.customsOrigin==null && other.getCustomsOrigin()==null) || 
             (this.customsOrigin!=null &&
              this.customsOrigin.equals(other.getCustomsOrigin()))) &&
            ((this.customsOrder==null && other.getCustomsOrder()==null) || 
             (this.customsOrder!=null &&
              this.customsOrder.equals(other.getCustomsOrder()))) &&
            ((this.linehaul==null && other.getLinehaul()==null) || 
             (this.linehaul!=null &&
              this.linehaul.equals(other.getLinehaul()))) &&
            ((this.shipMrn==null && other.getShipMrn()==null) || 
             (this.shipMrn!=null &&
              this.shipMrn.equals(other.getShipMrn()))) &&
            ((this.collectiveCustomsClearance==null && other.getCollectiveCustomsClearance()==null) || 
             (this.collectiveCustomsClearance!=null &&
              this.collectiveCustomsClearance.equals(other.getCollectiveCustomsClearance()))) &&
            ((this.invoicePosition==null && other.getInvoicePosition()==null) || 
             (this.invoicePosition!=null &&
              this.invoicePosition.equals(other.getInvoicePosition()))) &&
            ((this.comment1==null && other.getComment1()==null) || 
             (this.comment1!=null &&
              this.comment1.equals(other.getComment1()))) &&
            ((this.comment2==null && other.getComment2()==null) || 
             (this.comment2!=null &&
              this.comment2.equals(other.getComment2()))) &&
            ((this.commercialInvoiceConsigneeVatNumber==null && other.getCommercialInvoiceConsigneeVatNumber()==null) || 
             (this.commercialInvoiceConsigneeVatNumber!=null &&
              this.commercialInvoiceConsigneeVatNumber.equals(other.getCommercialInvoiceConsigneeVatNumber()))) &&
            ((this.commercialInvoiceConsignee==null && other.getCommercialInvoiceConsignee()==null) || 
             (this.commercialInvoiceConsignee!=null &&
              this.commercialInvoiceConsignee.equals(other.getCommercialInvoiceConsignee()))) &&
            ((this.commercialInvoiceConsignorVatNumber==null && other.getCommercialInvoiceConsignorVatNumber()==null) || 
             (this.commercialInvoiceConsignorVatNumber!=null &&
              this.commercialInvoiceConsignorVatNumber.equals(other.getCommercialInvoiceConsignorVatNumber()))) &&
            ((this.commercialInvoiceConsignor==null && other.getCommercialInvoiceConsignor()==null) || 
             (this.commercialInvoiceConsignor!=null &&
              this.commercialInvoiceConsignor.equals(other.getCommercialInvoiceConsignor()))) &&
            ((this.additionalInvoiceLines==null && other.getAdditionalInvoiceLines()==null) || 
             (this.additionalInvoiceLines!=null &&
              java.util.Arrays.equals(this.additionalInvoiceLines, other.getAdditionalInvoiceLines())));
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
        _hashCode += (isParcelType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getCustomsAmount()).hashCode();
        if (getCustomsAmountParcel() != null) {
            _hashCode += getCustomsAmountParcel().hashCode();
        }
        if (getCustomsCurrency() != null) {
            _hashCode += getCustomsCurrency().hashCode();
        }
        if (getCustomsAmountExport() != null) {
            _hashCode += getCustomsAmountExport().hashCode();
        }
        if (getCustomsCurrencyExport() != null) {
            _hashCode += getCustomsCurrencyExport().hashCode();
        }
        if (getCustomsTerms() != null) {
            _hashCode += getCustomsTerms().hashCode();
        }
        if (getCustomsContent() != null) {
            _hashCode += getCustomsContent().hashCode();
        }
        if (getCustomsTarif() != null) {
            _hashCode += getCustomsTarif().hashCode();
        }
        if (getCustomsPaper() != null) {
            _hashCode += getCustomsPaper().hashCode();
        }
        if (getCustomsEnclosure() != null) {
            _hashCode += getCustomsEnclosure().hashCode();
        }
        if (getCustomsInvoice() != null) {
            _hashCode += getCustomsInvoice().hashCode();
        }
        if (getCustomsInvoiceDate() != null) {
            _hashCode += getCustomsInvoiceDate().hashCode();
        }
        if (getCustomsOrigin() != null) {
            _hashCode += getCustomsOrigin().hashCode();
        }
        if (getCustomsOrder() != null) {
            _hashCode += getCustomsOrder().hashCode();
        }
        if (getLinehaul() != null) {
            _hashCode += getLinehaul().hashCode();
        }
        if (getShipMrn() != null) {
            _hashCode += getShipMrn().hashCode();
        }
        if (getCollectiveCustomsClearance() != null) {
            _hashCode += getCollectiveCustomsClearance().hashCode();
        }
        if (getInvoicePosition() != null) {
            _hashCode += getInvoicePosition().hashCode();
        }
        if (getComment1() != null) {
            _hashCode += getComment1().hashCode();
        }
        if (getComment2() != null) {
            _hashCode += getComment2().hashCode();
        }
        if (getCommercialInvoiceConsigneeVatNumber() != null) {
            _hashCode += getCommercialInvoiceConsigneeVatNumber().hashCode();
        }
        if (getCommercialInvoiceConsignee() != null) {
            _hashCode += getCommercialInvoiceConsignee().hashCode();
        }
        if (getCommercialInvoiceConsignorVatNumber() != null) {
            _hashCode += getCommercialInvoiceConsignorVatNumber().hashCode();
        }
        if (getCommercialInvoiceConsignor() != null) {
            _hashCode += getCommercialInvoiceConsignor().hashCode();
        }
        if (getAdditionalInvoiceLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInvoiceLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInvoiceLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(International.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "international"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsAmountParcel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsAmountParcel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsAmountExport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsAmountExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsCurrencyExport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsCurrencyExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">international>customsTerms"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsContent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("customsPaper");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsPaper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsEnclosure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsEnclosure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsInvoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsInvoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customsOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linehaul");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linehaul"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">international>linehaul"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMrn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipMrn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectiveCustomsClearance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectiveCustomsClearance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoicePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercialInvoiceConsigneeVatNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commercialInvoiceConsigneeVatNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercialInvoiceConsignee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commercialInvoiceConsignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "address"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercialInvoiceConsignorVatNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commercialInvoiceConsignorVatNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commercialInvoiceConsignor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commercialInvoiceConsignor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "address"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInvoiceLines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalInvoiceLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "additionalInvoiceLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
