package java0709;

/**
 * 여기에 내용을 쓰세요.
 */
public class Swap {

	/**
	 * @param a
	 * @param b
	 * @since 1.0
	 */
	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.printf("x=%d, y=%d\n", a, b);
	}
	
	/**
	 * @param args
	 * @since 1.0
	 */
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.printf("x=%d, y=%d\n", x, y);
		swap(x, y);
		//스와핑
//		int tmp = x;
//		x = y;
//		y = tmp;
//		System.out.printf("x=%d, y=%d\n", x, y);

	}

}
