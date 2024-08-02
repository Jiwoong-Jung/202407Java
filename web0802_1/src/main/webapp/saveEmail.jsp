<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String email = "";
Cookies cookies = new Cookies(request);
if (cookies.exists("email")) {
	email = cookies.getValue("email");
}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일을 쿠키에 저장하려는 폼</title>
</head>
<body>
<form action="saveEmailResult.jsp" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="<%=email %>" required>
        <input type="submit" value="이메일 쿠키 저장">
    </form>
</body>
</html>