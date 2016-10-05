import java.util.Scanner;

public class Rectangle 
{
	public double l;
	public double w;
	public double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Rectangle box = new Rectangle();
		
		System.out.println("Please enter the length: ");
		box.l = kb.nextInt();
		
		System.out.println("Please enter the width: ");
		box.w = kb.nextInt();
		
		box.perimeter();
		box.print();

	}
	public double perimeter() 
	{
		return perimeter = 2.0*l + 2.0*w;
	}
	public void print()
	{
		System.out.printf("Your rectangle is %5.2f ft around", perimeter);
	}
}
