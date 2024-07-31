package java0731;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Ex1 {
	static int sum = 0;
	public static void main(String[] ar) {
//		int sum = 0;
//		IntConsumer x = a -> {System.out.println(a);};
		
		IntStream.rangeClosed(1, 5).forEach(a -> {
			sum += a;
//			System.out.println(sum);
		});
		System.out.println(sum);
	}

}
