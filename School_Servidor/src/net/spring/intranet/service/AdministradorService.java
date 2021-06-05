package net.spring.intranet.service;

import net.spring.intranet.dao.AdministradorDao;
import net.spring.intranet.entidad.Administrador;

public class AdministradorService {

	AdministradorDao dao = new AdministradorDao();
	
	
	public Administrador iniciarSesion(String user, String pass) {
		return dao.iniciarSesion(user, pass);
	}
	
	
}
