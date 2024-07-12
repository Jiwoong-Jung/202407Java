package java0712;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("배열크기 입력:");   // 학생수
		int num = Integer.parseInt(scan.nextLine());
		int arr[] = new int[num];
		for (int i=0; i < num; i++) {
			System.out.print(i+"번째 값:");
			arr[i] = Integer.parseInt(scan.nextLine());
		}
		for (int n : arr) {
			System.out.println(n);
		}

	}

}
