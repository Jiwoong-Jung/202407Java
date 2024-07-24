package grade;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StudentGroupIterator implements Iterator<Student> {
	private StudentGroup studentGroup;
	private int index;
	
	public StudentGroupIterator(StudentGroup studentGroup) {
		this.studentGroup = studentGroup;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < studentGroup.getLength()) {
            return true;
        } else {
            return false;
        }
	}

	@Override
	public Student next() {
		if (!hasNext()) {
            throw new NoSuchElementException(); // 예외 발생
        }
        Student student = studentGroup.getStudentAt(index);
        index++;
        return student;
	}

}
