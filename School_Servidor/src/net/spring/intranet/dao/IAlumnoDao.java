package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entidad.Estudiantes;

public interface IAlumnoDao {

	public int saveAlu(Estudiantes bean);
	public int updateAlu(Estudiantes bean);
	public int deleteAlu(int codigo);
	public Estudiantes findAlu(int codigo);
	public List<Estudiantes> listaEstudiantes();
	
	public List<Estudiantes>listaEstudiantesXCarrera(int cod);
}
