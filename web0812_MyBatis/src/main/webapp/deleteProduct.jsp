<%@page import="shop.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");

ProductDAO productDAO = new ProductDAO();
productDAO.deleteProduct(Integer.parseInt(id));
%>
<jsp:forward page="products.jsp"/>