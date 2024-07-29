package java0729;

public class ThreadEx1 {

	public static void main(String[] args) {
		Thread mThread = Thread.currentThread();
		System.out.println(mThread.getName());

		ThreadA threadA = new ThreadA();
		threadA.start();
		
		//스레드B는 익명 자식 객체 생성으로 만들어 보세요. p552
		Thread threadB = new Thread() {
			
			@Override
			public void run() {
				for (int i=0; i < 2; i++) {
					System.out.println(this.getName());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		threadB.setName("ThreadB");
		threadB.start();
		
		// 스레드C는 Runnable 구현 객체 생성으로 만들어 보세요. p549
		Thread threadC = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=0; i < 2; i++) {
					System.out.println("threadC");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		threadC.setName("threadC");
		threadC.start();

		
	}

	
	
	
	
}
