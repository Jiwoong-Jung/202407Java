<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>제품 목록</title>
</head>
<body>
    <h1>제품 목록</h1>
    <ul>
        <li>
            제품 1 - 1000원
            <form action="process.jsp" method="post">
                <input type="hidden" name="product" value="제품 1">
                <input type="hidden" name="price" value="1000">
                <input type="submit" value="카트에 넣기">
            </form>
        </li>
        <li>
            제품 2 - 2000원
            <form action="process.jsp" method="post">
                <input type="hidden" name="product" value="제품 2">
                <input type="hidden" name="price" value="2000">
                <input type="submit" value="카트에 넣기">
            </form>
        </li>
    </ul>
    <a href="cart.jsp">카트 보기</a>
</body>
</html>