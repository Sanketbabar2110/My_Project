package java8.prowings.practice;

//Enter 3 numbers from the user and make a function to print their average. 

import java.util.Scanner;
public class Function1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		
		average(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		sc.close();
	}
	
	public static void average(int num1, int num2 ,int num3) {
		
		int avg = (num1+num2+num3)/3;
		
		System.out.println("\nThe average of three numbers is : "+avg);
	}
}
