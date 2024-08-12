<%@page import="shop.Product"%>
<%@page import="shop.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");

ProductDAO productDAO = new ProductDAO();
Product product = productDAO.getProductById(Integer.parseInt(id));
request.setAttribute("product", product);
%>
<jsp:forward page="modifyProduct.jsp"/>
