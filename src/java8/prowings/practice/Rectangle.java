package java8.prowings.practice;

import java.lang.Math;
public class Rectangle {
	
	float length;
	float bredth;
	
	public Rectangle(){
	}

	public Rectangle(float l, float b){
		super();
		this.length = l;
		this.bredth = b;
	}
	
	public float area(){
		return length*bredth;
	}
	
	public float perimeter(){
		return 2*(length + bredth);
	}
	
	public double digonal(){
		double Power = Math.pow(length, 2) + Math.pow(bredth, 2);
		return Math.sqrt(Power);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
