//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.21 at 03:44:38 PM CEST 
//


package com.exchange.client.model.transaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addToCustomerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addToCustomerProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="profileGuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="customerIdentification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="markAsPreferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addToCustomerProfileType", propOrder = {
    "profileGuid",
    "customerIdentification",
    "markAsPreferred"
})
public class AddToCustomerProfileType {

    protected String profileGuid;
    protected String customerIdentification;
    protected Boolean markAsPreferred;

    /**
     * Default no-arg constructor
     * 
     */
    public AddToCustomerProfileType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AddToCustomerProfileType(final String profileGuid, final String customerIdentification, final Boolean markAsPreferred) {
        this.profileGuid = profileGuid;
        this.customerIdentification = customerIdentification;
        this.markAsPreferred = markAsPreferred;
    }

    /**
     * Gets the value of the profileGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileGuid() {
        return profileGuid;
    }

    /**
     * Sets the value of the profileGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileGuid(String value) {
        this.profileGuid = value;
    }

    /**
     * Gets the value of the customerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdentification() {
        return customerIdentification;
    }

    /**
     * Sets the value of the customerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentification(String value) {
        this.customerIdentification = value;
    }

    /**
     * Gets the value of the markAsPreferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkAsPreferred() {
        return markAsPreferred;
    }

    /**
     * Sets the value of the markAsPreferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkAsPreferred(Boolean value) {
        this.markAsPreferred = value;
    }

}
