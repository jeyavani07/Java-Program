package multithreading;

public class MultiThread implements Runnable{
		public void run() {
			System.out.println("Running the run method");
		}
	public static void main(String[] args) {
MultiThread m1=new MultiThread();
Thread t1=new Thread(m1);
t1.start();
	}

}
