<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.File" %>
    
<% 
    int num = Integer.parseInt(request.getParameter("num"));

    Class.forName("com.mysql.cj.jdbc.Driver");
    try ( 
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/spring5fs", "root", "mysql");
        Statement stmt = conn.createStatement();            
        
        // 삭제할 파일의 정보를 읽어오는 쿼리 (파일명을 알기 위해)
        ResultSet rs = stmt.executeQuery(
                "select * from webhard where num=" + num);
    ) {
        if (rs.next()) {

            // 지정된 파일 삭제
            File file = new File(application.getRealPath("/files/") +
                                 rs.getString("fname"));
            if (file != null) {
                file.delete();
            }
            
            // DB에서 파일 정보를 삭제
            stmt.executeUpdate(
                    "delete from webhard where num=" + num);
        }

    } catch(Exception e) {
        e.printStackTrace();
    }
    
    response.sendRedirect("webhard.jsp");
%>