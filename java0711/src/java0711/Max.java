package java0711;

public class Max {

	public static void main(String[] args) {
		int a[] = {11, 33, 10, 266, 88};
		int max = a[0]; // 초기화는 여러분의 몫
		
		// 최대값 구하기
		for (int i=1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		
		//최대값을 출력
		System.out.println("최대값: " + max);
	}

}
