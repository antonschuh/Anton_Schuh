import java.util.Scanner;

public class CubeStatic
{
	static int side;
	static double SA;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the leangth of the side: ");
		side = kb.nextInt();
		
		area();
		print();
		
	}
	public static double area() 
	{
		return SA = 6*side*side;
	}
	public static void print()
	{
		System.out.printf("The Surface area of your cube is %5.2f", SA);
	}
}
