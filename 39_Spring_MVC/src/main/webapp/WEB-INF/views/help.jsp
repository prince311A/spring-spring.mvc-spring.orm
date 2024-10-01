<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>This is Help Page</h1>
<h2>Sending data from Controller Dynamically</h2>
<%
 /* Method 1 Directly print with getAttribute() */
String name = (String)request.getAttribute("name");
String city = (String)request.getAttribute("city");
LocalDateTime localDateTime = (LocalDateTime)request.getAttribute("time");
%>
<h3><%=name %></h3>
<h4><%=city %></h4>
<h2><%=localDateTime %></h2>
</body>
</html>