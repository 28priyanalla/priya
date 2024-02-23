package day5;


import java.io.IOException;
//to demonstrate throws keyword
public class Test2 {

	public static void main(String[] args) {
		
		ThrowsDemo t=new ThrowsDemo();
		try {
			
			t.display();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
