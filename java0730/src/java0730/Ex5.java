package java0730;

import java.util.stream.IntStream;

public class Ex5 {

	public static void main(String[] args) {
//		IntStream ii = IntStream.range(1, 5);
		IntStream ii = IntStream.rangeClosed(1, 5);
//		ii.forEach(System.out::println);
		ii.forEach(a->{
			System.out.println(a);
		});

	}

}
