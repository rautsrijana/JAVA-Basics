package thothweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class NewLoginDemo extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		if("srijana".equalsIgnoreCase(username)&&"raut".equalsIgnoreCase(password)) {
			//resp.getWriter().print("<h1>Successfully login</h1>");
			req.getRequestDispatcher("success.html").forward(req, resp);
		}else {
			//resp.getWriter().print("<h1>Failure </h1>");
			req.getRequestDispatcher("fail.html").forward(req, resp);
		}
		
		
		
		
	}
	
	

}