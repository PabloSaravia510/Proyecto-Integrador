
package net.spring.intranet.entidad.Det_Sec_Alu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Det_sec_alu complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Det_sec_alu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_alu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cod_sec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cod_sec_alu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="des_curs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="des_sec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom_alu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Det_sec_alu", propOrder = {
    "codAlu",
    "codSec",
    "codSecAlu",
    "desCurs",
    "desSec",
    "nomAlu",
    "nota1",
    "nota2"
})
public class DetSecAlu {

    @XmlElement(name = "cod_alu")
    protected Integer codAlu;
    @XmlElement(name = "cod_sec")
    protected Integer codSec;
    @XmlElement(name = "cod_sec_alu")
    protected Integer codSecAlu;
    @XmlElementRef(name = "des_curs", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desCurs;
    @XmlElementRef(name = "des_sec", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSec;
    @XmlElementRef(name = "nom_alu", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomAlu;
    protected Integer nota1;
    protected Integer nota2;

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
     * Obtiene el valor de la propiedad codSecAlu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSecAlu() {
        return codSecAlu;
    }

    /**
     * Define el valor de la propiedad codSecAlu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSecAlu(Integer value) {
        this.codSecAlu = value;
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
