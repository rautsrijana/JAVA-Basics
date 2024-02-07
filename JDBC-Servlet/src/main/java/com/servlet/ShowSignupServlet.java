package com.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/signups")
public class ShowSignupServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//get the data and store in the list
		List<SignupDto> signupdtos= new ArrayList<SignupDto>();
		try {
			//step 1 load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded successfully");
			
			//step 2  create the connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_signup","root","Shree@18");
			System.out.println("connection has been created");
			
			//step 3 fire the query
			String sql="select id,username,password,email,gender from users";
			PreparedStatement pstm = conn.prepareStatement(sql);
			
//			pstm.execute();
			ResultSet rs= pstm.executeQuery();
			while(rs.next()) {
				SignupDto signupdto = new SignupDto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				signupdtos.add(signupdto);
		
			}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		req.setAttribute("message", "data has been retrieved");
	
		req.setAttribute("sdata", signupdtos);
		req.getRequestDispatcher("slist.jsp").forward(req, resp);
	
	}

}

