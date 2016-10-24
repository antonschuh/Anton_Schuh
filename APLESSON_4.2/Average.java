import java.util.Scanner;

public class Average 
{
	public int num1;
	public int num2;
	public int num3;
	public double average;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Average mean = new Average();
		
		System.out.println("Please enter the first number: ");
		mean.num1 = kb.nextInt();
		
		System.out.println("Please enter the second number: ");
		mean.num2 = kb.nextInt();
		
		System.out.println("Please enter the third number: ");
		mean.num3 = kb.nextInt();
		
		mean.average();
		mean.print();
	}
	public double average()
	{
		return average = (num1 + num2 + num3)/3.0;
	}
	public void print()
	{
		System.out.printf("The average of %3d, %3d, %3d is %5.2f", num1, num2, num3, average);
	}
}
