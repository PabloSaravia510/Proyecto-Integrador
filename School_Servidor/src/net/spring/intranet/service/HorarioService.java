package net.spring.intranet.service;

import java.util.List;

import net.spring.intranet.dao.HorarioDao;
import net.spring.intranet.entidad.Horario;

public class HorarioService {

	HorarioDao dao = new HorarioDao();
	
	
	
	public List<Horario> listaHorario() {
		return dao.listaHorario();
	}
	
	
	
	
	
}
