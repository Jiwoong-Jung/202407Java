package java0731;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class Ex2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties  = new Properties();  // HashMap 하위 클래스
		String path = Ex2.class.getResource("database.properties").getPath();  // p506
		path = URLDecoder.decode(path, "utf-8");
		System.out.println(path);
		properties.load(new FileReader(path));
		String driver = properties.getProperty("driver");
		System.out.println("드라이버 : " + driver);
		String username = properties.getProperty("kkk");
		System.out.println("username : " + username);
	}

}
