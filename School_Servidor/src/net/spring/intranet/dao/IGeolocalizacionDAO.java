package net.spring.intranet.dao;

import java.util.List;

import net.spring.intranet.entidad.Geolocalizacion;

public interface IGeolocalizacionDAO {
	public int saveGeo(Geolocalizacion bean);
	
	public int findGeo(int cod);
	
	public List<Geolocalizacion> listGeos();
}
