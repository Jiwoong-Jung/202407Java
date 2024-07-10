package java0709;

public class Prob3 {

	public static void main(String[] args) {
		int in1 = 10;
		int in2 = 20;
		int result = 0;
		if (in1 > in2) {
			result = in1;
		} else if (in1 == in2) {
			result = 0;
		} else {
			result = in2;
		}
		System.out.println(result);
	}

}
