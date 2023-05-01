package nl.utwente.di.temperature;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/** Example of a Servlet that gets a temperature in Celsius and returns it in Farenheit
 */


public class Temperature extends HttpServlet {

 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Temperaturer temperaturer;
	
    public void init() throws ServletException {
    	temperaturer = new Temperaturer();
    }	
	
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String title = "Temperature Conventer";
    
    // Done with string concatenation only for the demo
    // Not expected to be done like this in the project
    out.println("<!DOCTYPE HTML>\n" +
                "<HTML>\n" +
                "<HEAD><TITLE>" + title + "</TITLE>" +
                "<LINK REL=STYLESHEET HREF=\"styles.css\">" +
                		"</HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + title + "</H1>\n" +              
                "  <P>Temperature in Celsius: " +
                   request.getParameter("celsius") + "\n" +
                "  <P>In Farenheit: " +
                   temperaturer.getFarenheitTemp(Double.parseDouble(request.getParameter("celsius"))) +
                "</BODY></HTML>");
  }
}
