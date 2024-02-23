package day5;

import java.util.Scanner;

//to demonstrate throw keyword
public class TestDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rollnumber");
		int rollno=sc.nextInt();
		if(rollno<0) {
			System.out.println("rollnumber can not be negative");
		}
		else {
			System.out.println("valid rollnumber");
		}
	}

}
