<%@page import="shop.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");

ProductDAO productDAO = new ProductDAO();
boolean ret = productDAO.deleteProduct(Integer.parseInt(id));
request.setAttribute("flag", ret);
%>
<jsp:forward page="products.jsp"/>