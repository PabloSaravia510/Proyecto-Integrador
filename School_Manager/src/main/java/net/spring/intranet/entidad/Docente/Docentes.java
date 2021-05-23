
package net.spring.intranet.entidad.Docente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Docentes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Docentes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apePro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="celPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRolPro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoPro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="desRolPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direcPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edadPro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passPro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usernamePro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Docentes", propOrder = {
    "apePro",
    "celPro",
    "codRolPro",
    "codigoPro",
    "desRolPro",
    "direcPro",
    "edadPro",
    "estado",
    "nomPro",
    "passPro",
    "usernamePro"
})
public class Docentes {

    @XmlElementRef(name = "apePro", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apePro;
    @XmlElementRef(name = "celPro", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> celPro;
    protected Integer codRolPro;
    protected Integer codigoPro;
    @XmlElementRef(name = "desRolPro", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desRolPro;
    @XmlElementRef(name = "direcPro", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direcPro;
    protected Integer edadPro;
    @XmlElementRef(name = "estado", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "nomPro", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomPro;
    @XmlElementRef(name = "passPro", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passPro;
    @XmlElementRef(name = "usernamePro", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usernamePro;

    /**
     * Obtiene el valor de la propiedad apePro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApePro() {
        return apePro;
    }

    /**
     * Define el valor de la propiedad apePro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApePro(JAXBElement<String> value) {
        this.apePro = value;
    }

    /**
     * Obtiene el valor de la propiedad celPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelPro() {
        return celPro;
    }

    /**
     * Define el valor de la propiedad celPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelPro(JAXBElement<String> value) {
        this.celPro = value;
    }

    /**
     * Obtiene el valor de la propiedad codRolPro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodRolPro() {
        return codRolPro;
    }

    /**
     * Define el valor de la propiedad codRolPro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodRolPro(Integer value) {
        this.codRolPro = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoPro() {
        return codigoPro;
    }

    /**
     * Define el valor de la propiedad codigoPro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoPro(Integer value) {
        this.codigoPro = value;
    }

    /**
     * Obtiene el valor de la propiedad desRolPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesRolPro() {
        return desRolPro;
    }

    /**
     * Define el valor de la propiedad desRolPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesRolPro(JAXBElement<String> value) {
        this.desRolPro = value;
    }

    /**
     * Obtiene el valor de la propiedad direcPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirecPro() {
        return direcPro;
    }

    /**
     * Define el valor de la propiedad direcPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirecPro(JAXBElement<String> value) {
        this.direcPro = value;
    }

    /**
     * Obtiene el valor de la propiedad edadPro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdadPro() {
        return edadPro;
    }

    /**
     * Define el valor de la propiedad edadPro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdadPro(Integer value) {
        this.edadPro = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstado(JAXBElement<String> value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad nomPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomPro() {
        return nomPro;
    }

    /**
     * Define el valor de la propiedad nomPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomPro(JAXBElement<String> value) {
        this.nomPro = value;
    }

    /**
     * Obtiene el valor de la propiedad passPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassPro() {
        return passPro;
    }

    /**
     * Define el valor de la propiedad passPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassPro(JAXBElement<String> value) {
        this.passPro = value;
    }

    /**
     * Obtiene el valor de la propiedad usernamePro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsernamePro() {
        return usernamePro;
    }

    /**
     * Define el valor de la propiedad usernamePro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsernamePro(JAXBElement<String> value) {
        this.usernamePro = value;
    }

}
