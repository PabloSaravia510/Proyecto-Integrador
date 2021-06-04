package net.spring.intranet.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.spring.intranet.entidad.Estudiantes;
import net.spring.intranet.util.MysqlDBConexion;

public class AlumnoDao implements IAlumnoDao{

	@Override
	public int saveAlu(Estudiantes bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_saveAlu(?,?,?,?,?,?,?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setString(1,bean.getNomAlu());
			cstm.setString(2,bean.getApeAlu());
			cstm.setString(3,bean.getUsernameAlu());
			cstm.setString(4,bean.getPassAlu());
			cstm.setInt(5, bean.getCodCarreraAlu());
			cstm.setInt(6, bean.getEdadAlu());
			cstm.setString(7, bean.getCelAlu());
			cstm.setString(8, bean.getDirecAlu());
			cstm.setInt(9, bean.getCodRolAlu());
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
	public int updateAlu(Estudiantes bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_updateAlu(?,?,?,?,?,?,?,?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1, bean.getCodigoAlu());
			cstm.setString(2,bean.getNomAlu());
			cstm.setString(3,bean.getApeAlu());
			cstm.setString(4,bean.getUsernameAlu());
			cstm.setString(5,bean.getPassAlu());
			cstm.setInt(6, bean.getCodCarreraAlu());
			cstm.setInt(7, bean.getEdadAlu());
			cstm.setString(8, bean.getCelAlu());
			cstm.setString(9, bean.getDirecAlu());
			cstm.setInt(10, bean.getCodRolAlu());
			cstm.setString(11, bean.getEstado());
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
	public int deleteAlu(int codigo) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_deleteAlu(?)";
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
	public Estudiantes findAlu(int codigo) {
		Estudiantes bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_findAlu(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,codigo);
			rs=cstm.executeQuery();
			if(rs.next()) {
				bean=new Estudiantes();
				bean.setCodigoAlu(rs.getInt(1));
				bean.setNomAlu(rs.getString(2));
				bean.setApeAlu(rs.getString(3));
				bean.setUsernameAlu(rs.getString(4));
				bean.setPassAlu(rs.getString(5));
				bean.setCodCarreraAlu(rs.getInt(6));
				bean.setEdadAlu(rs.getInt(7));
				bean.setCelAlu(rs.getString(8));
				bean.setDirecAlu(rs.getString(9));
				bean.setCodRolAlu(rs.getInt(10));
				bean.setEstado(rs.getString(11));
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
	public List<Estudiantes> listaEstudiantes() {
		List<Estudiantes> lista=new ArrayList<Estudiantes>();
		Estudiantes bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_listarAlu()";
			cstm=cn.prepareCall(sql);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Estudiantes();
				bean.setCodigoAlu(rs.getInt(1));
				bean.setNomAlu(rs.getString(2));
				bean.setApeAlu(rs.getString(3));
				bean.setUsernameAlu(rs.getString(4));
				bean.setPassAlu(rs.getString(5));
				bean.setCodCarreraAlu(rs.getInt(6));
				bean.setDesCarreraAlu(rs.getString(7));
				bean.setEdadAlu(rs.getInt(8));
				bean.setCelAlu(rs.getString(9));
				bean.setDirecAlu(rs.getString(10));
				bean.setCodRolAlu(rs.getInt(11));
				bean.setDesRolAlu(rs.getString(12));
				bean.setEstado(rs.getString(13));
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
	public Estudiantes iniciarSesion(String user, String pass, int codRol) {
		Estudiantes bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_InicioSesion(?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setString(1, user);
			cstm.setString(2, pass);
			cstm.setInt(3, codRol);
			rs=cstm.executeQuery();
			if(rs.next()) {
				bean=new Estudiantes();
//				bean.setCodigoAlu(rs.getInt(1));
				bean.setNomAlu(rs.getString(1));
				bean.setApeAlu(rs.getString(2));
				bean.setDesRolAlu(rs.getString(3));
//				bean.setUsernameAlu(rs.getString(4));
//				bean.setPassAlu(rs.getString(5));
//				bean.setCodCarreraAlu(rs.getInt(6));
//				bean.setEdadAlu(rs.getInt(7));
//				bean.setCelAlu(rs.getString(8));
//				bean.setDirecAlu(rs.getString(9));
//				bean.setCodRolAlu(rs.getInt(10));
//				bean.setEstado(rs.getString(11));
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

}
