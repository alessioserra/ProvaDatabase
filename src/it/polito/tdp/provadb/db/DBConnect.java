package it.polito.tdp.provadb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() {
		
		String url="jdbc:mysql://localhost/dizionario?useTimezone=true&serverTimezone=UTC&user=root&password=alessio";	
		Connection conn;	
		
		try {
			conn = DriverManager.getConnection(url);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
