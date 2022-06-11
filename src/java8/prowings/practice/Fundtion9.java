package java8.prowings.practice;

//Fibonacci series

import java.util.Scanner;
public class Fundtion9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int x = 0;
		int y = 1;
		int z = y;
		
		System.out.print(x+" "+y);
		
		for(int i=0;i<=22;i++) {
			y = x+y;
			if(y<=n && y>0)
				System.out.print(" "+y);
			z=y+z;
			x=z;
			if(z<=n && z>0)
				System.out.print(" "+z);
		}
		sc.close();
	}

}
