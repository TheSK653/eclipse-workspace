package Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet  extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,java.io.IOException
	{
		System.out.println("Hello Servlet is called");
		req.setAttribute("course", "Java Full Stack");
		
		RequestDispatcher rd = req.getRequestDispatcher("users");
		rd.forward(req, res);
	}
}