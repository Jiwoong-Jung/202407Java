<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO2"%>
<%@page import="dept.DeptDTO"%>
<%@page import="java.util.List"%>
<%@page import="dept.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
BoardDAO2 dao = new BoardDAO2();
List<BoardDTO> list = dao.listBoard();
for (BoardDTO dto : list) {
	out.println(dto+"<br>");
}
%>
</body>
</html>