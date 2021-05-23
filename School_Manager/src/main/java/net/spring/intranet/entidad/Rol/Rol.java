
package net.spring.intranet.entidad.Rol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Rol complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Rol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRol" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="desRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rol", propOrder = {
    "codigoRol",
    "desRol"
})
public class Rol {

    protected Integer codigoRol;
    @XmlElementRef(name = "desRol", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desRol;

    /**
     * Obtiene el valor de la propiedad codigoRol.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoRol() {
        return codigoRol;
    }

    /**
     * Define el valor de la propiedad codigoRol.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoRol(Integer value) {
        this.codigoRol = value;
    }

    /**
     * Obtiene el valor de la propiedad desRol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesRol() {
        return desRol;
    }

    /**
     * Define el valor de la propiedad desRol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesRol(JAXBElement<String> value) {
        this.desRol = value;
    }

}
