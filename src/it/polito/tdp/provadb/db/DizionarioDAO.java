package it.polito.tdp.provadb.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import it.polito.tdp.privadb.model.*;

public class DizionarioDAO {
	
	
	public boolean esisteParola(String nome) {

		try {
			Connection conn = DBConnect.getConnection();
			
			String sql = "SELECT id, nome FROM parola WHERE nome = ?";
			
			//Veicolo di trasporto quando si usano variabili
			PreparedStatement st = conn.prepareStatement(sql);
			
			//Setto la variabile "?" all'interno della Query
			st.setString(1, nome);
			
			//Eseguo query
			ResultSet rs = st.executeQuery();
			
			boolean result ;
			
			if (rs.next()) {
				result = true;
			} else {
				result = false;
			}
			conn.close();
			return result;
			
			} catch (SQLException e) {
				System.out.println("ERRORE SQL!");
			}

		return false;
	}
	
	public List<Parola> listAll(){
		
		return null;
	}
	
	public void creaParola(Parola nuova) {
		
	}

}
