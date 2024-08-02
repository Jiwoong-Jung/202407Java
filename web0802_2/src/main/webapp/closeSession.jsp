<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//session.invalidate(); // 세션 모두 삭제
session.removeAttribute("key2");  // 일부 삭제
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션 삭제
</body>
</html>