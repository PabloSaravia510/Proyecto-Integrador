
package net.spring.intranet.entidad.Seccion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.spring.intranet.entidad.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SeccionDesSec_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "des_sec");
    private final static QName _SeccionDesCurso_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "des_curso");
    private final static QName _SeccionDesPro_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "des_pro");
    private final static QName _SeccionHorario_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "horario");
    private final static QName _SeccionEstado_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "estado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.entidad.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Seccion }
     * 
     */
    public Seccion createSeccion() {
        return new Seccion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "des_sec", scope = Seccion.class)
    public JAXBElement<String> createSeccionDesSec(String value) {
        return new JAXBElement<String>(_SeccionDesSec_QNAME, String.class, Seccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "des_curso", scope = Seccion.class)
    public JAXBElement<String> createSeccionDesCurso(String value) {
        return new JAXBElement<String>(_SeccionDesCurso_QNAME, String.class, Seccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "des_pro", scope = Seccion.class)
    public JAXBElement<String> createSeccionDesPro(String value) {
        return new JAXBElement<String>(_SeccionDesPro_QNAME, String.class, Seccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "horario", scope = Seccion.class)
    public JAXBElement<String> createSeccionHorario(String value) {
        return new JAXBElement<String>(_SeccionHorario_QNAME, String.class, Seccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "estado", scope = Seccion.class)
    public JAXBElement<String> createSeccionEstado(String value) {
        return new JAXBElement<String>(_SeccionEstado_QNAME, String.class, Seccion.class, value);
    }

}
