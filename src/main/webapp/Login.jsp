<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

out.print(request.getAttribute("msg"));

%>
<form action="LoginServlet1" method="post">
<table align="center">
<tr>
  <td>Enter User Name:- </td>
  <td><input type="text" name="uname"></td>
</tr>

<tr>
  <td>Enter Password :- </td>
  <td><input type="Password" name="password"></td>
</tr>

<tr>
  <td>Email id :- </td>
  <td><input type="Email" name="Email"></td>
</tr>

<tr>
  <td></td>
  <td><input type="submit"></td>
</tr>

</table>
</form>
</body>
</html>