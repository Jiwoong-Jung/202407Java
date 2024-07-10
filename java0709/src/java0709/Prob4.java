package java0709;

public class Prob4 {

	public static void main(String[] args) {
		int max = 0;
		int a = 10;
		int b = 20;
		int c = 30;
		max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println(max);
	}

}
