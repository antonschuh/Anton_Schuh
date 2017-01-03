public class RandomNumbers
{
	public static void main(String[]args)
	{
		int numbers = 
		int[][]randNums = new int [4][4];
		randNums [0][0] = 1;
		randNums [1][1] = 2;
		randNums [2][2] = 3;
		randNums [3][3] = 4;
		
		for(int i = 0; i < randNums.length; i++)
		{
			for(int j = 0; j < randNums[i].length; j++)
			{
				System.out.print(randNums[i][j] + "\t");
			}
			
		}
	}
}