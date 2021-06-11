package net.spring.intranet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import net.spring.intranet.entidad.Administrador.Administrador;
import net.spring.intranet.servicio.Administrador.AdministradorService;
import net.spring.intranet.servicio.Administrador.AdministradorServicePortType;



@Controller
@RequestMapping("/login")
public class AdministradorController {

	
	private AdministradorService administradorservice;
	
	public AdministradorController() {
		administradorservice = new AdministradorService();
	}
	
	
	@RequestMapping(value = "/")
	public String administrador(Model m) {
			
			
			m.addAttribute("adminObj",new Administrador());
		
			return "login";
				
		}
	
	
	@RequestMapping("/ingresar")
	public String buscar(@RequestParam("usu") String usu,@RequestParam("pass") String pass) {
		AdministradorServicePortType soap = administradorservice.getAdministradorServiceHttpSoap11Endpoint();
			soap.iniciarSesion(usu, pass);

			 return "redirect:/principal/";
	
	
		
	

	
	} 
	
		


}
	
	
	
	
	

