//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.18 at 10:46:38 PM CST 
//


package com.mastercard.api.fraud.merchant.v1.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for principal-match_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="principal-match_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://mastercard.com/termination}match-enumeration_Type"/>
 *         &lt;element name="NationalId" type="{http://mastercard.com/termination}match-enumeration_Type" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://mastercard.com/termination}match-enumeration_Type" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://mastercard.com/termination}match-enumeration_Type"/>
 *         &lt;element name="DriversLicense" type="{http://mastercard.com/termination}match-enumeration_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "principal-match_Type", propOrder = {
    "name",
    "nationalId",
    "phoneNumber",
    "address",
    "driversLicense"
})
public class PrincipalMatchType {

    @XmlElement(name = "Name", required = true)
    protected MatchEnumerationType name;
    @XmlElement(name = "NationalId")
    protected MatchEnumerationType nationalId;
    @XmlElement(name = "PhoneNumber")
    protected MatchEnumerationType phoneNumber;
    @XmlElement(name = "Address", required = true)
    protected MatchEnumerationType address;
    @XmlElement(name = "DriversLicense")
    protected MatchEnumerationType driversLicense;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link MatchEnumerationType }
     *     
     */
    public MatchEnumerationType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchEnumerationType }
     *     
     */
    public void setName(MatchEnumerationType value) {
        this.name = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link MatchEnumerationType }
     *     
     */
    public MatchEnumerationType getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchEnumerationType }
     *     
     */
    public void setNationalId(MatchEnumerationType value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MatchEnumerationType }
     *     
     */
    public MatchEnumerationType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchEnumerationType }
     *     
     */
    public void setPhoneNumber(MatchEnumerationType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link MatchEnumerationType }
     *     
     */
    public MatchEnumerationType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchEnumerationType }
     *     
     */
    public void setAddress(MatchEnumerationType value) {
        this.address = value;
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link MatchEnumerationType }
     *     
     */
    public MatchEnumerationType getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchEnumerationType }
     *     
     */
    public void setDriversLicense(MatchEnumerationType value) {
        this.driversLicense = value;
    }

}
