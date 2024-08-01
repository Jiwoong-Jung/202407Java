package sec01.exam07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
		String str = "ABC";
		writer.write(str);
		
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
//		
//		writer.write(a);
//		writer.write(b);
//		writer.write(c);
		
		writer.flush();
		writer.close();

	}

}
