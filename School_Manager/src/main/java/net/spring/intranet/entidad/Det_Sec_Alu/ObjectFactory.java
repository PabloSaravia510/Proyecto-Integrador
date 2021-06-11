
package net.spring.intranet.entidad.Det_Sec_Alu;

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

    private final static QName _DetSecAluDesSec_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "des_sec");
    private final static QName _DetSecAluDesCurs_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "des_curs");
    private final static QName _DetSecAluNomAlu_QNAME = new QName("http://entidad.intranet.spring.net/xsd", "nom_alu");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.spring.intranet.entidad.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DetSecAlu }
     * 
     */
    public DetSecAlu createDetSecAlu() {
        return new DetSecAlu();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "des_sec", scope = DetSecAlu.class)
    public JAXBElement<String> createDetSecAluDesSec(String value) {
        return new JAXBElement<String>(_DetSecAluDesSec_QNAME, String.class, DetSecAlu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "des_curs", scope = DetSecAlu.class)
    public JAXBElement<String> createDetSecAluDesCurs(String value) {
        return new JAXBElement<String>(_DetSecAluDesCurs_QNAME, String.class, DetSecAlu.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entidad.intranet.spring.net/xsd", name = "nom_alu", scope = DetSecAlu.class)
    public JAXBElement<String> createDetSecAluNomAlu(String value) {
        return new JAXBElement<String>(_DetSecAluNomAlu_QNAME, String.class, DetSecAlu.class, value);
    }

}
