
package com.mycompany.data_transmission_using_tpa;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RegisterService", targetNamespace = "http://data_transmission_using_tpa.mycompany.com/", wsdlLocation = "http://localhost:8080/Data_Transmission_using_TPA/RegisterService?WSDL")
public class RegisterService_Service
    extends Service
{

    private final static URL REGISTERSERVICE_WSDL_LOCATION;
    private final static WebServiceException REGISTERSERVICE_EXCEPTION;
    private final static QName REGISTERSERVICE_QNAME = new QName("http://data_transmission_using_tpa.mycompany.com/", "RegisterService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Data_Transmission_using_TPA/RegisterService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REGISTERSERVICE_WSDL_LOCATION = url;
        REGISTERSERVICE_EXCEPTION = e;
    }

    public RegisterService_Service() {
        super(__getWsdlLocation(), REGISTERSERVICE_QNAME);
    }

    public RegisterService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), REGISTERSERVICE_QNAME, features);
    }

    public RegisterService_Service(URL wsdlLocation) {
        super(wsdlLocation, REGISTERSERVICE_QNAME);
    }

    public RegisterService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REGISTERSERVICE_QNAME, features);
    }

    public RegisterService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RegisterService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RegisterService
     */
    @WebEndpoint(name = "RegisterServicePort")
    public RegisterService getRegisterServicePort() {
        return super.getPort(new QName("http://data_transmission_using_tpa.mycompany.com/", "RegisterServicePort"), RegisterService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RegisterService
     */
    @WebEndpoint(name = "RegisterServicePort")
    public RegisterService getRegisterServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://data_transmission_using_tpa.mycompany.com/", "RegisterServicePort"), RegisterService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REGISTERSERVICE_EXCEPTION!= null) {
            throw REGISTERSERVICE_EXCEPTION;
        }
        return REGISTERSERVICE_WSDL_LOCATION;
    }

}
