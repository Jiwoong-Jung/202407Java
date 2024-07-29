package java0729;

public class PrintThread1 extends Thread {

	private boolean stop;  //false
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while (!stop) { // true 무한 반복
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
