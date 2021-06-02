package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entidad.Docentes;

public interface IDocentesDao {

	public int saveDocente(Docentes bean);
	public int updateDocente(Docentes bean);
	public int deleteDocente(int codigo);
	public Docentes findDocente(int codigo);
	public List<Docentes> listaDocentes();
	public Docentes iniciarSesion (String user, String pass, int codRol);
//	segun metodo jquery, con regex definirá un codrol y este se insertará en el metodo
}
