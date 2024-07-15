package dp;

public class Professor {
	private Student student;
	
	public void setStudent(Student student) {
		this.student = student;
	}

	public void advise() {
		System.out.println("상담 내용은 여기에~");
	}
}
