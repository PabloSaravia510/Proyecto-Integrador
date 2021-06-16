package net.spring.intranet.servicio.Asistencia;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.spring.intranet.entidad.Asistencia.*;


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

    private final static QName _SaveAsistenciaBean_QNAME = new QName("http://service.intranet.spring.net", "bean");
    private final static QName _FindAsisrenciaResponseReturn_QNAME = new QName("http://service.intranet.spring.net", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaAsistenciaxAlumnoResponse }
     * 
     */
    public ListaAsistenciaxAlumnoResponse createListaAsistenciaxAlumnoResponse() {
        return new ListaAsistenciaxAlumnoResponse();
    }

    /**
     * Create an instance of {@link SaveAsistencia }
     * 
     */
    public SaveAsistencia createSaveAsistencia() {
        return new SaveAsistencia();
    }

    /**
     * Create an instance of {@link FindAsisrenciaResponse }
     * 
     */
    public FindAsisrenciaResponse createFindAsisrenciaResponse() {
        return new FindAsisrenciaResponse();
    }

    /**
     * Create an instance of {@link SaveAsistenciaResponse }
     * 
     */
    public SaveAsistenciaResponse createSaveAsistenciaResponse() {
        return new SaveAsistenciaResponse();
    }

    /**
     * Create an instance of {@link ListaAsistencia }
     * 
     */
    public ListaAsistencia createListaAsistencia() {
        return new ListaAsistencia();
    }

    /**
     * Create an instance of {@link UpdateAsistencia }
     * 
     */
    public UpdateAsistencia createUpdateAsistencia() {
        return new UpdateAsistencia();
    }

    /**
     * Create an instance of {@link UpdateAsistenciaResponse }
     * 
     */
    public UpdateAsistenciaResponse createUpdateAsistenciaResponse() {
        return new UpdateAsistenciaResponse();
    }

    /**
     * Create an instance of {@link FindAsisrencia }
     * 
     */
    public FindAsisrencia createFindAsisrencia() {
        return new FindAsisrencia();
    }

    /**
     * Create an instance of {@link ListaAsistenciaResponse }
     * 
     */
    public ListaAsistenciaResponse createListaAsistenciaResponse() {
        return new ListaAsistenciaResponse();
    }

    /**
     * Create an instance of {@link ListaAsistenciaxAlumno }
     * 
     */
    public ListaAsistenciaxAlumno createListaAsistenciaxAlumno() {
        return new ListaAsistenciaxAlumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Asistencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "bean", scope = SaveAsistencia.class)
    public JAXBElement<Asistencia> createSaveAsistenciaBean(Asistencia value) {
        return new JAXBElement<Asistencia>(_SaveAsistenciaBean_QNAME, Asistencia.class, SaveAsistencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Asistencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "return", scope = FindAsisrenciaResponse.class)
    public JAXBElement<Asistencia> createFindAsisrenciaResponseReturn(Asistencia value) {
        return new JAXBElement<Asistencia>(_FindAsisrenciaResponseReturn_QNAME, Asistencia.class, FindAsisrenciaResponse.class, value);
    }

}
