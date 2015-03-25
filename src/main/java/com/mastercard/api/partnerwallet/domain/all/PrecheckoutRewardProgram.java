
package com.mastercard.api.partnerwallet.domain.all;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecheckoutRewardProgram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecheckoutRewardProgram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RewardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpiryMonth" type="{}Month" minOccurs="0"/>
 *         &lt;element name="ExpiryYear" type="{}Year" minOccurs="0"/>
 *         &lt;element name="RewardProgramId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RewardLogoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "PrecheckoutRewardProgram", propOrder = {
    "rewardNumber",
    "rewardId",
    "rewardName",
    "expiryMonth",
    "expiryYear",
    "rewardProgramId",
    "rewardLogoUrl",
    "extensionPoint"
})
public class PrecheckoutRewardProgram {

    @XmlElement(name = "RewardNumber", required = true)
    protected String rewardNumber;
    @XmlElement(name = "RewardId", required = true)
    protected String rewardId;
    @XmlElement(name = "RewardName")
    protected String rewardName;
    @XmlElement(name = "ExpiryMonth")
    protected Integer expiryMonth;
    @XmlElement(name = "ExpiryYear")
    protected Integer expiryYear;
    @XmlElement(name = "RewardProgramId", required = true)
    protected String rewardProgramId;
    @XmlElement(name = "RewardLogoUrl", required = true)
    protected String rewardLogoUrl;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;

    /**
     * Gets the value of the rewardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardNumber() {
        return rewardNumber;
    }

    /**
     * Sets the value of the rewardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardNumber(String value) {
        this.rewardNumber = value;
    }

    /**
     * Gets the value of the rewardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardId() {
        return rewardId;
    }

    /**
     * Sets the value of the rewardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardId(String value) {
        this.rewardId = value;
    }

    /**
     * Gets the value of the rewardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardName() {
        return rewardName;
    }

    /**
     * Sets the value of the rewardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardName(String value) {
        this.rewardName = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryMonth(Integer value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryYear(Integer value) {
        this.expiryYear = value;
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
     * Gets the value of the rewardLogoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRewardLogoUrl() {
        return rewardLogoUrl;
    }

    /**
     * Sets the value of the rewardLogoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRewardLogoUrl(String value) {
        this.rewardLogoUrl = value;
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
