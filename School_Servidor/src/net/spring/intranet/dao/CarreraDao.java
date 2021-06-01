package net.spring.intranet.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.spring.intranet.entidad.Carrera;
import net.spring.intranet.util.MysqlDBConexion;

public class CarreraDao implements ICarreraDao {

	@Override
	public List<Carrera> listaCarreras() {
		List<Carrera> lista=new ArrayList<Carrera>();
		Carrera bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_listarCarrera()";
			cstm=cn.prepareCall(sql);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Carrera();
				bean.setCodigoCarrera(rs.getInt(1));
				bean.setDesCarrera(rs.getString(2));
				bean.setEstado(rs.getString(3));
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
