package day9;

public class TestDemo {
	public static void main(String[] args) {
		
		Runnable basic=()->{ String threadname=Thread.currentThread().getName();
		System.out.println("Threadname"+threadname);};
		
		// instanitiate 2 thread

		Thread t1=new Thread(basic);
		Thread t2=new Thread(basic);
		
		t1.start();
		t2.start();
	}
}
