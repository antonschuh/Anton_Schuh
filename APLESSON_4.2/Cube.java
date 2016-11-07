import java.util.Scanner;

public class Cube
{
	static int side;
	static double SA;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Cube surface = new Cube();
		
		System.out.println("Please enter the leangth of the side: ");
		side = kb.nextInt();
		
		calcSurf();
		print();
		
	}
	public static void calcSurf() 
	{
		SA = 6*side*side;
	}
	public static void print()
	{
		System.out.println("The Surface area of your cube is " + SA);
	}
}