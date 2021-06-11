
package net.spring.intranet.entidad.Carrera;

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

    private final static QName _CarreraDesCarrera_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "desCarrera");
    private final static QName _CarreraEstado_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "estado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.entidad.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Carrera }
     * 
     */
    public Carrera createCarrera() {
        return new Carrera();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "desCarrera", scope = Carrera.class)
    public JAXBElement<String> createCarreraDesCarrera(String value) {
        return new JAXBElement<String>(_CarreraDesCarrera_QNAME, String.class, Carrera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "estado", scope = Carrera.class)
    public JAXBElement<String> createCarreraEstado(String value) {
        return new JAXBElement<String>(_CarreraEstado_QNAME, String.class, Carrera.class, value);
    }

}
