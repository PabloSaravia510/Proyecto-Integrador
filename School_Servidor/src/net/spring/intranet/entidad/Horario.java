package net.spring.intranet.entidad;

import java.io.Serializable;

public class Horario  implements Serializable {

	private int cod_horario;
	private String des_horario;
	
	
	public int getCod_horario() {
		return cod_horario;
	}
	public void setCod_horario(int cod_horario) {
		this.cod_horario = cod_horario;
	}
	public String getDes_horario() {
		return des_horario;
	}
	public void setDes_horario(String des_horario) {
		this.des_horario = des_horario;
	}
	
	
	
	
}
