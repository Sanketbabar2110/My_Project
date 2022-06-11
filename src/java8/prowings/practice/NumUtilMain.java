package java8.prowings.practice;


import java.util.Scanner;
public class NumUtilMain {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x and n (i.e x to the power n) : ");
		double x = sc.nextDouble();
		int n = sc.nextInt();
		
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		NumUtil obj = new NumUtil();
		
		System.out.println("\nx to the Power n is  	 : "+obj.getpower(x, n));
		System.out.println("factorial of number 	 : "+obj.getfactorial(num));
		System.out.println("Number is a Prime number : "+obj.isPrime(num));
		System.out.println("Number is an Even number : "+obj.isEven(num));
		
		sc.close();
	}

}
