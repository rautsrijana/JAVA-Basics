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

@WebServlet("/dsignup")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pid = req.getParameter("id");

        List<SignupDto> signupDtos = new ArrayList<>();
        try {
            // Step 1: Load the driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Create the connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_signup", "root", "Shree@18");

            // Delete query
            String dquery = "delete from users where id = ?";
            PreparedStatement pstm = conn.prepareStatement(dquery);
            pstm.setInt(1, Integer.parseInt(pid));
            pstm.executeUpdate(); // Execute delete operation

            // Retrieve the updated list of users
            String query = "select * from users"; // Adjust the query as needed to select the appropriate columns
            pstm = conn.prepareStatement(query);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                SignupDto signupDto = new SignupDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                signupDtos.add(signupDto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        req.setAttribute("message", "Data has been retrieved");
        req.setAttribute("sdata", signupDtos);
        req.getRequestDispatcher("slist.jsp").forward(req, resp);
    }
}
