package java0725;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] array = {3,1,13,2,8,5,1};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		for (int n : array) {
			System.out.println(n);
		}

	}

}
