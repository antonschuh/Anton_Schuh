import java.util.Scanner;

public class Average 
{
	static int num1;
	static int num2;
	static int num3;
	static double average;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Average mean = new Average();
		
		System.out.println("Please enter the first number: ");
		num1 = kb.nextInt();
		
		System.out.println("Please enter the second number: ");
		num2 = kb.nextInt();
		
		System.out.println("Please enter the third number: ");
		num3 = kb.nextInt();
		
		calcAverage();
		print();
	}
	public static void calcAverage()
	{
		average = (num1 + num2 + num3)/3.0;
	}
	public static void print()
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", " + num3 + " is " + average);
	}
}
