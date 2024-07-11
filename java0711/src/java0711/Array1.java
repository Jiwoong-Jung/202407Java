package java0711;

public class Array1 {

	public static void main(String[] args) {
		int scores[] = new int[] {83, 90, 87};
		int scores2[] = {83, 90, 87};
		double sum = 0.0;
		double avg = 0;
		
		System.out.println(scores[scores.length-1]);
		
		// scores의 총점, 평균을 출력하세요.
		for (int i=0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총계:"+sum);
		avg = sum / scores.length;
		System.out.println("평균:"+avg);
		
		for (int i=0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		int myArr[] = new int[5]; // 배열 생성 (초기화)
		
		for (int i=0; i<5; i++) {
			System.out.println(myArr[i]);
		}
		
		double myArr2[] = new double[5];
		
		for (int i=0; i<5; i++) {
			System.out.println(myArr2[i]);
		}
		
		boolean myArr3[] = new boolean[5];
		
		for (int i=0; i<5; i++) {
			System.out.println(myArr3[i]);
		}

	}

}
