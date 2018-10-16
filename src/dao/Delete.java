package dao;

import java.sql.Connection;
import java.sql.SQLException;

public class Delete {
	public static void deleteImpiegato(int idimpiegato) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String deleteTableSQL = "DELETE FROM impiegato WHERE idimpiegato = ?";

		try {
			preparedStatement = con.prepareStatement(deleteTableSQL);

			preparedStatement.setInt(1, idimpiegato);
			
			// execute update SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("DELETED TO TABLE IMPIEGATI");
			System.out.println("Record is deleted to DBUSER table!");

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
	
	public static void deleteRuolo(int stipendio) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String deleteTableSQL = "DELETE FROM ruolo WHERE stipendio = ?";

		try {
			preparedStatement = con.prepareStatement(deleteTableSQL);

			preparedStatement.setInt(1, stipendio);
			
			// execute update SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("DELETED TO TABLE RUOLO");
			System.out.println("Record is deleted to DBUSER table!");

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
	
	public static void deleteStorico(String dataFine) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String deleteTableSQL = "DELETE FROM storico WHERE DataFine = ?";

		try {
			preparedStatement = con.prepareStatement(deleteTableSQL);

			preparedStatement.setString(1, dataFine);
			
			// execute update SQL stetement
			preparedStatement.executeUpdate();
			System.out.println("DELETED TO TABLE STORICO");
			System.out.println("Record is deleted to DBUSER table!");

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
