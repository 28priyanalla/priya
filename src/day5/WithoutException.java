package day5;

public class WithoutException {

	public static void main(String[] args) {
		int d=9;
		try {
		int s=9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught"+e.getMessage());
		}
		System.out.println("hello");

	}

}
