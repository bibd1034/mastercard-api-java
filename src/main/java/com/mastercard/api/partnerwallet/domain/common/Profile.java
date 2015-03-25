
package com.mastercard.api.partnerwallet.domain.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EmailAddress" type="{}EmailAddress"/>
 *         &lt;element name="MobilePhone" type="{}MobilePhone"/>
 *         &lt;element name="Name" type="{}ProfileName"/>
 *         &lt;element name="Preferences" type="{}Preferences"/>
 *         &lt;element name="SecurityChallenge" type="{}SecurityChallenge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TermsOfUseAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PrivacyPolicyAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CookiePolicyAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PersonalGreeting" type="{}PersonalGreeting" minOccurs="0"/>
 *         &lt;element name="CSRFToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtensionPoint" type="{}ExtensionPoint" minOccurs="0"/>
 *         &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Locale" type="{}Locale"/>
 *         &lt;element name="DateOfBirth" type="{}DateOfBirth" minOccurs="0"/>
 *         &lt;element name="Gender" type="{}Gender" minOccurs="0"/>
 *         &lt;element name="NationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DirectProvisionedSwitch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "id",
    "ref",
    "emailAddress",
    "mobilePhone",
    "name",
    "preferences",
    "securityChallenge",
    "termsOfUseAccepted",
    "privacyPolicyAccepted",
    "cookiePolicyAccepted",
    "personalGreeting",
    "csrfToken",
    "extensionPoint",
    "countryOfResidence",
    "locale",
    "dateOfBirth",
    "gender",
    "nationalId",
    "directProvisionedSwitch"
})
public class Profile {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "EmailAddress", required = true)
    protected String emailAddress;
    @XmlElement(name = "MobilePhone", required = true)
    protected MobilePhone mobilePhone;
    @XmlElement(name = "Name", required = true)
    protected ProfileName name;
    @XmlElement(name = "Preferences", required = true)
    protected Preferences preferences;
    @XmlElement(name = "SecurityChallenge")
    protected List<SecurityChallenge> securityChallenge;
    @XmlElement(name = "TermsOfUseAccepted")
    protected boolean termsOfUseAccepted;
    @XmlElement(name = "PrivacyPolicyAccepted")
    protected boolean privacyPolicyAccepted;
    @XmlElement(name = "CookiePolicyAccepted")
    protected boolean cookiePolicyAccepted;
    @XmlElement(name = "PersonalGreeting")
    protected PersonalGreeting personalGreeting;
    @XmlElement(name = "CSRFToken")
    protected String csrfToken;
    @XmlElement(name = "ExtensionPoint")
    protected ExtensionPoint extensionPoint;
    @XmlElement(name = "CountryOfResidence", required = true)
    protected String countryOfResidence;
    @XmlElement(name = "Locale", required = true)
    protected Locale locale;
    @XmlElement(name = "DateOfBirth")
    protected DateOfBirth dateOfBirth;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "token")
    protected Gender gender;
    @XmlElement(name = "NationalId")
    protected String nationalId;
    @XmlElement(name = "DirectProvisionedSwitch")
    protected Boolean directProvisionedSwitch;

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
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link MobilePhone }
     *     
     */
    public MobilePhone getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilePhone }
     *     
     */
    public void setMobilePhone(MobilePhone value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileName }
     *     
     */
    public ProfileName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileName }
     *     
     */
    public void setName(ProfileName value) {
        this.name = value;
    }

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link Preferences }
     *     
     */
    public Preferences getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preferences }
     *     
     */
    public void setPreferences(Preferences value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the securityChallenge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityChallenge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityChallenge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityChallenge }
     * 
     * 
     */
    public List<SecurityChallenge> getSecurityChallenge() {
        if (securityChallenge == null) {
            securityChallenge = new ArrayList<SecurityChallenge>();
        }
        return this.securityChallenge;
    }

    /**
     * Gets the value of the termsOfUseAccepted property.
     * 
     */
    public boolean isTermsOfUseAccepted() {
        return termsOfUseAccepted;
    }

    /**
     * Sets the value of the termsOfUseAccepted property.
     * 
     */
    public void setTermsOfUseAccepted(boolean value) {
        this.termsOfUseAccepted = value;
    }

    /**
     * Gets the value of the privacyPolicyAccepted property.
     * 
     */
    public boolean isPrivacyPolicyAccepted() {
        return privacyPolicyAccepted;
    }

    /**
     * Sets the value of the privacyPolicyAccepted property.
     * 
     */
    public void setPrivacyPolicyAccepted(boolean value) {
        this.privacyPolicyAccepted = value;
    }

    /**
     * Gets the value of the cookiePolicyAccepted property.
     * 
     */
    public boolean isCookiePolicyAccepted() {
        return cookiePolicyAccepted;
    }

    /**
     * Sets the value of the cookiePolicyAccepted property.
     * 
     */
    public void setCookiePolicyAccepted(boolean value) {
        this.cookiePolicyAccepted = value;
    }

    /**
     * Gets the value of the personalGreeting property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalGreeting }
     *     
     */
    public PersonalGreeting getPersonalGreeting() {
        return personalGreeting;
    }

    /**
     * Sets the value of the personalGreeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalGreeting }
     *     
     */
    public void setPersonalGreeting(PersonalGreeting value) {
        this.personalGreeting = value;
    }

    /**
     * Gets the value of the csrfToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSRFToken() {
        return csrfToken;
    }

    /**
     * Sets the value of the csrfToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSRFToken(String value) {
        this.csrfToken = value;
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
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLocale(Locale value) {
        this.locale = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link DateOfBirth }
     *     
     */
    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOfBirth }
     *     
     */
    public void setDateOfBirth(DateOfBirth value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalId(String value) {
        this.nationalId = value;
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

}
