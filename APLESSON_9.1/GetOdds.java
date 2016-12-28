import java.util.Random;
import java.util.Scanner;

public class GetOdds 
{
	public static void main(String[]args)
	{
		 int[] numbers = new int[10];
		 
		 fillArray(numbers);
		 printArray(numbers);
		 System.out.println("\nThe odd numbers are: " + 
				 			getOdds(numbers));
	}
	
	public static void fillArray(int[] num)
	{
		Random rand = new Random();
		
		for(int i = 0; i < num.length; i++)
		{
			num[i] = rand.nextInt(100 - 1 + 1) + 1;
		}
	}
	
	public static void printArray(int[] num)
	{
		for(int out : num)
		{
			System.out.print(out + " ");
		}
	}
	
	public static String getOdds(int[] num)
	{
		String odds = "";
		
		for (int number : num)
		{
			if(number%2 == 1)
			{
				odds = odds + number + " ";
			}
		}
		
		return odds;
	}
}
