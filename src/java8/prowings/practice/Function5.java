package java8.prowings.practice;

/**
 * Write a function that takes in age as input and returns if that person
 * 	is eligible to vote or not. A Person of age > 18 is eligible to vote
 * **/

import java.util.Scanner;
public class Function5 {
	
	public static void voteEligiblity(int age) {
		
		if(age>=18)
			System.out.println("A person is eligible for vote");
		else
			System.out.println("A person is not eligible for vote");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of a person : ");
		
		voteEligiblity(sc.nextInt());
		
		sc.close();
	}

}
