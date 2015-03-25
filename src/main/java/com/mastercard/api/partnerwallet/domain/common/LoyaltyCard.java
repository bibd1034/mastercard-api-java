
package com.mastercard.api.partnerwallet.domain.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoyaltyCardId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="LoyaltyBrandId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MembershipNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *         &lt;element name="ExpiryMonth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="|[0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpiryYear" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="|[0-9]{4}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyCard", propOrder = {
    "loyaltyCardId",
    "loyaltyBrandId",
    "membershipNumber",
    "extensionPoint",
    "expiryMonth",
    "expiryYear"
})
public class LoyaltyCard {

    @XmlElement(name = "LoyaltyCardId")
    protected long loyaltyCardId;
    @XmlElement(name = "LoyaltyBrandId")
    protected long loyaltyBrandId;
    @XmlElement(name = "MembershipNumber", required = true)
    protected String membershipNumber;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;
    @XmlElement(name = "ExpiryMonth")
    protected String expiryMonth;
    @XmlElement(name = "ExpiryYear")
    protected String expiryYear;

    /**
     * Gets the value of the loyaltyCardId property.
     * 
     */
    public long getLoyaltyCardId() {
        return loyaltyCardId;
    }

    /**
     * Sets the value of the loyaltyCardId property.
     * 
     */
    public void setLoyaltyCardId(long value) {
        this.loyaltyCardId = value;
    }

    /**
     * Gets the value of the loyaltyBrandId property.
     * 
     */
    public long getLoyaltyBrandId() {
        return loyaltyBrandId;
    }

    /**
     * Sets the value of the loyaltyBrandId property.
     * 
     */
    public void setLoyaltyBrandId(long value) {
        this.loyaltyBrandId = value;
    }

    /**
     * Gets the value of the membershipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /**
     * Sets the value of the membershipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipNumber(String value) {
        this.membershipNumber = value;
    }

    /**
     * Gets the value of the extensionPoint property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionPoint }
     *     
     */
    public ExtensionPoint getExtensionPoint() {
        return extensionPoint;
    }

    /**
     * Sets the value of the extensionPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionPoint }
     *     
     */
    public void setExtensionPoint(ExtensionPoint value) {
        this.extensionPoint = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryMonth(String value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

}
