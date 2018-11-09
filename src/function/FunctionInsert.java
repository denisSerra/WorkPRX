package function;

import java.sql.Connection;
import java.sql.SQLException;

import dao.ConnessioneJDBC;

public class FunctionInsert {
	public static boolean insertImpiegato(String nome,String cognome,String codFisc) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO impiegato SET Nome = ?,Cognome =?,CodiceFiscale = ?" ;
		boolean inserito= false;
		try {
			preparedStatement = con.prepareStatement(insertTableSQL);			
			preparedStatement.setString(1,nome );
			preparedStatement.setString(2,cognome );
			preparedStatement.setString(3, codFisc);
			// execute update SQL stetement
			if(preparedStatement.executeUpdate() == 1) {
				inserito=true;
			}
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
		return inserito;
	}
	
	public static boolean insertRuolo(int idruolo,int stipendio) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO ruolo SET idruolo =?,stipendio = ?" ;
		boolean inserito= false;
		try {
			preparedStatement = con.prepareStatement(insertTableSQL);

			preparedStatement.setInt(1, idruolo);
			preparedStatement.setInt(2,stipendio);
			// execute update SQL stetement
			preparedStatement.executeUpdate();
//			System.out.println("INSERT INTO TABLE RUOLO");
//			System.out.println("Record is updated to DBUSER table!");
			if(preparedStatement.executeUpdate() == 1) {
				inserito=true;
			}

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
		return inserito;
	}
	
	public static boolean insertStorico(int idruolo,String dataInizio,String dataFine) throws SQLException {
		Connection con = ConnessioneJDBC.connessione();
		java.sql.PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO storico SET idruolo =?,dataInizio = ?,dataFine =?" ;
		boolean inserito= false;
		try {
			preparedStatement = con.prepareStatement(insertTableSQL);

			preparedStatement.setInt(1, idruolo);
			preparedStatement.setString(2,dataInizio);
			preparedStatement.setString(3,dataFine);
			// execute update SQL stetement
			preparedStatement.executeUpdate();
//			System.out.println("INSERT INTO TABLE STORICO");
//			System.out.println("Record is updated to DBUSER table!");
			if(preparedStatement.executeUpdate() == 1) {
				inserito=true;
			}
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
		return inserito;
	}
}
