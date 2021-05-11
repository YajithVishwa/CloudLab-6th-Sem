
package com.scriptons.crop;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getMoistureReturn" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getMoistureReturn"
})
@XmlRootElement(name = "getMoistureResponse")
public class GetMoistureResponse {

    protected float getMoistureReturn;

    /**
     * Gets the value of the getMoistureReturn property.
     * 
     */
    public float getGetMoistureReturn() {
        return getMoistureReturn;
    }

    /**
     * Sets the value of the getMoistureReturn property.
     * 
     */
    public void setGetMoistureReturn(float value) {
        this.getMoistureReturn = value;
    }

}
