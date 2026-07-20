<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
<h1>Welcome to Student JSP page</h1>

<%
ArrayList<String> a1 = new ArrayList<>();
a1.add("Rohit");
a1.add("Soham");
a1.add("Sam");
for(String s : a1)
{
    %>
    <br>
    <%= s %>
    <%
}
%>
</body>
</html>