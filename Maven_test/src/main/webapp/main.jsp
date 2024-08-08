<%@page import="dept.DeptDTO"%>
<%@page import="java.util.List"%>
<%@page import="dept.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
DeptDAO dao = new DeptDAO();
int deptno = dao.searchDeptno("SALES");
System.out.println(deptno);
List<DeptDTO> list = dao.listDept();
for (DeptDTO dto : list) {
	out.println(dto+"<br>");
}
%>
</body>
</html>