import java.util.Scanner;

public class RandStrings 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String[][] randStrings = new String[4][4];
		
		for(int i = 0; i < randStrings.length; i++)
		{
			for(int j = 0; j < randStrings[i].length; j++)
			{
				System.out.println("Please enter a word: ");
				randStrings[i][j] = kb.nextLine();
			}
		}
		
		for(int i = 0; i < randStrings.length; i++)
		{
			for(int j = 0; j < randStrings[i].length; j++)
			{
				System.out.print(randStrings[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
