
package net.spring.intranet.servicio.Alumno;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.spring.intranet.entidad.Alumno.*;


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

    private final static QName _FindAluResponseReturn_QNAME = new QName("http://service.intranet.spring.net", "return");
    private final static QName _SaveAluBean_QNAME = new QName("http://service.intranet.spring.net", "bean");
    private final static QName _IniciarSesionAluPass_QNAME = new QName("http://service.intranet.spring.net", "pass");
    private final static QName _IniciarSesionAluUser_QNAME = new QName("http://service.intranet.spring.net", "user");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteAlu }
     * 
     */
    public DeleteAlu createDeleteAlu() {
        return new DeleteAlu();
    }

    /**
     * Create an instance of {@link ListaEstudiantesResponse }
     * 
     */
    public ListaEstudiantesResponse createListaEstudiantesResponse() {
        return new ListaEstudiantesResponse();
    }

    /**
     * Create an instance of {@link IniciarSesionAluResponse }
     * 
     */
    public IniciarSesionAluResponse createIniciarSesionAluResponse() {
        return new IniciarSesionAluResponse();
    }

    /**
     * Create an instance of {@link FindAluResponse }
     * 
     */
    public FindAluResponse createFindAluResponse() {
        return new FindAluResponse();
    }

    /**
     * Create an instance of {@link ListaEstudiantesXCarrera }
     * 
     */
    public ListaEstudiantesXCarrera createListaEstudiantesXCarrera() {
        return new ListaEstudiantesXCarrera();
    }

    /**
     * Create an instance of {@link SaveAlu }
     * 
     */
    public SaveAlu createSaveAlu() {
        return new SaveAlu();
    }

    /**
     * Create an instance of {@link UpdateAluResponse }
     * 
     */
    public UpdateAluResponse createUpdateAluResponse() {
        return new UpdateAluResponse();
    }

    /**
     * Create an instance of {@link IniciarSesionAlu }
     * 
     */
    public IniciarSesionAlu createIniciarSesionAlu() {
        return new IniciarSesionAlu();
    }

    /**
     * Create an instance of {@link UpdateAlu }
     * 
     */
    public UpdateAlu createUpdateAlu() {
        return new UpdateAlu();
    }

    /**
     * Create an instance of {@link ListaEstudiantes }
     * 
     */
    public ListaEstudiantes createListaEstudiantes() {
        return new ListaEstudiantes();
    }

    /**
     * Create an instance of {@link DeleteAluResponse }
     * 
     */
    public DeleteAluResponse createDeleteAluResponse() {
        return new DeleteAluResponse();
    }

    /**
     * Create an instance of {@link SaveAluResponse }
     * 
     */
    public SaveAluResponse createSaveAluResponse() {
        return new SaveAluResponse();
    }

    /**
     * Create an instance of {@link FindAlu }
     * 
     */
    public FindAlu createFindAlu() {
        return new FindAlu();
    }

    /**
     * Create an instance of {@link ListaEstudiantesXCarreraResponse }
     * 
     */
    public ListaEstudiantesXCarreraResponse createListaEstudiantesXCarreraResponse() {
        return new ListaEstudiantesXCarreraResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "return", scope = FindAluResponse.class)
    public JAXBElement<Estudiantes> createFindAluResponseReturn(Estudiantes value) {
        return new JAXBElement<Estudiantes>(_FindAluResponseReturn_QNAME, Estudiantes.class, FindAluResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "bean", scope = SaveAlu.class)
    public JAXBElement<Estudiantes> createSaveAluBean(Estudiantes value) {
        return new JAXBElement<Estudiantes>(_SaveAluBean_QNAME, Estudiantes.class, SaveAlu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "pass", scope = IniciarSesionAlu.class)
    public JAXBElement<String> createIniciarSesionAluPass(String value) {
        return new JAXBElement<String>(_IniciarSesionAluPass_QNAME, String.class, IniciarSesionAlu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "user", scope = IniciarSesionAlu.class)
    public JAXBElement<String> createIniciarSesionAluUser(String value) {
        return new JAXBElement<String>(_IniciarSesionAluUser_QNAME, String.class, IniciarSesionAlu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "bean", scope = UpdateAlu.class)
    public JAXBElement<Estudiantes> createUpdateAluBean(Estudiantes value) {
        return new JAXBElement<Estudiantes>(_SaveAluBean_QNAME, Estudiantes.class, UpdateAlu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estudiantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "return", scope = IniciarSesionAluResponse.class)
    public JAXBElement<Estudiantes> createIniciarSesionAluResponseReturn(Estudiantes value) {
        return new JAXBElement<Estudiantes>(_FindAluResponseReturn_QNAME, Estudiantes.class, IniciarSesionAluResponse.class, value);
    }

}
