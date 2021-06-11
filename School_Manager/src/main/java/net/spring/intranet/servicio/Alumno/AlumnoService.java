
package net.spring.intranet.servicio.Alumno;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AlumnoService", targetNamespace = "http://service.intranet.spring.net", wsdlLocation = "http://localhost:8080/School_Servidor/services/AlumnoService?wsdl")
public class AlumnoService
    extends Service
{

    private final static URL ALUMNOSERVICE_WSDL_LOCATION;
    private final static WebServiceException ALUMNOSERVICE_EXCEPTION;
    private final static QName ALUMNOSERVICE_QNAME = new QName("http://service.intranet.spring.net", "AlumnoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/School_Servidor/services/AlumnoService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ALUMNOSERVICE_WSDL_LOCATION = url;
        ALUMNOSERVICE_EXCEPTION = e;
    }

    public AlumnoService() {
        super(__getWsdlLocation(), ALUMNOSERVICE_QNAME);
    }

    public AlumnoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ALUMNOSERVICE_QNAME, features);
    }

    public AlumnoService(URL wsdlLocation) {
        super(wsdlLocation, ALUMNOSERVICE_QNAME);
    }

    public AlumnoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ALUMNOSERVICE_QNAME, features);
    }

    public AlumnoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AlumnoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AlumnoServicePortType
     */
    @WebEndpoint(name = "AlumnoServiceHttpSoap11Endpoint")
    public AlumnoServicePortType getAlumnoServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "AlumnoServiceHttpSoap11Endpoint"), AlumnoServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlumnoServicePortType
     */
    @WebEndpoint(name = "AlumnoServiceHttpSoap11Endpoint")
    public AlumnoServicePortType getAlumnoServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "AlumnoServiceHttpSoap11Endpoint"), AlumnoServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns AlumnoServicePortType
     */
    @WebEndpoint(name = "AlumnoServiceHttpSoap12Endpoint")
    public AlumnoServicePortType getAlumnoServiceHttpSoap12Endpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "AlumnoServiceHttpSoap12Endpoint"), AlumnoServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlumnoServicePortType
     */
    @WebEndpoint(name = "AlumnoServiceHttpSoap12Endpoint")
    public AlumnoServicePortType getAlumnoServiceHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "AlumnoServiceHttpSoap12Endpoint"), AlumnoServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns AlumnoServicePortType
     */
    @WebEndpoint(name = "AlumnoServiceHttpEndpoint")
    public AlumnoServicePortType getAlumnoServiceHttpEndpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "AlumnoServiceHttpEndpoint"), AlumnoServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AlumnoServicePortType
     */
    @WebEndpoint(name = "AlumnoServiceHttpEndpoint")
    public AlumnoServicePortType getAlumnoServiceHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "AlumnoServiceHttpEndpoint"), AlumnoServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ALUMNOSERVICE_EXCEPTION!= null) {
            throw ALUMNOSERVICE_EXCEPTION;
        }
        return ALUMNOSERVICE_WSDL_LOCATION;
    }

}
