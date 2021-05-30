package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entidad.Docentes;

public interface IDocentesDao {

	public int saveDocente(Docentes bean);
	public int updateDocente(Docentes bean);
	public int deleteDocente(int codigo);
	public Docentes findDocente(int codigo);
	public List<Docentes> listaDocentes();
	
}
