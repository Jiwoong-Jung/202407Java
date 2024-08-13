<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest,
                 com.oreilly.servlet.multipart.DefaultFileRenamePolicy,
                 java.io.File" %>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<% 
    MultipartRequest multi = new MultipartRequest(
            request,                    // POST 로 전달된 내용을 담은 객체
            application.getRealPath("/files"),   // 파일을 저장할 경로
            100 * 1024 * 1024,                   // 최대 파일 크기 (100MB)
            "utf-8",                             // 인코딩
            new DefaultFileRenamePolicy()        // 동일 파일명 처리 방법
    );

    File file = multi.getFile("upload");         // 파일 객체 얻기
    
    if (file == null)
        out.print("파일 업로드 오류!");
    else {
        out.print("File Name : " + file.getName() + "<br>");
        out.print("File Size : " + file.length()  + "<br>");
    }
%>

</body>
</html>