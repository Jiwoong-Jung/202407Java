<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    request.setAttribute("name", "홍길동");
    request.setAttribute("money", 5000);
    request.setAttribute("dataList", new String[] {"a", "b", "c"}); 
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JSTL if  -->
<c:if test="${name == '홍길동'}">
    이름은 홍길동입니다.<br>
</c:if>
</body>
</html>