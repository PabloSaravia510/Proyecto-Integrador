package net.spring.intranet.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlDBConexion {
	public static Connection getConexion(){
		Connection cn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost/db_proyecto_dawii?serverTimezone=UTC","root","mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;	
	}
}

