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
}
