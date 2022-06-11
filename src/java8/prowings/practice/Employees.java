package java8.prowings.practice;

//write another test class,whether you have to take emp details from user using scanner and create object and call methods

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Employees {

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter emp_ID, emp_name, emp_Department, Address, salary: ");
		Employee obj1 = new Employee(scr.next(), br.readLine(),scr.next(),br.readLine(),scr.nextInt());
		obj1.displayEmpDetails();
		scr.close();
		br.close();
	}
}
