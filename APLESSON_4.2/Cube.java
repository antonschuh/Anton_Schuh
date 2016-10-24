import java.util.Scanner;

public class Cube
{
	public int side;
	public double SA;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Cube surface = new Cube();
		
		System.out.println("Please enter the leangth of the side: ");
		surface.side = kb.nextInt();
		
		surface.area();
		surface.print();
		
	}
	public double area() 
	{
		return SA = 6*side*side;
	}
	public void print()
	{
		System.out.printf("The Surface area of your cube is %5.2f", SA);
	}
}