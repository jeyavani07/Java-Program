package multithreading;

public class Testing extends Thread{
	public void run() {
		System.out.println("running....");
	}
	public static void main(String[] args) {
Testing t1=new Testing();
Testing t2=new Testing();
System.out.println(t1.getName());
System.out.println(t2.getName());
t1.start();
t2.start();
t1.setName("Vani");
System.out.println("After setting, the name of thread t2 is :"+t2.getName());
	}

}
