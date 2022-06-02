//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0-M3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.29 at 09:57:39 PM UTC 
//


package com.sun.ts.lib.implementation.sun.javaee.runtime.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    "name",
    "uniqueId",
    "ejb",
    "pmDescriptors",
    "cmpResource",
    "messageDestination",
    "webserviceDescription"
})
@XmlRootElement(name = "enterprise-beans")
public class EnterpriseBeans
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String name;
    @XmlElement(name = "unique-id")
    protected String uniqueId;
    protected List<Ejb> ejb;
    @XmlElement(name = "pm-descriptors")
    protected PmDescriptors pmDescriptors;
    @XmlElement(name = "cmp-resource")
    protected CmpResource cmpResource;
    @XmlElement(name = "message-destination")
    protected List<MessageDestination> messageDestination;
    @XmlElement(name = "webservice-description")
    protected List<WebserviceDescription> webserviceDescription;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
    }

    /**
     * Gets the value of the ejb property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the ejb property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEjb().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Ejb }
     * 
     * 
     */
    public List<Ejb> getEjb() {
        if (ejb == null) {
            ejb = new ArrayList<Ejb>();
        }
        return this.ejb;
    }

    /**
     * Gets the value of the pmDescriptors property.
     * 
     * @return
     *     possible object is
     *     {@link PmDescriptors }
     *     
     */
    public PmDescriptors getPmDescriptors() {
        return pmDescriptors;
    }

    /**
     * Sets the value of the pmDescriptors property.
     * 
     * @param value
     *     allowed object is
     *     {@link PmDescriptors }
     *     
     */
    public void setPmDescriptors(PmDescriptors value) {
        this.pmDescriptors = value;
    }

    /**
     * Gets the value of the cmpResource property.
     * 
     * @return
     *     possible object is
     *     {@link CmpResource }
     *     
     */
    public CmpResource getCmpResource() {
        return cmpResource;
    }

    /**
     * Sets the value of the cmpResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmpResource }
     *     
     */
    public void setCmpResource(CmpResource value) {
        this.cmpResource = value;
    }

    /**
     * Gets the value of the messageDestination property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the messageDestination property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMessageDestination().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDestination }
     * 
     * 
     */
    public List<MessageDestination> getMessageDestination() {
        if (messageDestination == null) {
            messageDestination = new ArrayList<MessageDestination>();
        }
        return this.messageDestination;
    }

    /**
     * Gets the value of the webserviceDescription property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the webserviceDescription property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getWebserviceDescription().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link WebserviceDescription }
     * 
     * 
     */
    public List<WebserviceDescription> getWebserviceDescription() {
        if (webserviceDescription == null) {
            webserviceDescription = new ArrayList<WebserviceDescription>();
        }
        return this.webserviceDescription;
    }

}
