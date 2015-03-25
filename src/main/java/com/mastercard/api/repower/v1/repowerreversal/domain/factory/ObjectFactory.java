//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 12:07:46 PM CST 
//


package com.mastercard.api.repower.v1.repowerreversal.domain.factory;

import com.mastercard.api.repower.v1.repowerreversal.domain.RepowerReversal;
import com.mastercard.api.repower.v1.repowerreversal.domain.RepowerReversalRequest;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RepowerReversalRequest }
     * 
     */
    public RepowerReversalRequest createRepowerReversalRequest() {
        return new RepowerReversalRequest();
    }

    /**
     * Create an instance of {@link RepowerReversal.TransactionHistory.Transaction.Response }
     *
     */
    public RepowerReversal.TransactionHistory.Transaction.Response createRepowerReversalTransactionHistoryTransactionResponse() {
        return new RepowerReversal.TransactionHistory.Transaction.Response();
    }

    /**
     * Create an instance of {@link RepowerReversal }
     *
     */
    public RepowerReversal createRepowerReversal() {
        RepowerReversal repowerReversal = new RepowerReversal();
        repowerReversal.setTransactionHistory(createRepowerReversalTransactionHistory());
        return repowerReversal;
    }

    /**
     * Create an instance of {@link RepowerReversal.TransactionHistory.Transaction }
     *
     */
    public RepowerReversal.TransactionHistory.Transaction createRepowerReversalTransactionHistoryTransaction() {
        RepowerReversal.TransactionHistory.Transaction transaction = new RepowerReversal.TransactionHistory.Transaction();
        transaction.setResponse(createRepowerReversalTransactionHistoryTransactionResponse());
        return transaction;
    }

    /**
     * Create an instance of {@link RepowerReversal.TransactionHistory }
     *
     */
    public RepowerReversal.TransactionHistory createRepowerReversalTransactionHistory() {
        RepowerReversal.TransactionHistory transactionHistory = new RepowerReversal.TransactionHistory();
        transactionHistory.setTransaction(createRepowerReversalTransactionHistoryTransaction());
        return transactionHistory;
    }

}
