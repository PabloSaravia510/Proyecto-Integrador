
package net.spring.intranet.servicio.Asistencia;

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
@WebServiceClient(name = "AsistenciaService", targetNamespace = "http://service.intranet.spring.net", wsdlLocation = "http://localhost:8080/School_Servidor/services/AsistenciaService?wsdl")
public class AsistenciaService
    extends Service
{

    private final static URL ASISTENCIASERVICE_WSDL_LOCATION;
    private final static WebServiceException ASISTENCIASERVICE_EXCEPTION;
    private final static QName ASISTENCIASERVICE_QNAME = new QName("http://service.intranet.spring.net", "AsistenciaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/School_Servidor/services/AsistenciaService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ASISTENCIASERVICE_WSDL_LOCATION = url;
        ASISTENCIASERVICE_EXCEPTION = e;
    }

    public AsistenciaService() {
        super(__getWsdlLocation(), ASISTENCIASERVICE_QNAME);
    }

    public AsistenciaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ASISTENCIASERVICE_QNAME, features);
    }

    public AsistenciaService(URL wsdlLocation) {
        super(wsdlLocation, ASISTENCIASERVICE_QNAME);
    }

    public AsistenciaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ASISTENCIASERVICE_QNAME, features);
    }

    public AsistenciaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AsistenciaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AsistenciaServicePortType
     */
    @WebEndpoint(name = "AsistenciaServiceHttpSoap11Endpoint")
    public AsistenciaServicePortType getAsistenciaServiceHttpSoap11Endpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "AsistenciaServiceHttpSoap11Endpoint"), AsistenciaServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsistenciaServicePortType
     */
    @WebEndpoint(name = "AsistenciaServiceHttpSoap11Endpoint")
    public AsistenciaServicePortType getAsistenciaServiceHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "AsistenciaServiceHttpSoap11Endpoint"), AsistenciaServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns AsistenciaServicePortType
     */
    @WebEndpoint(name = "AsistenciaServiceHttpSoap12Endpoint")
    public AsistenciaServicePortType getAsistenciaServiceHttpSoap12Endpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "AsistenciaServiceHttpSoap12Endpoint"), AsistenciaServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsistenciaServicePortType
     */
    @WebEndpoint(name = "AsistenciaServiceHttpSoap12Endpoint")
    public AsistenciaServicePortType getAsistenciaServiceHttpSoap12Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "AsistenciaServiceHttpSoap12Endpoint"), AsistenciaServicePortType.class, features);
    }

    /**
     * 
     * @return
     *     returns AsistenciaServicePortType
     */
    @WebEndpoint(name = "AsistenciaServiceHttpEndpoint")
    public AsistenciaServicePortType getAsistenciaServiceHttpEndpoint() {
        return super.getPort(new QName("http://service.intranet.spring.net", "AsistenciaServiceHttpEndpoint"), AsistenciaServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsistenciaServicePortType
     */
    @WebEndpoint(name = "AsistenciaServiceHttpEndpoint")
    public AsistenciaServicePortType getAsistenciaServiceHttpEndpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.intranet.spring.net", "AsistenciaServiceHttpEndpoint"), AsistenciaServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ASISTENCIASERVICE_EXCEPTION!= null) {
            throw ASISTENCIASERVICE_EXCEPTION;
        }
        return ASISTENCIASERVICE_WSDL_LOCATION;
    }

}
