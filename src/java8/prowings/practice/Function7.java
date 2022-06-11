package java8.prowings.practice;

/**
 * Two numbers are entered by the user, x and n. Write a function to
 * 	find the value of one number raised to the power of another 	
 * **/

//import java.lang.Math;
import java.util.Scanner;
public class Function7 {
	
	public static int power(int x, int n) {
		int pow=1;
		for(int i=1;i<=n;i++) {
			pow = pow * x;
		}
		//System.out.println(Math.pow(x,n));
		return pow;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number x and his power n : ");
		System.out.println("x to the power n is : "+power(sc.nextInt(),sc.nextInt()));
		
		sc.close();
	}

}
