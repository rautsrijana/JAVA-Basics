package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class FormRegisterServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get print writer
		PrintWriter pw = resp.getWriter();
		// set resp type
		resp.setContentType("text/html");
		//read the form data
		String name = req.getParameter("name");
		String dob = req.getParameter("dob");
		String gender = req.getParameter("gender");
		String qlfy = req.getParameter("qlfy");
		//for hobbies we have multiple so taking values
		String[] hobbies = req.getParameterValues("hb");
		List al = Arrays.asList(hobbies);
		
		//add bootstrap
		pw.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\">\n"
				+ "\n"
				+ "<!-- jQuery library -->\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js\"></script>\n"
				+ "\n"
				+ "<!-- Popper JS -->\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n"
				+ "\n"
				+ "<!-- Latest compiled JavaScript -->\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>");
		
		//printing data
		pw.println("<div style='width:600px; margin:auto;margin-top:50px;'>");
		pw.println("<table class = 'table table-hover table-striped'>");
		pw.println("<tr>");
		pw.println("<td>Name</td>");
		pw.println("<td>" +name+"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>DOB</td>");
		pw.println("<td>" +dob+"</td>");
		pw.println("</tr>");

		pw.println("<tr>");
		pw.println("<td>Gender</td>");
		pw.println("<td>" +gender+"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>Qualification</td>");
		pw.println("<td>"  + qlfy+"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td>Hobbies</td>");
		pw.println("<td>" +al+"</td>");
		pw.println("</tr>");

		pw.println("</table>");
		pw.println("</div>");
		
//		pw.println("name:" +name+"<br>");
//		pw.println("Dob:" +dob + "<br>");
//		pw.println("Gender:" +gender + "<br>");
//		pw.println("Qualification:" +qlfy + "<br>");
//		pw.println("Hobbies:" +al);
		pw.close();
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}
	

}
