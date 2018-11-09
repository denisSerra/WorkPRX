package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.ConnessioneJDBC;
import model.Impiegato;
import model.Ruolo;
import model.Storico;

public class Read {
	public static ArrayList<Impiegato> ottieniImpiegati(){
		ArrayList<Impiegato> arrayListImp = new ArrayList<Impiegato>();
		Connection con = ConnessioneJDBC.connessione();
		if(con!=null) {
			try {
				Statement cmd = con.createStatement();
				String qry = "SELECT * FROM impiegato ";
				ResultSet resultSet= cmd.executeQuery(qry);
				while(resultSet.next()) {
					Impiegato impiegato = new Impiegato();
					
					impiegato.setNome(resultSet.getString("Nome"));
					impiegato.setCognome(resultSet.getString("Cognome"));
					impiegato.setCodFisc(resultSet.getString("CodiceFiscale"));
					arrayListImp.add(impiegato);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println("errore");
				e.printStackTrace();
			}
		}
		
		return arrayListImp;
	}
	
	public static ArrayList<Ruolo> ottieniRuolo(){
		ArrayList<Ruolo> arrayListImp = new ArrayList<Ruolo>();
		Connection con = ConnessioneJDBC.connessione();
		if(con!=null) {
			try {
				Statement cmd = con.createStatement();
				String qry = "SELECT * FROM ruolo";
				ResultSet resultSet= cmd.executeQuery(qry);
				while(resultSet.next()) {
					Ruolo ruolo = new Ruolo();
					ruolo.setIdImpiegato(resultSet.getInt("idruolo"));
					ruolo.setStipendio(resultSet.getInt("stipendio"));
					arrayListImp.add(ruolo);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println("errore");
				e.printStackTrace();
			}
		}
		return arrayListImp;
	}
	
	public static ArrayList<Storico> ottieniStorico(){
		ArrayList<Storico> arrayListImp = new ArrayList<Storico>();
		Connection con = ConnessioneJDBC.connessione();
		if(con!=null) {
			try {
				Statement cmd = con.createStatement();
				String qry = "SELECT * FROM storico";
				ResultSet resultSet= cmd.executeQuery(qry);
				while(resultSet.next()) {
					Storico storico = new Storico();
					storico.setId_ruolo(resultSet.getInt("idruolo"));
					storico.setData_inizio(resultSet.getString("DataInizio"));
					storico.setData_fine(resultSet.getString("DataFine"));
					arrayListImp.add(storico);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println("errore");
				e.printStackTrace();
			}
		}
		return arrayListImp;
	}
	
	public static Impiegato ottieniImpiegatiPerCF(String codFisc){
		Impiegato imp = null;
		Connection con = ConnessioneJDBC.connessione();
		if(con!=null) {
			try {
				String qry = "SELECT * FROM impiegato where codiceFiscale=? ";
				PreparedStatement cmd = con.prepareStatement(qry);
				cmd.setString(1,codFisc);
				ResultSet resultSet= cmd.executeQuery();
				if(resultSet.next()) {
					imp = new Impiegato();
					imp.setNome(resultSet.getString("Nome"));
					imp.setCognome(resultSet.getString("Cognome"));
					imp.setCodFisc(resultSet.getString("CodiceFiscale"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println("errore");
				e.printStackTrace();
			}
		}
		return imp;
	}
	
	public static Storico ottieniStoricoPerDataInizio(String dataInizio){
//		ArrayList<Storico> arrayListImp = new ArrayList<Storico>();
		Connection con = ConnessioneJDBC.connessione();
		Storico storico=null;
		if(con!=null) {
			try {
				String qry = "SELECT * FROM storico where DataInizio=?";
				PreparedStatement cmd = con.prepareStatement(qry);
				cmd.setString(1,dataInizio);
				ResultSet resultSet= cmd.executeQuery();
				if(resultSet.next())  {
					storico = new Storico();
					storico.setId_ruolo(resultSet.getInt("idruolo"));
					storico.setData_inizio(resultSet.getString("DataInizio"));
					storico.setData_fine(resultSet.getString("DataFine"));
//					System.out.println(resultSet.getString("DataInizio"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println("errore");
				e.printStackTrace();
			}
		}
		return storico;
	}
	
	public static Ruolo ottieniRuoloPerStipendio(int stipendio){
		Connection con = ConnessioneJDBC.connessione();
		Ruolo ruolo=null;
		if(con!=null) {
			try {
				String qry = "SELECT * FROM ruolo where stipendio=?";
				PreparedStatement cmd = con.prepareStatement(qry);
				cmd.setInt(1,stipendio);
				ResultSet resultSet= cmd.executeQuery();
				if(resultSet.next())  {
					ruolo = new Ruolo();
					ruolo.setIdImpiegato(resultSet.getInt("idruolo"));
					ruolo.setStipendio(resultSet.getInt("stipendio"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				System.err.println("errore");
				e.printStackTrace();
			}
		}
		return ruolo;
	}
}
