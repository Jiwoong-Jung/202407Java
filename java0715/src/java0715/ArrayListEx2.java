package java0715;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();

		list.add(123);
		list.add("홍길동");
		list.add("자바");
		list.add(3.15);
		
//		이터레이터 (자바 디자인 패턴)
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
			Object str = it.next();
			int num = (int)str + 100;
			System.out.println(num);
		}
		
		
//		for (String str : list) {
//			System.out.println(str);
//		}
	}

}
