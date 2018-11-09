package servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.CorsiEJBRemote;

/**
 * Servlet implementation class ServletEJB
 */
@WebServlet("/ServletCorsiEJB")
public class ServletCorsiEJB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 @Resource(mappedName="java:jboss/exported/Corsi/CorsiEJB!ejb.CorsiEJBRemote")
	    private CorsiEJBRemote corsiEJBRemote;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCorsiEJB() {
        super();
        // TODO Auto-generated constructor stub
    }
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/InserimentoCorso.jsp");
		dispatcher.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
//			corsiEJBRemote.find();
//			corsiEJBRemote.inserisciCorso(2, "JavaEE");
//			corsiEJBRemote.modificaNomeCorsoById(1,"gonfia palloncini");
//			corsiEJBRemote.deleteCorso(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
