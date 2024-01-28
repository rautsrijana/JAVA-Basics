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
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		
	}
	

}
