package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entidad.Administrador;

public interface IAdministradorDAO {
	public Administrador iniciarSesion (String user, String pass, int codRol);
//	segun metodo jquery, con regex definirá un codrol y este se insertará en el metodo
}
