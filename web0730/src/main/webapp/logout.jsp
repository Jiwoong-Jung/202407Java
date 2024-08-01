<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                cookie.setMaxAge(0); // 쿠키 삭제
                response.addCookie(cookie);
                break;
            }
        }
    }

    response.sendRedirect("index.jsp");
%>