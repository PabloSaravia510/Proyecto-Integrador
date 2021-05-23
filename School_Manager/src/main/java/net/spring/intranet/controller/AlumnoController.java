package net.spring.intranet.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.spring.intranet.entidad.Alumno.Estudiantes;
import net.spring.intranet.entidad.Carrera.Carrera;
import net.spring.intranet.entidad.Rol.Rol;
import net.spring.intranet.servicio.Alumno.AlumnoService;
import net.spring.intranet.servicio.Alumno.AlumnoServicePortType;
import net.spring.intranet.servicio.Carrera.CarreraService;
import net.spring.intranet.servicio.Carrera.CarreraServicePortType;
import net.spring.intranet.servicio.Docente.DocenteServicePortType;
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
	
	
	
	
	
	
	
	
	
	
	
}
