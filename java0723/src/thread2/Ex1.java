package thread2;

public class Ex1 {

	public static void main(String[] args) {
//		Thread thread = new Thread(new Th1());
		Th1 th1 = new Th1();
		th1.start();

		for (int i=0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
