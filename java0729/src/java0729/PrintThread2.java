package java0729;

public class PrintThread2 extends Thread {
	
	@Override
	public void run() {

			while (true) {
				System.out.println("실행 중");
				if (Thread.interrupted()) {
					break;
				}
			
			}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
//	@Override
//	public void run() {
//		try {
//			while (true) {
//				System.out.println("실행 중");
//				Thread.sleep(1);
//			
//			}
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
//		System.out.println("자원 정리");
//		System.out.println("실행 종료");
//	}

}
