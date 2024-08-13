<%@page import="webhard.Webhard"%>
<%@page import="webhard.WebhardDAO"%>
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
        	WebhardDAO dao = new WebhardDAO();
            // 현재 시간 얻기
            String curTime = LocalDate.now() + " " +
                             LocalTime.now().toString().substring(0, 8);
            Webhard webhard = new Webhard(0, file.getName(), curTime, (int)file.length());
			dao.addWebhard(webhard);
            
            response.sendRedirect("webhard.jsp");

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