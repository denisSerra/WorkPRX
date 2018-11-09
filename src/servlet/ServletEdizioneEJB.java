package servlet;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.EdizioneEJBRemote;

/**
 * Servlet implementation class ServletEdizioneEJB
 */
@WebServlet("/ServletEdizioneEJB")
public class ServletEdizioneEJB extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(mappedName="java:jboss/exported/Corsi/EdizioneEJB!ejb.EdizioneEJBRemote")
    private EdizioneEJBRemote edizioneEJBRemote;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEdizioneEJB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			LocalDate datainizio = LocalDate.of(2016,5,22);
			LocalDate datafine = LocalDate.of(2018,9,22);
			edizioneEJBRemote.inserisciEdizione(3, 3, 3, 3, java.sql.Date.valueOf(datainizio), java.sql.Date.valueOf(datafine));
			
//			edizioneEJBRemote.find();
			
//			edizioneEJBRemote.modificaIdcorsoById(1, 2);
//			edizioneEJBRemote.
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
