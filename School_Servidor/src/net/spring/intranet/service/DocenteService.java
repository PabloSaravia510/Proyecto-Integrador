package net.spring.intranet.service;

import java.util.List;

import net.spring.intranet.dao.DocentesDao;
import net.spring.intranet.entidad.Docentes;

public class DocenteService {

	DocentesDao dao = new DocentesDao();
	
	
	public int saveDocente(Docentes bean) {
		return dao.saveDocente(bean);
	}


	public int updateDocente(Docentes bean) {
		return dao.updateDocente(bean);
	}


	public int deleteDocente(int codigo) {
		return dao.deleteDocente(codigo);
	}

	
	public Docentes findDocente(int codigo) {
		return dao.findDocente(codigo);
	}


	public List<Docentes> listaDocentes() {
		return dao.listaDocentes();
	}

}
