package java8.prowings.practice;

public class Array4 {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				
		int[] x = new int[100];
		
		for(int i=0;i<100;i++)
		{
			x[i] = i+1;
			System.out.print("  "+x[i]);
		}
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%4==0)
			{
				System.out.print("\n\nDivisible by 4 : "+x[i]);
			}
			
			if(x[i]%7==0)
			{
				System.out.print("\tDivisible by 7 : "+x[i]);
			}
			
			if(x[i]%4==0 && x[i]%7==0)
			{
				System.out.print("\tDivisible by 4 & 7 : "+x[i]);
			}
		}
	}
}
