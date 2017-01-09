import java.util.Random;
import java.util.Scanner;

public class RandomNumbers
{
	public static void main(String[]args)
	{ 
		Random rand = new Random();
		int[][] randNums = new int [4][4];
		
		for(int i = 0; i < randNums.length; i++)
		{
			for(int j = 0; j < randNums[i].length; j++)
			{
				randNums[i][j] = rand.nextInt(100 - 1 + 1) + 1;
			}
		}
		
		for(int i = 0; i < randNums.length; i++)
		{
			for(int j = 0; j < randNums[i].length; j++)
			{
				System.out.print(randNums[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}
