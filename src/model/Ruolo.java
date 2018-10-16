package model;

public class Ruolo {
	private int idImpiegato;
	private int stipendio;
	public int getIdImpiegato() {
		return idImpiegato;
	}
	public void setIdImpiegato(int idImpiegato) {
		this.idImpiegato = idImpiegato;
	}
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	@Override
	public String toString() {
		return String.format("idImpiegato: %d - stipendio: %s", this.idImpiegato,this.stipendio);
	}
}
