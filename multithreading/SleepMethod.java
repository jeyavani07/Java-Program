package multithreading;

public class SleepMethod extends Thread{
public void run() {
	for(int i=0;i<5;i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(i+" ");
	}
}
	public static void main(String[] args) {
SleepMethod sm=new SleepMethod();
sm.start();
	}

}
