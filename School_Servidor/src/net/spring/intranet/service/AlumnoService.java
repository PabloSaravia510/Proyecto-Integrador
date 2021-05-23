package net.spring.intranet.service;

import java.util.List;

import net.spring.intranet.dao.AlumnoDao;
import net.spring.intranet.entidad.Estudiantes;

public class AlumnoService {

	AlumnoDao dao = new AlumnoDao();
	
	
	public int saveAlu(Estudiantes bean) {
		return dao.saveAlu(bean);
	}

	
	public int updateAlu(Estudiantes bean) {
		return dao.updateAlu(bean);
	}


	public int deleteAlu(int codigo) {
		return dao.deleteAlu(codigo);
	}

	
	public Estudiantes findAlu(int codigo) {
		return dao.findAlu(codigo);
	}

	
	public List<Estudiantes> listaEstudiantes() {
		return dao.listaEstudiantes();
	}

}
