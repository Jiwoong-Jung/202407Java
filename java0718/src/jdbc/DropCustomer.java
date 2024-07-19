package jdbc;
import java.sql.*;
public class DropCustomer {
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

	String createString = "drop table customer";
	try {
		con = DriverManager.getConnection(url, user, passwd);
		stmt = con.createStatement();
		stmt.executeUpdate(createString);
		System.out.println("The table customer has been successfully dropped!");
	} catch(SQLException e) {
		System.err.println("SQLException: " + e.getMessage());
	}
	finally {
        	try {
			if (stmt != null) stmt.close();
                	if (con != null) con.close();
               	} catch (Exception e) {}
       }
    }
}

