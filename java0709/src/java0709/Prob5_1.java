package java0709;

public class Prob5_1 {

	public static void main(String[] args) {
		int in = 100;
		String score = "";
		switch (in/10) {
		case 10:
		case 9:
			score = "A";
			break;
		case 8:
			score = "B";
			break;
		case 7:
			score = "C";
			break;
		case 6:
			score = "D";
			break;
		default:
			score = "F";
		}
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
