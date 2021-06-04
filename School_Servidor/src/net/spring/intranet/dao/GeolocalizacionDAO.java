package net.spring.intranet.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.spring.intranet.entidad.Geolocalizacion;
import net.spring.intranet.util.MysqlDBConexion;

public class GeolocalizacionDAO implements IGeolocalizacionDAO{

	@Override
	public int saveGeo(Geolocalizacion bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_saveGeo(?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setString(1,bean.getCoordenadasGeolocalizacion());
			cstm.setInt(2,bean.getCodigoAlumno());
			estado=cstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	@Override
	public int findGeo(int cod) {
		int resultado = 0;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_findAlu(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,cod);
			rs=cstm.executeQuery();
			if(rs.next()) {
				resultado = 1;
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
		return resultado;
	}

	@Override
	public List<Geolocalizacion> listGeos() {
		List<Geolocalizacion> lista=new ArrayList<Geolocalizacion>();
		Geolocalizacion bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_listGeos()";
			cstm=cn.prepareCall(sql);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Geolocalizacion();
				bean.getCodigoGeolocalizacion();
				bean.getCoordenadasGeolocalizacion();
				bean.getCodigoAlumno();
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
