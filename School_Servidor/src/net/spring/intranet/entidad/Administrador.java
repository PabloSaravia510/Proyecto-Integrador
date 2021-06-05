package net.spring.intranet.entidad;

import java.io.Serializable;

public class Administrador  implements Serializable {

	
	
	private int codigoAdministrador;
	
	private String nombreAdministrador;
	
	private String apellidoAdministrador;
	
	private String usuAdministrador;
	
	private String passAdministrador;
	
	private int codRolAdministrador;
	
	private String desRolAdministrador;
	
	private String estadoRegistro;

	
	
	
	
	public int getCodigoAdministrador() {
		return codigoAdministrador;
	}

	public void setCodigoAdministrador(int codigoAdministrador) {
		this.codigoAdministrador = codigoAdministrador;
	}

	public String getNombreAdministrador() {
		return nombreAdministrador;
	}

	public void setNombreAdministrador(String nombreAdministrador) {
		this.nombreAdministrador = nombreAdministrador;
	}

	public String getApellidoAdministrador() {
		return apellidoAdministrador;
	}

	public void setApellidoAdministrador(String apellidoAdministrador) {
		this.apellidoAdministrador = apellidoAdministrador;
	}

	public String getUsuAdministrador() {
		return usuAdministrador;
	}

	public void setUsuAdministrador(String usuAdministrador) {
		this.usuAdministrador = usuAdministrador;
	}

	public String getPassAdministrador() {
		return passAdministrador;
	}

	public void setPassAdministrador(String passAdministrador) {
		this.passAdministrador = passAdministrador;
	}

	public int getCodRolAdministrador() {
		return codRolAdministrador;
	}

	public void setCodRolAdministrador(int codRolAdministrador) {
		this.codRolAdministrador = codRolAdministrador;
	}

	public String getDesRolAdministrador() {
		return desRolAdministrador;
	}

	public void setDesRolAdministrador(String desRolAdministrador) {
		this.desRolAdministrador = desRolAdministrador;
	}

	public String getEstadoRegistro() {
		return estadoRegistro;
	}

	public void setEstadoRegistro(String estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	
	
	
	
	
	
	
	
	
	
}
