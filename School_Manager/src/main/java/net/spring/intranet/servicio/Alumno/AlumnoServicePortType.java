
package net.spring.intranet.servicio.Alumno;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import net.spring.intranet.entidad.Alumno.*;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AlumnoServicePortType", targetNamespace = "http://service.intranet.spring.net")
@XmlSeeAlso({
    net.spring.intranet.entidad.Alumno.ObjectFactory.class,
    net.spring.intranet.servicio.Alumno.ObjectFactory.class
})
public interface AlumnoServicePortType {


    /**
     * 
     * @param bean
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(action = "urn:updateAlu")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "updateAlu", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.UpdateAlu")
    @ResponseWrapper(localName = "updateAluResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.UpdateAluResponse")
    public Integer updateAlu(
        @WebParam(name = "bean", targetNamespace = "http://service.intranet.spring.net")
        Estudiantes bean);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(action = "urn:deleteAlu")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "deleteAlu", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.DeleteAlu")
    @ResponseWrapper(localName = "deleteAluResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.DeleteAluResponse")
    public Integer deleteAlu(
        @WebParam(name = "codigo", targetNamespace = "http://service.intranet.spring.net")
        Integer codigo);

    /**
     * 
     * @return
     *     returns java.util.List<net.spring.intranet.entidad.xsd.Estudiantes>
     */
    @WebMethod(action = "urn:listaEstudiantes")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "listaEstudiantes", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.ListaEstudiantes")
    @ResponseWrapper(localName = "listaEstudiantesResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.ListaEstudiantesResponse")
    public List<Estudiantes> listaEstudiantes();

    /**
     * 
     * @param codigo
     * @return
     *     returns net.spring.intranet.entidad.xsd.Estudiantes
     */
    @WebMethod(action = "urn:findAlu")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "findAlu", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.FindAlu")
    @ResponseWrapper(localName = "findAluResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.FindAluResponse")
    public Estudiantes findAlu(
        @WebParam(name = "codigo", targetNamespace = "http://service.intranet.spring.net")
        Integer codigo);

    /**
     * 
     * @param bean
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(action = "urn:saveAlu")
    @WebResult(targetNamespace = "http://service.intranet.spring.net")
    @RequestWrapper(localName = "saveAlu", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.SaveAlu")
    @ResponseWrapper(localName = "saveAluResponse", targetNamespace = "http://service.intranet.spring.net", className = "net.spring.intranet.service.SaveAluResponse")
    public Integer saveAlu(
        @WebParam(name = "bean", targetNamespace = "http://service.intranet.spring.net")
        Estudiantes bean);

}