
package net.spring.intranet.servicio.Rol;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import net.spring.intranet.entidad.Rol.*;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RolServicePortType", targetNamespace = "http://service.intranet.spring.net")
@XmlSeeAlso({
    net.spring.intranet.entidad.Rol.ObjectFactory.class,
    net.spring.intranet.servicio.Rol.ObjectFactory.class
})
public interface RolServicePortType {


    /**
     * 
     * @return
     *     returns java.util.List<net.spring.intranet.entidad.xsd.Rol>
     */
    @WebMethod(action = "urn:listaRoles")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "listaRoles", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.ListaRoles")
    @ResponseWrapper(localName = "listaRolesResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.ListaRolesResponse")
    public List<Rol> listaRoles();

}
