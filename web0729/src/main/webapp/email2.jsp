<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
    <title>Email Input</title>
</head>
<body>
    <h1>Enter Your Email</h1>
    <%
        String email = "";
        boolean rememberMe = false;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("email".equals(cookie.getName())) {
                    email = cookie.getValue();
                    rememberMe = true;
                    break;
                }
            }
        }
    %>
    <form action="EmailServlet2" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="<%= email %>" required>
        <br>
        <input type="checkbox" id="rememberMe" name="rememberMe" <%= rememberMe ? "checked" : "" %>>
        <label for="rememberMe">Remember Me</label>
        <br>
        <input type="submit" value="Submit">
    </form>
    <% if (!email.isEmpty()) { %>
        <p>Saved Email: <%= email %></p>
    <% } %>
</body>
</html>