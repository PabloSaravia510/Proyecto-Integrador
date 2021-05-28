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
import net.spring.intranet.entidad.Docente.ObjectFactory;
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
	
	
	
	
	@RequestMapping("/guardar")
	public String guardar(@RequestParam("codigo") int cod,
						  @RequestParam("nombre")  String nom,
						  @RequestParam("apellido")  String ape,
						  @RequestParam("username")  String user,
						  @RequestParam("password")  String pass,
						  @RequestParam("edad")  int edad,
						  @RequestParam("celular")  String cel,
						  @RequestParam("direccion")  String dir,
						  @RequestParam("rol")  int rol,
						  @RequestParam("estado")  String est,
						RedirectAttributes redirect) {
		
		try {
			DocenteServicePortType soap = docenteservice.getDocenteServiceHttpSoap11Endpoint();
			
			Docentes bean = new Docentes();
			
			bean.setCodigoPro(cod);
			bean.setEdadPro(edad);
			bean.setCodRolPro(rol);
			
			
			ObjectFactory factory = new ObjectFactory();
			
			JAXBElement<String> xNom,xApe,xUsu,xPass,xCel,xDir,xEst;
			
			xNom = factory.createDocentesNomPro(nom);
			xApe = factory.createDocentesApePro(ape);
			xUsu = factory.createDocentesUsernamePro(user);
			xPass = factory.createDocentesPassPro(pass);
			xCel = factory.createDocentesCelPro(cel);
			xDir = factory.createDocentesDirecPro(dir);
			xEst = factory.createDocentesEstado(est);
			
			
			bean.setNomPro(xNom);
			bean.setApePro(xApe);
			bean.setUsernamePro(xUsu);
			bean.setPassPro(xPass);
			bean.setCelPro(xCel);
			bean.setDirecPro(xDir);
			bean.setEstado(xEst);
			
			
			if (cod == 0) {
				int salida; 
				salida = soap.saveDocente(bean);
				if(salida > 0) {
					redirect.addFlashAttribute("MENSAJE","DOCENTE REGISTRADO");
				}else {
					redirect.addFlashAttribute("MENSAJE","ERROR EN EL REGISTRO");
				}
			}else {
				int salida; 
				salida = soap.updateDocente(bean);
				if(salida > 0) {
					redirect.addFlashAttribute("MENSAJE","DOCENTE ACTUALIZADO");
				}else {
					redirect.addFlashAttribute("MENSAJE","ERROR AL ACTUALIZAR");
				}
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return "redirect:/docente/";
	
	
	}
	
	
	
	
	
	
	

	@RequestMapping("/buscar")
	@ResponseBody //devolver json
	public Docentes buscar(@RequestParam("codigo") int cod) {
		Docentes bean = null;
		try {
			DocenteServicePortType soap = docenteservice.getDocenteServiceHttpSoap11Endpoint();
			bean = soap.findDocente(cod);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			return bean;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
