package model;

public class Storico {
	private int id_ruolo;
	private String data_inizio;
	private String data_fine;
	public int getId_ruolo() {
		return id_ruolo;
	}
	public void setId_ruolo(int id_ruolo) {
		this.id_ruolo = id_ruolo;
	}
	public String getData_inizio() {
		return data_inizio;
	}
	public void setData_inizio(String data_inizio) {
		this.data_inizio = data_inizio;
	}
	public String getData_fine() {
		return data_fine;
	}
	public void setData_fine(String data_fine) {
		this.data_fine = data_fine;
	}
	
	@Override
	public String toString() {
		return String.format("id_ruolo: %d - dataInizio: %s - dataFine: %s ", this.id_ruolo,this.data_inizio,this.data_fine);
	}
}
