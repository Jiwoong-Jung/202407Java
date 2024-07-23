package thread3;

import java.time.LocalTime;

public class Th1 extends Thread {

	@Override
	public void run() {
		for (int i=0; i < 10; i++) {
			LocalTime localTime = LocalTime.now();
			System.out.printf("%d:%d:%d\n", 
					 localTime.getHour(), localTime.getMinute(), localTime.getSecond());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
