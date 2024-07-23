package java0723;

import java.time.LocalTime;

public class DisplayDateTime {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
//		System.out.println(localTime.getHour());
//		System.out.println(localTime.getMinute());
//		System.out.println(localTime.getSecond());
		System.out.printf("%d:%d:%d\n", 
				 localTime.getHour(), localTime.getMinute(), localTime.getSecond());

	}

}
