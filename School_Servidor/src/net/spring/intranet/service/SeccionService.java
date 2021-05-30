package net.spring.intranet.service;

import java.util.List;

import net.spring.intranet.dao.SeccionDao;
import net.spring.intranet.entidad.Seccion;

public class SeccionService {

	SeccionDao dao = new SeccionDao();
	
	public int saveSeccion(Seccion bean) {
		return dao.saveSeccion(bean);
	}
	
	
	public int updateSeccion(Seccion bean) {
		return dao.updateSeccion(bean);
	}
	
	
	
	public int deleteSeccion(int codigo) {
		return dao.deleteSeccion(codigo);
	}
	
	
	
	public Seccion findSeccion(int codigo) {
		return dao.findSeccion(codigo);
	}
	
	
	public List<Seccion> listaSecciones() {
		return dao.listaSecciones();
	}
	
	
}
