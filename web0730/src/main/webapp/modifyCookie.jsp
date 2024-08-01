<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 변경</title>
</head>
<body>
<%
Cookie[] cookies = request.getCookies();
if (cookies != null && cookies.length > 0) {
	for (int i=0; i < cookies.length; i++) {
		if (cookies[i].getName().equals("username")) {
			Cookie cookie = new Cookie("username", "user2");   // key, value
			response.addCookie(cookie);
		}
	}
}

%>
loginid 쿠키 변경
</body>
</html>