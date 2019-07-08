//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.21 at 03:44:38 PM CEST 
//


package com.exchange.client.model.transaction;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://asxgw.com/Schema/V2/Transaction}amountType"/>
 *         &lt;element name="currency" type="{http://asxgw.com/Schema/V2/Transaction}currencyType"/>
 *         &lt;element name="periodLength" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="periodUnit" type="{http://asxgw.com/Schema/V2/Transaction}periodUnitType"/>
 *         &lt;element name="startDateTime" type="{http://asxgw.com/Schema/V2/Transaction}scheduleDateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleType", propOrder = {
    "amount",
    "currency",
    "periodLength",
    "periodUnit",
    "startDateTime"
})
public class ScheduleType {

    @XmlElement(required = true)
    protected BigDecimal amount;
    @XmlElement(required = true)
    protected String currency;
    @XmlSchemaType(name = "unsignedInt")
    protected long periodLength;
    @XmlElement(required = true)
    protected PeriodUnitType periodUnit;
    protected String startDateTime;

    /**
     * Default no-arg constructor
     * 
     */
    public ScheduleType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScheduleType(final BigDecimal amount, final String currency, final long periodLength, final PeriodUnitType periodUnit, final String startDateTime) {
        this.amount = amount;
        this.currency = currency;
        this.periodLength = periodLength;
        this.periodUnit = periodUnit;
        this.startDateTime = startDateTime;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the periodLength property.
     * 
     */
    public long getPeriodLength() {
        return periodLength;
    }

    /**
     * Sets the value of the periodLength property.
     * 
     */
    public void setPeriodLength(long value) {
        this.periodLength = value;
    }

    /**
     * Gets the value of the periodUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodUnitType }
     *     
     */
    public PeriodUnitType getPeriodUnit() {
        return periodUnit;
    }

    /**
     * Sets the value of the periodUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodUnitType }
     *     
     */
    public void setPeriodUnit(PeriodUnitType value) {
        this.periodUnit = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

}
