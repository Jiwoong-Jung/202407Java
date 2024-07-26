<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>While Example</h1>
<%
request.setCharacterEncoding("UTF-8");
String msg = request.getParameter("msg");
int number = Integer.parseInt(request.getParameter("number"));
for (int i=0; i < number; i++) {
%>
	<p><%=msg %></p>
<%
}
%>