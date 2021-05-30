package net.spring.intranet.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.spring.intranet.entidad.Docentes;
import net.spring.intranet.util.MysqlDBConexion;

public class DocentesDao implements IDocentesDao{

	@Override
	public int saveDocente(Docentes bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_saveDocente(?,?,?,?,?,?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setString(1,bean.getNomPro());
			cstm.setString(2,bean.getApePro());
			cstm.setString(3,bean.getUsernamePro());
			cstm.setString(4,bean.getPassPro());
			cstm.setInt(5, bean.getEdadPro());
			cstm.setString(6, bean.getCelPro());
			cstm.setString(7, bean.getDirecPro());
			cstm.setInt(8, bean.getCodRolPro());
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
	public int updateDocente(Docentes bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_updateDocente(?,?,?,?,?,?,?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1, bean.getCodigoPro());
			cstm.setString(2,bean.getNomPro());
			cstm.setString(3,bean.getApePro());
			cstm.setString(4,bean.getUsernamePro());
			cstm.setString(5,bean.getPassPro());
			cstm.setInt(6, bean.getEdadPro());
			cstm.setString(7, bean.getCelPro());
			cstm.setString(8, bean.getDirecPro());
			cstm.setInt(9, bean.getCodRolPro());
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
	public int deleteDocente(int codigo) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_deleteDocente(?)";
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
	public Docentes findDocente(int codigo) {
		Docentes bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_findDocente(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,codigo);
			rs=cstm.executeQuery();
			if(rs.next()) {
				bean=new Docentes();
				bean.setCodigoPro(rs.getInt(1));
				bean.setNomPro(rs.getString(2));
				bean.setApePro(rs.getString(3));
				bean.setUsernamePro(rs.getString(4));
				bean.setPassPro(rs.getString(5));
				bean.setEdadPro(rs.getInt(6));
				bean.setCelPro(rs.getString(7));
				bean.setDirecPro(rs.getString(8));
				bean.setCodRolPro(rs.getInt(9));
				bean.setDesRolPro(rs.getString(10));
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
	public List<Docentes> listaDocentes() {
		List<Docentes> lista=new ArrayList<Docentes>();
		Docentes bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_listarDocentes()";
			cstm=cn.prepareCall(sql);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new Docentes();
				bean.setCodigoPro(rs.getInt(1));
				bean.setNomPro(rs.getString(2));
				bean.setApePro(rs.getString(3));
				bean.setUsernamePro(rs.getString(4));
				bean.setPassPro(rs.getString(5));
				bean.setEdadPro(rs.getInt(6));
				bean.setCelPro(rs.getString(7));
				bean.setDirecPro(rs.getString(8));
				bean.setCodRolPro(rs.getInt(9));
				bean.setDesRolPro(rs.getString(10));
				bean.setEstado(rs.getString(11));
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
