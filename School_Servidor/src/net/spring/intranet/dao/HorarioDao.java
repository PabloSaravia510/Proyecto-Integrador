package net.spring.intranet.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.spring.intranet.entidad.Horario;
import net.spring.intranet.util.MysqlDBConexion;

public class HorarioDao implements IHorarioDao{

	@Override
	public List<Horario> listaHorario() {
		List<Horario> lista=new ArrayList<Horario>();
		Horario bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_listarHorario()";
			cstm=cn.prepareCall(sql);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Horario();
				bean.setCod_horario(rs.getInt(1));
				bean.setDes_horario(rs.getString(2));
				lista.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(rs!=null) rs.close();
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}

}
