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
String find = request.getParameter("find");   // update하기 전 학번을 클릭하면 넘어오는 매개변수값
String num = request.getParameter("num");     // null이면 insert나 update를 하지 말아야
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");
String delete = request.getParameter("delete");

if (delete != null) {
	sqlTmp = "delete from score where num = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, delete);
	int ret = pstmt.executeUpdate();
}

// update하기 전 학번을 클릭하면
if (find != null) {
	sqlTmp = "select * from score where num = ?";
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, find);
	ResultSet rs = pstmt.executeQuery();
	if (rs.next()) {
		numTmp = rs.getString("num");
		nameTmp = rs.getString("name");
		korTmp = rs.getString("kor");
		engTmp = rs.getString("eng");
		mathTmp = rs.getString("math");
	}
}

// 학번이 null이 아니면 이미 입력된 학번인지 조회
if (num != null) {
	sqlTmp = "select count(*) from score where num = ?";  // 이미 있는 학번 조회 (있으면 1을 가져옴)
	pstmt = conn.prepareStatement(sqlTmp);
	pstmt.setString(1, num);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	int cnt = rs.getInt(1);  // 0: insert, 1: update
	if (cnt == 1) { // 정보 수정
		sqlTmp = "update score set name = ?, kor = ?, eng = ?, math = ? where num = ?";
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1, name);
		pstmt.setString(2, kor);
		pstmt.setString(3, eng);
		pstmt.setString(4, math);
		pstmt.setString(5, num);
		int ret = pstmt.executeUpdate();
	} else { //정보 입력
		sqlTmp = "insert into score(num, name, kor, eng, math) values (?,?,?,?,?)";
		pstmt = conn.prepareStatement(sqlTmp);
		pstmt.setString(1, num);
		pstmt.setString(2, name);
		pstmt.setString(3, kor);
		pstmt.setString(4, eng);
		pstmt.setString(5, math);
		int ret = pstmt.executeUpdate();
	}
}
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
	<td><a href="?find=<%=numTmp %>"><%=numTmp %></a></td><td><%=nameTmp %></td><td><%=korTmp %></td>
	<td><%=engTmp %></td><td><%=mathTmp %></td><td><%=tot %></td><td><%=avg %></td>
	<td><button  onclick="location.href='?delete=<%=numTmp%>'" >삭제</button></td>
	</tr>
<%
}
%>

</table>
</body>
</html>