//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.SQLException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import dao.ImpiegatoDao;
//import dao.Insert;
//import dao.Read;
//import function.Function;
//import function.FunctionInsert;
//import model.Impiegato;
//import model.Ruolo;
//import model.Storico;
//
///**
// * Servlet implementation class Prova
// */
//@WebServlet("/Prova")
//public class Prova extends HttpServlet {
//
//	private static final long serialVersionUID = 1L;
//	@SuppressWarnings("unused")
//	private String message;
//
//	   public void init() throws ServletException {
//	      // Do required initialization
//	      message = "Servlet";
//	   }
//	   
//	   public void doGet(HttpServletRequest request, HttpServletResponse response)
//	      throws ServletException, IOException {
//	      
//	      // Set response content type
//	      response.setContentType("text/html");
//
//	      // Actual logic goes here.
//	      PrintWriter out = response.getWriter();
//	      String parametro=request.getParameter("tabella");
//	      if(parametro.equals("impiegato")) {
//	    	  out.write("TABELLA IMPIEGATO"+"<br></br>");
//	    	  //questa riga stampa la funzione fatta nella classe function nel metodo formattaListaImpiegato
//	    	  out.write(Function.formattaListaImpiegato(Read.ottieniImpiegati()));
//	      }
//	      else
//	    	  if(parametro.equals("ruolo")) {
//	    		  out.write("TABELLA RUOLO"+"<br></br>");
//	    		//questa riga stampa la funzione fatta nella classe function nel metodo formattaListaRuolo
//		    	out.write(Function.formattaListaRuolo(Read.ottieniRuolo()));
//	    	  }
//	   		else
//	    	  if(parametro.equals("storico")) {
//	    		  out.write("TABELLA SORICO"+"<br></br>");
//	    		//questa riga stampa la funzione fatta nella classe function nel metodo formattaListaRuolo
//			    out.write(Function.formattaListaStorico(Read.ottieniStorico()));
//	    	  }
//	    	else {
//	    	  out.write("SERVLET"+"<br></br>");
//	    	  out.write("inserisci parametro corretto");
//	      }
//	   }
//	   
//	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
//	   IOException {
//			String nome = request.getParameter("nome");
//			String cognome = request.getParameter("cognome");
//			String codiceFiscale = request.getParameter("codiceFiscale");		
//				if( nome!=null&& cognome!=null&&codiceFiscale!=null) {
//					try {
//						FunctionInsert.insertImpiegato(nome, cognome, codiceFiscale);
//					} catch (NumberFormatException e) {
//						e.printStackTrace();
//					} catch (SQLException e) {
//						e.printStackTrace();
//					}
//				RequestDispatcher req = request.getRequestDispatcher("index.jsp");
//				req.include(request, response);
//				
//				}
//	   }
//	   
//	   public void destroy() {
//	      // do nothing.
//	   }
//}