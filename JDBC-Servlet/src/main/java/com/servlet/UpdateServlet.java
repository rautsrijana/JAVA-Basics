package com.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get data");
	}
    
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Extract form parameters
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");

        try {
            // Establish database connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_signup", "root", "Shree@18");
            
            String updateQuery = "UPDATE users SET username=?, password=?, email=?, gender=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(updateQuery);
          
             
           
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, gender);
            ps.setInt(5, Integer.parseInt(id));
            
            int updated = ps.executeUpdate();
            if (updated > 0) {
                System.out.println("User updated successfully");
            } else {
                System.out.println("User update failed");
            }
                
            
        } catch (Exception e) {
            e.printStackTrace();
        }

//        resp.sendRedirect("signup.jsp");
        // Forward to signup.jsp with pre-populated data for the selected user
        req.getRequestDispatcher("/signup.jsp").forward(req, resp);
    }
}
