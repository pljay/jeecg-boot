/**
 * LoginServicePublic_2_0TestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.entity.HkdBootConstant;
import org.springframework.scheduling.annotation.Async;

@Slf4j
public class LoginServicePublic_2_0TestCase extends junit.framework.TestCase {
    public LoginServicePublic_2_0TestCase(java.lang.String name) {
        super(name);
    }

    public void testAsync(){
        for(int i=0;i<100;i++){
            this.async(i);
        }


    }
    @Async(HkdBootConstant.ASYNC_POOL)
    public void async(int i){
        log.info("线程---"+i);
        try {
            Thread.sleep(3000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void testLoginService_2_0_SOAPWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginServicePublic_2_0Locator().getLoginService_2_0_SOAPAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginServicePublic_2_0Locator().getServiceName());
        assertTrue(service != null);
    }

    public void test1LoginService_2_0_SOAPGetAuth() throws Exception {
        org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService_2_0_SOAPStub binding;
        try {
            binding = (org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginService_2_0_SOAPStub)
                          new org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.LoginServicePublic_2_0Locator().getLoginService_2_0_SOAP();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
            {
                jre.getLinkedCause().printStackTrace();
            }
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        try {
            org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.Login value = null;
            value = binding.getAuth("sandboxdpd", "xMmshh1", "en_EN");
        }
        catch (org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.AuthenticationFault e1) {
            throw new junit.framework.AssertionFailedError("AuthenticationFault Exception caught: " + e1);
        }
            // TBD - validate results
    }

}
