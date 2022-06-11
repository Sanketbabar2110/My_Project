package java8.prowings.practice;

import java.util.Scanner;
public class NumUtilMain2 {
	
	public static void main(String[] args) {
		
		System.out.println("**********O P R E T I O N S**********");
		System.out.print("\n\n\t 1. Power"+"\n\n\t 2. Factorial");
		System.out.println("\n\n\t 3. Prime number"+"\n\n\t 4. Even number");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nChose which operation you want to do : ");
		int c = sc.nextInt();
		
		NumUtil obj = new NumUtil();
		
		switch(c)
		{
			case 1:
				{
					System.out.print("Enter x and n (i.e x to the power n) : ");
					double x = sc.nextDouble();
					int n = sc.nextInt();
				
					System.out.println("\nx to the Power n is  	 : "+obj.getpower(x, n));
				}
				break;
				
				
			case 2:
				{
					System.out.println("Enter any number : ");
					int num = sc.nextInt();
				
					System.out.println("factorial of number 	 : "+obj.getfactorial(num));
				}
				break;
				
			case 3:
				{
					System.out.println("Enter any number : ");
					int num = sc.nextInt();
				
					System.out.println("Number is a Prime number : "+obj.isPrime(num));
				}
				break;
				
			case 4:
				{
					System.out.println("Enter any number : ");
					int num = sc.nextInt();
				
					System.out.println("Number is an Even number : "+obj.isEven(num));
				}
				break;
				
			default:
				System.out.println("Sorry, Invalid choice");
		}
		
		sc.close();
	}
}


