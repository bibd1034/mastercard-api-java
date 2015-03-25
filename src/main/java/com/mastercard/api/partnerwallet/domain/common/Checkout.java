
package com.mastercard.api.partnerwallet.domain.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Checkout complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Checkout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{}Name"/>
 *         &lt;element name="PaymentMethod" type="{}PaymentCard"/>
 *         &lt;element name="DeliveryDestination" type="{}DeliveryDestination"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *         &lt;element name="LoyaltyCard" type="{}LoyaltyCard" minOccurs="0"/>
 *         &lt;element name="CheckoutResourceUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MerchantCallbackUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CheckoutPairingCallbackUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VerifierToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Checkout", propOrder = {
    "id",
    "ref",
    "name",
    "paymentMethod",
    "deliveryDestination",
    "extensionPoint",
    "loyaltyCard",
    "checkoutResourceUrl",
    "merchantCallbackUrl",
    "checkoutPairingCallbackUrl",
    "verifierToken"
})
public class Checkout {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "Name", required = true)
    protected Name name;
    @XmlElement(name = "PaymentMethod", required = true)
    protected PaymentCard paymentMethod;
    @XmlElement(name = "DeliveryDestination", required = true)
    protected DeliveryDestination deliveryDestination;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;
    @XmlElement(name = "LoyaltyCard")
    protected LoyaltyCard loyaltyCard;
    @XmlElement(name = "CheckoutResourceUrl", required = true)
    protected String checkoutResourceUrl;
    @XmlElement(name = "MerchantCallbackUrl", required = true)
    protected String merchantCallbackUrl;
    @XmlElement(name = "CheckoutPairingCallbackUrl", required = true)
    protected String checkoutPairingCallbackUrl;
    @XmlElement(name = "VerifierToken", required = true)
    protected String verifierToken;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard }
     *     
     */
    public PaymentCard getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard }
     *     
     */
    public void setPaymentMethod(PaymentCard value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the deliveryDestination property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDestination }
     *     
     */
    public DeliveryDestination getDeliveryDestination() {
        return deliveryDestination;
    }

    /**
     * Sets the value of the deliveryDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDestination }
     *     
     */
    public void setDeliveryDestination(DeliveryDestination value) {
        this.deliveryDestination = value;
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
     * Gets the value of the loyaltyCard property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyCard }
     *     
     */
    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    /**
     * Sets the value of the loyaltyCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyCard }
     *     
     */
    public void setLoyaltyCard(LoyaltyCard value) {
        this.loyaltyCard = value;
    }

    /**
     * Gets the value of the checkoutResourceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutResourceUrl() {
        return checkoutResourceUrl;
    }

    /**
     * Sets the value of the checkoutResourceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutResourceUrl(String value) {
        this.checkoutResourceUrl = value;
    }

    /**
     * Gets the value of the merchantCallbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCallbackUrl() {
        return merchantCallbackUrl;
    }

    /**
     * Sets the value of the merchantCallbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCallbackUrl(String value) {
        this.merchantCallbackUrl = value;
    }

    /**
     * Gets the value of the checkoutPairingCallbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutPairingCallbackUrl() {
        return checkoutPairingCallbackUrl;
    }

    /**
     * Sets the value of the checkoutPairingCallbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutPairingCallbackUrl(String value) {
        this.checkoutPairingCallbackUrl = value;
    }

    /**
     * Gets the value of the verifierToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifierToken() {
        return verifierToken;
    }

    /**
     * Sets the value of the verifierToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifierToken(String value) {
        this.verifierToken = value;
    }

}
