package net.spring.intranet.entidad;

import java.io.Serializable;

public class Rol implements Serializable{

	private int codigoRol;
	private String desRol;
	
	public int getCodigoRol() {
		return codigoRol;
	}
	public void setCodigoRol(int codigoRol) {
		this.codigoRol = codigoRol;
	}
	public String getDesRol() {
		return desRol;
	}
	public void setDesRol(String desRol) {
		this.desRol = desRol;
	}
	
	
	
	
}
