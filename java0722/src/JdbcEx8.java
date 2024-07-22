import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEx8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		Statement stmt = null;
		String sql2 = "SELECT max(deptno) as max FROM dept";
		System.out.print("부서명:");
		String strName = scanner.nextLine();
		System.out.print("부서지역:");
		String strLoc = scanner.nextLine();
		String sql = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("접속 성공!!");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql2);
			rs.next();
			int maxNo = rs.getInt("max");
			System.out.println(maxNo);
			
			sql = String.format("insert into dept(deptno, dname, loc) values (%d, '%s', '%s')",
					                                                          maxNo+1, strName, strLoc);
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건을 입력!!");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
