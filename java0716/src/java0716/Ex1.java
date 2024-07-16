package java0716;

public class Ex1 {

	public static void main(String[] args) {
		Cat cat = new Cat("페르시안", "검정", 9);
//		System.out.println(cat.age);
//		cat.age = 9;
		cat.setAge(9);
		System.out.println(cat);
	}

}
