import java.util.Scanner;
public class ReverseWord
{
	public static void main(String[]args)
	{
		String [] names = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 names: ");
		
		for(int i = 0; i < names.length; i++)
		{
			names[i] = kb.next();
		}
		
		System.out.println("In order... ");
		
		for(String name : names)
		{
			System.out.print( name + ", ");
			
		}		
	}
}