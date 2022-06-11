package java8.prowings.practice;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] x = new int[] {10,20,30,40,50,60,70,80,90,100};
		int size=x.length;
			
		System.err.println("Size of an Array : "+size);
			
		System.err.print("\nValues of Even Indices : ");
		for(int i=(x.length-1);i>=0;i--)
		{
			if(i%2==0)
				System.out.print(x[i]+" ");
		}
			
		System.err.print("\nValues of Odd Indices : ");
		for(int i=(x.length-1);i>=0;i--)
		{
			if(i%2!=0)
				System.out.print(x[i]+" ");
		}
	}
}

