<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%String subject = (String) request.getAttribute("subject");
		  String course = (String) request.getAttribute("course");
		%>
		
		<h1><%=subject%></h1>
		<h1><%=course%></h1>
</body>
</html>