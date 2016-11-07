import java.util.Scanner;

public class Rectangle 
{
	static int l;
	static int w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Rectangle box = new Rectangle();
		
		System.out.println("Please enter the length: ");
		l = kb.nextInt();
		
		System.out.println("Please enter the width: ");
		w = kb.nextInt();
		
		calcPerim();
		print();
	}
	public static void calcPerim() 
	{
		perimeter = 2.0*l + 2.0*w;
	}
	public static void print()
	{
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
}
