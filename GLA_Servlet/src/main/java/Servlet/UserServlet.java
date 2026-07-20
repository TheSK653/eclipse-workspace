package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/users")
public class UserServlet extends GenericServlet {
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Business Logic for User Servlets");
		
		arg1.setContentType("text/html");
		PrintWriter pw = arg1.getWriter();
		pw.println("<h3> Welcome to the Users servlet class </h3>");
		String name =(String) arg0.getAttribute("course");
		pw.print("<h1>"+name+"</h1>");
	}
}