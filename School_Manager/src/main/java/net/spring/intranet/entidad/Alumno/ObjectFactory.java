
package net.spring.intranet.entidad.Alumno;


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

    private final static QName _EstudiantesNomAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "nomAlu");
    private final static QName _EstudiantesUsernameAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "usernameAlu");
    private final static QName _EstudiantesApeAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "apeAlu");
    private final static QName _EstudiantesDirecAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "direcAlu");
    private final static QName _EstudiantesDesCarreraAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "desCarreraAlu");
    private final static QName _EstudiantesDesRolAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "desRolAlu");
    private final static QName _EstudiantesPassAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "passAlu");
    private final static QName _EstudiantesCelAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "celAlu");
    private final static QName _EstudiantesEstado_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "estado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.entidad.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Estudiantes }
     * 
     */
    public Estudiantes createEstudiantes() {
        return new Estudiantes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "nomAlu", scope = Estudiantes.class)
    public JAXBElement<String> createEstudiantesNomAlu(String value) {
        return new JAXBElement<String>(_EstudiantesNomAlu_QNAME, String.class, Estudiantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "usernameAlu", scope = Estudiantes.class)
    public JAXBElement<String> createEstudiantesUsernameAlu(String value) {
        return new JAXBElement<String>(_EstudiantesUsernameAlu_QNAME, String.class, Estudiantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "apeAlu", scope = Estudiantes.class)
    public JAXBElement<String> createEstudiantesApeAlu(String value) {
        return new JAXBElement<String>(_EstudiantesApeAlu_QNAME, String.class, Estudiantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "direcAlu", scope = Estudiantes.class)
    public JAXBElement<String> createEstudiantesDirecAlu(String value) {
        return new JAXBElement<String>(_EstudiantesDirecAlu_QNAME, String.class, Estudiantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "desCarreraAlu", scope = Estudiantes.class)
    public JAXBElement<String> createEstudiantesDesCarreraAlu(String value) {
        return new JAXBElement<String>(_EstudiantesDesCarreraAlu_QNAME, String.class, Estudiantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "desRolAlu", scope = Estudiantes.class)
    public JAXBElement<String> createEstudiantesDesRolAlu(String value) {
        return new JAXBElement<String>(_EstudiantesDesRolAlu_QNAME, String.class, Estudiantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "passAlu", scope = Estudiantes.class)
    public JAXBElement<String> createEstudiantesPassAlu(String value) {
        return new JAXBElement<String>(_EstudiantesPassAlu_QNAME, String.class, Estudiantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "celAlu", scope = Estudiantes.class)
    public JAXBElement<String> createEstudiantesCelAlu(String value) {
        return new JAXBElement<String>(_EstudiantesCelAlu_QNAME, String.class, Estudiantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "estado", scope = Estudiantes.class)
    public JAXBElement<String> createEstudiantesEstado(String value) {
        return new JAXBElement<String>(_EstudiantesEstado_QNAME, String.class, Estudiantes.class, value);
    }

}
