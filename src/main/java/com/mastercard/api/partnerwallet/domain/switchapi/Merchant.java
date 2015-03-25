
package com.mastercard.api.partnerwallet.domain.switchapi;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Merchant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Merchant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductionUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CardinalMerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AuthOptions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SandboxUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MerchantCheckoutId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Logo" type="{}Logo" minOccurs="0"/>
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
@XmlType(name = "Merchant", propOrder = {
    "name",
    "displayName",
    "merchantType",
    "productionUrl",
    "cardinalMerchantId",
    "authOptions",
    "sandboxUrl",
    "merchantCheckoutId",
    "logo",
    "extensionPoint"
})
@XmlRootElement(name = "Merchant")
public class Merchant {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "MerchantType")
    protected String merchantType;
    @XmlElement(name = "ProductionUrl", required = true)
    protected String productionUrl;
    @XmlElement(name = "CardinalMerchantId", required = true)
    protected String cardinalMerchantId;
    @XmlElement(name = "AuthOptions", required = true)
    protected String authOptions;
    @XmlElement(name = "SandboxUrl", required = true)
    protected String sandboxUrl;
    @XmlElement(name = "MerchantCheckoutId", required = true)
    protected String merchantCheckoutId;
    @XmlElement(name = "Logo")
    protected Logo logo;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

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
     * Gets the value of the merchantType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantType() {
        return merchantType;
    }

    /**
     * Sets the value of the merchantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantType(String value) {
        this.merchantType = value;
    }

    /**
     * Gets the value of the productionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionUrl() {
        return productionUrl;
    }

    /**
     * Sets the value of the productionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionUrl(String value) {
        this.productionUrl = value;
    }

    /**
     * Gets the value of the cardinalMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinalMerchantId() {
        return cardinalMerchantId;
    }

    /**
     * Sets the value of the cardinalMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinalMerchantId(String value) {
        this.cardinalMerchantId = value;
    }

    /**
     * Gets the value of the authOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthOptions() {
        return authOptions;
    }

    /**
     * Sets the value of the authOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthOptions(String value) {
        this.authOptions = value;
    }

    /**
     * Gets the value of the sandboxUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSandboxUrl() {
        return sandboxUrl;
    }

    /**
     * Sets the value of the sandboxUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSandboxUrl(String value) {
        this.sandboxUrl = value;
    }

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
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link Logo }
     *     
     */
    public Logo getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Logo }
     *     
     */
    public void setLogo(Logo value) {
        this.logo = value;
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
