/**
 * ShipmentServicePublic_4_3Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment;

public class ShipmentServicePublic_4_3Locator extends org.apache.axis.client.Service implements org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3 {

/**

 */

    public ShipmentServicePublic_4_3Locator() {
    }


    public ShipmentServicePublic_4_3Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ShipmentServicePublic_4_3Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ShipmentServicePublic_4_3_SOAP
    private java.lang.String ShipmentServicePublic_4_3_SOAP_address = "https://public-ws-stage.dpd.com/services/ShipmentService/V4_3/";

    @Override
    public java.lang.String getShipmentServicePublic_4_3_SOAPAddress() {
        return ShipmentServicePublic_4_3_SOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ShipmentServicePublic_4_3_SOAPWSDDServiceName = "ShipmentService-Public_4_3_SOAP";

    public java.lang.String getShipmentServicePublic_4_3_SOAPWSDDServiceName() {
        return ShipmentServicePublic_4_3_SOAPWSDDServiceName;
    }

    public void setShipmentServicePublic_4_3_SOAPWSDDServiceName(java.lang.String name) {
        ShipmentServicePublic_4_3_SOAPWSDDServiceName = name;
    }

    @Override
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentService_4_3 getShipmentServicePublic_4_3_SOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ShipmentServicePublic_4_3_SOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getShipmentServicePublic_4_3_SOAP(endpoint);
    }

    @Override
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentService_4_3 getShipmentServicePublic_4_3_SOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub _stub = new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub(portAddress, this);
            _stub.setPortName(getShipmentServicePublic_4_3_SOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setShipmentServicePublic_4_3_SOAPEndpointAddress(java.lang.String address) {
        ShipmentServicePublic_4_3_SOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    @Override
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentService_4_3.class.isAssignableFrom(serviceEndpointInterface)) {
                org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub _stub = new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.shipment.ShipmentServicePublic_4_3_SOAPStub(new java.net.URL(ShipmentServicePublic_4_3_SOAP_address), this);
                _stub.setPortName(getShipmentServicePublic_4_3_SOAPWSDDServiceName());
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
    @Override
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ShipmentService-Public_4_3_SOAP".equals(inputPortName)) {
            return getShipmentServicePublic_4_3_SOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    @Override
    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dpd.com/common/service/ShipmentService/4.3", "ShipmentService-Public_4_3");
    }

    private java.util.HashSet ports = null;

    @Override
    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dpd.com/common/service/ShipmentService/4.3", "ShipmentService-Public_4_3_SOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

if ("ShipmentServicePublic_4_3_SOAP".equals(portName)) {
            setShipmentServicePublic_4_3_SOAPEndpointAddress(address);
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
