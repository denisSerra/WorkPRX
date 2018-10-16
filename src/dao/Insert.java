package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class Insert {
	public static void insertImpiegato(int idimpiegato,String nome,String cognome,String codFisc) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO impiegato SET idimpiegato =?,Nome = ?,Cognome =?,CodiceFiscale = ?" ;

		try {
			preparedStatement = con.prepareStatement(insertTableSQL);

			preparedStatement.setInt(1, idimpiegato);
			preparedStatement.setString(2,nome );
			preparedStatement.setString(3,cognome );
			preparedStatement.setString(4, codFisc);
			// execute update SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("INSERT INTO TABLE IMPIEGATI");
			System.out.println("Record is updated to DBUSER table!");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (con != null) {
				con.close();
			}
		}
	}
	
	public static void insertRuolo(int idruolo,int stipendio) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO ruolo SET idruolo =?,stipendio = ?" ;

		try {
			preparedStatement = con.prepareStatement(insertTableSQL);

			preparedStatement.setInt(1, idruolo);
			preparedStatement.setInt(2,stipendio);
			// execute update SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("INSERT INTO TABLE RUOLO");
			System.out.println("Record is updated to DBUSER table!");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (con != null) {
				con.close();
			}
		}
	}
	
	public static void insertStorico(int idruolo,String dataInizio,String dataFine) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO storico SET idruolo =?,dataInizio = ?,dataFine =?" ;

		try {
			preparedStatement = con.prepareStatement(insertTableSQL);

			preparedStatement.setInt(1, idruolo);
			preparedStatement.setString(2,dataInizio);
			preparedStatement.setString(3,dataFine);
			// execute update SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("INSERT INTO TABLE STORICO");
			System.out.println("Record is updated to DBUSER table!");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (con != null) {
				con.close();
			}
		}
	}
}
