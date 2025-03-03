<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>Product List</h1>
    <a href="${pageContext.request.contextPath}/registProduct.jsp">Add New Product</a>
    <a href="${pageContext.request.contextPath}/justViewCart.jsp">장바구니로</a>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Stock</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.description}</td>
                <td>${product.price}</td>
                <td>${product.stock}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/addToCart.jsp?id=${product.id}">Add to Cart</a>
                    <a href="${pageContext.request.contextPath}/selectOneForUpdate.jsp?id=${product.id}">Edit</a>
                    <a href="${pageContext.request.contextPath}/deleteProduct.jsp?id=${product.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
<script type="text/javascript">
let flag = ${flag};
if (flag) {
	alert("선택하신 상품은 삭제하실 수 없습니다.");
}
</script>

</body>
</html>