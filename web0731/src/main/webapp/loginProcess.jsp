<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Process</title>
</head>
<body>
<%
    // Sample user data
    Map<String, String> users = new HashMap<>();
    users.put("user1", "pass1");
    users.put("user2", "pass2");

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (users.containsKey(username) && users.get(username).equals(password)) {
        out.println("<h2>Login 성공! Welcome, " + username + ".</h2>");
     
    
    } else {
    	out.println("<h2>Login 실패.</h2>");
    }

%>
</body>
</html>