package sec01.exam01;

public class Main {

	public static void main(String[] args) {
//		A a = new A();
//		A.B b = a.new B();
		A.B b = new A().new B();
//		A.B b = new A.B();
		
		A.C c = new A.C();

	}

}
