//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.15 at 02:30:16 PM CDT 
//


package com.mastercard.api.moneysend.v2.mapping.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="OriginalRequestId" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *         &lt;element name="TransactionReference" type="{http://www.w3.org/2001/XMLSchema}Long"/>
 *         &lt;element name="TransactionHistory">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Transaction">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SystemTraceAuditNumber" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *                             &lt;element name="NetworkReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *                             &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *                             &lt;element name="Response">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
 *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SubmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "originalRequestId",
    "transactionReference",
    "transactionHistory"
})
@XmlRootElement(name = "TransferReversal")
public class TransferReversal {

    @XmlElement(name = "RequestId")
    protected Integer requestId;
    @XmlElement(name = "OriginalRequestId")
    protected Integer originalRequestId;
    @XmlElement(name = "TransactionReference")
    protected Long transactionReference;
    @XmlElement(name = "TransactionHistory", required = true)
    protected TransactionHistory transactionHistory;

    /**
     * Gets the value of the requestId property.
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     */
    public void setRequestId(Integer value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the originalRequestId property.
     * 
     */
    public Integer getOriginalRequestId() {
        return originalRequestId;
    }

    /**
     * Sets the value of the originalRequestId property.
     * 
     */
    public void setOriginalRequestId(Integer value) {
        this.originalRequestId = value;
    }

    /**
     * Gets the value of the transactionReference property.
     * 
     */
    public Long getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     * 
     */
    public void setTransactionReference(Long value) {
        this.transactionReference = value;
    }

    /**
     * Gets the value of the transactionHistory property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.TransferReversal.TransactionHistory }
     *     
     */
    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }

    /**
     * Sets the value of the transactionHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.moneysend.v2.mapping.domain.TransferReversal.TransactionHistory }
     *     
     */
    public void setTransactionHistory(TransactionHistory value) {
        this.transactionHistory = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Transaction">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SystemTraceAuditNumber" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
     *                   &lt;element name="NetworkReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
     *                   &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
     *                   &lt;element name="Response">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
     *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SubmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transaction"
    })
    public static class TransactionHistory {

        @XmlElement(name = "Transaction", required = true)
        protected Transaction transaction;

        /**
         * Gets the value of the transaction property.
         * 
         * @return
         *     possible object is
         *     {@link com.mastercard.api.moneysend.v2.mapping.domain.TransferReversal.TransactionHistory.Transaction }
         *     
         */
        public Transaction getTransaction() {
            return transaction;
        }

        /**
         * Sets the value of the transaction property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.mastercard.api.moneysend.v2.mapping.domain.TransferReversal.TransactionHistory.Transaction }
         *     
         */
        public void setTransaction(Transaction value) {
            this.transaction = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SystemTraceAuditNumber" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
         *         &lt;element name="NetworkReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
         *         &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
         *         &lt;element name="Response">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
         *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SubmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type",
            "systemTraceAuditNumber",
            "networkReferenceNumber",
            "settlementDate",
            "response",
            "submitTime"
        })
        public static class Transaction {

            @XmlElement(name = "Type", required = true)
            protected String type;
            @XmlElement(name = "SystemTraceAuditNumber")
            protected Integer systemTraceAuditNumber;
            @XmlElement(name = "NetworkReferenceNumber")
            protected Integer networkReferenceNumber;
            @XmlElement(name = "SettlementDate")
            protected Integer settlementDate;
            @XmlElement(name = "Response", required = true)
            protected Response response;
            @XmlElement(name = "SubmitTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar submitTime;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the systemTraceAuditNumber property.
             * 
             */
            public Integer getSystemTraceAuditNumber() {
                return systemTraceAuditNumber;
            }

            /**
             * Sets the value of the systemTraceAuditNumber property.
             * 
             */
            public void setSystemTraceAuditNumber(Integer value) {
                this.systemTraceAuditNumber = value;
            }

            /**
             * Gets the value of the networkReferenceNumber property.
             * 
             */
            public Integer getNetworkReferenceNumber() {
                return networkReferenceNumber;
            }

            /**
             * Sets the value of the networkReferenceNumber property.
             * 
             */
            public void setNetworkReferenceNumber(Integer value) {
                this.networkReferenceNumber = value;
            }

            /**
             * Gets the value of the settlementDate property.
             * 
             */
            public Integer getSettlementDate() {
                return settlementDate;
            }

            /**
             * Sets the value of the settlementDate property.
             * 
             */
            public void setSettlementDate(Integer value) {
                this.settlementDate = value;
            }

            /**
             * Gets the value of the response property.
             * 
             * @return
             *     possible object is
             *     {@link com.mastercard.api.moneysend.v2.mapping.domain.TransferReversal.TransactionHistory.Transaction.Response }
             *     
             */
            public Response getResponse() {
                return response;
            }

            /**
             * Sets the value of the response property.
             * 
             * @param value
             *     allowed object is
             *     {@link com.mastercard.api.moneysend.v2.mapping.domain.TransferReversal.TransactionHistory.Transaction.Response }
             *     
             */
            public void setResponse(Response value) {
                this.response = value;
            }

            /**
             * Gets the value of the submitTime property.
             * 
             * @return
             *     possible object is
             *     {@link javax.xml.datatype.XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getSubmitTime() {
                return submitTime;
            }

            /**
             * Sets the value of the submitTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link javax.xml.datatype.XMLGregorianCalendar }
             *     
             */
            public void setSubmitTime(XMLGregorianCalendar value) {
                this.submitTime = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}Integer"/>
             *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "description"
            })
            public static class Response {

                @XmlElement(name = "Code")
                protected Integer code;
                @XmlElement(name = "Description", required = true)
                protected String description;

                /**
                 * Gets the value of the code property.
                 * 
                 */
                public Integer getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 */
                public void setCode(Integer value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
                }

            }

        }

    }

}
