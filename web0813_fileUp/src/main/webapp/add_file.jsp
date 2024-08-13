<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.oreilly.servlet.MultipartRequest,
                 com.oreilly.servlet.multipart.DefaultFileRenamePolicy,
                 java.io.File" %>
<%@ page import="java.time.*" %>

<%
    MultipartRequest multi = new MultipartRequest(
            request,
            application.getRealPath("/files"),   // 파일을 저장할 경로
            100 * 1024 * 1024,                   // 최대 파일 크기 (100MB)
            "utf-8",                             // 인코딩
            new DefaultFileRenamePolicy()        // 동일 파일명 처리 방법
    );

    File file = multi.getFile("upload");         // 파일 객체 얻기

    if (file != null) {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/spring5fs", "root", "mysql");
            Statement stmt = conn.createStatement();
        ) {
            // 현재 시간 얻기
            String curTime = LocalDate.now() + " " +
                             LocalTime.now().toString().substring(0, 8);

            // 쿼리 실행
            stmt.executeUpdate(String.format(
                "insert into webhard (fname, ftime, fsize) " +
                "values ('%s', '%s', %d)",
                file.getName(), curTime, (int)file.length()));

            // 메인 페이지로 돌아가기
            response.sendRedirect("webhard.jsp");
            return;

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<script>
    alert('업로드 실패 !');
    history.back();
</script>

</body>
</html>