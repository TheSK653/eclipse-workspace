<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%String name = (String) request.getAttribute("name");
		  String email = (String) request.getAttribute("email");
		  String course = (String) request.getAttribute("course");
		%>
		
		<h1><%=name%></h1>
		<h1><%=email%></h1>
		<h1><%=course%></h1>
</body>
</html>