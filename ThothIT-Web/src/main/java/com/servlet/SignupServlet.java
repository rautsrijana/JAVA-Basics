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
public class SignupServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Create a new list for each request
        List<SignupDto> signuplist = new ArrayList<SignupDto>();

        // Extract parameters and add to list
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");

        SignupDto signupdto = new SignupDto(username, password, email, gender);
        signuplist.add(signupdto);

        // Set attributes and forward request
        req.setAttribute("email", email);
        req.setAttribute("message", "Data has been saved");
        req.setAttribute("sdata", signuplist);
        req.getRequestDispatcher("slist.jsp").forward(req, resp);
    }
}
