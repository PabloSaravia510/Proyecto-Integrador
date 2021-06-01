package net.spring.intranet.entidad;

import java.io.Serializable;

public class Estudiantes implements Serializable{
	
	private int codigoAlu;
	private String nomAlu;
	private String apeAlu;
	private String usernameAlu;
	private String passAlu;	
	private int codCarreraAlu;
	private String DesCarreraAlu;
	private int edadAlu;
	private String celAlu;
	private String direcAlu;
	private int codRolAlu;
	private String DesRolAlu;
	private String estado;
	
	
	public int getCodigoAlu() {
		return codigoAlu;
	}
	public void setCodigoAlu(int codigoAlu) {
		this.codigoAlu = codigoAlu;
	}
	public String getNomAlu() {
		return nomAlu;
	}
	public void setNomAlu(String nomAlu) {
		this.nomAlu = nomAlu;
	}
	public String getApeAlu() {
		return apeAlu;
	}
	public void setApeAlu(String apeAlu) {
		this.apeAlu = apeAlu;
	}
	public String getUsernameAlu() {
		return usernameAlu;
	}
	public void setUsernameAlu(String usernameAlu) {
		this.usernameAlu = usernameAlu;
	}
	public String getPassAlu() {
		return passAlu;
	}
	public void setPassAlu(String passAlu) {
		this.passAlu = passAlu;
	}
	public int getEdadAlu() {
		return edadAlu;
	}
	public void setEdadAlu(int edadAlu) {
		this.edadAlu = edadAlu;
	}
	public String getCelAlu() {
		return celAlu;
	}
	public void setCelAlu(String celAlu) {
		this.celAlu = celAlu;
	}
	public String getDirecAlu() {
		return direcAlu;
	}
	public void setDirecAlu(String direcAlu) {
		this.direcAlu = direcAlu;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getCodRolAlu() {
		return codRolAlu;
	}
	public void setCodRolAlu(int codRolAlu) {
		this.codRolAlu = codRolAlu;
	}
	public int getCodCarreraAlu() {
		return codCarreraAlu;
	}
	public void setCodCarreraAlu(int codCarreraAlu) {
		this.codCarreraAlu = codCarreraAlu;
	}
	public String getDesCarreraAlu() {
		return DesCarreraAlu;
	}
	public void setDesCarreraAlu(String desCarreraAlu) {
		DesCarreraAlu = desCarreraAlu;
	}
	public String getDesRolAlu() {
		return DesRolAlu;
	}
	public void setDesRolAlu(String desRolAlu) {
		DesRolAlu = desRolAlu;
	}
	
	
	
	
	
	

}
