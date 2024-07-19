package jdbc;
import java.sql.*;

public class SelectFromCustomer {
	public static void main(String args[]) {
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		String user = "root";
		String passwd = "1234";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: "); 
			System.err.println("드라이버 로딩오류:" + e.getMessage());
			return;
		} 

		try {
			con = DriverManager.getConnection(url, user, passwd);
			stmt = con.createStatement();

			ResultSet result = stmt.executeQuery("SELECT * FROM customer"); 
	
			int count=0;
			while (result.next()) { 
				if (count==0) displayHeadInfo();
				String resultStr = result.getString("customer_id") + "\t\t";
				resultStr += result.getString("customer_name") + "\t";
				resultStr +=  result.getString("customer_tel") + "\t";
				resultStr += result.getString("customer_addr");
				System.out.println(resultStr);
				count++;
			}
			displayEndInfo(count);
			stmt.close();
			con.close();	

		} catch(SQLException ex) {
			System.err.println("Select 오류: " + ex.getMessage());
		}
		
	}
	
	public static void displayHeadInfo() {
		System.out.println("\n고객 정보 질의 결과");
		drawLine();
		System.out.println("고객번호\t고객명\t전화번호\t주소");
		drawLine();
	}
	
	public static void displayEndInfo(int count) {
		drawLine();
		System.out.println(count + "개의 레코드가 검색됨! ");
	}

	public static void drawLine () {
		System.out.println("=============================================");
	}
	
}