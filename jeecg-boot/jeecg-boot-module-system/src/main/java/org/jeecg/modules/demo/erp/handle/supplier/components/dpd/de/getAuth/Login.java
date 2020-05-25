/**
 * Login.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth;


/**
 * Is created when a user logs in and contains its login information.
 */
public class Login  implements java.io.Serializable {
    /* The user's DELIS-Id. */
    private java.lang.String delisId;

    /* The user's customer uid. This is needed for subaccounts, usually
     * this is equal to DELIS-Id */
    private java.lang.String customerUid;

    /* The Authtoken, needed for other web service calls. */
    private java.lang.String authToken;

    /* The depot, to which the user is assigned. */
    private java.lang.String depot;

    public Login() {
    }

    public Login(
           java.lang.String delisId,
           java.lang.String customerUid,
           java.lang.String authToken,
           java.lang.String depot) {
           this.delisId = delisId;
           this.customerUid = customerUid;
           this.authToken = authToken;
           this.depot = depot;
    }


    /**
     * Gets the delisId value for this Login.
     * 
     * @return delisId   * The user's DELIS-Id.
     */
    public java.lang.String getDelisId() {
        return delisId;
    }


    /**
     * Sets the delisId value for this Login.
     * 
     * @param delisId   * The user's DELIS-Id.
     */
    public void setDelisId(java.lang.String delisId) {
        this.delisId = delisId;
    }


    /**
     * Gets the customerUid value for this Login.
     * 
     * @return customerUid   * The user's customer uid. This is needed for subaccounts, usually
     * this is equal to DELIS-Id
     */
    public java.lang.String getCustomerUid() {
        return customerUid;
    }


    /**
     * Sets the customerUid value for this Login.
     * 
     * @param customerUid   * The user's customer uid. This is needed for subaccounts, usually
     * this is equal to DELIS-Id
     */
    public void setCustomerUid(java.lang.String customerUid) {
        this.customerUid = customerUid;
    }


    /**
     * Gets the authToken value for this Login.
     * 
     * @return authToken   * The Authtoken, needed for other web service calls.
     */
    public java.lang.String getAuthToken() {
        return authToken;
    }


    /**
     * Sets the authToken value for this Login.
     * 
     * @param authToken   * The Authtoken, needed for other web service calls.
     */
    public void setAuthToken(java.lang.String authToken) {
        this.authToken = authToken;
    }


    /**
     * Gets the depot value for this Login.
     * 
     * @return depot   * The depot, to which the user is assigned.
     */
    public java.lang.String getDepot() {
        return depot;
    }


    /**
     * Sets the depot value for this Login.
     * 
     * @param depot   * The depot, to which the user is assigned.
     */
    public void setDepot(java.lang.String depot) {
        this.depot = depot;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Login)) return false;
        Login other = (Login) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delisId==null && other.getDelisId()==null) || 
             (this.delisId!=null &&
              this.delisId.equals(other.getDelisId()))) &&
            ((this.customerUid==null && other.getCustomerUid()==null) || 
             (this.customerUid!=null &&
              this.customerUid.equals(other.getCustomerUid()))) &&
            ((this.authToken==null && other.getAuthToken()==null) || 
             (this.authToken!=null &&
              this.authToken.equals(other.getAuthToken()))) &&
            ((this.depot==null && other.getDepot()==null) || 
             (this.depot!=null &&
              this.depot.equals(other.getDepot())));
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
        if (getDelisId() != null) {
            _hashCode += getDelisId().hashCode();
        }
        if (getCustomerUid() != null) {
            _hashCode += getCustomerUid().hashCode();
        }
        if (getAuthToken() != null) {
            _hashCode += getAuthToken().hashCode();
        }
        if (getDepot() != null) {
            _hashCode += getDepot().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Login.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dpd.com/common/service/types/LoginService/2.0", "Login"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delisId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delisId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerUid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerUid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
