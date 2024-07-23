package thread2;

public class Th1 extends Thread {

	@Override
	public void run() {
		for (int i=0; i < 5; i++) {
			System.out.println("삐");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
