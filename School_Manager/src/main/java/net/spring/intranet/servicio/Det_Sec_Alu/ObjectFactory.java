
package net.spring.intranet.servicio.Det_Sec_Alu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import net.spring.intranet.entidad.Det_Sec_Alu.*;


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

    private final static QName _FindDetSecAluResponseReturn_QNAME = new QName("http://service.intranet.spring.net", "return");
    private final static QName _SaveDetSecAluBean_QNAME = new QName("http://service.intranet.spring.net", "bean");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaDetSecAluResponse }
     * 
     */
    public ListaDetSecAluResponse createListaDetSecAluResponse() {
        return new ListaDetSecAluResponse();
    }

    /**
     * Create an instance of {@link ListaDetSecAluxAlumnosResponse }
     * 
     */
    public ListaDetSecAluxAlumnosResponse createListaDetSecAluxAlumnosResponse() {
        return new ListaDetSecAluxAlumnosResponse();
    }

    /**
     * Create an instance of {@link ListaDetSecAluxAlumnos }
     * 
     */
    public ListaDetSecAluxAlumnos createListaDetSecAluxAlumnos() {
        return new ListaDetSecAluxAlumnos();
    }

    /**
     * Create an instance of {@link SaveDetSecAlu }
     * 
     */
    public SaveDetSecAlu createSaveDetSecAlu() {
        return new SaveDetSecAlu();
    }

    /**
     * Create an instance of {@link SaveDetSecAluResponse }
     * 
     */
    public SaveDetSecAluResponse createSaveDetSecAluResponse() {
        return new SaveDetSecAluResponse();
    }

    /**
     * Create an instance of {@link FindDetSecAluResponse }
     * 
     */
    public FindDetSecAluResponse createFindDetSecAluResponse() {
        return new FindDetSecAluResponse();
    }

    /**
     * Create an instance of {@link UpdateDetSecAlu }
     * 
     */
    public UpdateDetSecAlu createUpdateDetSecAlu() {
        return new UpdateDetSecAlu();
    }

    /**
     * Create an instance of {@link ListaDetSecAlu }
     * 
     */
    public ListaDetSecAlu createListaDetSecAlu() {
        return new ListaDetSecAlu();
    }

    /**
     * Create an instance of {@link FindDetSecAlu }
     * 
     */
    public FindDetSecAlu createFindDetSecAlu() {
        return new FindDetSecAlu();
    }

    /**
     * Create an instance of {@link UpdateDetSecAluResponse }
     * 
     */
    public UpdateDetSecAluResponse createUpdateDetSecAluResponse() {
        return new UpdateDetSecAluResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetSecAlu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "return", scope = FindDetSecAluResponse.class)
    public JAXBElement<DetSecAlu> createFindDetSecAluResponseReturn(DetSecAlu value) {
        return new JAXBElement<DetSecAlu>(_FindDetSecAluResponseReturn_QNAME, DetSecAlu.class, FindDetSecAluResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetSecAlu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "bean", scope = SaveDetSecAlu.class)
    public JAXBElement<DetSecAlu> createSaveDetSecAluBean(DetSecAlu value) {
        return new JAXBElement<DetSecAlu>(_SaveDetSecAluBean_QNAME, DetSecAlu.class, SaveDetSecAlu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetSecAlu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.intranet.spring.net", name = "bean", scope = UpdateDetSecAlu.class)
    public JAXBElement<DetSecAlu> createUpdateDetSecAluBean(DetSecAlu value) {
        return new JAXBElement<DetSecAlu>(_SaveDetSecAluBean_QNAME, DetSecAlu.class, UpdateDetSecAlu.class, value);
    }

}
