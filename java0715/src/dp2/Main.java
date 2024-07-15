package dp2;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("민수");
		Student s2 = new Student("길동");
		
		Course c1 = new Course("자바");
		Course c2 = new Course("C/C++");
		
		Transcript t1 = new Transcript(c1, s1, "2024년 2학기", "A");  // 자바 강좌, 민수
		Transcript t2 = new Transcript(c1, s2, "2024년 2학기", "B+"); // 자바 강좌, 길동
		Transcript t3 = new Transcript(c2, s1, "2024년 2학기", "A+"); // C/C++ 강좌, 민수
		
		s1.addTranscript(t1);  // 민수의 성적등록(자바)
		s2.addTranscript(t2);  // 길동의 성적등록(C/C++)
		s1.addTranscript(t3);  // 민수의 성적등록(C/C++)
		
		c1.addTranscript(t1);  // 자바 수강자 성적등록
		c1.addTranscript(t2);  // 자바 수강자 성적등록
		
		c2.addTranscript(t3);  // C/C++ 수강자 성적등록
		
		System.out.println("민수의 성적기록");
		for (Transcript transcript : s1.getTranscripts()) {
			System.out.print(transcript.getCourse().getName()+":");
			System.out.println(transcript.getGrade());
		}
		System.out.println("---------------------------");
		System.out.println("자바 코스의 성적기록");
		for (Transcript transcript : c1.getTranscripts()) {
			System.out.print(transcript.getStudent().getName()+":");
			System.out.println(transcript.getGrade());
		}
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		System.out.println(c1);
//		System.out.println(c2);

	}

}
