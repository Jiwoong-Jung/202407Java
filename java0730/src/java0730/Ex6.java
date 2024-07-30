package java0730;

import java.util.stream.IntStream;

public class Ex6 {

	public static void main(String[] args) {
		int count = 10;

		int sum = IntStream.rangeClosed(1, count).sum();
        System.out.println("합계: " + sum);

	}

}
