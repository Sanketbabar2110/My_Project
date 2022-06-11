package java8.prowings.practice;

import java.util.Scanner;
public class CustomizedExeption {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to Withdraw : ");
		int balance = sc.nextInt();
		
		if(balance <100)
			throw new LowBalance("Entered amount is low, Plz Enter amount more then Rs. 100");
		else if(balance > 10000)
			throw new HighBalance("Your account balance is high but you can withdraw upto RS. 10000 only");
		else 
			System.out.println("Collect your cash");
	
	}
}

class LowBalance extends RuntimeException{
	public LowBalance(String s) {
		super(s);
	}
}

class HighBalance extends RuntimeException{
	public HighBalance(String s) {
		super(s);
	}
}
