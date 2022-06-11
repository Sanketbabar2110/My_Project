package java8.prowings.practice;

/**
 * Write a function that calculate the Greatest Common Divisor of two 
 * numbers
 *  
 * **/

import java.util.Scanner;
public class Function8 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int Gcd=0;
		
		for(int i=1;i<=num1 || i<=num2;i++) {
			if(num1%i==0 && num2%i==0) {
				Gcd = i;
			}
		}
		System.out.println("the gretest common factor of numbers is : "+Gcd);
		sc.close();
	}	
}
