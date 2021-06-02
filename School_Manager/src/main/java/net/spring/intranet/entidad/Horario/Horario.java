
package net.spring.intranet.entidad.Horario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Horario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Horario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cod_horario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="des_horario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Horario", propOrder = {
    "codHorario",
    "desHorario"
})
public class Horario {

    @XmlElement(name = "cod_horario")
    protected Integer codHorario;
    @XmlElementRef(name = "des_horario", namespace = "http://entidad.intranet.spring.net/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desHorario;

    /**
     * Obtiene el valor de la propiedad codHorario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodHorario() {
        return codHorario;
    }

    /**
     * Define el valor de la propiedad codHorario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodHorario(Integer value) {
        this.codHorario = value;
    }

    /**
     * Obtiene el valor de la propiedad desHorario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesHorario() {
        return desHorario;
    }

    /**
     * Define el valor de la propiedad desHorario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesHorario(JAXBElement<String> value) {
        this.desHorario = value;
    }

}
