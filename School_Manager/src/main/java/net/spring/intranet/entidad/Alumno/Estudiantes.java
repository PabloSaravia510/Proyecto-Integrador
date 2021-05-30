
package net.spring.intranet.entidad.Alumno;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Estudiantes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Estudiantes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apeAlu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="celAlu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCarreraAlu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRolAlu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoAlu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="desCarreraAlu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desRolAlu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direcAlu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edadAlu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomAlu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passAlu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usernameAlu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estudiantes", propOrder = {
    "apeAlu",
    "celAlu",
    "codCarreraAlu",
    "codRolAlu",
    "codigoAlu",
    "desCarreraAlu",
    "desRolAlu",
    "direcAlu",
    "edadAlu",
    "estado",
    "nomAlu",
    "passAlu",
    "usernameAlu"
})
public class Estudiantes {

    @XmlElementRef(name = "apeAlu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apeAlu;
    @XmlElementRef(name = "celAlu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> celAlu;
    protected Integer codCarreraAlu;
    protected Integer codRolAlu;
    protected Integer codigoAlu;
    @XmlElementRef(name = "desCarreraAlu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desCarreraAlu;
    @XmlElementRef(name = "desRolAlu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desRolAlu;
    @XmlElementRef(name = "direcAlu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direcAlu;
    protected Integer edadAlu;
    @XmlElementRef(name = "estado", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "nomAlu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomAlu;
    @XmlElementRef(name = "passAlu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passAlu;
    @XmlElementRef(name = "usernameAlu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usernameAlu;

    /**
     * Obtiene el valor de la propiedad apeAlu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApeAlu() {
        return apeAlu;
    }

    /**
     * Define el valor de la propiedad apeAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApeAlu(JAXBElement<String> value) {
        this.apeAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad celAlu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCelAlu() {
        return celAlu;
    }

    /**
     * Define el valor de la propiedad celAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCelAlu(JAXBElement<String> value) {
        this.celAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad codCarreraAlu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodCarreraAlu() {
        return codCarreraAlu;
    }

    /**
     * Define el valor de la propiedad codCarreraAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodCarreraAlu(Integer value) {
        this.codCarreraAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad codRolAlu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodRolAlu() {
        return codRolAlu;
    }

    /**
     * Define el valor de la propiedad codRolAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodRolAlu(Integer value) {
        this.codRolAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAlu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoAlu() {
        return codigoAlu;
    }

    /**
     * Define el valor de la propiedad codigoAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoAlu(Integer value) {
        this.codigoAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad desCarreraAlu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesCarreraAlu() {
        return desCarreraAlu;
    }

    /**
     * Define el valor de la propiedad desCarreraAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesCarreraAlu(JAXBElement<String> value) {
        this.desCarreraAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad desRolAlu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesRolAlu() {
        return desRolAlu;
    }

    /**
     * Define el valor de la propiedad desRolAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesRolAlu(JAXBElement<String> value) {
        this.desRolAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad direcAlu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDirecAlu() {
        return direcAlu;
    }

    /**
     * Define el valor de la propiedad direcAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDirecAlu(JAXBElement<String> value) {
        this.direcAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad edadAlu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEdadAlu() {
        return edadAlu;
    }

    /**
     * Define el valor de la propiedad edadAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEdadAlu(Integer value) {
        this.edadAlu = value;
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
     * Obtiene el valor de la propiedad nomAlu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomAlu() {
        return nomAlu;
    }

    /**
     * Define el valor de la propiedad nomAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomAlu(JAXBElement<String> value) {
        this.nomAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad passAlu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassAlu() {
        return passAlu;
    }

    /**
     * Define el valor de la propiedad passAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassAlu(JAXBElement<String> value) {
        this.passAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad usernameAlu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsernameAlu() {
        return usernameAlu;
    }

    /**
     * Define el valor de la propiedad usernameAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsernameAlu(JAXBElement<String> value) {
        this.usernameAlu = value;
    }

}
