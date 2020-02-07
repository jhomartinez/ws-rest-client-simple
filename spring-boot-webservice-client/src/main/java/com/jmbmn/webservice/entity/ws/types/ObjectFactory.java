
package com.jmbmn.webservice.entity.ws.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jmbmn.webservice.entity.ws.types package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jmbmn.webservice.entity.ws.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserCardsRequest }
     * 
     */
    public GetUserCardsRequest createGetUserCardsRequest() {
        return new GetUserCardsRequest();
    }

    /**
     * Create an instance of {@link GetUserCardsResponse }
     * 
     */
    public GetUserCardsResponse createGetUserCardsResponse() {
        return new GetUserCardsResponse();
    }

    /**
     * Create an instance of {@link ListCardType }
     * 
     */
    public ListCardType createListCardType() {
        return new ListCardType();
    }

    /**
     * Create an instance of {@link CardType }
     * 
     */
    public CardType createCardType() {
        return new CardType();
    }

}
