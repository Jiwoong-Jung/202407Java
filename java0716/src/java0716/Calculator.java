package java0716;

public class Calculator {
	int x, y;
	
	int plus() {
//		int result = x + y;
		return this.x + this.y;
	}
	
	double avg() {
//		double sum = plus(x, y);
//		double result = sum / 2;
		return this.plus() / 2.0;
	}
	
	void execute() {
//		double result = avg(7, 10);
		this.println("실행결과: " + this.avg());
	}
	
	void println(String msg) {
		System.out.println(msg);
	}

}
