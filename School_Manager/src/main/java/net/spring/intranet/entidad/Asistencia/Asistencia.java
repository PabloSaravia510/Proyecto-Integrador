
package net.spring.intranet.entidad.Asistencia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Asistencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Asistencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_alu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cod_asi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cod_sec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="des_curs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="des_sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limite_faltas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nom_alu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Asistencia", propOrder = {
    "codAlu",
    "codAsi",
    "codSec",
    "desCurs",
    "desSec",
    "estado",
    "limiteFaltas",
    "nomAlu"
})
public class Asistencia {

    @XmlElement(name = "cod_alu")
    protected Integer codAlu;
    @XmlElement(name = "cod_asi")
    protected Integer codAsi;
    @XmlElement(name = "cod_sec")
    protected Integer codSec;
    @XmlElementRef(name = "des_curs", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desCurs;
    @XmlElementRef(name = "des_sec", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSec;
    @XmlElementRef(name = "estado", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElement(name = "limite_faltas")
    protected Integer limiteFaltas;
    @XmlElementRef(name = "nom_alu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomAlu;

    /**
     * Obtiene el valor de la propiedad codAlu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAlu() {
        return codAlu;
    }

    /**
     * Define el valor de la propiedad codAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAlu(Integer value) {
        this.codAlu = value;
    }

    /**
     * Obtiene el valor de la propiedad codAsi.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAsi() {
        return codAsi;
    }

    /**
     * Define el valor de la propiedad codAsi.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAsi(Integer value) {
        this.codAsi = value;
    }

    /**
     * Obtiene el valor de la propiedad codSec.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSec() {
        return codSec;
    }

    /**
     * Define el valor de la propiedad codSec.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSec(Integer value) {
        this.codSec = value;
    }

    /**
     * Obtiene el valor de la propiedad desCurs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesCurs() {
        return desCurs;
    }

    /**
     * Define el valor de la propiedad desCurs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesCurs(JAXBElement<String> value) {
        this.desCurs = value;
    }

    /**
     * Obtiene el valor de la propiedad desSec.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesSec() {
        return desSec;
    }

    /**
     * Define el valor de la propiedad desSec.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesSec(JAXBElement<String> value) {
        this.desSec = value;
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
     * Obtiene el valor de la propiedad limiteFaltas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimiteFaltas() {
        return limiteFaltas;
    }

    /**
     * Define el valor de la propiedad limiteFaltas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimiteFaltas(Integer value) {
        this.limiteFaltas = value;
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

}
