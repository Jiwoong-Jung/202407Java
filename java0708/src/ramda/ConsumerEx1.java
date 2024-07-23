package ramda;

import java.util.function.Consumer;

public class ConsumerEx1 {

	public static void main(String[] args) {
		Consumer<String> consumer = t->System.out.println(t+" 나온다");
		consumer.accept("test");

	}

}
