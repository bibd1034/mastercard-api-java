
package com.mastercard.api.partnerwallet.domain.all;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpressCheckoutRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressCheckoutRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MerchantCheckoutId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrecheckoutTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OrderAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShippingAddressId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardProgramId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvancedCheckoutOverride" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OriginUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ExpressCheckoutRequest", propOrder = {
    "merchantCheckoutId",
    "precheckoutTransactionId",
    "currencyCode",
    "orderAmount",
    "cardId",
    "shippingAddressId",
    "rewardProgramId",
    "advancedCheckoutOverride",
    "originUrl",
    "extensionPoint"
})
public class ExpressCheckoutRequest {

    @XmlElement(name = "MerchantCheckoutId", required = true)
    protected String merchantCheckoutId;
    @XmlElement(name = "PrecheckoutTransactionId", required = true)
    protected String precheckoutTransactionId;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "OrderAmount")
    protected long orderAmount;
    @XmlElement(name = "CardId", required = true)
    protected String cardId;
    @XmlElement(name = "ShippingAddressId", required = true)
    protected String shippingAddressId;
    @XmlElement(name = "RewardProgramId")
    protected String rewardProgramId;
    @XmlElement(name = "AdvancedCheckoutOverride")
    protected boolean advancedCheckoutOverride;
    @XmlElement(name = "OriginUrl")
    protected String originUrl;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the merchantCheckoutId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantCheckoutId() {
        return merchantCheckoutId;
    }

    /**
     * Sets the value of the merchantCheckoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantCheckoutId(String value) {
        this.merchantCheckoutId = value;
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the orderAmount property.
     * 
     */
    public long getOrderAmount() {
        return orderAmount;
    }

    /**
     * Sets the value of the orderAmount property.
     * 
     */
    public void setOrderAmount(long value) {
        this.orderAmount = value;
    }

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the shippingAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddressId() {
        return shippingAddressId;
    }

    /**
     * Sets the value of the shippingAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddressId(String value) {
        this.shippingAddressId = value;
    }

    /**
     * Gets the value of the rewardProgramId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardProgramId() {
        return rewardProgramId;
    }

    /**
     * Sets the value of the rewardProgramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardProgramId(String value) {
        this.rewardProgramId = value;
    }

    /**
     * Gets the value of the advancedCheckoutOverride property.
     * 
     */
    public boolean isAdvancedCheckoutOverride() {
        return advancedCheckoutOverride;
    }

    /**
     * Sets the value of the advancedCheckoutOverride property.
     * 
     */
    public void setAdvancedCheckoutOverride(boolean value) {
        this.advancedCheckoutOverride = value;
    }

    /**
     * Gets the value of the originUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginUrl() {
        return originUrl;
    }

    /**
     * Sets the value of the originUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginUrl(String value) {
        this.originUrl = value;
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
