package java0710;

public class Ex2 {

	public static void main(String[] args) {
		// & &&
		// | ||
		
		String str1 = "가나다";
		String str2 = "가나다";
		boolean result2 = str1 == str2;
		System.out.println(result2);
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = num1 == num2;
		System.out.println(result1);
		
		int x = 0;
		int y = ++x;
//		int y = x++;
//		x = x + 1;
		System.out.println(x);
		System.out.println(y);

	}

}
