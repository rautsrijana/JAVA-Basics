package thothweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addition")
public class AddDemo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 //Set response content type
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        String title = "Result of Addition";

        try {
            // Getting the values from the form and converting them to integers
            int num1 = Integer.parseInt(req.getParameter("num1"));
            int num2 = Integer.parseInt(req.getParameter("num2"));
            int sum = num1 + num2;

            // Displaying the result
            out.println("<html>");
            out.println("<head><title>" + title + "</title></head>");
            out.println("<body>");
            out.println("<h1>" + title + "</h1>");
            out.println("<p>The sum of " + num1 + " and " + num2 + " is: " + sum + "</p>");
            out.println("</body></html>");
            
            
        } catch(NumberFormatException e) {
            out.println("<html><body><p>Error: Please enter valid numbers.</p></body></html>");
        }



	}

}


    