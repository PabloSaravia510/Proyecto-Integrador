
package net.spring.intranet.servicio.Seccion;

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
@WebServiceClient(name = "SeccionService", targetNamespace = "http://service.intranet.spring.net", wsdlLocation = "http://localhost:8080/School_Servidor/services/SeccionService?wsdl")
public class SeccionService
    extends Service
{

    private final static URL SECCIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException SECCIONSERVICE_EXCEPTION;
    private final static QName SECCIONSERVICE_QNAME = new QName("http://service.intranet.spring.net", "SeccionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/School_Servidor/services/SeccionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SECCIONSERVICE_WSDL_LOCATION = url;
        SECCIONSERVICE_EXCEPTION = e;
    }

    public SeccionService() {
        super(__getWsdlLocation(), SECCIONSERVICE_QNAME);
    }

    public SeccionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SECCIONSERVICE_QNAME, features);
    }

    public SeccionService(URL wsdlLocation) {
        super(wsdlLocation, SECCIONSERVICE_QNAME);
    }

    public SeccionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SECCIONSERVICE_QNAME, features);
    }

    public SeccionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SeccionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SeccionServicePortType
     */
    @WebEndpoint(name = "SeccionServiceHttpSoap11Endpoint")
    public SeccionServicePortType getSeccionServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "SeccionServiceHttpSoap11Endpoint"), SeccionServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SeccionServicePortType
     */
    @WebEndpoint(name = "SeccionServiceHttpSoap11Endpoint")
    public SeccionServicePortType getSeccionServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "SeccionServiceHttpSoap11Endpoint"), SeccionServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns SeccionServicePortType
     */
    @WebEndpoint(name = "SeccionServiceHttpSoap12Endpoint")
    public SeccionServicePortType getSeccionServiceHttpSoap12Endpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "SeccionServiceHttpSoap12Endpoint"), SeccionServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SeccionServicePortType
     */
    @WebEndpoint(name = "SeccionServiceHttpSoap12Endpoint")
    public SeccionServicePortType getSeccionServiceHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "SeccionServiceHttpSoap12Endpoint"), SeccionServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns SeccionServicePortType
     */
    @WebEndpoint(name = "SeccionServiceHttpEndpoint")
    public SeccionServicePortType getSeccionServiceHttpEndpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "SeccionServiceHttpEndpoint"), SeccionServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SeccionServicePortType
     */
    @WebEndpoint(name = "SeccionServiceHttpEndpoint")
    public SeccionServicePortType getSeccionServiceHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "SeccionServiceHttpEndpoint"), SeccionServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SECCIONSERVICE_EXCEPTION!= null) {
            throw SECCIONSERVICE_EXCEPTION;
        }
        return SECCIONSERVICE_WSDL_LOCATION;
    }

}
