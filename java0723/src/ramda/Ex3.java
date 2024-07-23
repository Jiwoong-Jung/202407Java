package ramda;

public class Ex3 {

	public static void main(String[] args) {
		MyInterf2 myInterf2 = a -> {
			System.out.println(a+300);
		};
		
		myInterf2.method(100);

	}

}
