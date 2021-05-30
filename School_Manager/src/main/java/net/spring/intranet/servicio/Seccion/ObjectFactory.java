package net.spring.intranet.servicio.Seccion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.spring.intranet.entidad.Seccion.*;


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

    private final static QName _UpdateSeccionBean_QNAME = new QName("http://service.intranet.spring.net", "bean");
    private final static QName _FindSeccionResponseReturn_QNAME = new QName("http://service.intranet.spring.net", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveSeccionResponse }
     * 
     */
    public SaveSeccionResponse createSaveSeccionResponse() {
        return new SaveSeccionResponse();
    }

    /**
     * Create an instance of {@link UpdateSeccion }
     * 
     */
    public UpdateSeccion createUpdateSeccion() {
        return new UpdateSeccion();
    }

    /**
     * Create an instance of {@link FindSeccion }
     * 
     */
    public FindSeccion createFindSeccion() {
        return new FindSeccion();
    }

    /**
     * Create an instance of {@link DeleteSeccionResponse }
     * 
     */
    public DeleteSeccionResponse createDeleteSeccionResponse() {
        return new DeleteSeccionResponse();
    }

    /**
     * Create an instance of {@link ListaSeccionesResponse }
     * 
     */
    public ListaSeccionesResponse createListaSeccionesResponse() {
        return new ListaSeccionesResponse();
    }

    /**
     * Create an instance of {@link DeleteSeccion }
     * 
     */
    public DeleteSeccion createDeleteSeccion() {
        return new DeleteSeccion();
    }

    /**
     * Create an instance of {@link SaveSeccion }
     * 
     */
    public SaveSeccion createSaveSeccion() {
        return new SaveSeccion();
    }

    /**
     * Create an instance of {@link ListaSecciones }
     * 
     */
    public ListaSecciones createListaSecciones() {
        return new ListaSecciones();
    }

    /**
     * Create an instance of {@link UpdateSeccionResponse }
     * 
     */
    public UpdateSeccionResponse createUpdateSeccionResponse() {
        return new UpdateSeccionResponse();
    }

    /**
     * Create an instance of {@link FindSeccionResponse }
     * 
     */
    public FindSeccionResponse createFindSeccionResponse() {
        return new FindSeccionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Seccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "bean", scope = UpdateSeccion.class)
    public JAXBElement<Seccion> createUpdateSeccionBean(Seccion value) {
        return new JAXBElement<Seccion>(_UpdateSeccionBean_QNAME, Seccion.class, UpdateSeccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Seccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "bean", scope = SaveSeccion.class)
    public JAXBElement<Seccion> createSaveSeccionBean(Seccion value) {
        return new JAXBElement<Seccion>(_UpdateSeccionBean_QNAME, Seccion.class, SaveSeccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Seccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "return", scope = FindSeccionResponse.class)
    public JAXBElement<Seccion> createFindSeccionResponseReturn(Seccion value) {
        return new JAXBElement<Seccion>(_FindSeccionResponseReturn_QNAME, Seccion.class, FindSeccionResponse.class, value);
    }

}
