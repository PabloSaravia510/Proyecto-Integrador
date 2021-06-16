
package net.spring.intranet.entidad.Asistencia;


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

    private final static QName _AsistenciaDesSec_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "des_sec");
    private final static QName _AsistenciaDesCurs_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "des_curs");
    private final static QName _AsistenciaEstado_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "estado");
    private final static QName _AsistenciaNomAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "nom_alu");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.entidad.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Asistencia }
     * 
     */
    public Asistencia createAsistencia() {
        return new Asistencia();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "des_sec", scope = Asistencia.class)
    public JAXBElement<String> createAsistenciaDesSec(String value) {
        return new JAXBElement<String>(_AsistenciaDesSec_QNAME, String.class, Asistencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "des_curs", scope = Asistencia.class)
    public JAXBElement<String> createAsistenciaDesCurs(String value) {
        return new JAXBElement<String>(_AsistenciaDesCurs_QNAME, String.class, Asistencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "estado", scope = Asistencia.class)
    public JAXBElement<String> createAsistenciaEstado(String value) {
        return new JAXBElement<String>(_AsistenciaEstado_QNAME, String.class, Asistencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "nom_alu", scope = Asistencia.class)
    public JAXBElement<String> createAsistenciaNomAlu(String value) {
        return new JAXBElement<String>(_AsistenciaNomAlu_QNAME, String.class, Asistencia.class, value);
    }

}
