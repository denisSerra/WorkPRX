package servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.DocenteEJBRemote;

/**
 * Servlet implementation class ServletDocenteEJB
 */
@WebServlet("/ServletDocenteEJB")
public class ServletDocenteEJB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(mappedName="java:jboss/exported/Corsi/DocenteEJB!ejb.DocenteEJBRemote")
       private DocenteEJBRemote docenteEJBRemote;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDocenteEJB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			docenteEJBRemote.inserisciDocente(3, "Franco", "Fino", "BLOUGL456789FL09");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
