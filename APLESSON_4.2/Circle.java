import java.util.Scanner;

public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the radius of your circle: ");
		r = kb.nextInt();
		
		area();
		print();
	}
	
	public static void area()
	{
			area = 3.14*(r*r);
	}
	
	public static void print()
	{
			System.out.printf("The area of your circle with a radius of" +r+ " %.5f is", area);
	}	
}	