
package net.spring.intranet.entidad.Seccion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Seccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Seccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_pro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cod_sec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigo_horario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="des_curso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="des_pro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="des_sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lcla_sec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="lfal_sec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nota1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nota2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Seccion", propOrder = {
    "codPro",
    "codSec",
    "codigoHorario",
    "desCurso",
    "desPro",
    "desSec",
    "estado",
    "horario",
    "lclaSec",
    "lfalSec",
    "nota1",
    "nota2"
})
public class Seccion {

    @XmlElement(name = "cod_pro")
    protected Integer codPro;
    @XmlElement(name = "cod_sec")
    protected Integer codSec;
    @XmlElement(name = "codigo_horario")
    protected Integer codigoHorario;
    @XmlElementRef(name = "des_curso", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desCurso;
    @XmlElementRef(name = "des_pro", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desPro;
    @XmlElementRef(name = "des_sec", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSec;
    @XmlElementRef(name = "estado", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "horario", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horario;
    @XmlElement(name = "lcla_sec")
    protected Integer lclaSec;
    @XmlElement(name = "lfal_sec")
    protected Integer lfalSec;
    protected Integer nota1;
    protected Integer nota2;

    /**
     * Obtiene el valor de la propiedad codPro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodPro() {
        return codPro;
    }

    /**
     * Define el valor de la propiedad codPro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodPro(Integer value) {
        this.codPro = value;
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
     * Obtiene el valor de la propiedad codigoHorario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoHorario() {
        return codigoHorario;
    }

    /**
     * Define el valor de la propiedad codigoHorario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoHorario(Integer value) {
        this.codigoHorario = value;
    }

    /**
     * Obtiene el valor de la propiedad desCurso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesCurso() {
        return desCurso;
    }

    /**
     * Define el valor de la propiedad desCurso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesCurso(JAXBElement<String> value) {
        this.desCurso = value;
    }

    /**
     * Obtiene el valor de la propiedad desPro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesPro() {
        return desPro;
    }

    /**
     * Define el valor de la propiedad desPro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesPro(JAXBElement<String> value) {
        this.desPro = value;
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
     * Obtiene el valor de la propiedad horario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHorario() {
        return horario;
    }

    /**
     * Define el valor de la propiedad horario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHorario(JAXBElement<String> value) {
        this.horario = value;
    }

    /**
     * Obtiene el valor de la propiedad lclaSec.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLclaSec() {
        return lclaSec;
    }

    /**
     * Define el valor de la propiedad lclaSec.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLclaSec(Integer value) {
        this.lclaSec = value;
    }

    /**
     * Obtiene el valor de la propiedad lfalSec.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLfalSec() {
        return lfalSec;
    }

    /**
     * Define el valor de la propiedad lfalSec.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLfalSec(Integer value) {
        this.lfalSec = value;
    }

    /**
     * Obtiene el valor de la propiedad nota1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNota1() {
        return nota1;
    }

    /**
     * Define el valor de la propiedad nota1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNota1(Integer value) {
        this.nota1 = value;
    }

    /**
     * Obtiene el valor de la propiedad nota2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNota2() {
        return nota2;
    }

    /**
     * Define el valor de la propiedad nota2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNota2(Integer value) {
        this.nota2 = value;
    }

}
