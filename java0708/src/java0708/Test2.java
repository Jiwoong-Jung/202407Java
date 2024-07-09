package java0708;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        String str;

        for (;;) {
        	System.out.print("입력>>");
            str = input.next();
            if (str.equalsIgnoreCase("q"))
            	break;
     
            System.out.println("str : " + str);
        }
        System.out.println("종료");
        input.close();
    }
}
