<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String find =request.getParameter("find");
out.println(find);
String num = request.getParameter("num");
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");
String sql = "";
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");

conn = DriverManager.getConnection(URL, "root", "mysql");

if (num != null) {
	sql = "insert into score(num, name, kor, eng, math) values (?,?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, num);
	pstmt.setString(2, name);
	pstmt.setString(3, kor);
	pstmt.setString(4, eng);
	pstmt.setString(5, math);
	int ret = pstmt.executeUpdate();
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
	학번: <input type="text" name="num"><br>
	이름: <input type="text" name="name"><br>
    국어: <input type="text" name="kor"><br>
    영어: <input type="text" name="eng"><br>
    수학: <input type="text" name="math"><br>
    <input type="submit" value="확인"> 
</form>
<table>
	<tr>
        <th>번호</th><th>이름</th>
        <th>국어</th><th>영어</th><th>수학</th>
        <th>총점</th><th>평균</th>
    </tr>
<%
sql = "select * from score";
pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();

while(rs.next()) {
	String num1 = rs.getString("num");
	String name1 = rs.getString("name");
	String kor1 = rs.getString("kor");
	String eng1 = rs.getString("eng");
	String math1 = rs.getString("math");
	int tot = Integer.parseInt(kor1)+Integer.parseInt(eng1)+Integer.parseInt(math1);
	double avg = tot / 3.0;
%>
<tr>
<td><a href="manageScore.jsp?find=<%=num1%>"><%=num1 %></a></td><td><%=name1 %></td><td><%=kor1 %></td><td><%=eng1 %></td><td><%=math1 %></td>
<td><%=tot %></td><td><%=avg %></td>
</tr>
<%	
}
%>
</table>
</body>
</html>