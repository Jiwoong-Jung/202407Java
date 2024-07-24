package grade;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		StudentGroup studentGroup = new StudentGroup(3);
		studentGroup.appendStudent(new Student("홍길동", "202401001", 90));
		studentGroup.appendStudent(new Student("김자바", "202401002", 78));
		studentGroup.appendStudent(new Student("강한나", "202401003", 95));
		
		Iterator<Student> it = studentGroup.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student);
		}
		
		System.out.println("--------------------");
		for (Student st1 : studentGroup) {
			System.out.println(st1);
		}

	}

}
