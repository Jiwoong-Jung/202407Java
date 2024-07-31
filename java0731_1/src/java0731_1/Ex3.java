package java0731_1;

public class Ex3 {

	public static void main(String[] args) {
		char grade = 'B';
		int ret = switch(grade) {
			case 'A', 'a' -> {
				yield 100;
			}
			case 'B', 'b' -> {
				yield 80;
			}
			default -> {
				yield 70;
			}
		};
		System.out.println(ret);

	}

}
