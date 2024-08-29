<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String num = request.getParameter("deptno");
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
/* path 속성 바꾸기 */
svg path {
  fill: transparent; 
  stroke: red;
  stroke-width: 1;
}
</style>
</head>
<body>
<svg width="200px" height="200px" xmlns="http://www.w3.org/2000/svg" viewBox="-5 -5 448 512"><!--!Font Awesome Free 6.6.0 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path d="M224 112c-8.8 0-16-7.2-16-16l0-16c0-44.2 35.8-80 80-80l16 0c8.8 0 16 7.2 16 16l0 16c0 44.2-35.8 80-80 80l-16 0zM0 288c0-76.3 35.7-160 112-160c27.3 0 59.7 10.3 82.7 19.3c18.8 7.3 39.9 7.3 58.7 0c22.9-8.9 55.4-19.3 82.7-19.3c76.3 0 112 83.7 112 160c0 128-80 224-160 224c-16.5 0-38.1-6.6-51.5-11.3c-8.1-2.8-16.9-2.8-25 0c-13.4 4.7-35 11.3-51.5 11.3C80 512 0 416 0 288z"/></svg>
<ul class="print-data"></ul>
<script>
    let json = null;
    
    const apiUrl = 'http://localhost:3000/emp';
    function readPosts() {
        fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            const printData = document.querySelector('.print-data');
            printData.innerHTML = '';
            data.forEach(post => {
                printData.innerHTML += `<li>empno: ${post.empno} <br>ename: ${post.ename} <br>job: ${post.job}</li>`;
            });
            console.log(printData);
        })
        .catch(error => console.error('Error:', error));
    }
    function createPost(obj) {
        console.log(JSON.stringify(obj));
        fetch(apiUrl, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(obj)
        })
        .then(response => response.json())
        .then(data => {
            console.log('Post created:', data);
        })
        .catch(error => console.error('Error:', error));
    }
		<%
		String sql = "SELECT json_object('empno', empno, 'ename', ename, 'job', job, 'sal', sal) FROM emp";
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			String data = rs.getString(1);
		%>
	json = JSON.parse('<%=data%>');
//	createPost(json);

		<%
		}
		%>
	readPosts();

</script>
</body>
</html>