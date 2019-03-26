package it.polito.tdp.provadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	
	public void run() {

		//Stringa per accedere alla connesione (Stringa corretto per il fuso orario)
		String jdbUrl = "jdbc:mysql://localhost/dizionario?useTimezone=true&serverTimezone=UTC&user=root&password=alessio";
		
		try {
			Connection conn = DriverManager.getConnection(jdbUrl);
			
			//E' il veicolo di trasporto
			Statement st = conn.createStatement();
			
			//Scrivo Query
			String sql = "SELECT * FROM parola " + 
					     "WHERE nome LIKE 'Z%' ";
			
			//Eseguo query
			ResultSet rs = st.executeQuery(sql);
			
			while ( rs.next() ) {
				
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				
				System.out.println(id + " " + nome);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("Connesione fallita!");
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {

		Main test = new Main();
        test.run();
		
	}

}
