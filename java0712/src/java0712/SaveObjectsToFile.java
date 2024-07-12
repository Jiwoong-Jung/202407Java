package java0712;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObjectsToFile {

    public static void main(String[] args) {
        // 예제 객체 배열 생성
        ExampleObject[] objects = {
            new ExampleObject("Object1", 1),
            new ExampleObject("Object2", 2),
            new ExampleObject("Object3", 3),
            new ExampleObject("Object4", 4)
        };

        // 파일에 객체 배열 저장
        try (FileOutputStream fos = new FileOutputStream("c:\\temp\\objects.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(objects);
            System.out.println("객체를 파일에 저장했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
