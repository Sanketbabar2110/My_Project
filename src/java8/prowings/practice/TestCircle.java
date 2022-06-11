package java8.prowings.practice;

import java.util.Scanner;
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Circle : ");
		double r = sc.nextInt();
		
		Circle c1 = new Circle(r);
		System.out.println("Area of Circle		:  "+c1.calculateArea());
		System.out.println("Perimeter of Circle	:  "+String.format("%.4f", c1.calculatePerimeter()));
		sc.close();
	}
}
