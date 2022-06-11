package java8.prowings.practice;

//Write a function that takes in radius as input and and returns circumference
// and area of a circle

import java.util.Scanner;
public class Function4 {
	
	public static final float PI = 3.142f;
	
	public float area(float r) {
		return PI*r*r; 
	}
	
	public float circumference(float r) {
		return 2*PI*r;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter radius of circle : ");
		float r = sc.nextFloat();
		
		Function4 c1 = new Function4();
		
		System.out.println("Area of circle : "+c1.area(r));
		System.out.println("Circumference of circle : "+c1.circumference(r));
		sc.close();
	}

}
