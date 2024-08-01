<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    Cookie[] cookies = request.getCookies();
    String username = null;
	boolean flag = false;
	
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                username = cookie.getValue();
                flag = true;
                break;
            }
        }
    }

if (flag) {
%>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>

<h1>홈페이지</h1>
</body>
</html>
<%
} else {
	out.println("<script type='text/javascript'>");
    out.println("alert('로그인 하세요!');");
    out.println("window.location.href = 'index.jsp';");
    out.println("</script>");
}
%>