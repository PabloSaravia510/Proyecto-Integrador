package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entidad.Seccion;


public interface ISeccionDao {

	
	public int saveSeccion(Seccion bean);
	public int updateSeccion(Seccion bean);
	public int deleteSeccion(int codigo);
	public Seccion findSeccion(int codigo);
	public List<Seccion> listaSecciones();
	
	
}
