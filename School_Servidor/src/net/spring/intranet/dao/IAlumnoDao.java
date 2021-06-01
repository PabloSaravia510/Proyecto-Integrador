package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entidad.Estudiantes;

public interface IAlumnoDao {

	public int saveAlu(Estudiantes bean);
	public int updateAlu(Estudiantes bean);
	public int deleteAlu(int codigo);
	public Estudiantes findAlu(int codigo);
	public List<Estudiantes> listaEstudiantes();
	public Estudiantes iniciarSesion (String user, String pass, int codRol);
//	segun metodo jquery, con regex definirá un codrol y este se insertará en el metodo
}
