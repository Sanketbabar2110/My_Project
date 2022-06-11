package java8.prowings.practice;
class Hello {
// Declare an instance block. 
	{
		show();
	}

	Hello() {
		System.out.println("Hello constructor");
		show();
	}

	void show() {
		System.out.println("Hello method");
	}
	void display() {
		System.out.println("Inside parent");
	}
}

class Hi extends Hello {
	Hi() {
		System.out.println("Hi constructor");
	}
	void display() {
		System.out.println("Inside CHild");
	}

	void show() { // Override the show() method.
		System.out.println("Hi method");
	}
}

public class Demo{
	public static void main(String[] args) {
		Hi obj = new Hi();
		obj.show(); // show() method of Hi class is called.
		System.out.println("--------------------");
		// Superclass reference is equal to child class object.
		Hello obj1 = new Hi();
		obj1.show();
		obj1.display();
	}

}