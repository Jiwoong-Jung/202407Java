<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
    request.setCharacterEncoding("utf-8");

    Class.forName("com.mysql.cj.jdbc.Driver");
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/spring5fs", "root", "mysql");
        Statement stmt = conn.createStatement();
    ) {
        // 회원 정보 양식에 입력된 값을 DB에 저장
        stmt.executeUpdate(String.format(
                "update member set pw='%s', name='%s' where id='%s'",
                request.getParameter("pw"  ),
                request.getParameter("name"),
                request.getParameter("id"  )));
        
        // 사용자 이름을 담은 세션 속성도 업데이트
        // 아이디는 바뀌지 않지만, 사용자 이름은 바뀔 수 있기 때문임
        session.setAttribute("userName", request.getParameter("name"));
        
    } catch(Exception e) {
        e.printStackTrace();
    } 
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
    alert('수정이 완료되었습니다.');
    opener.location.reload(true);  // 사용자 이름이 바뀌었으면 바로 반영
    window.close();
</script>

</body>
</html>