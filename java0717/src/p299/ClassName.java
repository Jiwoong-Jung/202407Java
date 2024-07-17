package p299;

public class ClassName {
	int field1;
	void method1() {
		ClassName.field2 = 200;
		this.field1 = 300;
	}
	
	static int field2;
	static void method2() {
		field2 = 100;
	}
	
	public static void main(String... ar) {
//		method1();
		ClassName.method2();
		System.out.println(ClassName.field2);
		ClassName c1 = new ClassName();
		c1.method1();
		System.out.println(c1.field1);
		
	}
}
