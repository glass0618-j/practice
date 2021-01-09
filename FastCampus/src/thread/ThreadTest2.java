package thread;

class MeThread1 implements Runnable {
	public void run() {
		int i;
		for(i=0; i<=200; i++) {
			System.out.print(i+"\t");
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		
		System.out.println("start");
		
		MeThread1 runner1 = new MeThread1();
		Thread th1 = new Thread(runner1);
		th1.start();
		
		MeThread1 runner2 = new MeThread1();
		Thread th2 = new Thread(runner2);
		th2.start();
		
		System.out.println("end");

	}
}
