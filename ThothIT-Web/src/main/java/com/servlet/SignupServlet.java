package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet{

	private List<SignuptoDo> signuplist = new ArrayList<SignuptoDo>();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("username");
		String email = req.getParameter("username");
		String gender = req.getParameter("username");
		
		SignuptoDo signuptodo = new SignuptoDo(username, password, email, gender);
		signuplist.add(signuptodo);
		System.out.println(signuplist);
		
		req.setAttribute("sdata", signuplist);
		req.getRequestDispatcher("slist.jsp").forward(req, resp);
		
	}
}
