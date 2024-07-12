package java0712;

public class Ex3 {

	public static void main(String[] args) {
		int[][] array = {{95, 86}, 
				         {83, 92, 96},
				         {78, 83, 93, 87, 88}};

//		System.out.println(array.length);
//		System.out.println(array[0].length);
//		System.out.println(array[1].length);
//		System.out.println(array[2].length);
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
		for (int i=0; i < array.length; i++) {
			for (int j=0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
				sum += array[i][j];
				cnt++;
			}
		}
		
		avg = (double)sum / cnt;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
