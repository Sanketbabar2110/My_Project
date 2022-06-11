package java8.prowings.practice;

import java.util.Scanner;

class Students {

	int Roll;
	String name;
	int marks;
	String City;
	
	Scanner sc = new Scanner(System.in);
	
	void accept() {
		
		System.out.println("Enter roll number, name, marks, city of the students ");
		Roll = sc.nextInt();
		name = sc.next();
		marks = sc.nextInt();
		City = sc.next();
		
	}

	void display() {

		System.out.println("roll num of the students is =" + Roll);
		System.out.println("name of the student is =" + name);
		System.out.println("marks of the student is =" + marks);
		System.out.println("City of the student is =" + City);
	}
	
}

public class Cls{

	public static void main(String[] args) {

		Students s1 = new Students();
		s1.accept();
		s1.display();

		Students s2 = new Students();
		s2.accept();
		s2.display();


		Students s3 = new Students();
		s3.accept();
		s3.display();
	
	}

}
