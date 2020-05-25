/**
 * ProductAndServiceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Bundles product and service data for ShipmentService.
 */
public class ProductAndServiceData  implements java.io.Serializable {
    /* Defines the shipment type.
     * Possible values are:
     * consignment,
     * collection request order,
     * pickup information. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProductAndServiceDataOrderType orderType;

    /* Specifies if saturday delivery is demanded. Only selectable
     * for product "E12". Default value is false. */
    private java.lang.Boolean saturdayDelivery;

    /* Specifies if the recipient has to pay the consignment. Default
     * value is false. */
    private java.lang.Boolean exWorksDelivery;

    /* Set to true if an international shipment should use Guarantee,
     * only for products CL and E18 for international parcels. */
    private java.lang.Boolean guarantee;

    /* Set to true if this consignment contains bulk tyres, only for
     * product CL. */
    private java.lang.Boolean tyres;

    /* Set to true if the parcel should deliver as product 'DPD Food'. */
    private java.lang.Boolean food;

    /* Contains information for personal delivery. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PersonalDelivery personalDelivery;

    /* Contains information for pickup consignments, pickup address
     * for collection requests or details for pickup information. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Pickup pickup;

    /* Contains the necessary information, if a parcel shop delivery
     * is intended. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelShopDelivery parcelShopDelivery;

    /* Contains data for interactive notification for consignments.
     * The notification type "phone" is forbidden here. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification predict;

    /* Contains data for personal delivery notification for consignments. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification personalDeliveryNotification;

    /* Contains information of proactive notification for consignments. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotification[] proactiveNotification;

    /* Contains special delivery data for consignments. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Delivery delivery;

    /* Contains data about invoice recipient if it differs for consignment. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address invoiceAddress;

    /* In some relations a specific service code can be set, which
     * overwrites the feature selection. */
    private java.lang.String countrySpecificService;

    public ProductAndServiceData() {
    }

    public ProductAndServiceData(
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProductAndServiceDataOrderType orderType,
           java.lang.Boolean saturdayDelivery,
           java.lang.Boolean exWorksDelivery,
           java.lang.Boolean guarantee,
           java.lang.Boolean tyres,
           java.lang.Boolean food,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PersonalDelivery personalDelivery,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Pickup pickup,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelShopDelivery parcelShopDelivery,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification predict,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification personalDeliveryNotification,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotification[] proactiveNotification,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Delivery delivery,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address invoiceAddress,
           java.lang.String countrySpecificService) {
           this.orderType = orderType;
           this.saturdayDelivery = saturdayDelivery;
           this.exWorksDelivery = exWorksDelivery;
           this.guarantee = guarantee;
           this.tyres = tyres;
           this.food = food;
           this.personalDelivery = personalDelivery;
           this.pickup = pickup;
           this.parcelShopDelivery = parcelShopDelivery;
           this.predict = predict;
           this.personalDeliveryNotification = personalDeliveryNotification;
           this.proactiveNotification = proactiveNotification;
           this.delivery = delivery;
           this.invoiceAddress = invoiceAddress;
           this.countrySpecificService = countrySpecificService;
    }


