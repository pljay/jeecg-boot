/**
 * Printer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Information about the printer, if direct printing is used.
 */
public class Printer  implements java.io.Serializable {
    /* The printer's manufacturer. At the moment only for informational
     * purposes. */
    private java.lang.String manufacturer;

    /* The printer's model. At the moment only for informational purposes. */
    private java.lang.String model;

    /* The printer's revision / version. At the moment only for informational
     * purposes. */
    private java.lang.String revision;

    /* The horizontal offset in mm for the direct printer file (Not
     * used with normal PDF output). */
    private java.math.BigDecimal offsetX;

    /* The vertical offset in mm for the direct printer file (Not
     * used with normal PDF output). */
    private java.math.BigDecimal offsetY;

    /* The connection type of the printer: serial or parallel connection. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrinterConnectionType connectionType;

    /* If the printer can print AZTEC barcodes, set this flag to true. */
    private boolean barcodeCapable2D;

    public Printer() {
    }

    public Printer(
           java.lang.String manufacturer,
           java.lang.String model,
           java.lang.String revision,
           java.math.BigDecimal offsetX,
           java.math.BigDecimal offsetY,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrinterConnectionType connectionType,
           boolean barcodeCapable2D) {
           this.manufacturer = manufacturer;
           this.model = model;
           this.revision = revision;
           this.offsetX = offsetX;
           this.offsetY = offsetY;
           this.connectionType = connectionType;
           this.barcodeCapable2D = barcodeCapable2D;
    }


    /**
     * Gets the manufacturer value for this Printer.
     * 
     * @return manufacturer   * The printer's manufacturer. At the moment only for informational
     * purposes.
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this Printer.
     * 
     * @param manufacturer   * The printer's manufacturer. At the moment only for informational
     * purposes.
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the model value for this Printer.
     * 
     * @return model   * The printer's model. At the moment only for informational purposes.
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this Printer.
     * 
     * @param model   * The printer's model. At the moment only for informational purposes.
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the revision value for this Printer.
     * 
     * @return revision   * The printer's revision / version. At the moment only for informational
     * purposes.
     */
    public java.lang.String getRevision() {
        return revision;
    }


    /**
     * Sets the revision value for this Printer.
     * 
     * @param revision   * The printer's revision / version. At the moment only for informational
     * purposes.
     */
    public void setRevision(java.lang.String revision) {
        this.revision = revision;
    }


    /**
     * Gets the offsetX value for this Printer.
     * 
     * @return offsetX   * The horizontal offset in mm for the direct printer file (Not
     * used with normal PDF output).
     */
    public java.math.BigDecimal getOffsetX() {
        return offsetX;
    }


    /**
     * Sets the offsetX value for this Printer.
     * 
     * @param offsetX   * The horizontal offset in mm for the direct printer file (Not
     * used with normal PDF output).
     */
    public void setOffsetX(java.math.BigDecimal offsetX) {
        this.offsetX = offsetX;
    }


    /**
     * Gets the offsetY value for this Printer.
     * 
     * @return offsetY   * The vertical offset in mm for the direct printer file (Not
     * used with normal PDF output).
     */
    public java.math.BigDecimal getOffsetY() {
        return offsetY;
    }


    /**
     * Sets the offsetY value for this Printer.
     * 
     * @param offsetY   * The vertical offset in mm for the direct printer file (Not
     * used with normal PDF output).
     */
    public void setOffsetY(java.math.BigDecimal offsetY) {
        this.offsetY = offsetY;
    }


    /**
     * Gets the connectionType value for this Printer.
     * 
     * @return connectionType   * The connection type of the printer: serial or parallel connection.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrinterConnectionType getConnectionType() {
        return connectionType;
    }


    /**
     * Sets the connectionType value for this Printer.
     * 
     * @param connectionType   * The connection type of the printer: serial or parallel connection.
     */
    public void setConnectionType(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrinterConnectionType connectionType) {
        this.connectionType = connectionType;
    }


    /**
     * Gets the barcodeCapable2D value for this Printer.
     * 
     * @return barcodeCapable2D   * If the printer can print AZTEC barcodes, set this flag to true.
     */
    public boolean isBarcodeCapable2D() {
        return barcodeCapable2D;
    }


    /**
     * Sets the barcodeCapable2D value for this Printer.
     * 
     * @param barcodeCapable2D   * If the printer can print AZTEC barcodes, set this flag to true.
     */
    public void setBarcodeCapable2D(boolean barcodeCapable2D) {
        this.barcodeCapable2D = barcodeCapable2D;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Printer)) return false;
        Printer other = (Printer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.revision==null && other.getRevision()==null) || 
             (this.revision!=null &&
              this.revision.equals(other.getRevision()))) &&
            ((this.offsetX==null && other.getOffsetX()==null) || 
             (this.offsetX!=null &&
              this.offsetX.equals(other.getOffsetX()))) &&
            ((this.offsetY==null && other.getOffsetY()==null) || 
             (this.offsetY!=null &&
              this.offsetY.equals(other.getOffsetY()))) &&
            ((this.connectionType==null && other.getConnectionType()==null) || 
             (this.connectionType!=null &&
              this.connectionType.equals(other.getConnectionType()))) &&
            this.barcodeCapable2D == other.isBarcodeCapable2D();
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
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getRevision() != null) {
            _hashCode += getRevision().hashCode();
        }
        if (getOffsetX() != null) {
            _hashCode += getOffsetX().hashCode();
        }
        if (getOffsetY() != null) {
            _hashCode += getOffsetY().hashCode();
        }
        if (getConnectionType() != null) {
            _hashCode += getConnectionType().hashCode();
        }
        _hashCode += (isBarcodeCapable2D() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Printer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "printer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offsetX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offsetX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offsetY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offsetY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">printer>connectionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodeCapable2D");
        elemField.setXmlName(new javax.xml.namespace.QName("", "barcodeCapable2D"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
