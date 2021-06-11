
package net.spring.intranet.servicio.Administrador;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import net.spring.intranet.entidad.Administrador.*;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AdministradorServicePortType", targetNamespace = "http://service.intranet.spring.net")
@XmlSeeAlso({
    net.spring.intranet.entidad.Administrador.ObjectFactory.class,
    net.spring.intranet.servicio.Administrador.ObjectFactory.class
})
public interface AdministradorServicePortType {


    /**
     * 
     * @param pass
     * @param user
     * @return
     *     returns net.spring.intranet.entidad.xsd.Administrador
     */
    @WebMethod(action = "urn:iniciarSesion")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "iniciarSesion", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.IniciarSesion")
    @ResponseWrapper(localName = "iniciarSesionResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.IniciarSesionResponse")
    public Administrador iniciarSesion(
        @WebParam(name = "user", targetNamespace = "http://service.intranet.spring.net")
        String user,
        @WebParam(name = "pass", targetNamespace = "http://service.intranet.spring.net")
        String pass);

}