package java8.prowings.practice;

// Create a class Employee with fields like empID, name, dept, salary, address
//	write required constructors for initialization
//	write a method displayEmpDetails() in the same class

public class Employee {
	
	String empID;
	String name;
	String dept;
	String address;
	int salary;
	
	public Employee() {
	}
	
	public Employee(String empID, String name, String dept, String address, int salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.dept = dept;
		this.address = address;
		this.salary = salary;
	}
	 void displayEmpDetails()
		{
			System.err.println("\nEmployee Details : ");
			System.out.println("\nEmployee ID		:  "+this.empID+"\nEmployee name		:  "+this.name);
			System.out.println("Employee Department	:  "+this.dept+"\nEmployee Address	:  "+this.address);
			System.out.println("Salary			:  "+this.salary);
		}
	
	public static void main(String[] args) {
		
	}

	
}
