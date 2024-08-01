package sec01.exam07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadEx {

	public static void main(String[] args) throws IOException {
//		FileReader reader = new FileReader("C:/Temp/test7.txt");
		String line = "";
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp/board1.csv"));
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();

	}

}
