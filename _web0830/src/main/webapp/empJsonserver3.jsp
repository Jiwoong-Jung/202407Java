<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, org.json.*" %>
<%
    String jdbcUrl = "jdbc:mysql://localhost:3307/spring5fs";
    String jdbcUser = "root";
    String jdbcPassword = "mysql";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    String action = "";
    String responseJson = "";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

        // JSON 데이터 파싱
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = request.getReader().readLine()) != null) {
            sb.append(line);
        }
        System.out.println(sb);
        JSONObject jsonData = new JSONObject(sb.toString());
        action = jsonData.getString("action");
        
        if ("create".equalsIgnoreCase(action)) {
        	String ename = jsonData.getString("ename");
            String job = jsonData.getString("job");
            int mgr = jsonData.getInt("mgr");
            String hiredate = jsonData.getString("hiredate");
            double sal = jsonData.getDouble("sal");
            double comm = jsonData.getDouble("comm");
            int deptno = jsonData.getInt("deptno");

            String sql = "INSERT INTO emp (ename, job, mgr, hiredate, sal, comm, deptno) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ename);
            pstmt.setString(2, job);
            pstmt.setInt(3, mgr);
            pstmt.setString(4, hiredate);
            pstmt.setDouble(5, sal);
            pstmt.setDouble(6, comm);
            pstmt.setInt(7, deptno);
            int rows = pstmt.executeUpdate();
            responseJson = "{\"status\":\"success\",\"rows\":" + rows + "}";

        } else if ("read".equalsIgnoreCase(action)) {
            String sql = "SELECT * FROM emp";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            JSONArray jsonArray = new JSONArray();
            while (rs.next()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("empno", rs.getInt("empno"));
                jsonObject.put("ename", rs.getString("ename"));
                jsonObject.put("job", rs.getString("job"));
                jsonObject.put("mgr", rs.getInt("mgr"));
                jsonObject.put("hiredate", rs.getDate("hiredate"));
                jsonObject.put("sal", rs.getDouble("sal"));
                jsonObject.put("commn", rs.getDouble("comm"));
                jsonObject.put("deptno", rs.getInt("deptno"));
                jsonArray.put(jsonObject);
            }
            responseJson = jsonArray.toString();

        } else if ("update".equalsIgnoreCase(action)) {
            int empno = jsonData.getInt("empno");
            String ename = jsonData.getString("ename");
            String job = jsonData.getString("job");
            int mgr = jsonData.getInt("mgr");
            String hiredate = jsonData.getString("hiredate");
            double sal = jsonData.getDouble("sal");
            double comm = jsonData.getDouble("comm");
            int deptno = jsonData.getInt("deptno");

            String sql = "UPDATE emp SET ename=?, job=?, mgr=?, hiredate=?, sal=?, comm=?, deptno=? WHERE empno=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, ename);
            pstmt.setString(2, job);
            pstmt.setInt(3, mgr);
            pstmt.setString(4, hiredate);
            pstmt.setDouble(5, sal);
            pstmt.setDouble(6, comm);
            pstmt.setInt(7, deptno);
            pstmt.setInt(8, empno);
            int rows = pstmt.executeUpdate();
            responseJson = "{\"status\":\"success\",\"rows\":" + rows + "}";

        } else if ("delete".equalsIgnoreCase(action)) {
            int id = jsonData.getInt("id");

            String sql = "DELETE FROM emp WHERE id=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            responseJson = "{\"status\":\"success\",\"rows\":" + rows + "}";
        }

    } catch (Exception e) {
        e.printStackTrace();
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        responseJson = "{\"error\":\"An error occurred while processing the request.\"}";
    } finally {
        if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
        if (pstmt != null) try { pstmt.close(); } catch (SQLException ignore) {}
        if (conn != null) try { conn.close(); } catch (SQLException ignore) {}
    }

    out.print(responseJson);
%>