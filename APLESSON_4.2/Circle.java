import java.util.Scanner;

public class Circle
{
	public double r;
	public double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Circle round = new Circle();
		
		System.out.println("Please enter the radius of your circle: ");
		round.r = kb.nextInt();
		
		round.area();
		round.print();
	}
	
	public double area()
	{
			return area = 3.14*(r*r);
	}
	
	public void print()
	{
			System.out.printf("The area of your circle with a radius of" +r+ " %.5f is", area);
	}	
}	