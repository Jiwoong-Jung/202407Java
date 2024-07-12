package java0712;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadObjectsFromFile {

    public static void main(String[] args) {
        // 파일에서 객체 배열 불러오기
        try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Member[] objects = (Member[]) ois.readObject();
            System.out.println("파일에서 객체를 가져왔습니다.");

            // 불러온 객체 배열 출력
            for (Member obj : objects) {
                System.out.println("Name: " + obj.name + ", SSN: " + obj.ssn);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

 
}
