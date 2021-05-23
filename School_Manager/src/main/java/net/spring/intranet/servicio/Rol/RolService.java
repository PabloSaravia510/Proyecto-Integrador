
package net.spring.intranet.servicio.Rol;

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
@WebServiceClient(name = "RolService", targetNamespace = "http://service.intranet.spring.net", wsdlLocation = "http://localhost:8080/School_Servidor/services/RolService?wsdl")
public class RolService
    extends Service
{

    private final static URL ROLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ROLSERVICE_EXCEPTION;
    private final static QName ROLSERVICE_QNAME = new QName("http://service.intranet.spring.net", "RolService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/School_Servidor/services/RolService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ROLSERVICE_WSDL_LOCATION = url;
        ROLSERVICE_EXCEPTION = e;
    }

    public RolService() {
        super(__getWsdlLocation(), ROLSERVICE_QNAME);
    }

    public RolService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ROLSERVICE_QNAME, features);
    }

    public RolService(URL wsdlLocation) {
        super(wsdlLocation, ROLSERVICE_QNAME);
    }

    public RolService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ROLSERVICE_QNAME, features);
    }

    public RolService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RolService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RolServicePortType
     */
    @WebEndpoint(name = "RolServiceHttpSoap11Endpoint")
    public RolServicePortType getRolServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "RolServiceHttpSoap11Endpoint"), RolServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RolServicePortType
     */
    @WebEndpoint(name = "RolServiceHttpSoap11Endpoint")
    public RolServicePortType getRolServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "RolServiceHttpSoap11Endpoint"), RolServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns RolServicePortType
     */
    @WebEndpoint(name = "RolServiceHttpSoap12Endpoint")
    public RolServicePortType getRolServiceHttpSoap12Endpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "RolServiceHttpSoap12Endpoint"), RolServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RolServicePortType
     */
    @WebEndpoint(name = "RolServiceHttpSoap12Endpoint")
    public RolServicePortType getRolServiceHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "RolServiceHttpSoap12Endpoint"), RolServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns RolServicePortType
     */
    @WebEndpoint(name = "RolServiceHttpEndpoint")
    public RolServicePortType getRolServiceHttpEndpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "RolServiceHttpEndpoint"), RolServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RolServicePortType
     */
    @WebEndpoint(name = "RolServiceHttpEndpoint")
    public RolServicePortType getRolServiceHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "RolServiceHttpEndpoint"), RolServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ROLSERVICE_EXCEPTION!= null) {
            throw ROLSERVICE_EXCEPTION;
        }
        return ROLSERVICE_WSDL_LOCATION;
    }

}
