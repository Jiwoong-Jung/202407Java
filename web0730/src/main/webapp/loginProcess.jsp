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
    users.put("user1", "password1");
    users.put("user2", "password2");

    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (users.containsKey(username) && users.get(username).equals(password)) {
        out.println("<h2>Login successful! Welcome, " + username + ".</h2>");
    } else {
        out.println("<h2>Login failed! Invalid username or password.</h2>");
    }
%>
</body>
</html>