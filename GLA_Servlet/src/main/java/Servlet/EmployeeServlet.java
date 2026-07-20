package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/emp")
public class EmployeeServlet implements Servlet {

	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destoryed method has been called ");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Intilization of Employee Servlet");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Business Logic for Employee Servlets");
		
		arg1.setContentType("text/html");
		PrintWriter pw = arg1.getWriter();
		pw.println("<h1> Welcome to the Employee servlet class </h1>");
	}
}