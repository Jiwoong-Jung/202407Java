<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Cookie cookie = new Cookie("username", "강철수");   // key, value
response.addCookie(cookie);
 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 만들기</title>
</head>
<body>
<%= cookie.getName() %><br>
<%= cookie.getValue() %>
</body>
</html>