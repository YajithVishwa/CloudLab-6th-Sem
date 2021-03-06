
package com.scriptons.crop;

import javax.jws.WebMethod;
import javax.jws.WebParam;
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
@WebService(name = "CropClass", targetNamespace = "http://crop.scriptons.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CropClass {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "getNameReturn", targetNamespace = "http://crop.scriptons.com")
    @RequestWrapper(localName = "getName", targetNamespace = "http://crop.scriptons.com", className = "com.scriptons.crop.GetName")
    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://crop.scriptons.com", className = "com.scriptons.crop.GetNameResponse")
    public String getName();

    /**
     * 
     * @param name
     */
    @WebMethod
    @RequestWrapper(localName = "setName", targetNamespace = "http://crop.scriptons.com", className = "com.scriptons.crop.SetName")
    @ResponseWrapper(localName = "setNameResponse", targetNamespace = "http://crop.scriptons.com", className = "com.scriptons.crop.SetNameResponse")
    public void setName(
        @WebParam(name = "name", targetNamespace = "http://crop.scriptons.com")
        String name);

    /**
     * 
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(name = "getMoistureReturn", targetNamespace = "http://crop.scriptons.com")
    @RequestWrapper(localName = "getMoisture", targetNamespace = "http://crop.scriptons.com", className = "com.scriptons.crop.GetMoisture")
    @ResponseWrapper(localName = "getMoistureResponse", targetNamespace = "http://crop.scriptons.com", className = "com.scriptons.crop.GetMoistureResponse")
    public float getMoisture();

}
