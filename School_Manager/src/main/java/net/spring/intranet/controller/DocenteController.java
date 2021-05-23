package net.spring.intranet.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.spring.intranet.entidad.Docente.Docentes;
import net.spring.intranet.entidad.Rol.Rol;
import net.spring.intranet.servicio.Docente.DocenteService;
import net.spring.intranet.servicio.Docente.DocenteServicePortType;
import net.spring.intranet.servicio.Rol.RolService;
import net.spring.intranet.servicio.Rol.RolServicePortType;

@Controller
@RequestMapping("/docente")
public class DocenteController {

	
	private DocenteService docenteservice;
	private RolService rolservice;

	public DocenteController(){
		docenteservice= new DocenteService();
		rolservice = new RolService();
	
	}
	
	
	
	
	@RequestMapping("/")
	public String ListaDocentes(Model model) {

		try {
			DocenteServicePortType soapDoc = docenteservice.getDocenteServiceHttpSoap11Endpoint();
			List<Docentes> listaDocente = soapDoc.listaDocentes();
			
			RolServicePortType soapRol = rolservice.getRolServiceHttpSoap11Endpoint();
			List<Rol> listaRoles = soapRol.listaRoles();
			
			model.addAttribute("docentes",listaDocente);
			model.addAttribute("roles",listaRoles);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "docente";
	}
	
	
	
	
	
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("codigo") int cod, RedirectAttributes redirect) {

		try {
			DocenteServicePortType soap = docenteservice.getDocenteServiceHttpSoap11Endpoint();
			soap.deleteDocente(cod);
			redirect.addFlashAttribute("MENSAJE","DOCENTE ELIMINADO");
			
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE","ERROR AL ELIMINAR UN DOCENTE");
			e.printStackTrace();
		}
		
		return "redirect:/docente/";
	}
	
	
	
	
	
	
	
	
	
}
