
package net.spring.intranet.servicio.Administrador;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.spring.intranet.entidad.Administrador.*;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.spring.intranet.service package. 
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

    private final static QName _IniciarSesionResponseReturn_QNAME = new QName("http://service.intranet.spring.net", "return");
    private final static QName _IniciarSesionPass_QNAME = new QName("http://service.intranet.spring.net", "pass");
    private final static QName _IniciarSesionUser_QNAME = new QName("http://service.intranet.spring.net", "user");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IniciarSesion }
     * 
     */
    public IniciarSesion createIniciarSesion() {
        return new IniciarSesion();
    }

    /**
     * Create an instance of {@link IniciarSesionResponse }
     * 
     */
    public IniciarSesionResponse createIniciarSesionResponse() {
        return new IniciarSesionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Administrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "return", scope = IniciarSesionResponse.class)
    public JAXBElement<Administrador> createIniciarSesionResponseReturn(Administrador value) {
        return new JAXBElement<Administrador>(_IniciarSesionResponseReturn_QNAME, Administrador.class, IniciarSesionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "pass", scope = IniciarSesion.class)
    public JAXBElement<String> createIniciarSesionPass(String value) {
        return new JAXBElement<String>(_IniciarSesionPass_QNAME, String.class, IniciarSesion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "user", scope = IniciarSesion.class)
    public JAXBElement<String> createIniciarSesionUser(String value) {
        return new JAXBElement<String>(_IniciarSesionUser_QNAME, String.class, IniciarSesion.class, value);
    }

}
