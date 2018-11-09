package dao;

import java.util.ArrayList;

import function.Delete;
import function.Read;
import model.Impiegato;

public class ImpiegatoDao {	
	private static ArrayList<Impiegato> list_impiegato = new ArrayList<Impiegato>();
	
	public static boolean creaImpiegato(Impiegato impiegato) {
		return list_impiegato.add(impiegato);
	}
	
//	public static Impiegato leggiImpiegato(int id) {
//		for(Impiegato i:list_impiegato) {
//			if (i.getId()==id) {
//				return i;
//			}
//		}
//		return null;
//	}
	
//	public static boolean modificaImpiegato(int id,String nome) {
//		for(Impiegato i:list_impiegato) {
//			if (i.getId()==id) {
//				i.setNome(nome);
//				return true;
//			}
//		}
//	return false;
//	}

	public static Impiegato rimuoviImpiegato(int id) {
		return list_impiegato.remove(id);
	}
	public static ArrayList<Impiegato> ottieniImpiegati(){
		return Read.ottieniImpiegati();
	}
	
	public static Impiegato cercaImpiegatiCodFisc(String codFisc){
		return Read.ottieniImpiegatiPerCF(codFisc);
	}
	
	public static boolean cancellaImpiegatoCodFisc(String codFisc) {
		return Delete.deleteImpiegatoPerCodFisc(codFisc);
	}
}
