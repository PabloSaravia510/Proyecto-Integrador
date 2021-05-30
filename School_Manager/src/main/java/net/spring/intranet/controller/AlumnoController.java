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
import net.spring.intranet.entidad.Alumno.ObjectFactory;
import net.spring.intranet.entidad.Carrera.Carrera;

import net.spring.intranet.entidad.Rol.Rol;
import net.spring.intranet.servicio.Alumno.AlumnoService;
import net.spring.intranet.servicio.Alumno.AlumnoServicePortType;
import net.spring.intranet.servicio.Carrera.CarreraService;
import net.spring.intranet.servicio.Carrera.CarreraServicePortType;
import net.spring.intranet.servicio.Rol.RolService;
import net.spring.intranet.servicio.Rol.RolServicePortType;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	
	private AlumnoService alumnoservice;
	private RolService rolservice;
	private CarreraService carreraservice;

	public AlumnoController(){
		alumnoservice= new AlumnoService();
		rolservice = new RolService();
		carreraservice = new CarreraService();
	}
	
	
	
	
	@RequestMapping("/")
	public String ListaAlumnos(Model model) {

		try {
			AlumnoServicePortType soapAlu = alumnoservice.getAlumnoServiceHttpSoap11Endpoint();
			List<Estudiantes> listaAlumnos = soapAlu.listaEstudiantes();
			
			RolServicePortType soapRol = rolservice.getRolServiceHttpSoap11Endpoint();
			List<Rol> listaRoles = soapRol.listaRoles();
			
			CarreraServicePortType soapCarrera = carreraservice.getCarreraServiceHttpSoap11Endpoint();
			List<Carrera> listaCarrera = soapCarrera.listaCarreras();
			
			model.addAttribute("alumnos",listaAlumnos);
			model.addAttribute("roles",listaRoles);
			model.addAttribute("carreras",listaCarrera);
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "Alumno";
	}
	
	
	
	
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("codigo") int cod, RedirectAttributes redirect) {

		try {
			AlumnoServicePortType soap = alumnoservice.getAlumnoServiceHttpSoap11Endpoint();
			soap.deleteAlu(cod);
			redirect.addFlashAttribute("MENSAJE","ALUMNO ELIMINADO");
			
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","ERROR AL ELIMINAR UN ALUMNO");
			e.printStackTrace();
		}
		
		return "redirect:/alumno/";
	}
	
	
	
	
	
	@RequestMapping("/guardar")
	public String guardar(@RequestParam("codigo") int cod,
						  @RequestParam("nombre")  String nom,
						  @RequestParam("apellido")  String ape,
						  @RequestParam("username")  String user,
						  @RequestParam("password")  String pass,
						  @RequestParam("carrera")  int car,
						  @RequestParam("edad")  int edad,
						  @RequestParam("celular")  String cel,
						  @RequestParam("direccion")  String dir,
						  @RequestParam("rol")  int rol,
						  @RequestParam("estado")  String est,
						RedirectAttributes redirect) {
		
		try {
			AlumnoServicePortType soap = alumnoservice.getAlumnoServiceHttpSoap11Endpoint();
			Estudiantes bean = new Estudiantes();

			bean.setCodCarreraAlu(car);
			bean.setCodigoAlu(cod);
			bean.setEdadAlu(edad);
			bean.setCodRolAlu(rol);
			
			
			ObjectFactory factory = new ObjectFactory();
			
			JAXBElement<String> xNom,xApe,xUsu,xPass,xCel,xDir,xEst;
			
			xNom = factory.createEstudiantesNomAlu(nom);
			xApe = factory.createEstudiantesApeAlu(ape);
			xUsu = factory.createEstudiantesUsernameAlu(user);
			xPass = factory.createEstudiantesPassAlu(pass);
			xCel = factory.createEstudiantesCelAlu(cel);
			xDir = factory.createEstudiantesDirecAlu(dir);
			xEst = factory.createEstudiantesEstado(est);
			
			
			bean.setNomAlu(xNom);
			bean.setApeAlu(xApe);
			bean.setUsernameAlu(xUsu);
			bean.setPassAlu(xPass);
			bean.setCelAlu(xCel);
			bean.setDirecAlu(xDir);
			bean.setEstado(xEst);
			
			
			if (cod == 0) {
				int salida; 
				salida = soap.saveAlu(bean);
				if(salida > 0) {
					redirect.addFlashAttribute("MENSAJE","ALUMNO REGISTRADO");
				}else {
					redirect.addFlashAttribute("MENSAJE","ERROR EN EL REGISTRO");
				}
			}else {
				int salida; 
				salida = soap.updateAlu(bean);
				if(salida > 0) {
					redirect.addFlashAttribute("MENSAJE","ALUMNO ACTUALIZADO");
				}else {
					redirect.addFlashAttribute("MENSAJE","ERROR AL ACTUALIZAR");
				}
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return "redirect:/alumno/";
	
	
	}
	
	
	

	@RequestMapping("/buscar")
	@ResponseBody 
	public Estudiantes buscar(@RequestParam("codigo") int cod) {
		Estudiantes bean = null;
		try {
			AlumnoServicePortType soap = alumnoservice.getAlumnoServiceHttpSoap11Endpoint();
			bean = soap.findAlu(cod);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			return bean;
	}
	
	
	
	
	
	
	
}
