package jdbc;
import java.sql.*;

public class InsertIntoCustomer {
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
			System.err.println(e.getMessage());
			return;
		}
		
		int count = 0;
		String insertString = "INSERT INTO customer VALUES ";
		String recordString[] = 
			{insertString + "('C-1001', '가나다', '010-1111-2222', '서울')",
			insertString + "('C-1002', '라마바', '010-1111-3333', '부산')",
			insertString + "('C-1003', '사아자', '010-1111-4444', '대구')",
			insertString + "('C-1004', '가나다', '010-1111-5555', '광주')",
			insertString + "('C-1005', '나다라', '010-1111-6666', '대전')",
			insertString + "('C-1006', '다라마', '010-1111-7777' '강원')"};

		try {
			con = DriverManager.getConnection(url, user, passwd);	
			stmt = con.createStatement();
			while (count<recordString.length-1) {
				stmt.executeUpdate(recordString[count]);
				count++;
			}
			System.out.println(count + "개의 레코드가 customer 테이블에 삽입됨! ");
	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}
		finally {
        		try {
				if (stmt != null) stmt.close();
                		if (con != null) con.close();
               		} catch (Exception e) {}
      	 	}
	}
}