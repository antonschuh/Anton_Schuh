import java.util.Scanner;

public class AverageDigits
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		int num = kb.nextInt();
		
		System.out.println("The average of the digit in " + num + " is " + avDigits(num) );
	}
	
	public static int avDigits(int number)
	{
		int num = number;
		int av = 0;
		int digits = 0;
		
		while (num > 0)
		{
			digits = digits + 1;
			av += num%10;
			num /= 10;
		}
		return av /= digits;
	}
}