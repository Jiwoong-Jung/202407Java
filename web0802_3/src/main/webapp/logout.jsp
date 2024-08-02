<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    session.removeAttribute("userId"  );
    session.removeAttribute("userName");

    response.sendRedirect("login_main.jsp"); // 로그인 메인 화면으로
%> 
