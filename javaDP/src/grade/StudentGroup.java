package grade;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {
	private Student[] students;
	private int last = 0;
	
	@Override
	public Iterator<Student> iterator() {
		return new StudentGroupIterator(this);
	}
	
	public StudentGroup(int maxsize) {  // 생성자
        this.students = new Student[maxsize];
    }

    public Student getStudentAt(int index) { // 해당 인덱스의 학생을 리턴
        return students[index];
    }

    public void appendStudent(Student student) { // 학생을 추가
        this.students[last] = student;
        last++;
    }

    public int getLength() { // 학생들의 총 건수
        return last;
    }

}
