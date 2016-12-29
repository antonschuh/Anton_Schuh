import java.util.Random;
import java.util.Scanner;

public class BiggestNumber 
{
	public static void main(String[]args)
	{
		 int[] numbers = new int[10];
		 
		 fillArray(numbers);
		 printArray(numbers);
		 System.out.println("\nThe biggest number is: " + getBiggest(numbers));
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
	
	public static int getBiggest(int[] num)
	{
		int max = 0;
		
		for(int temp : num)
		{
			if (temp > max)
				max = temp;
		}
		
		return max;
	}
}
