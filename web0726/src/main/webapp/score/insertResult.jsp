<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");

String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
//out.println("드라이버 로딩!!");
conn = DriverManager.getConnection(URL, "root", "mysql");
//out.println("mysql 접속!!");
String sql = "insert into score(num, name, kor, eng, math) values (?,?,?,?,?)";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, num);
pstmt.setString(2, name);
pstmt.setString(3, kor);
pstmt.setString(4, eng);
pstmt.setString(5, math);
int ret = pstmt.executeUpdate();
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<%
if (ret == 1) {
	out.println("입력 성공!");
} else {
	out.println("입력 실패!");
}
%>

</body>
</html>