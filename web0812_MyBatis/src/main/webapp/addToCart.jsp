<%@page import="shop.ProductDAO"%>
<%@page import="shop.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
CartDAO dao = new CartDAO();
ProductDAO pdao = new ProductDAO();
System.out.println(pdao.countProducts(Integer.parseInt(id)));
if (pdao.countProducts(Integer.parseInt(id)) <= 0) {

	System.out.println("장바구니에 담을 수량이 부족합니다!");
	request.setAttribute("flag", true);
} else {
	pdao.decreaseStock(Integer.parseInt(id));
	
	dao.addToCart(Integer.parseInt(id));
}

request.setAttribute("list", dao.viewCart());
%>
<jsp:forward page="viewCart.jsp"/>
