package java0712;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		Random rd = new Random();
		for (int i=0; i < 6; i++) {
//			System.out.println(rd.nextInt(10)); // 0~9
//			System.out.println(rd.nextInt(10)+1); // 1~10
			System.out.println(rd.nextInt(45)+1); // 1~45
		}

	}

}
