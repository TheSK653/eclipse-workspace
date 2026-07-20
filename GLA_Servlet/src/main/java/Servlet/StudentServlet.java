package Servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class StudentServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Destoryed method has been called ");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Intilization of Struden Servlet");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service method has been called");
		arg1.setContentType("text/html");
		arg1.getWriter().println("<h1>Welcome to Student Servlet</h1>");
		
		RequestDispatcher rd=arg0.getRequestDispatcher("emp");
		rd.include(arg0, arg1);
		
	}

}