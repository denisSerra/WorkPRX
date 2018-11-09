package dao;

import java.util.ArrayList;

import function.Read;
import model.Impiegato;
import model.Ruolo;

public class RuoloDao {
	private ArrayList<Ruolo> list_ruolo= new ArrayList<Ruolo>();
	
	public boolean creaRuolo(Ruolo ruolo) {
		return list_ruolo.add(ruolo);
	}
	
	public Ruolo leggiRuolo(int id) {
		for(Ruolo r:list_ruolo) {
			if (r.getIdImpiegato()==id) {
				return r;
			}
		}
		return null;
	}
	
	public boolean modificaRuolo(int id,int modificaStip) {
		for(Ruolo r:list_ruolo) {
			if (r.getIdImpiegato()==id) {
				r.setStipendio(modificaStip);
				return true;
			}
		}
	return false;
	}

	public Ruolo rimuoviId(int id) {
		return list_ruolo.remove(id);
	}
	
	public static ArrayList<Ruolo> ottieniRuolo(){
		return Read.ottieniRuolo();
	}
	
	public static Ruolo cercaRuoloStipendio(int stipendio){
		return Read.ottieniRuoloPerStipendio(stipendio);
	}
}
