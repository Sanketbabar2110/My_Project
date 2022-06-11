package java8.prowings.practice;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] x = new int[50];
		
		for(int i=0;i<x.length;i++)
		{
			x[i] = i+1;
		}
		System.err.print("\nOriginal array : ");
		System.out.println(Arrays.toString(x));
		
		System.out.println("\nEven numbers : "+"\tOdd numbers : ");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0)
			{
				System.out.println("\t"+x[i]);
			}
			else
			{
				System.out.println("\t\t\t"+x[i]);
			}
		}
	}

}

