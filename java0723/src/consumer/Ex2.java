package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex2 {

	public static void main(String[] args) {
		List fruits = Arrays.asList("Apple", "Banana", "Orange");

		Consumer listPrinter = fruit -> System.out.println("Fruit: " + fruit);

		fruits.forEach(listPrinter);
		

	}

}
