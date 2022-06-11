package java8.prowings.practice;

//Write a function to print the sum of all odd numbers. 

import java.util.Scanner;
public class Function2 {
	
	public static int sumOdd(int x) {
		int sum = 0;
		for(int i=0;i<=x;i++) {
			if(i%2==1)
				sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number upto which sum of Odd numbers you want : ");
		int n = sc.nextInt();
		
		System.out.println("Sum of Odd numbers is : "+Function2.sumOdd(n));
		sc.close();
	}
	
}
