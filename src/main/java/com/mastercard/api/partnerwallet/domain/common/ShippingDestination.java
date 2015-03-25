
package com.mastercard.api.partnerwallet.domain.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Ref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PhoneNumber" type="{}MobilePhone" minOccurs="0"/>
 *         &lt;element name="Preferred" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Address" type="{}Address"/>
 *         &lt;element name="DirectProvisionedSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ShippingDestination", propOrder = {
    "id",
    "ref",
    "alias",
    "recipientName",
    "phoneNumber",
    "preferred",
    "address",
    "directProvisionedSwitch",
    "extensionPoint"
})
public class ShippingDestination {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "RecipientName", required = true)
    protected String recipientName;
    @XmlElement(name = "PhoneNumber")
    protected MobilePhone phoneNumber;
    @XmlElement(name = "Preferred")
    protected boolean preferred;
    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "DirectProvisionedSwitch")
    protected Boolean directProvisionedSwitch;
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
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
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
