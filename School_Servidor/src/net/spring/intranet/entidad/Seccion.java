package net.spring.intranet.entidad;

import java.io.Serializable;

public class Seccion implements Serializable{

	
	private int cod_sec;
	private String des_sec;
	private String des_curso;
	private int nota1;
	private int nota2;
	
	private int cod_pro;
	private String des_pro;
	
	private int codigo_horario;
	private String horario;
	
	private int lfal_sec;
	private int lcla_sec;
	private String estado;
	
	
	
	
	
	public int getCod_sec() {
		return cod_sec;
	}
	public void setCod_sec(int cod_sec) {
		this.cod_sec = cod_sec;
	}
	public String getDes_sec() {
		return des_sec;
	}
	public void setDes_sec(String des_sec) {
		this.des_sec = des_sec;
	}
	public String getDes_curso() {
		return des_curso;
	}
	public void setDes_curso(String des_curso) {
		this.des_curso = des_curso;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getCod_pro() {
		return cod_pro;
	}
	public void setCod_pro(int cod_pro) {
		this.cod_pro = cod_pro;
	}
	public String getDes_pro() {
		return des_pro;
	}
	public void setDes_pro(String des_pro) {
		this.des_pro = des_pro;
	}
	public int getCodigo_horario() {
		return codigo_horario;
	}
	public void setCodigo_horario(int codigo_horario) {
		this.codigo_horario = codigo_horario;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getLfal_sec() {
		return lfal_sec;
	}
	public void setLfal_sec(int lfal_sec) {
		this.lfal_sec = lfal_sec;
	}
	public int getLcla_sec() {
		return lcla_sec;
	}
	public void setLcla_sec(int lcla_sec) {
		this.lcla_sec = lcla_sec;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
	
}
