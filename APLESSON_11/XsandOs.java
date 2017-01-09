import java.util.Random;

public class XsandOs 
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		String[][] xAndO = new String[4][4];
		int num = 0;
		
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				num = rand.nextInt(2 - 1 + 1) + 1;
				
				if(num == 1)
					xAndO[i][j] = "x";
				else
					xAndO[i][j] = "o";
			}
		}
		
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				System.out.print(xAndO[i][j] + " ");
			}
			System.out.println();
		}
	}
}
