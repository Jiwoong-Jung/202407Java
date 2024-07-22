package java0722;

import java.time.LocalTime;

public class DisplayDateTime {
	
	public static void main(String[] ar) {
		// 현재 시간 구하기 (시스템 시계, 시스템 타임존)
		LocalTime present = LocalTime.now();
		System.out.print(present.getHour() + ":");
		System.out.print(present.getMinute() + ":");
		System.out.println(present.getSecond());

	}
	
}
