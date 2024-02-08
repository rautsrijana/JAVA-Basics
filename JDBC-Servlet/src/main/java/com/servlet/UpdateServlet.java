package com.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usignup")
public class UpdateServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_signup", "root", "Shree@18");
            
            String selectQuery = "SELECT * FROM users WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(selectQuery);
            ps.setInt(1, Integer.parseInt(id));
            
            
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Map<String, Object> user = new HashMap<>();
                user.put("id", rs.getInt("id"));
                user.put("username", rs.getString("username"));
                user.put("email", rs.getString("email"));
                user.put("gender", rs.getString("gender"));
                // Add other fields as necessary
                req.setAttribute("user", user);
            }

//            if (rs.next()) {
//                req.setAttribute("user", rs);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        req.getRequestDispatcher("/signup.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");

        try {
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
        
        System.out.println("Updated Successfully!");
//        resp.sendRedirect("signup.jsp"); // Consider redirecting to a success page or showing a success message
        req.getRequestDispatcher("success.jsp").forward(req, resp);
    }
}
