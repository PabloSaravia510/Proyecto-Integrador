package net.spring.intranet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.spring.intranet.entidad.Administrador.Administrador;
import net.spring.intranet.entidad.Alumno.Estudiantes;
import net.spring.intranet.entidad.Docente.Docentes;
import net.spring.intranet.servicio.Administrador.AdministradorService;
import net.spring.intranet.servicio.Administrador.AdministradorServicePortType;
import net.spring.intranet.servicio.Alumno.AlumnoService;
import net.spring.intranet.servicio.Alumno.AlumnoServicePortType;
import net.spring.intranet.servicio.Docente.DocenteService;
import net.spring.intranet.servicio.Docente.DocenteServicePortType;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	private AlumnoService alumnoservice;
	private DocenteService docenteService;
	private AdministradorService administradorService;
//	private RolService rolservice;
	
	public LoginController() {
		alumnoservice = new AlumnoService();
		docenteService = new DocenteService();
		administradorService = new AdministradorService();
//		rolservice = new RolService();
	}
	
	@RequestMapping(value = "/")
	public String login() {
			
			
//			m.addAttribute("adminObj",new Administrador());
	
			
			return "loginV2";
				
		}
	
	@RequestMapping("/ingresar")
	public String buscar(@RequestParam("usu") String usu,@RequestParam("pass") String pass, RedirectAttributes redirect) {
		if(usu.substring(0,1).equals("s")) {
			int rol = 0;
			AdministradorServicePortType soapAdmin = administradorService.getAdministradorServiceHttpSoap11Endpoint();
			
			Administrador admin = soapAdmin.iniciarSesion(usu, pass, rol);
			
			if(admin.getCodigoAdministrador() != null) 
				return "redirect:/principal/";				
			else {
				redirect.addFlashAttribute("MENSAJE","USUARIO Y/O CONTRASEÑA INCORRECTA");
				return "loginV2";				
			}
			
		}
 		else if (usu.substring(0,1).equals("p")) {
 			int rol = 1;
 			DocenteServicePortType soapDoc = docenteService.getDocenteServiceHttpSoap11Endpoint();
 			
 			Docentes doce = soapDoc.iniciarSesion(usu, pass, rol);
 			
 			if(doce.getCodigoPro() != null) 
				return "redirect:/principal/";				
			else {
				redirect.addFlashAttribute("MENSAJE","USUARIO Y/O CONTRASEÑA INCORRECTA");
				return "loginV2";				
			}
 		}
 		else if (usu.substring(0,1).equals("a")) {
 			int rol = 2;
 			AlumnoServicePortType soapAlu = alumnoservice.getAlumnoServiceHttpSoap11Endpoint();
 			
 			Estudiantes alu = soapAlu.iniciarSesionAlu(usu, pass, rol);
 			
 			if(alu.getCodigoAlu() != null) 
				return "redirect:/principal/";				
			else {
				redirect.addFlashAttribute("MENSAJE","USUARIO Y/O CONTRASEÑA INCORRECTA");
				return "loginV2";				
			}
 		}
 		else {
 			redirect.addFlashAttribute("MENSAJE","USUARIO Y/O CONTRASEÑA INCORRECTA");
 			return "loginV2";
 		}
	} 

}
