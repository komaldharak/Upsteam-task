

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TempComvert
 */
@WebServlet("/TempConvert")
public class TempConvert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		    // Set response content type
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    try {

		    // Get the parameters from the request
		    String tempString = request.getParameter("inputTemp");
		    String scaleFrom = request.getParameter("inputScale");
		    String scaleTo = request.getParameter("outputScale");

		    // Convert the temperature to the target scale
		    double temp = Double.parseDouble(tempString);
		   

		    // Create the response
		     double convertedTemp = 0;
		   
		    
		   
		    if (scaleFrom.equals("fahrenheit")) {
		      if (scaleTo.equals("celsius")) {
		        convertedTemp = (temp - 32) * 5 / 9;
		        out.println("<br><br><center><h3>Temperature "+tempString+" F  to C : "+convertedTemp+" C");

		      } else if (scaleTo.equals("kelvin")) {
		        convertedTemp = (temp - 32) * 5 / 9 + 273.15;
		        out.println("<br><br><center><h3>Temperature  "+tempString+" F to K : "+convertedTemp+" K");
		      }
		    } else if (scaleFrom.equals("celsius")) {
		      if (scaleTo.equals("fahrenheit")) {
		        convertedTemp = temp * 9 / 5 + 32;
		        out.println("<br><br><center><h3>Temperature  "+tempString+" C to F : "+convertedTemp+" F");
		      } else if (scaleTo.equals("kelvin")) {
		        convertedTemp = temp + 273.15;
		        out.println("<br><br><center><h3>Temperature "+tempString+" C to K : "+convertedTemp+" K");
		      }
		    } else if (scaleFrom.equals("kelvin")) {
		      if (scaleTo.equals("fahrenheit")) {
		        convertedTemp = (temp - 273.15) * 9 / 5 + 32;
		        out.println("<br><br><center><h3>Temperature "+tempString+" K to F : "+convertedTemp+" F");
		      } else if (scaleTo.equals("celsius")) {
		        convertedTemp = temp - 273.15;
		        out.println("<br><br><center><h3>Temperature "+tempString+" K to C : "+convertedTemp+" C");
		      }
		    } 
		}catch(Exception e) {
			out.println("Error : "+e.getMessage());
		}finally {
			out.println("<br>");
			out.println("To go back to main page <a href=Home.jsp> click here </a>");
			out.println("</center>");
		}
}
}
