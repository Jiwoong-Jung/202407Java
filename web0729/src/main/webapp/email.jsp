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
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("email".equals(cookie.getName())) {
                    email = cookie.getValue();
                    break;
                }
            }
        }
    %>
    <form action="EmailServlet" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="<%= email %>" required>
        <input type="submit" value="Submit">
    </form>
    <% if (!email.isEmpty()) { %>
        <p>저장된 Email: <%= email %></p>
    <% } %>
</body>
</html>