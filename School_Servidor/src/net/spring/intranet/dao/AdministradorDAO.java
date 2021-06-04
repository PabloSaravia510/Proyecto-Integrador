package net.spring.intranet.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import net.spring.intranet.entidad.Administrador;
import net.spring.intranet.util.MysqlDBConexion;

public class AdministradorDAO implements IAdministradorDAO{

	
	@Override
	public Administrador iniciarSesion(String user, String pass, int codRol) {
		Administrador bean=null;
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
				bean=new Administrador();
				bean.setNombreAdministrador(rs.getString(1));
				bean.setApellidoAdministrador(rs.getString(2));
				bean.setDesRolAdministrador(rs.getString(3));
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
