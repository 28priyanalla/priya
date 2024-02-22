package day4;

public class TestInterface {
	public static void main(String[] args) {
		Bank b=new SBI();
		System.out.println("ROI"+b.rateofinterest());
		
		Bank p=new PNB();
		System.out.println("ROI " + p.rateofinterest());
	}
}
