package net.spring.intranet.entidad;

import java.io.Serializable;

public class Carrera implements Serializable{

	private int codigoCarrera;
	private String desCarrera;
	private String estado;
	
	public int getCodigoCarrera() {
		return codigoCarrera;
	}
	public void setCodigoCarrera(int codigoCarrera) {
		this.codigoCarrera = codigoCarrera;
	}
	public String getDesCarrera() {
		return desCarrera;
	}
	public void setDesCarrera(String desCarrera) {
		this.desCarrera = desCarrera;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
	
}
