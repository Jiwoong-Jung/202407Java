package java0711;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i=0; i < n; i++) { // n이 반복 횟수
        	if (i % 2 == 0)                    // 짝수
                System.out.print("+");
            else                               // 홀수
                System.out.print("-");
        }
        
	}

}




