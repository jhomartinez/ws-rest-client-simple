
package com.jmbmn.webservice.entity.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listCard" type="{http://webservice.jmbmn.com/entity/ws/types}ListCardType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listCard"
})
@XmlRootElement(name = "GetUserCardsResponse")
public class GetUserCardsResponse {

    protected ListCardType listCard;

    /**
     * Obtiene el valor de la propiedad listCard.
     * 
     * @return
     *     possible object is
     *     {@link ListCardType }
     *     
     */
    public ListCardType getListCard() {
        return listCard;
    }

    /**
     * Define el valor de la propiedad listCard.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCardType }
     *     
     */
    public void setListCard(ListCardType value) {
        this.listCard = value;
    }

}
