package java0731;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/temp/file/data.txt");
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out::println);
		//-----------------------------------------------------------------
		File file = path.toFile();
		BufferedReader br = new BufferedReader(new FileReader(file));
		stream = br.lines();
		stream.forEach(System.out::println);

	}

}
