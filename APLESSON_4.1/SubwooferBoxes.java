import java.util.Scanner;

public class SubwooferBoxes 
{
	public static void main(String[]args)
	{
		SubwooferBoxes box = new SubwooferBoxes();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the length of your box in inches:");
		int length = kb.nextInt();
		
		System.out.println("Please enter the width of your box in inches:");
		int width = kb.nextInt();
		
		System.out.println("Please enter the height of your box in inches:");
		int height = kb.nextInt();
		
		System.out.printf("The volume of your new subwoofer box in cubic feet is: %5.2f ft^3", 
				box.volume(length, width, height));
		
	}
	
	public double volume(int l, int w, int h) 
	{
		return (l/12.0)*(w/12.0)*(h/12.0);
	}
}
