package day1;

public class ConstructerExample {
	
	ConstructerExample(){
		System.out.println("default constructor");
	}
	ConstructerExample(int a){
		System.out.println("constructor with one parameter");
	}
	ConstructerExample(int b, String a){
		System.out.println("constructors with different parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructerExample c=new ConstructerExample();
		ConstructerExample b=new ConstructerExample(4);
		ConstructerExample a=new ConstructerExample(3,"s");
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		

	}

}
