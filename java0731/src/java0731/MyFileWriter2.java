package java0731;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyFileWriter2 {  // p663

	public static void main(String[] args) throws IOException {
		File dir = new File("c:/Temp/file");
		if (dir.exists() == false) {
			dir.mkdir();
		}
		Writer writer = new FileWriter("c:/Temp/file/data.txt");
		String str = "ABC 안녕 자바!!";
		writer.write(str);
		writer.flush();
		writer.close();

	}

}
