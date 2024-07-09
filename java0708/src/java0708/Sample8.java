package java0708;

/**
 * 
 */
public class Sample8 {
	/**
	 * @param args
	 * @since 1.0
	 */
	public static void main(String[] args) {
		int a = 60;
		int b = -10;
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a),a);
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(b),b);
		System.out.printf("[%32s] %d\n", Integer.toBinaryString(a&b),a&b);

	}

}
