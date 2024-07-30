package java0730;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,62,31,1,54,31};
		List<Integer> list3 = Arrays.asList(arr);
		Set<Integer> set3 = new HashSet<>(list3);
		System.out.println(set3);
		
		List<Integer> list1 = Arrays.asList(1,62,31,1,54,31);
		List<String> list2 = Arrays.asList("홍길동", "김길동", "홍길동");
		
		System.out.println(list1);
		System.out.println(list2);
		
		Set<Integer> set1 = new HashSet<>(list1);
		System.out.println(set1);
		Set<String> set2 = new HashSet<>(list2);
		System.out.println(set2);
	}

}
