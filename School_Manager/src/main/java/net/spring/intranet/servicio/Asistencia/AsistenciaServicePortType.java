
package net.spring.intranet.servicio.Asistencia;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import net.spring.intranet.entidad.Asistencia.*;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AsistenciaServicePortType", targetNamespace = "http://service.intranet.spring.net")
@XmlSeeAlso({
    net.spring.intranet.entidad.Asistencia.ObjectFactory.class,
    net.spring.intranet.servicio.Asistencia.ObjectFactory.class
})
public interface AsistenciaServicePortType {


    /**
     * 
     * @param bean
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(action = "urn:saveAsistencia")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "saveAsistencia", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.SaveAsistencia")
    @ResponseWrapper(localName = "saveAsistenciaResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.SaveAsistenciaResponse")
    public Integer saveAsistencia(
        @WebParam(name = "bean", targetNamespace = "http://service.intranet.spring.net")
        Asistencia bean);

    /**
     * 
     * @return
     *     returns java.util.List<net.spring.intranet.entidad.xsd.Asistencia>
     */
    @WebMethod(action = "urn:listaAsistencia")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "listaAsistencia", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.ListaAsistencia")
    @ResponseWrapper(localName = "listaAsistenciaResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.ListaAsistenciaResponse")
    public List<Asistencia> listaAsistencia();

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(action = "urn:updateAsistencia")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "updateAsistencia", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.UpdateAsistencia")
    @ResponseWrapper(localName = "updateAsistenciaResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.UpdateAsistenciaResponse")
    public Integer updateAsistencia(
        @WebParam(name = "codigo", targetNamespace = "http://service.intranet.spring.net")
        Integer codigo);

    /**
     * 
     * @param codigo
     * @return
     *     returns net.spring.intranet.entidad.xsd.Asistencia
     */
    @WebMethod(action = "urn:findAsisrencia")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "findAsisrencia", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.FindAsisrencia")
    @ResponseWrapper(localName = "findAsisrenciaResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.FindAsisrenciaResponse")
    public Asistencia findAsisrencia(
        @WebParam(name = "codigo", targetNamespace = "http://service.intranet.spring.net")
        Integer codigo);

    /**
     * 
     * @param cod
     * @return
     *     returns java.util.List<net.spring.intranet.entidad.xsd.Asistencia>
     */
    @WebMethod(action = "urn:listaAsistenciaxAlumno")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "listaAsistenciaxAlumno", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.ListaAsistenciaxAlumno")
    @ResponseWrapper(localName = "listaAsistenciaxAlumnoResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.ListaAsistenciaxAlumnoResponse")
    public List<Asistencia> listaAsistenciaxAlumno(
        @WebParam(name = "cod", targetNamespace = "http://service.intranet.spring.net")
        Integer cod);

}
