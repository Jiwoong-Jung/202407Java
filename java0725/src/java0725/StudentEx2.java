package java0725;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentEx2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 50));
		list.add(new Student("기길동", 90));
		list.add(new Student("김길동", 70));
		list.add(new Student("강길동", 80));
		list.add(new Student("천길동", 60));
		
		Comparator<Student> c = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				return Integer.compare(o2.getScore(), o1.getScore());
			}
		};
		
		Collections.sort(list, c);
		System.out.println(list);
	}

}




