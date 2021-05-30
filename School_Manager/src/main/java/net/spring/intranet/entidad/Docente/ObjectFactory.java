
package net.spring.intranet.entidad.Docente;

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

    private final static QName _DocentesUsernamePro_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "usernamePro");
    private final static QName _DocentesApePro_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "apePro");
    private final static QName _DocentesDesRolPro_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "desRolPro");
    private final static QName _DocentesDirecPro_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "direcPro");
    private final static QName _DocentesNomPro_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "nomPro");
    private final static QName _DocentesPassPro_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "passPro");
    private final static QName _DocentesCelPro_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "celPro");
    private final static QName _DocentesEstado_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "estado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.entidad.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Docentes }
     * 
     */
    public Docentes createDocentes() {
        return new Docentes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "usernamePro", scope = Docentes.class)
    public JAXBElement<String> createDocentesUsernamePro(String value) {
        return new JAXBElement<String>(_DocentesUsernamePro_QNAME, String.class, Docentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "apePro", scope = Docentes.class)
    public JAXBElement<String> createDocentesApePro(String value) {
        return new JAXBElement<String>(_DocentesApePro_QNAME, String.class, Docentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "desRolPro", scope = Docentes.class)
    public JAXBElement<String> createDocentesDesRolPro(String value) {
        return new JAXBElement<String>(_DocentesDesRolPro_QNAME, String.class, Docentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "direcPro", scope = Docentes.class)
    public JAXBElement<String> createDocentesDirecPro(String value) {
        return new JAXBElement<String>(_DocentesDirecPro_QNAME, String.class, Docentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "nomPro", scope = Docentes.class)
    public JAXBElement<String> createDocentesNomPro(String value) {
        return new JAXBElement<String>(_DocentesNomPro_QNAME, String.class, Docentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "passPro", scope = Docentes.class)
    public JAXBElement<String> createDocentesPassPro(String value) {
        return new JAXBElement<String>(_DocentesPassPro_QNAME, String.class, Docentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "celPro", scope = Docentes.class)
    public JAXBElement<String> createDocentesCelPro(String value) {
        return new JAXBElement<String>(_DocentesCelPro_QNAME, String.class, Docentes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "estado", scope = Docentes.class)
    public JAXBElement<String> createDocentesEstado(String value) {
        return new JAXBElement<String>(_DocentesEstado_QNAME, String.class, Docentes.class, value);
    }

}
