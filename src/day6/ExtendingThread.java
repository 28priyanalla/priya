package day6;

public class ExtendingThread  extends Thread{
	@Override
	public void run() {                        // running state
		System.out.println("welcome");
	}
		public static void main(String[] args) {
			
	ExtendingThread e=new ExtendingThread();   // new state

	    e.start();     // Runnable state
		}

	

}
