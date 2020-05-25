/**
 * PrintOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;


/**
 * Options how to return the parcel labels
 */
public class PrintOption  implements java.io.Serializable {
    /* The format in which the parcel labels should be returned.
     * PDF, BARCODE_IMAGE, MULTIPAGE_IMAGE as file output; DPL, PDL, ZPL
     * for direct printing.
     * In any case the output is base64 encoded. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputFormatType outputFormat;

    /* Declares the paper format for parcel label print, either "A4",
     * "A6" or "A7".
     * For direct printing must be set to "A6". "A7" only prints return labels. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOptionPaperFormat paperFormat;

    /* Information about the printer, if direct printing is enabled. */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Printer printer;

    /* The start position of the first parcellabel on the first page,
     * if page format A4 is chosen. Ignored on other paperformats */
    private org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StartPosition startPosition;

    public PrintOption() {
    }

    public PrintOption(
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputFormatType outputFormat,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOptionPaperFormat paperFormat,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Printer printer,
           org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StartPosition startPosition) {
           this.outputFormat = outputFormat;
           this.paperFormat = paperFormat;
           this.printer = printer;
           this.startPosition = startPosition;
    }


    /**
     * Gets the outputFormat value for this PrintOption.
     * 
     * @return outputFormat   * The format in which the parcel labels should be returned.
     * PDF, BARCODE_IMAGE, MULTIPAGE_IMAGE as file output; DPL, PDL, ZPL
     * for direct printing.
     * In any case the output is base64 encoded.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputFormatType getOutputFormat() {
        return outputFormat;
    }


    /**
     * Sets the outputFormat value for this PrintOption.
     * 
     * @param outputFormat   * The format in which the parcel labels should be returned.
     * PDF, BARCODE_IMAGE, MULTIPAGE_IMAGE as file output; DPL, PDL, ZPL
     * for direct printing.
     * In any case the output is base64 encoded.
     */
    public void setOutputFormat(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.OutputFormatType outputFormat) {
        this.outputFormat = outputFormat;
    }


    /**
     * Gets the paperFormat value for this PrintOption.
     * 
     * @return paperFormat   * Declares the paper format for parcel label print, either "A4",
     * "A6" or "A7".
     * For direct printing must be set to "A6". "A7" only prints return labels.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOptionPaperFormat getPaperFormat() {
        return paperFormat;
    }


    /**
     * Sets the paperFormat value for this PrintOption.
     * 
     * @param paperFormat   * Declares the paper format for parcel label print, either "A4",
     * "A6" or "A7".
     * For direct printing must be set to "A6". "A7" only prints return labels.
     */
    public void setPaperFormat(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.PrintOptionPaperFormat paperFormat) {
        this.paperFormat = paperFormat;
    }


    /**
     * Gets the printer value for this PrintOption.
     * 
     * @return printer   * Information about the printer, if direct printing is enabled.
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Printer getPrinter() {
        return printer;
    }


    /**
     * Sets the printer value for this PrintOption.
     * 
     * @param printer   * Information about the printer, if direct printing is enabled.
     */
    public void setPrinter(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.Printer printer) {
        this.printer = printer;
    }


    /**
     * Gets the startPosition value for this PrintOption.
     * 
     * @return startPosition   * The start position of the first parcellabel on the first page,
     * if page format A4 is chosen. Ignored on other paperformats
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StartPosition getStartPosition() {
        return startPosition;
    }


    /**
     * Sets the startPosition value for this PrintOption.
     * 
     * @param startPosition   * The start position of the first parcellabel on the first page,
     * if page format A4 is chosen. Ignored on other paperformats
     */
    public void setStartPosition(org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.StartPosition startPosition) {
        this.startPosition = startPosition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintOption)) return false;
        PrintOption other = (PrintOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outputFormat==null && other.getOutputFormat()==null) || 
             (this.outputFormat!=null &&
              this.outputFormat.equals(other.getOutputFormat()))) &&
            ((this.paperFormat==null && other.getPaperFormat()==null) || 
             (this.paperFormat!=null &&
              this.paperFormat.equals(other.getPaperFormat()))) &&
            ((this.printer==null && other.getPrinter()==null) || 
             (this.printer!=null &&
              this.printer.equals(other.getPrinter()))) &&
            ((this.startPosition==null && other.getStartPosition()==null) || 
             (this.startPosition!=null &&
              this.startPosition.equals(other.getStartPosition())));
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
        if (getOutputFormat() != null) {
            _hashCode += getOutputFormat().hashCode();
        }
        if (getPaperFormat() != null) {
            _hashCode += getPaperFormat().hashCode();
        }
        if (getPrinter() != null) {
            _hashCode += getPrinter().hashCode();
        }
        if (getStartPosition() != null) {
            _hashCode += getStartPosition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "printOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outputFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "OutputFormatType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paperFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paperFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", ">printOption>paperFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "printer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/ShipmentService/4.3", "startPosition"));
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
