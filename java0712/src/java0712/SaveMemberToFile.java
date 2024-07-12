package java0712;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveMemberToFile {

    public static void main(String[] args) {
        //객체 배열 생성
    	Member memberlist[] = {
    			new Member("강하나", "911224", "010-1234-5678"),
    			new Member("김하나", "891224", "010-1234-3456"),
    			new Member("이하나", "901224", "010-7890-5678")
    	};

        // 파일에 객체 배열 저장
        try (FileOutputStream fos = new FileOutputStream("c:\\temp\\members.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(memberlist);
            System.out.println("객체를 파일에 저장했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
