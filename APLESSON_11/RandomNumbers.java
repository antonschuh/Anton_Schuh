public class RandomNumbers
{
	public static void main(String[]args)
	{ 
		int nums = "1, 2, 3, 4, 5, 6, 7, 8, 9";
		int[][]randNums = new int [4][4];
		
			randNums [0][0] = 1;
			randNums [1][1] = 2;
			randNums [2][2] = 3;
			randNums [3][3] = 4;
		
		int num = 1;
		for(int i = 0; i < randNums.length; i++)
		{
			for(int j = 0; j < randNums[i].length; j++)
			{
				randNums[i][j] = num;
			}
			num++;
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