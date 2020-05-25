/**
 * LoginServicePublic_2_0Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth;

public class LoginServicePublic_2_0Locator extends org.apache.axis.client.Service implements org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginServicePublic_2_0 {

    public LoginServicePublic_2_0Locator() {
    }


    public LoginServicePublic_2_0Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginServicePublic_2_0Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginService_2_0_SOAP
    private java.lang.String LoginService_2_0_SOAP_address = "https://public-ws-stage.dpd.com/services/LoginService/V2_0/";

    public java.lang.String getLoginService_2_0_SOAPAddress() {
        return LoginService_2_0_SOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoginService_2_0_SOAPWSDDServiceName = "LoginService_2_0_SOAP";

    public java.lang.String getLoginService_2_0_SOAPWSDDServiceName() {
        return LoginService_2_0_SOAPWSDDServiceName;
    }

    public void setLoginService_2_0_SOAPWSDDServiceName(java.lang.String name) {
        LoginService_2_0_SOAPWSDDServiceName = name;
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService getLoginService_2_0_SOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginService_2_0_SOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginService_2_0_SOAP(endpoint);
    }

    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService getLoginService_2_0_SOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService_2_0_SOAPStub _stub = new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService_2_0_SOAPStub(portAddress, this);
            _stub.setPortName(getLoginService_2_0_SOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginService_2_0_SOAPEndpointAddress(java.lang.String address) {
        LoginService_2_0_SOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService_2_0_SOAPStub _stub = new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService_2_0_SOAPStub(new java.net.URL(LoginService_2_0_SOAP_address), this);
                _stub.setPortName(getLoginService_2_0_SOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LoginService_2_0_SOAP".equals(inputPortName)) {
            return getLoginService_2_0_SOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dpd.com/common/service/LoginService/2.0", "LoginService-Public_2_0");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dpd.com/common/service/LoginService/2.0", "LoginService_2_0_SOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoginService_2_0_SOAP".equals(portName)) {
            setLoginService_2_0_SOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
