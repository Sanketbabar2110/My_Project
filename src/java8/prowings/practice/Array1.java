package java8.prowings.practice;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index of array");
		int y = sc.nextInt();
		int[] x= {10, 20, 30, 40, 50};
		
		for( int i=y; i<x.length; i++)
		{
			System.out.println(x[i]+" ");
			
			if(y!=0)
			{
				if(i==x.length-1){
				i = -1;
				}
				else if(i==(y-1)){
				i = x.length-1;
				}
			}
			
		}
		
		sc.close();
	}

}
