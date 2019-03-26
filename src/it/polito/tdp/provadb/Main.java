package it.polito.tdp.provadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.polito.tdp.provadb.db.DizionarioDAO;

public class Main {

	
	public void run() {

		String parola= "gatto";
		
		DizionarioDAO d = new DizionarioDAO();
		
		if (d.esisteParola(parola)) System.out.format("La parola %s esiste \n",parola);
		else System.out.format("La parola %s NON esiste", parola);
		
	}
	
	public static void main(String[] args) {

		Main test = new Main();
        test.run();
		
	}

}
