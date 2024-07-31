package java0731;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter {  // p663

	public static void main(String[] args) throws IOException {
		File dir = new File("c:/Temp/text");
//		File file1 = new File("c:/Temp/text/file1.txt");
		if (dir.exists() == false) {
			dir.mkdir();
		}
//		if (file1.exists() == false) {
//			file1.createNewFile();
//		}
		Writer writer = new FileWriter("c:/Temp/text/file2.txt");
		String str = "ABC 안녕 자바!!";
		writer.write(str);
		writer.flush();
		writer.close();

	}

}
