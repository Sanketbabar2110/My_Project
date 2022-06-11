package java8.prowings.practice;

/**
 * Write a program to enter the numbers till the user wants and at the
 * 	end it should display the count of positive, negative and the zeros 
 * 	entered
 * 
 * **/

import java.util.Scanner;
public class Function6 {
	
	public static void main(String[] args) {
		
		int c1=0, c2=0, c3=0;
		boolean b = true;
		
		Scanner sc = new Scanner(System.in);

		do {
				System.out.print("Enter any number : ");
				System.out.println("\t\tYou want to Exit press : -1111111111");
				int s = sc.nextInt();
				
				if(s==-1111111111)
					break;
				else if(s>0)
					c1++;
				else if(s<0)
					c2++;
				else
					c3++;
			
		}while(b);
		
		System.out.println("\nTotal positive numbers entered : "+c1);
		System.out.println("Total negative numbers entered : "+c2);
		System.out.println("Total zeros entered : "+c3);
				
		sc.close();
	}
}
