<%@page import="shop.ProductDAO"%>
<%@page import="shop.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
ProductDAO productDAO = new ProductDAO();
List<Product> products = productDAO.getAllProducts();
request.setAttribute("products", products);
%>
<jsp:forward page="productList.jsp"/>
