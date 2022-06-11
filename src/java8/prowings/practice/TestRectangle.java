package java8.prowings.practice;

import java.util.Scanner;
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter length and bredth of Rectangle : ");
		
		Rectangle r1 = new Rectangle(sc.nextFloat(), sc.nextFloat());
		
		System.out.println("Area of Rectangle	:  "+r1.area());
		System.out.println("Perimeter of rectangle	:  "+r1.perimeter());
		System.out.println("Digonal of rectangle	:  "+String.format("%.4f", r1.digonal()));
		
		sc.close();
	}
}
