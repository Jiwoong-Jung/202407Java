<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//데이터베이스 접속
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
	width: 680px;
	text-align: center;
}

th {
	background-color: cyan;
}

.num {
	width: 80px;
}

.title {
	width: 230px;
}

.writer {
	width: 100px;
}

.regtime {
	width: 180px;
}

a:link {
	text-decoration: none;
	color: blue;
}

a:visited {
	text-decoration: none;
	color: gray;
}

a:hover {
	text-decoration: none;
	color: red;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th class="num">부서번호</th>
			<th class="title">부서명</th>
			<th class="writer">지역</th>
		</tr>
		<%
		String sql = "select * from dept";
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			String deptno = rs.getString("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
		%>
		<tr>
			<td><a href='javascript:callEmp(<%=deptno%>);'><%=deptno%></a></td>
			<td><%=dname%></td>
			<td><%=loc%></td>
		</tr>
		<%
		}
		%>
	</table>
	<hr>
	<div id="result"></div>
	<script type="text/javascript">
	function callEmp(deptno) {
		const xhr = new XMLHttpRequest();
        xhr.open('get', 'emp.jsp?deptno='+deptno, true);
        xhr.send();
        //
        xhr.onreadystatechange = function () {
            if (xhr.readyState === XMLHttpRequest.DONE) {
                if (xhr.status === 200) {
                    document.getElementById('result').innerHTML = xhr.responseText;
                } else {
                    console.error('Error!');
                }
            }
        }
	}
	</script>
</body>
</html>