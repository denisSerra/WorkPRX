package servlet;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import dao.ImpiegatoDao;
import dao.RuoloDao;
import dao.StoricoDao;
import function.FunctionInsert;
import function.Read;
import model.Impiegato;
import model.Ruolo;
import model.Storico;

/**
 * Servlet implementation class FindServlet
 */
@WebServlet("/FindServlet")
public class FindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Find.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Impiegato impiegato=null;
		Storico storico=null;
		Ruolo ruolo=null;
		String codiceFiscale = request.getParameter("codFisc");	
		String dataInizio = request.getParameter("dataIni");
		String stipRuolo = request.getParameter("ruoloStip");
		String option = request.getParameter("button");
			switch(option) {
			case "Cerca CodF":
				try {
				impiegato=ImpiegatoDao.cercaImpiegatiCodFisc(codiceFiscale);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			if(impiegato!=null) {
				request.getSession().setAttribute("Impiegato",impiegato);
				RequestDispatcher reqImp = request.getRequestDispatcher("/WEB-INF/FindImp.jsp");
				reqImp.forward(request, response);
				break;
			}
			case "Cerca DataI":
				try {
					storico=StoricoDao.cercaStoricoDataInizio(dataInizio);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
				if(storico!=null) {
					request.getSession().setAttribute("dataIni",storico);
					RequestDispatcher reqStor = request.getRequestDispatcher("/WEB-INF/FindStorico.jsp");
					reqStor.forward(request, response);
					break;
				}
			case "Cerca Ruolo":
				try {
					int intStipRuol = Integer.parseInt(stipRuolo);
					ruolo=RuoloDao.cercaRuoloStipendio(intStipRuol);
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
				if(ruolo!=null) {
					request.getSession().setAttribute("ruoloStip",ruolo);
					RequestDispatcher reqStor = request.getRequestDispatcher("/WEB-INF/FindRuolo.jsp");
					reqStor.forward(request, response);
					break;
				}
				default:
					RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/Find.jsp");
					req.forward(request, response);
		}
//		if(codiceFiscale!=null) {
//			try {
//				impiegato=ImpiegatoDao.cercaImpiegatiCodFisc(codiceFiscale);
//			} catch (NumberFormatException e) {
//				e.printStackTrace();
//			}
//			if(impiegato!=null) {
//				request.getSession().setAttribute("Impiegato",impiegato);
//				RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/Find.jsp");
//				req.forward(request, response);
//			}
			
//			else {
//		RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/Find.jsp");
//		req.forward(request, response);
//		}
	}
}
