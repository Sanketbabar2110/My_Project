package java8.prowings.practice;

public class DimondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			System.out.print("\n");
			
			for(j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print(" *  ");
			}
		}
		
		for(i=1;i<=4;i++)
		{
			System.out.print("\n");
			
			for(j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			
			for(j=5;j>i;j--)
			{
				System.out.print(" *  ");
			}
		}

	}

}
