package net.spring.intranet.controller;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.spring.intranet.entidad.Alumno.Estudiantes;
import net.spring.intranet.entidad.Asistencia.Asistencia;
import net.spring.intranet.entidad.Asistencia.ObjectFactory;
import net.spring.intranet.entidad.Seccion.Seccion;
import net.spring.intranet.servicio.Alumno.AlumnoService;
import net.spring.intranet.servicio.Alumno.AlumnoServicePortType;
import net.spring.intranet.servicio.Asistencia.AsistenciaService;
import net.spring.intranet.servicio.Asistencia.AsistenciaServicePortType;
import net.spring.intranet.servicio.Seccion.SeccionService;
import net.spring.intranet.servicio.Seccion.SeccionServicePortType;

@Controller
@RequestMapping("/asistencia")
public class AsistenciaController {

	private AsistenciaService asistenciaservice;
	private SeccionService seccionservice;
	private AlumnoService alumnoservice;
	
	public AsistenciaController() {
		asistenciaservice = new AsistenciaService();
		seccionservice = new SeccionService();
		alumnoservice = new AlumnoService();
	}
	
	
	
	@RequestMapping("/")
	public String ListaAsistencia(Model model) {
		
		try {
			AsistenciaServicePortType soapAsis = asistenciaservice.getAsistenciaServiceHttpSoap11Endpoint();
			List<Asistencia> listaAsis = soapAsis.listaAsistencia();
			
			SeccionServicePortType soapSec = seccionservice.getSeccionServiceHttpSoap11Endpoint();
			List<Seccion> listaSecciones = soapSec.listaSecciones();
			
			AlumnoServicePortType soapAlu = alumnoservice.getAlumnoServiceHttpSoap11Endpoint();
			List<Estudiantes> listaAlumno = soapAlu.listaEstudiantes();
			
			model.addAttribute("asistencias",listaAsis);
			model.addAttribute("secciones", listaSecciones);			
			model.addAttribute("alumnos",listaAlumno);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "asistencia";
	}
	
	
	
	/*
	@RequestMapping("/buscar")
	@ResponseBody 
	public Asistencia buscar(@RequestParam("codigo") int cod) {
		Asistencia bean = null;
		try {
			AsistenciaServicePortType soapAsis = asistenciaservice.getAsistenciaServiceHttpSoap11Endpoint();
			bean = soapAsis.findAsisrencia(cod);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bean;
		
	}
	
	*/
	
	
	@RequestMapping("/guardar")
	public String guardar(@RequestParam("codigo") int cod,
						   @RequestParam("alumno")  int alu,
						   @RequestParam("seccion") int sec,
						  @RequestParam("estado")  String estado,
						RedirectAttributes redirect) {
		
		
		try {
			
			AsistenciaServicePortType soapAsis = asistenciaservice.getAsistenciaServiceHttpSoap11Endpoint();
			Asistencia bean = new Asistencia();
			
			bean.setCodAsi(cod);
			bean.setCodAlu(alu);
			bean.setCodSec(sec);
			
			ObjectFactory factory = new ObjectFactory();
			JAXBElement<String> xEst;
			
			xEst = factory.createAsistenciaEstado(estado);
			
			bean.setEstado(xEst);
			
			
			if(cod == 0) {
				int salida; 
				salida = soapAsis.saveAsistencia(bean);
				if(salida > 0) {
					redirect.addFlashAttribute("MENSAJE","REGISTRADO CORRECTAMENTE");
				}else {
					redirect.addFlashAttribute("MENSAJE","ERROR EN EL REGISTRO");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
					
		return "redirect:/asistencia/";
			
		
	}
	
	
	
	
	
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("codigo") int cod, RedirectAttributes redirect) {

		try {
			AsistenciaServicePortType soapAsis = asistenciaservice.getAsistenciaServiceHttpSoap11Endpoint();
			soapAsis.updateAsistencia(cod);
			redirect.addFlashAttribute("MENSAJE","ASISTENCIA ACTUALIZADA");
			
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","ERROR EN LA ACTUALIZACION");
			e.printStackTrace();
		}
		
		return "redirect:/asistencia/";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("/filtro")
	public String listaAsistenciaxAlumno(Model model) {
		AlumnoServicePortType soapAlu = alumnoservice.getAlumnoServiceHttpSoap11Endpoint();
		List<Estudiantes> listaAlumno = soapAlu.listaEstudiantes();
		model.addAttribute("alumnos",listaAlumno);
		return "consultaAsistencia";
	}
	
	
	
	@RequestMapping("/consulta")
	@ResponseBody
	public List<Asistencia> consulta(@RequestParam("codigo") int cod){
		List<Asistencia> lista=null;
		try {
			AsistenciaServicePortType soapAsis = asistenciaservice.getAsistenciaServiceHttpSoap11Endpoint();
			lista=soapAsis.listaAsistenciaxAlumno(cod);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
