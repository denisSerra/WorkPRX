package servlet;
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
import function.Read;
import function.Function;
import function.FunctionInsert;
import model.Impiegato;
import model.Ruolo;
import model.Storico;

/**
 * Servlet implementation class Prova
 */
@WebServlet("/InserimentoServlet")
public class InserimentoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/InserisciImp.jsp");
		dispatcher.forward(request, response);
	}
	
	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
	   IOException {
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String codiceFiscale = request.getParameter("codiceFiscale");	
			boolean inserito=false;
				if( nome!=null&& cognome!=null&&codiceFiscale!=null) {
					try {
						inserito=FunctionInsert.insertImpiegato(nome, cognome, codiceFiscale);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if(inserito) {
						RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/Inserimento.jsp");
						req.forward(request, response);
					}
					else {
				RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/InserisciImp.jsp");
				req.forward(request, response);
				}
			}
	   }
	   
	   public void destroy() {
	      // do nothing.
	   }
}