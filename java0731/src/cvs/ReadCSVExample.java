package cvs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVExample {
    public static void main(String[] args) {
        String csvFile = "C:/Temp/sample2.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // CSV 파일의 각 줄을 쉼표로 분리
                String[] data = line.split(csvSplitBy);
                
                // 분리된 데이터 출력
                for (String element : data) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
