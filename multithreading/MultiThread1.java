package multithreading;

public class MultiThread1 extends Thread{
	public void run() {
		System.out.println("Running the run method");
	}

	public static void main(String[] args) {
MultiThread1 m=new MultiThread1();
m.start();
}

}
