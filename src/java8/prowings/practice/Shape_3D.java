package java8.prowings.practice;

public class Shape_3D {

	double coneVolume(double pi, int r, int h)
	{
		double cVolume = pi*r*r*h/3;
		return cVolume;
	}


	public static void main(String[] args) 
	{
		System.err.println("Volume of 3-Dimensional shape :");
		
		Shape_3D obj1 = new Shape_3D();
		System.out.println("\nVolume of cone		: "+obj1.coneVolume(3.142, 10, 10));
		
		Cylinder obj2 = new Cylinder();
		System.out.println("Volume of Cylinder	: "+obj2.cylinder(3.142, 10, 10));
		
		Sphere obj3 = new Sphere();
		System.out.println("Volume of Sphere	: "+obj3.sphere(3.142, 10));
	}
}
