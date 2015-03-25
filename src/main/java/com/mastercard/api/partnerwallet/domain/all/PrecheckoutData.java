
package com.mastercard.api.partnerwallet.domain.all;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecheckoutData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecheckoutData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cards" type="{}PrecheckoutCards"/>
 *         &lt;element name="Contact" type="{}Contact" minOccurs="0"/>
 *         &lt;element name="ShippingAddresses" type="{}PrecheckoutShippingAddresses"/>
 *         &lt;element name="RewardPrograms" type="{}PrecheckoutRewardPrograms"/>
 *         &lt;element name="WalletName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecheckoutTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConsumerWalletId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Errors" type="{}Errors" minOccurs="0"/>
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
@XmlType(name = "PrecheckoutData", propOrder = {
    "cards",
    "contact",
    "shippingAddresses",
    "rewardPrograms",
    "walletName",
    "precheckoutTransactionId",
    "consumerWalletId",
    "errors",
    "extensionPoint"
})
public class PrecheckoutData {

    @XmlElement(name = "Cards", required = true)
    protected PrecheckoutCards cards;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlElement(name = "ShippingAddresses", required = true)
    protected PrecheckoutShippingAddresses shippingAddresses;
    @XmlElement(name = "RewardPrograms", required = true)
    protected PrecheckoutRewardPrograms rewardPrograms;
    @XmlElement(name = "WalletName", required = true)
    protected String walletName;
    @XmlElement(name = "PrecheckoutTransactionId", required = true)
    protected String precheckoutTransactionId;
    @XmlElement(name = "ConsumerWalletId", required = true)
    protected String consumerWalletId;
    @XmlElement(name = "Errors")
    protected Errors errors;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the cards property.
     * 
     * @return
     *     possible object is
     *     {@link PrecheckoutCards }
     *     
     */
    public PrecheckoutCards getCards() {
        return cards;
    }

    /**
     * Sets the value of the cards property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecheckoutCards }
     *     
     */
    public void setCards(PrecheckoutCards value) {
        this.cards = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the shippingAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link PrecheckoutShippingAddresses }
     *     
     */
    public PrecheckoutShippingAddresses getShippingAddresses() {
        return shippingAddresses;
    }

    /**
     * Sets the value of the shippingAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecheckoutShippingAddresses }
     *     
     */
    public void setShippingAddresses(PrecheckoutShippingAddresses value) {
        this.shippingAddresses = value;
    }

    /**
     * Gets the value of the rewardPrograms property.
     * 
     * @return
     *     possible object is
     *     {@link PrecheckoutRewardPrograms }
     *     
     */
    public PrecheckoutRewardPrograms getRewardPrograms() {
        return rewardPrograms;
    }

    /**
     * Sets the value of the rewardPrograms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecheckoutRewardPrograms }
     *     
     */
    public void setRewardPrograms(PrecheckoutRewardPrograms value) {
        this.rewardPrograms = value;
    }

    /**
     * Gets the value of the walletName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletName() {
        return walletName;
    }

    /**
     * Sets the value of the walletName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletName(String value) {
        this.walletName = value;
    }

    /**
     * Gets the value of the precheckoutTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecheckoutTransactionId() {
        return precheckoutTransactionId;
    }

    /**
     * Sets the value of the precheckoutTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecheckoutTransactionId(String value) {
        this.precheckoutTransactionId = value;
    }

    /**
     * Gets the value of the consumerWalletId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerWalletId() {
        return consumerWalletId;
    }

    /**
     * Sets the value of the consumerWalletId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerWalletId(String value) {
        this.consumerWalletId = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
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
