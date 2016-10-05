import java.util.Scanner;

public class RectangleStatic 
{
	public static double l;
	public static double w;
	public static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length: ");
		l = kb.nextInt();
		
		System.out.println("Please enter the width: ");
		w = kb.nextInt();
		
		perimeter();
		print();

	}
	public static double perimeter() 
	{
		return perimeter = 2.0*l + 2.0*w;
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %5.2f ft around", perimeter);
	}
}
