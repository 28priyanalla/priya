package day5;

import java.util.Scanner;

public class UserDefined {
private static int age;
static void validate() throws Age{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	if(age<10) {
		throw new Age(" you are not eligible");
	}
	else {
		System.out.println("you are eligible and can vote");
	}
}
	
}
