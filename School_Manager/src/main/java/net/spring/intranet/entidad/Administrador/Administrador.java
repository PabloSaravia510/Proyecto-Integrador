
package net.spring.intranet.entidad.Administrador;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Administrador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Administrador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidoAdministrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRolAdministrador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoAdministrador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="desRolAdministrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAdministrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passAdministrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuAdministrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Administrador", propOrder = {
    "apellidoAdministrador",
    "codRolAdministrador",
    "codigoAdministrador",
    "desRolAdministrador",
    "estadoRegistro",
    "nombreAdministrador",
    "passAdministrador",
    "usuAdministrador"
})
public class Administrador {

    @XmlElementRef(name = "apellidoAdministrador", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellidoAdministrador;
    protected Integer codRolAdministrador;
    protected Integer codigoAdministrador;
    @XmlElementRef(name = "desRolAdministrador", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desRolAdministrador;
    @XmlElementRef(name = "estadoRegistro", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoRegistro;
    @XmlElementRef(name = "nombreAdministrador", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreAdministrador;
    @XmlElementRef(name = "passAdministrador", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passAdministrador;
    @XmlElementRef(name = "usuAdministrador", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuAdministrador;

    /**
     * Obtiene el valor de la propiedad apellidoAdministrador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellidoAdministrador() {
        return apellidoAdministrador;
    }

    /**
     * Define el valor de la propiedad apellidoAdministrador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellidoAdministrador(JAXBElement<String> value) {
        this.apellidoAdministrador = value;
    }

    /**
     * Obtiene el valor de la propiedad codRolAdministrador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodRolAdministrador() {
        return codRolAdministrador;
    }

    /**
     * Define el valor de la propiedad codRolAdministrador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodRolAdministrador(Integer value) {
        this.codRolAdministrador = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAdministrador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoAdministrador() {
        return codigoAdministrador;
    }

    /**
     * Define el valor de la propiedad codigoAdministrador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoAdministrador(Integer value) {
        this.codigoAdministrador = value;
    }

    /**
     * Obtiene el valor de la propiedad desRolAdministrador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesRolAdministrador() {
        return desRolAdministrador;
    }

    /**
     * Define el valor de la propiedad desRolAdministrador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesRolAdministrador(JAXBElement<String> value) {
        this.desRolAdministrador = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoRegistro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoRegistro() {
        return estadoRegistro;
    }

    /**
     * Define el valor de la propiedad estadoRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoRegistro(JAXBElement<String> value) {
        this.estadoRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAdministrador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreAdministrador() {
        return nombreAdministrador;
    }

    /**
     * Define el valor de la propiedad nombreAdministrador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreAdministrador(JAXBElement<String> value) {
        this.nombreAdministrador = value;
    }

    /**
     * Obtiene el valor de la propiedad passAdministrador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassAdministrador() {
        return passAdministrador;
    }

    /**
     * Define el valor de la propiedad passAdministrador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassAdministrador(JAXBElement<String> value) {
        this.passAdministrador = value;
    }

    /**
     * Obtiene el valor de la propiedad usuAdministrador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuAdministrador() {
        return usuAdministrador;
    }

    /**
     * Define el valor de la propiedad usuAdministrador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuAdministrador(JAXBElement<String> value) {
        this.usuAdministrador = value;
    }

}
