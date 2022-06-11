package java8.prowings.practice;

//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;
public class Function3 {
	
	public static int greaterNum(int num1, int num2) {
		int num=0;
		if(num1>num2)
			num=num1;
		else
			num=num2;
		return num;
	}
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		
		System.out.println("The greater number is :  "+Function3.greaterNum(sc.nextInt(), sc.nextInt()));
		
		sc.close();
	}
}
