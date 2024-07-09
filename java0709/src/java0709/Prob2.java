package java0709;

import java.util.Scanner;

public class Prob2 {
	public static int getCount(String msg, Scanner sc) {
		System.out.print(msg);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int apple = getCount("사과의 개수 입력:", scan);
//		System.out.print("사과의 개수 입력:");
//		String input = scan.nextLine();
//		int apple = Integer.parseInt(input);
		
		int people = getCount("친구 명수 입력:", scan);
//		System.out.print("친구 명수 입력:");
//		input = scan.nextLine();
//		int people = Integer.parseInt(input);
		
		int remainder = apple % (people+1);
		System.out.printf("남은 사과의 개수: %d개\n", remainder);
	}

}
