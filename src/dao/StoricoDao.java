package dao;

import java.util.ArrayList;

import function.Read;
import model.Impiegato;
import model.Storico;

public class StoricoDao {
	private ArrayList<Storico> list_storico = new ArrayList<Storico>();
	
	public boolean creaStorico(Storico storico) {
		return list_storico.add(storico);
	}
	
	public Storico leggiStorico(int id) {
		for(Storico s:list_storico) {
			if (s.getId_ruolo()==id) {
				return s;
			}
		}
		return null;
	}
	
	public boolean modificaStorico(int id,String data_fine) {
		for(Storico s:list_storico) {
			if (s.getId_ruolo()==id) {
				s.setId_ruolo(id);
				s.setData_fine(data_fine);
				return true;
			}
		}
	return false;
	}

	public Storico rimuoviStorico(int id) {
		return list_storico.remove(id);
	}	
	
	public static ArrayList<Storico> ottieniImpiegati(){
		return Read.ottieniStorico();
	}
	
	public static Storico cercaStoricoDataInizio(String dataInizio){
		return Read.ottieniStoricoPerDataInizio(dataInizio);
	}
}
