<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>장바구니</title>
</head>
<body>
    <h1>장바구니 List</h1>
    <a href="${pageContext.request.contextPath}/products.jsp">상품목록으로</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>이름</th>
            <th>설명</th>
            <th>가격</th>
            <th>수량</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="product" items="${list}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td>${product.quantity}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/products/${product.id}">none</a>
                    <a href="${pageContext.request.contextPath}/selectOneForUpdate.jsp?id=${product.id}">none</a>
                    <a href="${pageContext.request.contextPath}/products/delete/${product.id}">none</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>