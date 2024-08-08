<%@page import="board.BoardDTO"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
dao.deleteBoard(Integer.parseInt(num));
response.sendRedirect("list.jsp");
%>    
