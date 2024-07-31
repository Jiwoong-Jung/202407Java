package java0731_1;

public class Ex4 {

	public static void main(String[] args) {
		char grade = 'K';
		switch(grade) {
			case 'A', 'a' -> {
				System.out.println("우수 회원");
			}
			case 'B', 'b' -> {
				System.out.println("일반 회원");
			}
			default -> {
				System.out.println("손님");
			}
		}

	}

}
