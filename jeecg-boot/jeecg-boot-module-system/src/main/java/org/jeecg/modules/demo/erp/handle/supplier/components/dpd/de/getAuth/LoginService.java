/**
 * LoginService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth;

public interface LoginService extends java.rmi.Remote {

    /**
     * Creates an authentication token for the committed user if user
     * name and password are valid.
     * The authentication token is needed for accessing other DPD Web Services.
     * 
     * Sample request:
     * 
     * SOAP:
     * <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
     * 	xmlns:ns="http://dpd.com/common/service/types/LoginService/2.0">
     *    <soapenv:Header/>
     *    <soapenv:Body>
     *        <ns:getAuth>
     *            <delisId><your delisId></delisId>
     *            <password><your password></password>
     *            <messageLanguage>de_DE</messageLanguage>
     *        </ns:getAuth>
     *    </soapenv:Body>
     * <soapenv:Envelope>
     * 
     * REST:
     * URL: <server:port><path>/LoginService/V2_0/getAuth
     * JSON-Data for POST-Request (for GET-Request data must send with parameter
     * "request" and for
     * JSONP the Parameter "jsonpcallback" can be used, to send a padding
     * function name):
     * 
     * {
     *  "delisId" : "<your delisId>",
     *  "password": "<your password>",
     *  "messageLanguage":"en_EN"
     * }
     * 
     * REST-Result, without error:
     * 
     * {
     *    "getAuthResponse": {"return":    {
     *       "delisId": "<your delisId>",
     *       "customerUid": "<your customerUid>",
     *       "authToken": "<your authentication token>",
     *       "depot": "<your customerUid>"
     *    }},
     *    "status":    {
     *       "type": "OK",
     *       "code": "200",
     *       "message": "valid"
     *    }
     * }
     * 
     * REST-Result, if an error occurred:
     * 
     * {"status": {
     *    "type": "AuthenticationFault",
     *    "code": "<Error code, e.g. LOGIN_8>",
     *    "message": "<Error message, e.g. The combination of user and password
     * is invalid.>"
     * }}
     * 
     * Additional REST-State on system error:
     * Error-Code: 100
     * Error-Type: SystemFault
     * Error-Message: <Message, which describe the error>
     */
    public org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.Login getAuth(java.lang.String delisId, java.lang.String password, java.lang.String messageLanguage) throws java.rmi.RemoteException, org.jeecg.modules.demo.erp.handle.supplier.components.dpd.de.getAuth.AuthenticationFault;
}
