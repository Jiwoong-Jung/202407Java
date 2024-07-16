package java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class Cat {
	private String breed;   // 품종
	private String color;
	private int age;
	
//	public Cat(String breed) {
////		super();  // this()
////		this.breed = breed;
//		this(breed, "흰색", 10);
//	}
//
//	public Cat(String breed, String color) {
////		super();
////		this.breed = breed;
////		this.color = color;
//		this(breed, color, 10);
//	}
//
//	public Cat(String breed, String color, int age) {
//		super();   // this. super.
//		this.breed = breed;
//		this.color = color;
//		if (age > 9) {
//			this.age = age;
//		} else {
//			this.age = 10;
//		}
//		
//	}

	Cat() {  // 기본 생성자
		System.out.println("Cat()");
	}
	
	Cat(int age) {  // 생성자
	}
	
	
}
