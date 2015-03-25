
package com.mastercard.api.partnerwallet.domain.switchapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Ref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VerificationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardholderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardBrand" type="{}CardBrand"/>
 *         &lt;element name="DirectProvisionedSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="6"/>
 *               &lt;maxLength value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaskedAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpiryMonth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpiryYear" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SecurityCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PhoneNumber" type="{}MobilePhone"/>
 *         &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Address" type="{}Address"/>
 *         &lt;element name="Issuer" type="{}Logo" minOccurs="0"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard", propOrder = {
    "id",
    "ref",
    "alias",
    "verificationStatus",
    "cardholderName",
    "cardBrand",
    "directProvisionedSwitch",
    "accountNumber",
    "maskedAccountNumber",
    "expiryMonth",
    "expiryYear",
    "securityCode",
    "phoneNumber",
    "preferred",
    "address",
    "issuer",
    "extensionPoint"
})
public class PaymentCard {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "VerificationStatus")
    protected String verificationStatus;
    @XmlElement(name = "CardholderName", required = true)
    protected String cardholderName;
    @XmlElement(name = "CardBrand", required = true)
    protected CardBrand cardBrand;
    @XmlElement(name = "DirectProvisionedSwitch")
    protected Boolean directProvisionedSwitch;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "MaskedAccountNumber")
    protected String maskedAccountNumber;
    @XmlElement(name = "ExpiryMonth")
    protected String expiryMonth;
    @XmlElement(name = "ExpiryYear")
    protected String expiryYear;
    @XmlElement(name = "SecurityCode")
    protected String securityCode;
    @XmlElement(name = "PhoneNumber", required = true)
    protected MobilePhone phoneNumber;
    @XmlElement(name = "Preferred")
    protected boolean preferred;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "Issuer")
    protected Logo issuer;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the verificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Sets the value of the verificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationStatus(String value) {
        this.verificationStatus = value;
    }

    /**
     * Gets the value of the cardholderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * Sets the value of the cardholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardholderName(String value) {
        this.cardholderName = value;
    }

    /**
     * Gets the value of the cardBrand property.
     * 
     * @return
     *     possible object is
     *     {@link CardBrand }
     *     
     */
    public CardBrand getCardBrand() {
        return cardBrand;
    }

    /**
     * Sets the value of the cardBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBrand }
     *     
     */
    public void setCardBrand(CardBrand value) {
        this.cardBrand = value;
    }

    /**
     * Gets the value of the directProvisionedSwitch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectProvisionedSwitch() {
        return directProvisionedSwitch;
    }

    /**
     * Sets the value of the directProvisionedSwitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectProvisionedSwitch(Boolean value) {
        this.directProvisionedSwitch = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the maskedAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedAccountNumber() {
        return maskedAccountNumber;
    }

    /**
     * Sets the value of the maskedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedAccountNumber(String value) {
        this.maskedAccountNumber = value;
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

    /**
     * Gets the value of the securityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Sets the value of the securityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCode(String value) {
        this.securityCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePhone }
     *     
     */
    public MobilePhone getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePhone }
     *     
     */
    public void setPhoneNumber(MobilePhone value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     */
    public boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     */
    public void setPreferred(boolean value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link Logo }
     *     
     */
    public Logo getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Logo }
     *     
     */
    public void setIssuer(Logo value) {
        this.issuer = value;
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

}
