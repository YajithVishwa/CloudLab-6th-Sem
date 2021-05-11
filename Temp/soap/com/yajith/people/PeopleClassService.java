
package com.yajith.people;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PeopleClassService", targetNamespace = "http://people.yajith.com", wsdlLocation = "http://localhost:8080/ServerPeople/services/PeopleClass?wsdl")
public class PeopleClassService
    extends Service
{

    private final static URL PEOPLECLASSSERVICE_WSDL_LOCATION;
    private final static WebServiceException PEOPLECLASSSERVICE_EXCEPTION;
    private final static QName PEOPLECLASSSERVICE_QNAME = new QName("http://people.yajith.com", "PeopleClassService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServerPeople/services/PeopleClass?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PEOPLECLASSSERVICE_WSDL_LOCATION = url;
        PEOPLECLASSSERVICE_EXCEPTION = e;
    }

    public PeopleClassService() {
        super(__getWsdlLocation(), PEOPLECLASSSERVICE_QNAME);
    }

    public PeopleClassService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PEOPLECLASSSERVICE_QNAME, features);
    }

    public PeopleClassService(URL wsdlLocation) {
        super(wsdlLocation, PEOPLECLASSSERVICE_QNAME);
    }

    public PeopleClassService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PEOPLECLASSSERVICE_QNAME, features);
    }

    public PeopleClassService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PeopleClassService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PeopleClass
     */
    @WebEndpoint(name = "PeopleClass")
    public PeopleClass getPeopleClass() {
        return super.getPort(new QName("http://people.yajith.com", "PeopleClass"), PeopleClass.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PeopleClass
     */
    @WebEndpoint(name = "PeopleClass")
    public PeopleClass getPeopleClass(WebServiceFeature... features) {
        return super.getPort(new QName("http://people.yajith.com", "PeopleClass"), PeopleClass.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PEOPLECLASSSERVICE_EXCEPTION!= null) {
            throw PEOPLECLASSSERVICE_EXCEPTION;
        }
        return PEOPLECLASSSERVICE_WSDL_LOCATION;
    }

}
