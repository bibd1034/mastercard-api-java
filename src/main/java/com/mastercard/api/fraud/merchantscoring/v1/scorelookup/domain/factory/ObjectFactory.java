//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 09:38:09 AM CST 
//


package com.mastercard.api.fraud.merchantscoring.v1.scorelookup.domain.factory;

import com.mastercard.api.fraud.merchantscoring.v1.scorelookup.domain.ScoreLookupRequest;
import com.mastercard.api.fraud.merchantscoring.v1.scorelookup.domain.ScoreLookup;

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
     * Create an instance of {@link ScoreLookupRequest.TransactionDetail }
     * 
     */
    public ScoreLookupRequest.TransactionDetail createScoreLookupRequestTransactionDetail() {
        return new ScoreLookupRequest.TransactionDetail();
    }

    /**
     * Create an instance of {@link ScoreLookupRequest }
     * 
     */
    public ScoreLookupRequest createScoreLookupRequest() {
        ScoreLookupRequest request = new ScoreLookupRequest();
        request.setTransactionDetail(createScoreLookupRequestTransactionDetail());
        return request;
    }

    /**
     * Create an instance of {@link ScoreLookup.ScoreResponse }
     *
     */
    public ScoreLookup.ScoreResponse createScoreLookupScoreResponse() {
        return new ScoreLookup.ScoreResponse();
    }

    /**
     * Create an instance of {@link ScoreLookup }
     *
     */
    public ScoreLookup createScoreLookup() {
        ScoreLookup scoreLookup = new ScoreLookup();
        scoreLookup.setTransactionDetail(createScoreLookupTransactionDetail());
        scoreLookup.setScoreResponse(createScoreLookupScoreResponse());
        return scoreLookup;
    }

    /**
     * Create an instance of {@link ScoreLookup.TransactionDetail }
     *
     */
    public ScoreLookup.TransactionDetail createScoreLookupTransactionDetail() {
        return new ScoreLookup.TransactionDetail();
    }

}
