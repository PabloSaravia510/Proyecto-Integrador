
package net.spring.intranet.entidad.Administrador;

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

    private final static QName _AdministradorApellidoAdministrador_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "apellidoAdministrador");
    private final static QName _AdministradorEstadoRegistro_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "estadoRegistro");
    private final static QName _AdministradorPassAdministrador_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "passAdministrador");
    private final static QName _AdministradorDesRolAdministrador_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "desRolAdministrador");
    private final static QName _AdministradorUsuAdministrador_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "usuAdministrador");
    private final static QName _AdministradorNombreAdministrador_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "nombreAdministrador");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.entidad.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Administrador }
     * 
     */
    public Administrador createAdministrador() {
        return new Administrador();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "apellidoAdministrador", scope = Administrador.class)
    public JAXBElement<String> createAdministradorApellidoAdministrador(String value) {
        return new JAXBElement<String>(_AdministradorApellidoAdministrador_QNAME, String.class, Administrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "estadoRegistro", scope = Administrador.class)
    public JAXBElement<String> createAdministradorEstadoRegistro(String value) {
        return new JAXBElement<String>(_AdministradorEstadoRegistro_QNAME, String.class, Administrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "passAdministrador", scope = Administrador.class)
    public JAXBElement<String> createAdministradorPassAdministrador(String value) {
        return new JAXBElement<String>(_AdministradorPassAdministrador_QNAME, String.class, Administrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "desRolAdministrador", scope = Administrador.class)
    public JAXBElement<String> createAdministradorDesRolAdministrador(String value) {
        return new JAXBElement<String>(_AdministradorDesRolAdministrador_QNAME, String.class, Administrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "usuAdministrador", scope = Administrador.class)
    public JAXBElement<String> createAdministradorUsuAdministrador(String value) {
        return new JAXBElement<String>(_AdministradorUsuAdministrador_QNAME, String.class, Administrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "nombreAdministrador", scope = Administrador.class)
    public JAXBElement<String> createAdministradorNombreAdministrador(String value) {
        return new JAXBElement<String>(_AdministradorNombreAdministrador_QNAME, String.class, Administrador.class, value);
    }

}
