package thothweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculation")
public class AddDemo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 //Set response content type
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        String title = "Result";
        double num1, num2, result;
        String operation;

        try {
            // Getting the data values from the form and converting them to double
            num1 = Double.parseDouble(req.getParameter("num1"));
            num2 = Double.parseDouble(req.getParameter("num2"));
            operation = req.getParameter("operation");
            
            //now processing the data
            if(operation.equals("add")) {
            	result = num1+num2;
            	title = "Result of Addition";
            }
            else if(operation.equals("subtract")) {
            	result = num1 - num2;
            	title = "Result of Subtraction";
            }
            else if(operation.equals("multiply")) {
            	result = num1 * num2;
            	title = "Result of Multiplication";
            }
            else {
            	result = num1/num2;
            	title = "Result of Division";
            }
            
            // Displaying the result
            out.println("<html>");
            out.println("<head><title>" + title + "</title></head>");
            out.println("<body style='text-align: center;'>");
            out.println("<div style='display: inline-block; margin: auto; border: 2px solid black; padding: 10px;'>");
            out.println("<h1>" + title + "</h1>");
            out.println("<p>The result of " + num1 + " and " + num2 + " is= " + result + "</p>");
            out.println("</body></html>");
              
            
        } catch(NumberFormatException e) {
            out.println("<html><body><p>Error: Please enter valid numbers.</p></body></html>");
        }



	}

}


    