package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
				String qry = "SELECT * FROM impiegato";
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
}
