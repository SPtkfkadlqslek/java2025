package dec5;

public class ThreadA extends Thread{
	public ThreadA() {
		
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Downloading!!!");
			try {
				Thread.sleep(1000);;
			} catch (InterruptedException e) {}
		}
	}

}
