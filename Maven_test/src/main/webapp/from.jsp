
<%@page import="mmm.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
Member mb = new Member(1, "가나다");
request.setAttribute("gugu", "7");
request.setAttribute("cc", mb);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>From 페이지</h1>
<jsp:forward page="to.jsp"/>
</body>
</html>