    /**
     * Gets the orderType value for this ProductAndServiceData.
     * 
     * @return orderType   * Defines the shipment type.
     * Possible values are:
     * consignment,
     * collection request order,
     * pickup information.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProductAndServiceDataOrderType getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this ProductAndServiceData.
     * 
     * @param orderType   * Defines the shipment type.
     * Possible values are:
     * consignment,
     * collection request order,
     * pickup information.
     */
    public void setOrderType(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProductAndServiceDataOrderType orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the saturdayDelivery value for this ProductAndServiceData.
     * 
     * @return saturdayDelivery   * Specifies if saturday delivery is demanded. Only selectable
     * for product "E12". Default value is false.
     */
    public java.lang.Boolean getSaturdayDelivery() {
        return saturdayDelivery;
    }


    /**
     * Sets the saturdayDelivery value for this ProductAndServiceData.
     * 
     * @param saturdayDelivery   * Specifies if saturday delivery is demanded. Only selectable
     * for product "E12". Default value is false.
     */
    public void setSaturdayDelivery(java.lang.Boolean saturdayDelivery) {
        this.saturdayDelivery = saturdayDelivery;
    }


    /**
     * Gets the exWorksDelivery value for this ProductAndServiceData.
     * 
     * @return exWorksDelivery   * Specifies if the recipient has to pay the consignment. Default
     * value is false.
     */
    public java.lang.Boolean getExWorksDelivery() {
        return exWorksDelivery;
    }


    /**
     * Sets the exWorksDelivery value for this ProductAndServiceData.
     * 
     * @param exWorksDelivery   * Specifies if the recipient has to pay the consignment. Default
     * value is false.
     */
    public void setExWorksDelivery(java.lang.Boolean exWorksDelivery) {
        this.exWorksDelivery = exWorksDelivery;
    }


    /**
     * Gets the guarantee value for this ProductAndServiceData.
     * 
     * @return guarantee   * Set to true if an international shipment should use Guarantee,
     * only for products CL and E18 for international parcels.
     */
    public java.lang.Boolean getGuarantee() {
        return guarantee;
    }


    /**
     * Sets the guarantee value for this ProductAndServiceData.
     * 
     * @param guarantee   * Set to true if an international shipment should use Guarantee,
     * only for products CL and E18 for international parcels.
     */
    public void setGuarantee(java.lang.Boolean guarantee) {
        this.guarantee = guarantee;
    }


    /**
     * Gets the tyres value for this ProductAndServiceData.
     * 
     * @return tyres   * Set to true if this consignment contains bulk tyres, only for
     * product CL.
     */
    public java.lang.Boolean getTyres() {
        return tyres;
    }


    /**
     * Sets the tyres value for this ProductAndServiceData.
     * 
     * @param tyres   * Set to true if this consignment contains bulk tyres, only for
     * product CL.
     */
    public void setTyres(java.lang.Boolean tyres) {
        this.tyres = tyres;
    }


    /**
     * Gets the food value for this ProductAndServiceData.
     * 
     * @return food   * Set to true if the parcel should deliver as product 'DPD Food'.
     */
    public java.lang.Boolean getFood() {
        return food;
    }


    /**
     * Sets the food value for this ProductAndServiceData.
     * 
     * @param food   * Set to true if the parcel should deliver as product 'DPD Food'.
     */
    public void setFood(java.lang.Boolean food) {
        this.food = food;
    }


    /**
     * Gets the personalDelivery value for this ProductAndServiceData.
     * 
     * @return personalDelivery   * Contains information for personal delivery.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PersonalDelivery getPersonalDelivery() {
        return personalDelivery;
    }


    /**
     * Sets the personalDelivery value for this ProductAndServiceData.
     * 
     * @param personalDelivery   * Contains information for personal delivery.
     */
    public void setPersonalDelivery(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PersonalDelivery personalDelivery) {
        this.personalDelivery = personalDelivery;
    }


    /**
     * Gets the pickup value for this ProductAndServiceData.
     * 
     * @return pickup   * Contains information for pickup consignments, pickup address
     * for collection requests or details for pickup information.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Pickup getPickup() {
        return pickup;
    }


    /**
     * Sets the pickup value for this ProductAndServiceData.
     * 
     * @param pickup   * Contains information for pickup consignments, pickup address
     * for collection requests or details for pickup information.
     */
    public void setPickup(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Pickup pickup) {
        this.pickup = pickup;
    }


    /**
     * Gets the parcelShopDelivery value for this ProductAndServiceData.
     * 
     * @return parcelShopDelivery   * Contains the necessary information, if a parcel shop delivery
     * is intended.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelShopDelivery getParcelShopDelivery() {
        return parcelShopDelivery;
    }


    /**
     * Sets the parcelShopDelivery value for this ProductAndServiceData.
     * 
     * @param parcelShopDelivery   * Contains the necessary information, if a parcel shop delivery
     * is intended.
     */
    public void setParcelShopDelivery(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ParcelShopDelivery parcelShopDelivery) {
        this.parcelShopDelivery = parcelShopDelivery;
    }


    /**
     * Gets the predict value for this ProductAndServiceData.
     * 
     * @return predict   * Contains data for interactive notification for consignments.
     * The notification type "phone" is forbidden here.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification getPredict() {
        return predict;
    }


    /**
     * Sets the predict value for this ProductAndServiceData.
     * 
     * @param predict   * Contains data for interactive notification for consignments.
     * The notification type "phone" is forbidden here.
     */
    public void setPredict(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification predict) {
        this.predict = predict;
    }


    /**
     * Gets the personalDeliveryNotification value for this ProductAndServiceData.
     * 
     * @return personalDeliveryNotification   * Contains data for personal delivery notification for consignments.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification getPersonalDeliveryNotification() {
        return personalDeliveryNotification;
    }


    /**
     * Sets the personalDeliveryNotification value for this ProductAndServiceData.
     * 
     * @param personalDeliveryNotification   * Contains data for personal delivery notification for consignments.
     */
    public void setPersonalDeliveryNotification(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Notification personalDeliveryNotification) {
        this.personalDeliveryNotification = personalDeliveryNotification;
    }


    /**
     * Gets the proactiveNotification value for this ProductAndServiceData.
     * 
     * @return proactiveNotification   * Contains information of proactive notification for consignments.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotification[] getProactiveNotification() {
        return proactiveNotification;
    }


    /**
     * Sets the proactiveNotification value for this ProductAndServiceData.
     * 
     * @param proactiveNotification   * Contains information of proactive notification for consignments.
     */
    public void setProactiveNotification(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotification[] proactiveNotification) {
        this.proactiveNotification = proactiveNotification;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotification getProactiveNotification(int i) {
        return this.proactiveNotification[i];
    }

    public void setProactiveNotification(int i, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ProactiveNotification _value) {
        this.proactiveNotification[i] = _value;
    }


    /**
     * Gets the delivery value for this ProductAndServiceData.
     * 
     * @return delivery   * Contains special delivery data for consignments.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Delivery getDelivery() {
        return delivery;
    }


    /**
     * Sets the delivery value for this ProductAndServiceData.
     * 
     * @param delivery   * Contains special delivery data for consignments.
     */
    public void setDelivery(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Delivery delivery) {
        this.delivery = delivery;
    }


    /**
     * Gets the invoiceAddress value for this ProductAndServiceData.
     * 
     * @return invoiceAddress   * Contains data about invoice recipient if it differs for consignment.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address getInvoiceAddress() {
        return invoiceAddress;
    }


    /**
     * Sets the invoiceAddress value for this ProductAndServiceData.
     * 
     * @param invoiceAddress   * Contains data about invoice recipient if it differs for consignment.
     */
    public void setInvoiceAddress(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Address invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }


    /**
     * Gets the countrySpecificService value for this ProductAndServiceData.
     * 
     * @return countrySpecificService   * In some relations a specific service code can be set, which
     * overwrites the feature selection.
     */
    public java.lang.String getCountrySpecificService() {
        return countrySpecificService;
    }


    /**
     * Sets the countrySpecificService value for this ProductAndServiceData.
     * 
     * @param countrySpecificService   * In some relations a specific service code can be set, which
     * overwrites the feature selection.
     */
    public void setCountrySpecificService(java.lang.String countrySpecificService) {
        this.countrySpecificService = countrySpecificService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductAndServiceData)) return false;
        ProductAndServiceData other = (ProductAndServiceData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.saturdayDelivery==null && other.getSaturdayDelivery()==null) || 
             (this.saturdayDelivery!=null &&
              this.saturdayDelivery.equals(other.getSaturdayDelivery()))) &&
            ((this.exWorksDelivery==null && other.getExWorksDelivery()==null) || 
             (this.exWorksDelivery!=null &&
              this.exWorksDelivery.equals(other.getExWorksDelivery()))) &&
            ((this.guarantee==null && other.getGuarantee()==null) || 
             (this.guarantee!=null &&
              this.guarantee.equals(other.getGuarantee()))) &&
            ((this.tyres==null && other.getTyres()==null) || 
             (this.tyres!=null &&
              this.tyres.equals(other.getTyres()))) &&
            ((this.food==null && other.getFood()==null) || 
             (this.food!=null &&
              this.food.equals(other.getFood()))) &&
            ((this.personalDelivery==null && other.getPersonalDelivery()==null) || 
             (this.personalDelivery!=null &&
              this.personalDelivery.equals(other.getPersonalDelivery()))) &&
            ((this.pickup==null && other.getPickup()==null) || 
             (this.pickup!=null &&
              this.pickup.equals(other.getPickup()))) &&
            ((this.parcelShopDelivery==null && other.getParcelShopDelivery()==null) || 
             (this.parcelShopDelivery!=null &&
              this.parcelShopDelivery.equals(other.getParcelShopDelivery()))) &&
            ((this.predict==null && other.getPredict()==null) || 
             (this.predict!=null &&
              this.predict.equals(other.getPredict()))) &&
            ((this.personalDeliveryNotification==null && other.getPersonalDeliveryNotification()==null) || 
             (this.personalDeliveryNotification!=null &&
              this.personalDeliveryNotification.equals(other.getPersonalDeliveryNotification()))) &&
            ((this.proactiveNotification==null && other.getProactiveNotification()==null) || 
             (this.proactiveNotification!=null &&
              java.util.Arrays.equals(this.proactiveNotification, other.getProactiveNotification()))) &&
            ((this.delivery==null && other.getDelivery()==null) || 
             (this.delivery!=null &&
              this.delivery.equals(other.getDelivery()))) &&
            ((this.invoiceAddress==null && other.getInvoiceAddress()==null) || 
             (this.invoiceAddress!=null &&
              this.invoiceAddress.equals(other.getInvoiceAddress()))) &&
            ((this.countrySpecificService==null && other.getCountrySpecificService()==null) || 
             (this.countrySpecificService!=null &&
              this.countrySpecificService.equals(other.getCountrySpecificService())));
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
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getSaturdayDelivery() != null) {
            _hashCode += getSaturdayDelivery().hashCode();
        }
        if (getExWorksDelivery() != null) {
            _hashCode += getExWorksDelivery().hashCode();
        }
        if (getGuarantee() != null) {
            _hashCode += getGuarantee().hashCode();
        }
        if (getTyres() != null) {
            _hashCode += getTyres().hashCode();
        }
        if (getFood() != null) {
            _hashCode += getFood().hashCode();
        }
        if (getPersonalDelivery() != null) {
            _hashCode += getPersonalDelivery().hashCode();
        }
        if (getPickup() != null) {
            _hashCode += getPickup().hashCode();
        }
        if (getParcelShopDelivery() != null) {
            _hashCode += getParcelShopDelivery().hashCode();
        }
        if (getPredict() != null) {
            _hashCode += getPredict().hashCode();
        }
        if (getPersonalDeliveryNotification() != null) {
            _hashCode += getPersonalDeliveryNotification().hashCode();
        }
        if (getProactiveNotification() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProactiveNotification());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProactiveNotification(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDelivery() != null) {
            _hashCode += getDelivery().hashCode();
        }
        if (getInvoiceAddress() != null) {
            _hashCode += getInvoiceAddress().hashCode();
        }
        if (getCountrySpecificService() != null) {
            _hashCode += getCountrySpecificService().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductAndServiceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "productAndServiceData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">productAndServiceData>orderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saturdayDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exWorksDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exWorksDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guarantee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guarantee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tyres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tyres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("food");
        elemField.setXmlName(new javax.xml.namespace.QName("", "food"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "personalDelivery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pickup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "pickup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parcelShopDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parcelShopDelivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "parcelShopDelivery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predict");
        elemField.setXmlName(new javax.xml.namespace.QName("", "predict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "notification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalDeliveryNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "personalDeliveryNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "notification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proactiveNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proactiveNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "proactiveNotification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "delivery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countrySpecificService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countrySpecificService"));
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
