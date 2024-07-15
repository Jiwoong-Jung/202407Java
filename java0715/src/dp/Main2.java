package dp;

public class Main2 {

	public static void main(String[] args) {
		Student minsu = new Student("민수");  // 학생 등록
		Course java = new Course("cs100", "자바");   // 코스 등록
		Course cplus = new Course("cs101", "C/C++");   // 코스 등록
		minsu.registerCourse(java);
		java.addStudent(minsu);
		minsu.registerCourse(cplus);
		cplus.addStudent(minsu);
		
		Student gildong = new Student("길동");  // 학생 등록
		gildong.registerCourse(java);
		java.addStudent(gildong);
		
//		System.out.println(minsu);
//		System.out.println(gildong);
		
		// 코스별 신청자 출력
		System.out.println("자바 수강신청자:" + java.getNumOfStudents() +"명");
		for (Student student : java.getStudents()) {
			System.out.println(student.getName());
		}
		System.out.println("C/C++ 수강신청자:" + cplus.getNumOfStudents() +"명");
		for (Student student : cplus.getStudents()) {
			System.out.println(student.getName());
		}

	}

}
