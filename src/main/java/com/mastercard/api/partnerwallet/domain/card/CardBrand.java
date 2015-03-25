//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.18 at 03:48:23 PM CST 
//


package com.mastercard.api.partnerwallet.domain.card;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardBrand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardBrand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CvvRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExpDateRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrivateLabelCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardBrand", propOrder = {
    "cvvRequired",
    "displayName",
    "expDateRequired",
    "id",
    "logoUrl",
    "privateLabelCard"
})
public class CardBrand
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CvvRequired")
    protected boolean cvvRequired;
    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "ExpDateRequired")
    protected boolean expDateRequired;
    @XmlElement(name = "Id", required = true)
    protected String id;
    protected String logoUrl;
    @XmlElement(name = "PrivateLabelCard")
    protected boolean privateLabelCard;

    /**
     * Gets the value of the cvvRequired property.
     * 
     */
    public boolean isCvvRequired() {
        return cvvRequired;
    }

    /**
     * Sets the value of the cvvRequired property.
     * 
     */
    public void setCvvRequired(boolean value) {
        this.cvvRequired = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the expDateRequired property.
     * 
     */
    public boolean isExpDateRequired() {
        return expDateRequired;
    }

    /**
     * Sets the value of the expDateRequired property.
     * 
     */
    public void setExpDateRequired(boolean value) {
        this.expDateRequired = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Sets the value of the logoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUrl(String value) {
        this.logoUrl = value;
    }

    /**
     * Gets the value of the privateLabelCard property.
     * 
     */
    public boolean isPrivateLabelCard() {
        return privateLabelCard;
    }

    /**
     * Sets the value of the privateLabelCard property.
     * 
     */
    public void setPrivateLabelCard(boolean value) {
        this.privateLabelCard = value;
    }

}
