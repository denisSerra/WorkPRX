package servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.SedeEJBRemote;

/**
 * Servlet implementation class ServletSedeEJB
 */
@WebServlet("/ServletSedeEJB")
public class ServletSedeEJB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(mappedName="java:jboss/exported/Corsi/SedeEJB!ejb.SedeEJBRemote")
	private SedeEJBRemote sedeEJBRemote;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSedeEJB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
