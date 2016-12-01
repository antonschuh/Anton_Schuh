import java.util.Scanner;
public class FirstLetter
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter five words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("The first letter of each word is... ");
		
		for(String word : words)
		{
			System.out.print(word.charAt(0) + ", ");
		}
	}
	 
}