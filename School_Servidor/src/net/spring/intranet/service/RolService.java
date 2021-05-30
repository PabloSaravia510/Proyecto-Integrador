package net.spring.intranet.service;

import java.util.List;

import net.spring.intranet.dao.RolDao;
import net.spring.intranet.entidad.Rol;

public class RolService {

	RolDao dao = new RolDao();
	

	public List<Rol> listaRoles() {
		return dao.listaRoles();
	}

}
