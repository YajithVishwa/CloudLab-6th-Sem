
package com.yajith.people;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PeopleClass", targetNamespace = "http://people.yajith.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PeopleClass {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "getNameReturn", targetNamespace = "http://people.yajith.com")
    @RequestWrapper(localName = "getName", targetNamespace = "http://people.yajith.com", className = "com.yajith.people.GetName")
    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://people.yajith.com", className = "com.yajith.people.GetNameResponse")
    public String getName();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "getAgeReturn", targetNamespace = "http://people.yajith.com")
    @RequestWrapper(localName = "getAge", targetNamespace = "http://people.yajith.com", className = "com.yajith.people.GetAge")
    @ResponseWrapper(localName = "getAgeResponse", targetNamespace = "http://people.yajith.com", className = "com.yajith.people.GetAgeResponse")
    public int getAge();

}
