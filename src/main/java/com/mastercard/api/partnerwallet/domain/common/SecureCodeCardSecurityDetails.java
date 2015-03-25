
package com.mastercard.api.partnerwallet.domain.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecureCodeCardSecurityDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecureCodeCardSecurityDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LookupData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AuthorizationUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MerchantData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "SecureCodeCardSecurityDetails", propOrder = {
    "lookupData",
    "authorizationUrl",
    "merchantData",
    "extensionPoint"
})
public class SecureCodeCardSecurityDetails {

    @XmlElement(name = "LookupData", required = true)
    protected String lookupData;
    @XmlElement(name = "AuthorizationUrl", required = true)
    protected String authorizationUrl;
    @XmlElement(name = "MerchantData")
    protected String merchantData;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the lookupData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupData() {
        return lookupData;
    }

    /**
     * Sets the value of the lookupData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupData(String value) {
        this.lookupData = value;
    }

    /**
     * Gets the value of the authorizationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    /**
     * Sets the value of the authorizationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationUrl(String value) {
        this.authorizationUrl = value;
    }

    /**
     * Gets the value of the merchantData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantData() {
        return merchantData;
    }

    /**
     * Sets the value of the merchantData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantData(String value) {
        this.merchantData = value;
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
