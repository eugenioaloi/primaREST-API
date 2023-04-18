package src.service;

import java.util.List;

import src.connessione.QueryDb;
import src.model.Utenti;

public class UtentiService {
	
	public List<Utenti> getUser(){
		
		return QueryDb.listaUtentiDB();
	}
}
