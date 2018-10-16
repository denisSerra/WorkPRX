

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Read;
import function.Function;
import function.FunctionInsert;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/HomePage")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Home.jsp");
		dispatcher.include(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
	   IOException {
				String parmater = request.getParameter("pulsante");
				String page="/WEB-INF/404.jsp";
				if(parmater.equals("Impiegato")) {
					request.getSession().setAttribute("Impiegato", Function.formattaListaImpiegato(Read.ottieniImpiegati()));
					page="/WEB-INF/OttieniImpiegati.jsp";
				}
				else 
					if(parmater.equals("Storico"))
					{
						request.getSession().setAttribute("Storico", Function.formattaListaStorico(Read.ottieniStorico()));
						page="/WEB-INF/OttieniStorico.jsp";
					}
					else
						if(parmater.equals("Ruolo")) {
							request.getSession().setAttribute("Ruolo", Function.formattaListaRuolo(Read.ottieniRuolo()));
							page="/WEB-INF/OttieniRuolo.jsp";
						}
				RequestDispatcher req = request.getRequestDispatcher(page);
				req.forward(request, response);
	   }
}
