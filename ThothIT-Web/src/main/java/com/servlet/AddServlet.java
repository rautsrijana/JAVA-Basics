package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/additionresult")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response content type
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        String title = "Result of Addition";
        double num1, num2, result;

        try {
            // Getting the data values from the form and converting them to double
            num1 = Double.parseDouble(req.getParameter("num1"));
            num2 = Double.parseDouble(req.getParameter("num2"));
            
            // Perform addition
            result = num1 + num2;
            
            // Displaying the result
            out.println("<html>");
            out.println("<head><title>" + title + "</title></head>");
            out.println("<body style='text-align: center;'>");
            out.println("<div style='display: inline-block; margin: auto; border: 2px solid black; padding: 10px;'>");
            out.println("<h1>" + title + "</h1>");
            out.println("<p>The result of adding " + num1 + " and " + num2 + " is: " + result + "</p>");
            out.println("</div></body></html>");
              
        } catch(NumberFormatException e) {
            out.println("<html><body><p>Error: Please enter valid numbers.</p></body></html>");
        }
    }
}

