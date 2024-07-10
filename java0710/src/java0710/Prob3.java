package java0710;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1, str2;
		int in1 = 0;
		int in2 = 0;
		int result = 0;
		
		for (;;) {
			System.out.print("숫자1을 입력:");
			str1 = scan.nextLine();
			
			System.out.print("숫자2을 입력:");
			str2 = scan.nextLine();
			
			in1 = Integer.parseInt(str1);
			in2 = Integer.parseInt(str2);
			
			if (in1 > in2) {
				result = in1;
			} else if (in1 == in2) {
				result = 0;
			} else {
				result = in2;
			}
			
			System.out.println(result);
		}
		

	}

}
