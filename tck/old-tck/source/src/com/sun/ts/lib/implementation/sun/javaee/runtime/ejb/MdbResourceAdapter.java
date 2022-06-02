//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.29 at 09:57:39 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.ejb;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resourceAdapterMid",
    "activationConfig"
})
@XmlRootElement(name = "mdb-resource-adapter")
public class MdbResourceAdapter
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "resource-adapter-mid", required = true)
    protected String resourceAdapterMid;
    @XmlElement(name = "activation-config")
    protected ActivationConfig activationConfig;

    /**
     * Gets the value of the resourceAdapterMid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceAdapterMid() {
        return resourceAdapterMid;
    }

    /**
     * Sets the value of the resourceAdapterMid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceAdapterMid(String value) {
        this.resourceAdapterMid = value;
    }

    /**
     * Gets the value of the activationConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationConfig }
     *     
     */
    public ActivationConfig getActivationConfig() {
        return activationConfig;
    }

    /**
     * Sets the value of the activationConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationConfig }
     *     
     */
    public void setActivationConfig(ActivationConfig value) {
        this.activationConfig = value;
    }

}
