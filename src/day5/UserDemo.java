package day5;

public class UserDemo {

	public static void main(String[] args) {
		
		try {
			UserDefined.validate();
		}
		catch(Age e) {
			System.out.println("exception caught"+e.getMessage());
		}

	}

}
