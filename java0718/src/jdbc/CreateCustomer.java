package jdbc;
import java.sql.*;
public class CreateCustomer {
    public static void main(String args[]) {
	Connection con = null;
	Statement stmt = null;
	String url = "jdbc:mysql://192.168.56.1:3306/spring5fs";
	String user = "spring5";
	String passwd = "spring5";

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch(java.lang.ClassNotFoundException e) {
		System.err.print("ClassNotFoundException: "); 
		System.err.println(e.getMessage());
		return;
	}

	String createString = "CREATE TABLE customer " + 
		"(customer_id char(6) not null primary key, " +
		"customer_name varchar(15) not null, " +
		"customer_tel varchar(13), " + 
          	"customer_addr varchar(20))";
	try {
		con = DriverManager.getConnection(url, user, passwd);
		stmt = con.createStatement();
		stmt.executeUpdate(createString);
		System.out.println("The table customer has been successfully created!");
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

