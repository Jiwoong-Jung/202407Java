package java0730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Ex7 {

	public static void main(String[] args) {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		List<Score> list = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(URL, "root", "mysql");
		             Statement stmt = conn.createStatement();
		             ResultSet rs = stmt.executeQuery("SELECT * FROM score")) {
			while (rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				list.add(new Score(num, name, kor, eng, math));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);

	}

}
