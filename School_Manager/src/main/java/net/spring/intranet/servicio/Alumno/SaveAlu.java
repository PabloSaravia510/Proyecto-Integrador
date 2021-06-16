
package net.spring.intranet.servicio.Alumno;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.spring.intranet.entidad.Alumno.*;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bean" type="{http://entidad.intranet.spring.net/xsd}Estudiantes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bean"
})
@XmlRootElement(name = "saveAlu")
public class SaveAlu {

    @XmlElementRef(name = "bean", namespace = "http://service.intranet.spring.net", type = JAXBElement.class, required = false)
    protected JAXBElement<Estudiantes> bean;

    /**
     * Obtiene el valor de la propiedad bean.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Estudiantes }{@code >}
     *     
     */
    public JAXBElement<Estudiantes> getBean() {
        return bean;
    }

    /**
     * Define el valor de la propiedad bean.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Estudiantes }{@code >}
     *     
     */
    public void setBean(JAXBElement<Estudiantes> value) {
        this.bean = value;
    }

}
