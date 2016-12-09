import java.util.Random;
import java.util.Scanner;

public class AverageNumber
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; ++i)
		{
			//random number from [1,100]
			numbers[i] = rand.nextInt(100 - 1 + 1) + 1;
		}
		
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		
		System.out.println("\nThe average of the above numbers is: " + 
							average(numbers));
	}
	
	public static double average(int[] num)
	{
		int total = 0;
		
		for(int i = 0; i < num.length; ++i)
		{
			total = total + num[i];
		}
		
		return total/10.0;
	}
}