package model;

public class Impiegato {
	private String nome;
	private String cognome;
	private String codFisc;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodFisc() {
		return codFisc;
	}
	public void setCodFisc(String codFisc) {
		this.codFisc = codFisc;
	}
	
	
	@Override
	public String toString() {
		return String.format("Nome: %s - Cognome: %s - Codice Fiscale: %s",this.nome,this.cognome,this.codFisc);
	}	
}
