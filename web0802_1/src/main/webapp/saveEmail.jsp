<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이메일을 쿠키에 저장하려는 폼</title>
</head>
<body>
<form action="saveEmailResult.jsp" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="" required>
        <input type="submit" value="이메일 쿠키 저장">
    </form>
</body>
</html>