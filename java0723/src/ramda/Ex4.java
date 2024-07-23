package ramda;

public class Ex4 {

	public static void main(String[] args) {
		MyInterf3 myInterf3 = (a, b)->{
			System.out.println(a+b);
		};
		
		myInterf3.method(300, 400);

	}

}
