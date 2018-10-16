import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ImpiegatoDao;
import dao.Insert;
import dao.Read;
import function.Function;
import function.FunctionInsert;
import model.Impiegato;
import model.Ruolo;
import model.Storico;

/**
 * Servlet implementation class Prova
 */
@WebServlet("/Prova")
public class InserimentoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	   
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
	   IOException {
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String codiceFiscale = request.getParameter("codiceFiscale");		
				if( nome!=null&& cognome!=null&&codiceFiscale!=null) {
					try {
						FunctionInsert.insertImpiegato(nome, cognome, codiceFiscale);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				RequestDispatcher req = request.getRequestDispatcher("index.jsp");
				req.include(request, response);
				}
	   }
	   
	   public void destroy() {
	      // do nothing.
	   }
}