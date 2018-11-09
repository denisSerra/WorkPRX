package function;

import java.sql.Connection;
import java.sql.SQLException;

import dao.ConnessioneJDBC;

public class Update {
	public static void updateImpiegato(int idimpiegato,String nome,String cognome,String codFisc) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE impiegato SET Nome = ?,Cognome = ?,CodiceFiscale = ?" + " WHERE idimpiegato = ?";

		try {
			preparedStatement = con.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, nome);
			preparedStatement.setString(2, cognome);
			preparedStatement.setString(3, codFisc);
			preparedStatement.setInt(4, idimpiegato);
			// execute update SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("UPDATE TABLE IMPIEGATI");
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
	
	public static void updateRuolo(int idruolo,int stipendio) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE ruolo SET stipendio = ?" + " WHERE idruolo = ?";

		try {
			preparedStatement = con.prepareStatement(updateTableSQL);

			preparedStatement.setInt(1, stipendio);
			preparedStatement.setInt(2, idruolo);
			// execute update SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("UPDATE TABLE RUOLO");
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
	
	public static void updateStorico(int idruolo,String dataInizio,String dataFine) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE storico SET DataInizio = ?,DataFine = ?" + " WHERE idruolo = ?";

		try {
			preparedStatement = con.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, dataInizio);
			preparedStatement.setString(2, dataFine);
			preparedStatement.setInt(3, idruolo);
			// execute update SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("UPDATE TABLE STORICO");
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
