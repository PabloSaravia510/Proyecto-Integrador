package net.spring.intranet.service;

import java.util.List;

import net.spring.intranet.dao.CarreraDao;
import net.spring.intranet.entidad.Carrera;

public class CarreraService {

	CarreraDao dao = new CarreraDao();

	
	public List<Carrera> listaCarreras() {
		return dao.listaCarreras();
	}

}
