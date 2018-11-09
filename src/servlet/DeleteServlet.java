package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ImpiegatoDao;
import dao.RuoloDao;
import dao.StoricoDao;
import model.Impiegato;
import model.Ruolo;
import model.Storico;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Delete.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codiceFiscale = request.getParameter("codiceFisc");	
		boolean cancella = false;
//		String dataInizio = request.getParameter("dataIni");
//		String stipRuolo = request.getParameter("ruoloStip");
//		int intStipRuol = Integer.parseInt(stipRuolo);
		String option = request.getParameter("buttonDelete");
			switch(option) {
			case "Cancella CodF":
				try {
				cancella=ImpiegatoDao.cancellaImpiegatoCodFisc(codiceFiscale);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			if(cancella==true) {
				RequestDispatcher reqImp = request.getRequestDispatcher("/WEB-INF/DeleteImpiegato.jsp");
				reqImp.forward(request, response);
				break;
			}
			default:
					RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/Delete.jsp");
					req.forward(request, response);
		}
	}
}
