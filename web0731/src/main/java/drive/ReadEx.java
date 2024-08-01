package drive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import board.BoardDTO;

public class ReadEx {

	public static void main(String[] args) throws IOException {
//		FileReader reader = new FileReader("C:/Temp/test7.txt");
		String line = "";
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Temp/board1.csv"));
		while ((line = br.readLine()) != null) {
			// CSV 파일의 각 줄을 쉼표로 분리
            String[] data = line.split(", ");
            
            BoardDTO dto = new BoardDTO(0, data[0], data[1], data[2], null, 0);
            System.out.println(dto);
//            System.out.println(data[0]);
//            System.out.println(data[1]);
//            System.out.println(data[2]);
            
            // 분리된 데이터 출력
//            for (String element : data) {
//                System.out.print(element + " ");
//            }
//            System.out.println();
		}
		
		br.close();

	}

}
