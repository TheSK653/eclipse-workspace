package Servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/form")
public class FormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String course=req.getParameter("course");
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Course: "+course);
		
	}

}
