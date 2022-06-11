package java8.prowings.practice;

public class Circle {

	double r;
	public static final double PI =3.142;
	
	public Circle(){
	}
	
	public Circle(double r){
		super();
		this.r = r;
	}
	
	public double calculateArea() {
		return PI*r*r;		
	}
	
	public double calculatePerimeter() {
		return 2*PI*r;
	}
	
	public static void main(String[] args) {
		
	}
}
