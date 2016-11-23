import java.util.Scanner;

public class Lucky7s 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number with a 7: ");
		int num = kb.nextInt();
		
		System.out.println("In the number, " + num + ", there are " + luck(num) + " sevens");		
	}
	public static int luck(int num)
	{
		if(num > 0)
		{
			if (num%10 == 7)
			{
				return 1 + luck(num/10);				
			}
			else 
			{
				return 0 + luck(num/10);
			}			
		}
		else 
			return 0;
	}
}
