package function;

import java.util.ArrayList;

import model.Impiegato;
import model.Ruolo;
import model.Storico;

public class Function {
	public static String formattaListaImpiegato(ArrayList<Impiegato> arrayList) {
		String stringa="";
		for(Impiegato impiegato:arrayList) {
  		  stringa += String.format("<br>%s</br>",impiegato.toString());
  	  }
		return stringa;
	}
	
	public static String formattaListaRuolo(ArrayList<Ruolo> arrayList) {
		String stringa="";
		for(Ruolo ruolo:arrayList) {
  		  stringa += String.format("<br>%s</br>",ruolo.toString());
  	  }
		return stringa;
	}
	
	public static String formattaListaStorico(ArrayList<Storico> arrayList) {
		String stringa="";
		for(Storico storico:arrayList) {
  		  stringa += String.format("<br>%s</br>",storico.toString());
  	  }
		return stringa;
	}
}
