import java.util.Scanner;

public class Circle
{
	static int r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Circle round = new Circle();
		
		System.out.println("Please enter the radius of your circle: ");
		r = kb.nextInt();
		
		calcArea();
		print();
	}
	public static void calcArea()
	{
			area = 3.14*(r*r);
	}
	
	public static void print()
	{
			System.out.println("The area of your circle with a radius of " + r + " is " + area);
	}	
}	