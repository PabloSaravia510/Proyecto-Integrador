package net.spring.intranet.controller;

import java.util.List;

import javax.xml.bind.JAXBElement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.spring.intranet.entidad.Docente.Docentes;
import net.spring.intranet.entidad.Horario.Horario;
import net.spring.intranet.entidad.Seccion.ObjectFactory;
import net.spring.intranet.entidad.Seccion.Seccion;
import net.spring.intranet.servicio.Docente.DocenteService;
import net.spring.intranet.servicio.Docente.DocenteServicePortType;
import net.spring.intranet.servicio.Horario.HorarioService;
import net.spring.intranet.servicio.Horario.HorarioServicePortType;
import net.spring.intranet.servicio.Seccion.SeccionService;
import net.spring.intranet.servicio.Seccion.SeccionServicePortType;

@Controller
@RequestMapping("/seccion")
public class SeccionController {

	private SeccionService seccionservice;
	private HorarioService horarioservice;
	private DocenteService docenteservice;
	
	public SeccionController() {
		seccionservice = new SeccionService();
		horarioservice = new HorarioService();
		docenteservice = new DocenteService();
	}
	
	
	@RequestMapping("/")
	public String ListaSecciones(Model model) {
		
		try {
			
			SeccionServicePortType soapSec = seccionservice.getSeccionServiceHttpSoap11Endpoint();
			List<Seccion> listaSecciones = soapSec.listaSecciones();
			
			HorarioServicePortType soapHora = horarioservice.getHorarioServiceHttpSoap11Endpoint();
			List<Horario> listaHorarios = soapHora.listaHorario();
			
			DocenteServicePortType soapPro = docenteservice.getDocenteServiceHttpSoap11Endpoint();
			List<Docentes> listaProfesor = soapPro.listaDocentes();
			
			model.addAttribute("secciones", listaSecciones);
			model.addAttribute("horarios",listaHorarios);
			model.addAttribute("profesores",listaProfesor);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "seccion";
		
	}
	
	
	
	
	
	
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("codigo") int cod, RedirectAttributes redirect) {
		
		try {
			SeccionServicePortType soapSec = seccionservice.getSeccionServiceHttpSoap11Endpoint();
			soapSec.deleteSeccion(cod);
			redirect.addFlashAttribute("MENSAJE","SECCION ELIMINADO");
		} catch (Exception e) {
			e.printStackTrace();
			redirect.addFlashAttribute("MENSAJE","ERROR AL ELIMINAR LA SECCION");
		}
		return "redirect:/seccion/"; 
		
	}

		
	
	
	@RequestMapping("/buscar")
	@ResponseBody 
	public Seccion buscar(@RequestParam("codigo") int cod) {
		Seccion bean = null;
		try {
			SeccionServicePortType soapSec = seccionservice.getSeccionServiceHttpSoap11Endpoint();
			bean = soapSec.findSeccion(cod);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			return bean;
	}
	
	
	
	
	
	
	@RequestMapping("/guardar")
	public String guardar(@RequestParam("codigo") int cod,
						  @RequestParam("seccion")  String sec,
						  @RequestParam("curso")  String cur,
						  @RequestParam("nota1")  int not1,
						  @RequestParam("nota2")  int not2,
						  @RequestParam("profesor")  int pro,
						  @RequestParam("horario")  int hor,
						  @RequestParam("lfalta")  int lfal,
						  @RequestParam("lclases")  int lcla,
						  @RequestParam("estado")  String est,
						RedirectAttributes redirect) {
		
		
		try {
			SeccionServicePortType soapSec = seccionservice.getSeccionServiceHttpSoap11Endpoint();
			Seccion bean = new Seccion();
			
			bean.setCodSec(cod);
			bean.setNota1(not1);
			bean.setNota2(not2);
			bean.setCodPro(pro);
			bean.setCodigoHorario(hor);
			bean.setLfalSec(lfal);
			bean.setLclaSec(lcla);
			
			ObjectFactory factory = new ObjectFactory();
			JAXBElement<String> xSec,xCur,xEst;
			
			xSec = factory.createSeccionDesSec(sec);
			xCur = factory.createSeccionDesCurso(cur);
			xEst = factory.createSeccionEstado(est);
			
			bean.setDesSec(xSec);
			bean.setDesCurso(xCur);
			bean.setEstado(xEst);
			
			if (cod == 0) {
				int salida; 
				salida = soapSec.saveSeccion(bean);
				if(salida > 0) {
					redirect.addFlashAttribute("MENSAJE","SECCION REGISTRADO");
				}else {
					redirect.addFlashAttribute("MENSAJE","ERROR EN EL REGISTRO");
				}
			}else {
				int salida; 
				salida = soapSec.updateSeccion(bean);
				if(salida > 0) {
					redirect.addFlashAttribute("MENSAJE","SECCION ACTUALIZADO");
				}else {
					redirect.addFlashAttribute("MENSAJE","ERROR AL ACTUALIZAR");
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "redirect:/seccion/"; 
		
	}
		
	
	
	
	
	
	@RequestMapping("/filtro")
	public String listaSeccionxProfesor(Model model) {
		DocenteServicePortType soapPro = docenteservice.getDocenteServiceHttpSoap11Endpoint();
		List<Docentes> listaProfesor = soapPro.listaDocentes();
		model.addAttribute("profesores",listaProfesor);
		return "consultaSeccion";
	}
	
	
	@RequestMapping("/consulta")
	@ResponseBody
	public List<Seccion> consulta(@RequestParam("codigo") int cod){
		List<Seccion> lista=null;
		try {

			SeccionServicePortType soapSec = seccionservice.getSeccionServiceHttpSoap11Endpoint();
			lista=soapSec.listaSeccionesxProfesores(cod);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	
	
	
	
	
	
	
}
