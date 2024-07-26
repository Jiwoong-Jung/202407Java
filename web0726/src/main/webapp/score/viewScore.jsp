<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
//out.println("드라이버 로딩!!");
conn = DriverManager.getConnection(URL, "root", "mysql");
//out.println("mysql 접속!!");
String sql = "select * from score";
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width: 600px; text-align: left; }
        th    { width: 40px; background-color: cyan; }
    </style>  
<title>학생 전체 성적</title>
</head>
<body>
<table>
	<tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
    </tr>
<%
while(rs.next()) {
	String num = rs.getString("num");
	String name = rs.getString("name");
	String kor = rs.getString("kor");
	String eng = rs.getString("eng");
	String math = rs.getString("math");
	int tot = Integer.parseInt(kor)+Integer.parseInt(eng)+Integer.parseInt(math);
	double avg = tot / 3.0;
%>
<tr>
<td><%=num %></td><td><%=name %></td><td><%=kor %></td><td><%=eng %></td><td><%=math %></td>
<td><%=tot %></td><td><%=avg %></td>
</tr>
<%	
}
%>
</table>
</body>
</html>