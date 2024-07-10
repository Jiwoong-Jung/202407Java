package java0710;

public class Prob5 {

	public static void main(String[] args) {
		int in = 57;
		String score = (in >= 90) ? "A": 
			              (in >= 80) ? "B":
			            	  (in >= 70) ? "C":
			            		  (in >= 60) ? "D": "F";
		
//		if (in >= 90) {
//			score = "A";
//		} else if (in >= 80) {
//			score = "B";
//		} else if (in >= 70) {
//			score = "C";
//		} else if (in >= 60) {
//			score = "D";
//		} else {
//			score = "F";
//		}
		System.out.println(score);

	}

}
