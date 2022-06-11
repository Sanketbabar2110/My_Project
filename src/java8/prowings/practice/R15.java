package java8.prowings.practice;

//Program to print details of Yamaha r15.

public class R15 {
	
	static String company = "YAMAHA";
	static String name = "R15";
	static String a = "v2.0";
	static String b = "v3.0";
	static int c = 136;
	static int d = 150;
	static int fuel = 11;
	static int price = 152598;
	static int cost = 222257;
	static int eco = 40;
	static int cc = 150;
	
	public static void main(String[] args)
	{
		System.out.println("Company name : "+company);
		System.out.println("Bike name : "+name+" Single cylinder sports bike");
		System.out.println("on road price : Rs. "+price+" - Rs. "+cost);
		System.out.println("Fuel economy : "+eco+"km/l");
		System.out.println("Max. Speed : "+c+"  to "+d+" km/hr");
		System.out.println("Fuel tank capacity : "+fuel+" L");
		System.out.println("Engine : "+cc+" cc");
	}
}
