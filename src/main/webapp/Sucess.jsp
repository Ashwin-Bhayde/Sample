<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

List<String> ulist =(List<String>)request.getAttribute("data");
String uname = (String)request.getAttribute("uname");
%>

<ul> 
<%
for(String u : ulist)
{
	
%>
<li><%=u %></li>
<%
}
%>
</ul>
</body>
</html>