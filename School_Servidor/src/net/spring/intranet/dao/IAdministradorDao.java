package net.spring.intranet.dao;

import net.spring.intranet.entidad.Administrador;

public interface IAdministradorDao {

	public Administrador iniciarSesion (String user, String pass);
	
}
