package src.connessione;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import src.model.Utenti;

public class QueryDb  {
	
	public static List<Utenti> listaUtentiDB() {
		
		List<Utenti> utenti = new ArrayList<>();
		
		String query = "select * from utenti";
		
		try {
			ResultSet rs = Connesione.connettiDb(query);
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String email = rs.getString("email");
				utenti.add(new Utenti(id, nome, cognome, email));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return utenti;
	}
	
}
