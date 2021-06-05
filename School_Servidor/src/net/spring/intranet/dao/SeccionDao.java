package net.spring.intranet.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.spring.intranet.entidad.Seccion;
import net.spring.intranet.util.MysqlDBConexion;

public class SeccionDao implements ISeccionDao{

	@Override
	public int saveSeccion(Seccion bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_saveSeccion(?,?,?,?,?,?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setString(1,bean.getDes_sec());
			cstm.setString(2,bean.getDes_curso());
			cstm.setInt(3,bean.getNota1());
			cstm.setInt(4,bean.getNota2());
			cstm.setInt(5, bean.getCod_pro());
			cstm.setInt(6, bean.getCodigo_horario());
			cstm.setInt(7, bean.getLfal_sec());
			cstm.setInt(8, bean.getLcla_sec());
			cstm.setString(9, bean.getEstado());
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
	public int updateSeccion(Seccion bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_updateSeccion(?,?,?,?,?,?,?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,bean.getCod_sec());
			cstm.setString(2,bean.getDes_sec());
			cstm.setString(3,bean.getDes_curso());
			cstm.setInt(4,bean.getNota1());
			cstm.setInt(5,bean.getNota2());
			cstm.setInt(6, bean.getCod_pro());
			cstm.setInt(7, bean.getCodigo_horario());
			cstm.setInt(8, bean.getLfal_sec());
			cstm.setInt(9, bean.getLcla_sec());
			cstm.setString(10, bean.getEstado());
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
	public int deleteSeccion(int codigo) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_deleteSeccion(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,codigo);
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
	public Seccion findSeccion(int codigo) {
		Seccion bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_findSeccion(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,codigo);
			rs=cstm.executeQuery();
			if(rs.next()) {
				bean=new Seccion();
				bean.setCod_sec(rs.getInt(1));
				bean.setDes_sec(rs.getString(2));
				bean.setDes_curso(rs.getString(3));
				bean.setNota1(rs.getInt(4));
				bean.setNota2(rs.getInt(5));
				bean.setCod_pro(rs.getInt(6));
				bean.setCodigo_horario(rs.getInt(7));
				bean.setLfal_sec(rs.getInt(8));
				bean.setLcla_sec(rs.getInt(9));
				bean.setEstado(rs.getString(10));
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
		return bean;
	}

	@Override
	public List<Seccion> listaSecciones() {
		List<Seccion> lista=new ArrayList<Seccion>();
		Seccion bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_listarSeccion()";
			cstm=cn.prepareCall(sql);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Seccion();
				bean.setCod_sec(rs.getInt(1));
				bean.setDes_sec(rs.getString(2));
				bean.setDes_curso(rs.getString(3));
				bean.setNota1(rs.getInt(4));
				bean.setNota2(rs.getInt(5));
				bean.setCod_pro(rs.getInt(6));
				bean.setDes_pro(rs.getString(7));
				bean.setCodigo_horario(rs.getInt(8));
				bean.setHorario(rs.getString(9));
				bean.setLfal_sec(rs.getInt(10));
				bean.setLcla_sec(rs.getInt(11));
				bean.setEstado(rs.getString(12));
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

	@Override
	public List<Seccion> listaSeccionesxProfesores(int cod) {
		List<Seccion> lista=new ArrayList<Seccion>();
		Seccion bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_listarSeccionxProfesor(?)";
			cstm=cn.prepareCall(sql);
			cstm.setDouble(1,cod);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Seccion();
				bean.setCod_sec(rs.getInt(1));
				bean.setDes_sec(rs.getString(2));
				bean.setDes_curso(rs.getString(3));
				bean.setNota1(rs.getInt(4));
				bean.setNota2(rs.getInt(5));
				bean.setCod_pro(rs.getInt(6));
				bean.setDes_pro(rs.getString(7));
				bean.setCodigo_horario(rs.getInt(8));
				bean.setHorario(rs.getString(9));
				bean.setLfal_sec(rs.getInt(10));
				bean.setLcla_sec(rs.getInt(11));
				bean.setEstado(rs.getString(12));
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
