package 	java8.prowings.practice;

public class NumUtil {
	
	
	//Power method
	double getpower(double x, int n)
	{
		double pow = 1;	//local variable
		
		for(int i=1;i<=n;i++)
		{
			pow = x*pow;
		}
		
		return pow;
	}
	
	
	//Factorial method
	long getfactorial(int num)
	{
		long factorial = 1;
		
		for(int i=num;i>=1;i--)
		{
			factorial = factorial*i;
		}
		
		return factorial;
	}
	
	
	//Prime Number or not
	boolean isPrime(int num)
	{
		boolean prime = false;
		
		if( num == 2 )
		{
			prime = true;
			return prime;
		}
	 
		for(int i=2;i<=(num-1);)
		{
			int a = num % i;
			
			if(a==0)
			{
				prime = false;
				break;
			}
			else
			{
				prime = true;
				break;
			}			
		}
		
		return prime;
	}
	
	
	//Even number or not
	boolean isEven(int num)
	{
		boolean Even = false;
		if(num%2 == 0)
			Even = true;
		else 
			Even = false;
		return Even;
	}
	
	public static void main(String[] args) {
		
	}
	
}
