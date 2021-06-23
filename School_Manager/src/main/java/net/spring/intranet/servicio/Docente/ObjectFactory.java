
package net.spring.intranet.servicio.Docente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.spring.intranet.entidad.Docente.*;


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

    private final static QName _SaveDocenteBean_QNAME = new QName("http://service.intranet.spring.net", "bean");
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
     * Create an instance of {@link DeleteDocente }
     * 
     */
    public DeleteDocente createDeleteDocente() {
        return new DeleteDocente();
    }

    /**
     * Create an instance of {@link SaveDocente }
     * 
     */
    public SaveDocente createSaveDocente() {
        return new SaveDocente();
    }

    /**
     * Create an instance of {@link ListaDocentesResponse }
     * 
     */
    public ListaDocentesResponse createListaDocentesResponse() {
        return new ListaDocentesResponse();
    }

    /**
     * Create an instance of {@link DeleteDocenteResponse }
     * 
     */
    public DeleteDocenteResponse createDeleteDocenteResponse() {
        return new DeleteDocenteResponse();
    }

    /**
     * Create an instance of {@link UpdateDocente }
     * 
     */
    public UpdateDocente createUpdateDocente() {
        return new UpdateDocente();
    }

    /**
     * Create an instance of {@link FindDocenteResponse }
     * 
     */
    public FindDocenteResponse createFindDocenteResponse() {
        return new FindDocenteResponse();
    }

    /**
     * Create an instance of {@link FindDocente }
     * 
     */
    public FindDocente createFindDocente() {
        return new FindDocente();
    }

    /**
     * Create an instance of {@link IniciarSesion }
     * 
     */
    public IniciarSesion createIniciarSesion() {
        return new IniciarSesion();
    }

    /**
     * Create an instance of {@link UpdateDocenteResponse }
     * 
     */
    public UpdateDocenteResponse createUpdateDocenteResponse() {
        return new UpdateDocenteResponse();
    }

    /**
     * Create an instance of {@link IniciarSesionResponse }
     * 
     */
    public IniciarSesionResponse createIniciarSesionResponse() {
        return new IniciarSesionResponse();
    }

    /**
     * Create an instance of {@link SaveDocenteResponse }
     * 
     */
    public SaveDocenteResponse createSaveDocenteResponse() {
        return new SaveDocenteResponse();
    }

    /**
     * Create an instance of {@link ListaDocentes }
     * 
     */
    public ListaDocentes createListaDocentes() {
        return new ListaDocentes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Docentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "bean", scope = SaveDocente.class)
    public JAXBElement<Docentes> createSaveDocenteBean(Docentes value) {
        return new JAXBElement<Docentes>(_SaveDocenteBean_QNAME, Docentes.class, SaveDocente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Docentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "return", scope = IniciarSesionResponse.class)
    public JAXBElement<Docentes> createIniciarSesionResponseReturn(Docentes value) {
        return new JAXBElement<Docentes>(_IniciarSesionResponseReturn_QNAME, Docentes.class, IniciarSesionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Docentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "return", scope = FindDocenteResponse.class)
    public JAXBElement<Docentes> createFindDocenteResponseReturn(Docentes value) {
        return new JAXBElement<Docentes>(_IniciarSesionResponseReturn_QNAME, Docentes.class, FindDocenteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Docentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "bean", scope = UpdateDocente.class)
    public JAXBElement<Docentes> createUpdateDocenteBean(Docentes value) {
        return new JAXBElement<Docentes>(_SaveDocenteBean_QNAME, Docentes.class, UpdateDocente.class, value);
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
