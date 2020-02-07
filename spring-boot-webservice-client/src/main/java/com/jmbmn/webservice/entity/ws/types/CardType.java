
package com.jmbmn.webservice.entity.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="franchise" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="favorite" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="internationalCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardType", propOrder = {
    "id",
    "alias",
    "franchise",
    "favorite",
    "internationalCard",
    "state"
})
public class CardType {

    protected int id;
    @XmlElement(required = true)
    protected String alias;
    @XmlElement(required = true)
    protected String franchise;
    protected boolean favorite;
    protected boolean internationalCard;
    @XmlElement(required = true)
    protected String state;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad alias.
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
     * Define el valor de la propiedad alias.
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
     * Obtiene el valor de la propiedad franchise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFranchise() {
        return franchise;
    }

    /**
     * Define el valor de la propiedad franchise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFranchise(String value) {
        this.franchise = value;
    }

    /**
     * Obtiene el valor de la propiedad favorite.
     * 
     */
    public boolean isFavorite() {
        return favorite;
    }

    /**
     * Define el valor de la propiedad favorite.
     * 
     */
    public void setFavorite(boolean value) {
        this.favorite = value;
    }

    /**
     * Obtiene el valor de la propiedad internationalCard.
     * 
     */
    public boolean isInternationalCard() {
        return internationalCard;
    }

    /**
     * Define el valor de la propiedad internationalCard.
     * 
     */
    public void setInternationalCard(boolean value) {
        this.internationalCard = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

}
