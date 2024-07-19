package jdbc;
import java.sql.*;

public class TestForJDBC {
	 public static void main(String[] args) {
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e){
			System.err.println("Class Not Found : " + e.getMessage());
		}
		try {
			con = DriverManager.getConnection(URL, "root", "1234");
			System.out.println("Successfully connected to DBMS!");
		} catch(SQLException e){
			System.err.println("SQL Error : " + e.getMessage());
		}
		finally {
			try {
				if (con != null)con.close();
			} catch (Exception e) {}
		}
	}
}
