package java0709;

public class Prob5 {

	public static void main(String[] args) {
		int in = 59;
		String score = "";
		if (in >= 90) {
			score = "A";
		} else if (in >= 80) {
			score = "B";
		} else if (in >= 70) {
			score = "C";
		} else if (in >= 60) {
			score = "D";
		} else {
			score = "F";
		}
		System.out.println(score);

	}

}
