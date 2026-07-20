<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to the Employee JSP Page	</h1>
	<%! int a=10;
	String name="Rohit";
	
	
	public String name()
	{
	return "Spring Boot";
	}
	%>
	<%
	if(a>20)
	{
		a=0;
	}
	else
	{
		a = -100;
	}
	%>
	<%= a%>
	<%= name%>
	<%= name() %>
</body>
</html>