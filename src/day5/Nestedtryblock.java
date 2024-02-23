package day5;

public class Nestedtryblock {
	

	public static void check() {
		String str="TNS";//data member
		int slength=str.length();
		System.out.println("length of the sting"+slength);
		
		String anotherstring=null;//data member
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("index out of bound"+e.getMessage());
			}
			System.out.println("string length"+anotherstring.length());
		}
		catch(NullPointerException e) {
			System.out.println("exception is thrown"+e.getMessage());
		}
	}
}
