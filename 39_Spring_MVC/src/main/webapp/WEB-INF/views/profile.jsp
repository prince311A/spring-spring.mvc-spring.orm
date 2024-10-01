<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
<h1>Welcome to Profile Page</h1>
<h2>Name : ${user.getName() }</h2>
<h3>Email : ${user.getEmail() }</h3>
<h3>Phone: ${user.getPhone() }</h3>
<h3>Password : ${user.getPassword() }</h3>
</body>
</html>