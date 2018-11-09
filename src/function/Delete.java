package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ConnessioneJDBC;
import model.Impiegato;
import model.Ruolo;

public class Delete {
	public static void deleteImpiegato(String codFis) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String deleteTableSQL = "DELETE FROM impiegato WHERE CodiceFiscale = ?";

		try {
			preparedStatement = con.prepareStatement(deleteTableSQL);
			preparedStatement.setString(1, codFis);
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
	
	public static boolean deleteImpiegatoPerCodFisc(String codFis) {
		Connection con = ConnessioneJDBC.connessione();
		boolean cancellato=false;
		if(con!=null) {
			try {
				String qry = "DELETE FROM impiegato WHERE CodiceFiscale = ?";
				PreparedStatement cmd = con.prepareStatement(qry);
				cmd.setString(1,codFis);
				int righeUpd= cmd.executeUpdate();
				if(righeUpd==1)  {
					cancellato= true;
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
		return cancellato;
	}
}
