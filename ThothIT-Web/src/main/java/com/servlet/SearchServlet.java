package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchdata")
public class SearchServlet extends HttpServlet {
    
    private List<SignupDto> signuplist = new ArrayList<SignupDto>();
    
    @Override
    public void init() throws ServletException {
        SignupDto dto1 = new SignupDto("srijana", "test@123", "srijana@gmail.com", "female");
        SignupDto dto2 = new SignupDto("srij", "test@123445", "sraut@gmail.com", "female");
        SignupDto dto3 = new SignupDto("Hem", "training@123", "hem@gmail.com", "male");
        SignupDto dto4 = new SignupDto("john", "john@123", "john@gmail.com", "male");
        signuplist.add(dto1);
        signuplist.add(dto2);
        signuplist.add(dto3);
        signuplist.add(dto4);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String searchText = req.getParameter("searchText");
        
        List<SignupDto> searchresultlist = new ArrayList<SignupDto>();
        
        if (searchText != null && !searchText.isEmpty()) {
            for (SignupDto signupdto : signuplist) {
                if (searchText.equalsIgnoreCase(signupdto.getUsername()) ||
                    searchText.equalsIgnoreCase(signupdto.getEmail()) ||
                    searchText.equalsIgnoreCase(signupdto.getGender()) ||
                    searchText.equalsIgnoreCase(signupdto.getPassword())) {
                    searchresultlist.add(signupdto);
                }
            }
        }
        
        // Setting the search results in request scope and forwarding to a JSP page
        req.setAttribute("searchResults", searchresultlist);
        req.getRequestDispatcher("/search.jsp").forward(req, resp);
    }
}
