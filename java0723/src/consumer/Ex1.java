package consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Ex1 {

	public static void main(String[] args) {
		Consumer<String> consumer = t->System.out.println(t);
		
		consumer.accept("테스트");
		
		BiConsumer<String, String> consumer2 = (x,y)->System.out.println(x+y);
		consumer2.accept("혼자 공부하는", "자바");

	}

}
