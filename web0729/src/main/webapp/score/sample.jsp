<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <style>
        table { width: 600px; text-align: left; }
        th    { width: 40px; background-color: cyan; }
    </style>
<title>학생 점수 관리 프로그램</title>
</head>
<body>
<form>
	학번: <input type="text" name="num" value=""><br>
	이름: <input type="text" name="name" value=""><br>
    국어: <input type="text" name="kor" value=""><br>
    영어: <input type="text" name="eng" value=""><br>
    수학: <input type="text" name="math" value=""><br>
    <input type="submit" value="입력/수정">
</form>
<table>
<tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th><th>삭제</th>
</tr>
</table>
</body>
</html>