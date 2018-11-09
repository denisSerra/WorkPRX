package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.CorsiEJBRemote;
import function.FunctionCorsi;

/**
 * Servlet implementation class ServletEJB
 */
@WebServlet("/ServletCorsiEJB")
public class ServletCorsiEJB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(mappedName = "java:jboss/exported/Corsi/CorsiEJB!ejb.CorsiEJBRemote")
	private CorsiEJBRemote corsiEJBRemote;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletCorsiEJB() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Home.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idCorso = request.getParameter("id");
		String nomeCorso = request.getParameter("nomecorso");
		boolean inserito = false;
		if (idCorso != null && nomeCorso != null) {
			try {
				inserito = FunctionCorsi.inserisciCorso(idCorso, nomeCorso);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (inserito) {
				RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/Inserimento.jsp");
				req.forward(request, response);
			} else {
				RequestDispatcher req = request.getRequestDispatcher("/WEB-INF/InserisciImp.jsp");
				req.forward(request, response);
			}
		}
	}
}
