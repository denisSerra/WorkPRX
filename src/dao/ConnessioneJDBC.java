package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnessioneJDBC {
	public static Connection connessione() {
		Connection con =null;
		try {
			// QUERY
			// Carichiamo un driver di tipo 1 (bridge jdbc-odbc)
			String driver = "com.mysql.jdbc.Driver";

			Class.forName(driver);

			// Creiamo la stringa di connessione
			String url = "jdbc:mysql://localhost:3306/gestionale?useSSL=false";

			// Otteniamo una connessione con username e password
			con = DriverManager.getConnection(url, "root", "1234");
		}
			catch (Exception e) {
				System.err.println("errore");
				e.printStackTrace();
			} finally {
		return con; 
		}
	}
}
