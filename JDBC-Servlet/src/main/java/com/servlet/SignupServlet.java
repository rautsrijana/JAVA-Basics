package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Create a new list for each request
        List<SignupDto> signuplist = new ArrayList<SignupDto>();

        // Extract parameters and add to list
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
       
        
        try {
			//step 1 load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded successfully");
			
			//step 2  create the connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_signup","root","Shree@18");
			System.out.println("connection has been created");
			
			
			
			//step 3 fire the query
			String sql;
            if (id != null && !id.trim().isEmpty()) {
                // If 'id' is present, it's an update operation
                sql = "UPDATE users SET username=?, password=?, email=?, gender=? WHERE id=?";
            } else {
                // If 'id' is not present, it's an insert operation
                sql = "INSERT INTO users(username, password, email, gender) VALUES(?,?,?,?)";
            }
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			//set the value in placeholder
			pstm.setString(1, username);
			pstm.setString(2, password);
			pstm.setString(3, email);
			pstm.setString(4, gender);
			
			
			if (id != null && !id.isEmpty()) {
                // Only set the ID for an update operation
                pstm.setInt(5, Integer.parseInt(id));
            }

            int rowsAffected = pstm.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Update - Operation successful");
            } else {
                System.out.println("Operation failed");
            }
            
//			pstm.executeUpdate();
			System.out.println("Insert - inserted successfully");
			
			}catch(Exception e) {
				e.printStackTrace();
			}
        
//        SignupDto signupdto = new SignupDto(username, password, email, gender);
//        signuplist.add(signupdto);

        // Set attributes and forward request
//        req.setAttribute("email", email);
//        req.setAttribute("message", "Data has been saved");
//        req.setAttribute("sdata", signuplist);
        req.getRequestDispatcher("success.jsp").forward(req, resp);
    }
}
