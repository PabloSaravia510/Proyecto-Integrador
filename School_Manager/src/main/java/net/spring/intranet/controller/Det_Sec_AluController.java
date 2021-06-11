package net.spring.intranet.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import net.spring.intranet.entidad.Alumno.Estudiantes;
import net.spring.intranet.entidad.Det_Sec_Alu.DetSecAlu;
import net.spring.intranet.entidad.Seccion.Seccion;
import net.spring.intranet.servicio.Alumno.AlumnoService;
import net.spring.intranet.servicio.Alumno.AlumnoServicePortType;
import net.spring.intranet.servicio.Det_Sec_Alu.DetSecAluService;
import net.spring.intranet.servicio.Det_Sec_Alu.DetSecAluServicePortType;
import net.spring.intranet.servicio.Seccion.SeccionService;
import net.spring.intranet.servicio.Seccion.SeccionServicePortType;

@Controller
@RequestMapping("/detalle")
public class Det_Sec_AluController {

	private DetSecAluService detSecAluservice;
	private SeccionService seccionservice;
	private AlumnoService alumnoservice;
	
	public Det_Sec_AluController() {
		detSecAluservice = new DetSecAluService();
		seccionservice = new SeccionService();
		alumnoservice = new AlumnoService();
	}
	
	
	
	@RequestMapping("/")
	public String ListaSecciones(Model model) {
		
		try {
			
			DetSecAluServicePortType soapDet = detSecAluservice.getDetSecAluServiceHttpSoap11Endpoint();
			List<DetSecAlu> listaDetSecAlu = soapDet.listaDetSecAlu();
			
			SeccionServicePortType soapSec = seccionservice.getSeccionServiceHttpSoap11Endpoint();
			List<Seccion> listaSecciones = soapSec.listaSecciones();
			
			AlumnoServicePortType soapAlu = alumnoservice.getAlumnoServiceHttpSoap11Endpoint();
			List<Estudiantes> listaAlumno = soapAlu.listaEstudiantes();
			
			model.addAttribute("notas",listaDetSecAlu);
			model.addAttribute("secciones", listaSecciones);			
			model.addAttribute("alumnos",listaAlumno);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "detalle";
		
	}
	
	
	
	@RequestMapping("/buscar")
	@ResponseBody 
	public DetSecAlu buscar(@RequestParam("codigo") int cod) {
		DetSecAlu bean = null;
		try {
			DetSecAluServicePortType soapDet = detSecAluservice.getDetSecAluServiceHttpSoap11Endpoint();
			bean = soapDet.findDetSecAlu(cod);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			return bean;
	}
	
	
	
	
	
	@RequestMapping("/guardar")
	public String guardar(@RequestParam("codigo") int cod,
						  @RequestParam("seccion") int sec,
						  @RequestParam("nota1")  int not1,
						  @RequestParam("nota2")  int not2,
						  @RequestParam("alumno")  int alu,
						RedirectAttributes redirect) {
	
			try {	
					DetSecAluServicePortType soapDet = detSecAluservice.getDetSecAluServiceHttpSoap11Endpoint();
					DetSecAlu bean = new DetSecAlu();
					
					bean.setCodSecAlu(cod);
					bean.setCodSec(sec);
					bean.setNota1(not1);
					bean.setNota2(not2);
					bean.setCodAlu(alu);
					
					
					
					if(cod == 0) {
						int salida;
						salida = soapDet.saveDetSecAlu(bean);
						if(salida > 0) {
							redirect.addFlashAttribute("MENSAJE","NOTA REGISTRADO");
						}else {
							redirect.addFlashAttribute("MENSAJE","ERROR EN EL REGISTRO");
						}
					}else {
						int salida;
						salida = soapDet.updateDetSecAlu(bean);
						if(salida > 0) {
							redirect.addFlashAttribute("MENSAJE","NOTA ACTUALIZADO");
						}else {
							redirect.addFlashAttribute("MENSAJE","ERROR AL ACTUALIZAR");
						}
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			
			return "redirect:/detalle/"; 
		
	}
	
	
	
	
	
	@RequestMapping("/filtro")
	public String listaSeccionxProfesor(Model model) {
		AlumnoServicePortType soapAlu = alumnoservice.getAlumnoServiceHttpSoap11Endpoint();
		List<Estudiantes> listaAlumno = soapAlu.listaEstudiantes();
		model.addAttribute("alumnos",listaAlumno);
		return "consultaDetalle";
	}
	
	
	
	
	@RequestMapping("/consulta")
	@ResponseBody
	public List<DetSecAlu> consulta(@RequestParam("codigo") int cod){
		List<DetSecAlu> lista=null;
		try {
			DetSecAluServicePortType soapDet = detSecAluservice.getDetSecAluServiceHttpSoap11Endpoint();
			lista=soapDet.listaDetSecAluxAlumnos(cod);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	
	
	
	
	
	
	
}
