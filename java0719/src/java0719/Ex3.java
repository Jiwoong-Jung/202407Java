package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex3 {

	public static void main(String[] args) {
		String createString = "CREATE TABLE customer " + 
				"(customer_id char(6) not null primary key, " +
				"customer_name varchar(15) not null, " +
				"customer_tel varchar(13), " + 
		        "customer_addr varchar(20))";
		
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("Mysql 접속 성공!");
			stmt = con.createStatement();
			int num = stmt.executeUpdate(createString);
			System.out.println("테이블 생성! "+ num);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
