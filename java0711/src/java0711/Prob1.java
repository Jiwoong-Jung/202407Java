package java0711;

import java.util.Scanner;
//3개의 정수 값을 입력받아 중앙값을 구하고 출력하세요.
public class Prob1 {

	public static int med(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		} else if ((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;

		
		

//		if (a >= b) {
//        	if (b >= c) {
//        		return b;
//        	} else if (a <= c) {
//        		return a;
//        	} else {
//        		return c;
//        	}
//        	
//        } else if (a > c) {  // a는 b보다 작다
//        	return a;
//        } else if (b > c) {  // a는 b보다 작다
//        	return c;
//        } else {  // a는 b보다 작다, a는 c보다 작거나 같다, b는 c보다 작거나 같다
//        	return b;
//        }
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a 값 : ");  
        int a = stdIn.nextInt();
        System.out.print("b 값 : ");  
        int b = stdIn.nextInt();
        System.out.print("c 값 : ");  
        int c = stdIn.nextInt();
        
        System.out.println("중앙값은 " + med(a, b, c) + "입니다.");
        //아래의 로직을 메소드로 만들어 보세요.
//        if (a >= b) {
//        	if (b >= c) {
//        		System.out.println(b);
//        	} else if (a <= c) {
//        		System.out.println(a);
//        	} else {
//        		System.out.println(c);
//        	}
//        	
//        } else if (a > c) {  // a는 b보다 작다
//        	System.out.println(a);
//        } else if (b > c) {  // a는 b보다 작다
//        	System.out.println(c);
//        } else {  // a는 b보다 작다, a는 c보다 작거나 같다, b는 c보다 작거나 같다
//        	System.out.println(b);
//        }

	}

}
