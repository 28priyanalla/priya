package day5;
//exception with matching catch block
public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException e) {
			System.out.println("execption caught"+e.getMessage());
		}
		finally {
			System.out.println("end");
		}
	}

}
