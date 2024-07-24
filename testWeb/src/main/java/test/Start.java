package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Start
 */
@WebServlet("/Start")
public class Start extends HttpServlet {
	private String driver = null;
	private String url = null;
	private String dbName = null;
	private String user = null;
	private String passwd = null;
	

	public void init(ServletConfig config) throws ServletException {
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3307/";
		dbName = "spring5fs";
		user = "root";
		passwd = "mysql";
		

		try {
			Class.forName(driver);
		} catch(java.lang.ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}


	public void destory() {
		driver = null;
		url = null;
		dbName = null;
		user = null;
		passwd = null;
	}
		
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf8");
		

		PrintWriter out = response.getWriter();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		String query = "select * from dept";

		try {

			con = DriverManager.getConnection(url+dbName, user, passwd);
			stmt = con.createStatement();
			result = stmt.executeQuery(query);
			
			out.println("고객 정보<br>");
			out.println("=============================================<br>");
			out.println("고객번호&nbsp;&nbsp; 고객명&nbsp;&nbsp; ");
			out.println("전화번호&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 주소<br>");
			out.println("=============================================<br>");
			while (result.next()) { 
				String resultStr = result.getString(1); 
				resultStr += "&nbsp;&nbsp;&nbsp;&nbsp; ";
				resultStr += result.getString(2) + "&nbsp;&nbsp; ";
				resultStr +=  result.getString(3) + "&nbsp;&nbsp; ";
//				resultStr += result.getString(4);
				out.println(resultStr + "<br>");
			}
			out.println("=============================================<br>");
			out.println("<a href='https://www.naver.com'>네이버</a>");
			out.println("<a href='home.jsp'>홈</a>");

		} catch(SQLException e) {
			e.printStackTrace(out);
		} finally {
			try {
				if (result != null) result.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {}
		}
	}

}
