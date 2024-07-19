package prob4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetMetaDataExample {
	public static void main(String args[]) {
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;
		String url = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		String user = "spring5";
		String passwd = "spring5";	
	
		Scanner scan = new Scanner(System.in);
		System.out.print("테이블 이름 입력>>");
		String str = scan.nextLine();
//		if (args.length < 1) {
//			System.out.println("실행>>java ResultSetMetaDataExample tableName");
//			System.exit(0);
//		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: "); 
			System.err.println(e.getMessage());
			return;
		}	
		
		try {
			con = DriverManager.getConnection(url, user, passwd);
			stmt = con.createStatement();
			result = stmt.executeQuery("SELECT * FROM " + str); 

			ResultSetMetaData rsmd = result.getMetaData();
			
			System.out.println(str + " 테이블 정보");
			System.out.println("=======================================================");
			System.out.println("컬럼명		데이터타입		크기		NULL 허용 여부");
			System.out.println("=======================================================");

			int numOfCol = rsmd.getColumnCount();
			for (int i=1; i<=numOfCol; i++) {
				String resultStr = rsmd.getColumnName(i) + "\t";
				resultStr += rsmd.getColumnTypeName(i) + "\t\t";
				resultStr += rsmd.getColumnDisplaySize(i) + "\t";
				if (rsmd.isNullable(i) == ResultSetMetaData.columnNoNulls)
					resultStr+= "NOT NULLABLE";
				else if (rsmd.isNullable(i) == ResultSetMetaData.columnNullable)
					resultStr += "NULLABLE";
				else 
					resultStr += "UNKNOW";
				System.out.println(resultStr);
			}
			System.out.println("=======================================================");	
		} catch(SQLException e) {
			System.err.println("테이블 SELECT 오류: " + e.getMessage());
		} finally {
        		try {
				if (result != null) result.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
               		} catch (Exception e) {}
       		}
    	}
}