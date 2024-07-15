package dp;

public class Person {
	private Phone[] phones;
	
	public Person() {
		phones = new Phone[2];
	}
	
	public Phone getPhone(int i) {  // 나쁜 설계
		if (i == 0 || i == 1) {
			return phones[i]; // 0일 때는 집 전화, 1일 때는 회사 전화
		}
		return null;
	}
}
