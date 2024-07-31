package java0731_1;

public class Ex7 {

	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if (person instanceof Student student) {
			student.study();
		}
//		if (person instanceof Student) {
//			Student student = (Student) person;
//			student.study();
//		} else {
//			System.out.println("형변환이 안됩니다.");
//		}
		
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		System.out.println("-------------------");
		Student student = new Student("김길동", 30);
		personInfo(student);

	}

}
