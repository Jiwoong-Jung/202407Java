<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 데이터베이스 접속
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");
//임시 저장 변수들
String numTmp = "";
String nameTmp = "";
String korTmp = "";
String engTmp = "";
String mathTmp = "";
String sqlTmp = "";
// 매개변수들
request.setCharacterEncoding("UTF-8");        // 한글 처리
String find = request.getParameter("find");   // update시 반드시 넘어오는 매개변수
String num = request.getParameter("num");     // null이면 오류
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");
%>    
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
	학번: <input type="text" name="num" value="<%=numTmp %>"><br>
	이름: <input type="text" name="name" value="<%=nameTmp %>"><br>
    국어: <input type="text" name="kor" value="<%=korTmp %>"><br>
    영어: <input type="text" name="eng" value="<%=engTmp %>"><br>
    수학: <input type="text" name="math" value="<%=mathTmp %>"><br>
    <input type="submit" value="입력/수정">
</form>
<table>
<tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th><th>삭제</th>
</tr>

<%
sqlTmp = "select * from score";
pstmt = conn.prepareStatement(sqlTmp);
ResultSet rs = pstmt.executeQuery();

while(rs.next()) {
	numTmp = rs.getString("num");
	nameTmp = rs.getString("name");
	korTmp = rs.getString("kor");
	engTmp = rs.getString("eng");
	mathTmp = rs.getString("math");
	int tot = Integer.parseInt(korTmp)+Integer.parseInt(engTmp)+Integer.parseInt(mathTmp);
	double avg = tot / 3.0;
%>	
	<tr>
	<td><%=numTmp %></td><td><%=nameTmp %></td><td><%=korTmp %></td>
	<td><%=engTmp %></td><td><%=mathTmp %></td><td><%=tot %></td><td><%=avg %></td>
	</tr>
<%
}
%>

</table>
</body>
</html>