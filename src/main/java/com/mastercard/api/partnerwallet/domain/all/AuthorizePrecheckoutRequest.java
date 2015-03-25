
package com.mastercard.api.partnerwallet.domain.all;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorizePrecheckoutRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizePrecheckoutRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrecheckoutData" type="{}PrecheckoutData"/>
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
@XmlType(name = "AuthorizePrecheckoutRequest", propOrder = {
    "precheckoutData",
    "extensionPoint"
})
public class AuthorizePrecheckoutRequest {

    @XmlElement(name = "PrecheckoutData", required = true)
    protected PrecheckoutData precheckoutData;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the precheckoutData property.
     * 
     * @return
     *     possible object is
     *     {@link PrecheckoutData }
     *     
     */
    public PrecheckoutData getPrecheckoutData() {
        return precheckoutData;
    }

    /**
     * Sets the value of the precheckoutData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecheckoutData }
     *     
     */
    public void setPrecheckoutData(PrecheckoutData value) {
        this.precheckoutData = value;
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