package java0731;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex3 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("강하나", 92),
				new Student("김하나", 100)
		);
		
//		int sum = list.stream().mapToInt(s->s.getScore()).sum();
		int sum = list.stream().mapToInt(Student::getScore).sum();  // 메소드 참조
		System.out.println(sum);
		
		double avg = list.stream()
				.mapToInt(Student::getScore)
				.average().getAsDouble();
		System.out.println(avg);
		

	}

}
