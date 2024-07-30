<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>

<table>
    <tr>
        <th>제목</th>
        <td>글 제목 2</td>
    </tr>
    <tr>
        <th>작성자</th>
        <td>장길산</td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td>2020-02-06 14:32:25</td>
    </tr>
    <tr>
        <th>조회수</th>
        <td>31</td>
    </tr>
    <tr>
        <th>내용</th>
        <td>글의 내용입니다.</td>
    </tr>
</table>

<br>
<input type="button" value="목록보기" onclick="location.href='list.jsp'">
<input type="button" value="수정"
       onclick="location.href='write.jsp?num=2'">
<input type="button" value="삭제"
       onclick="location.href='delete.jsp?num=2'">

</body>
</html>
