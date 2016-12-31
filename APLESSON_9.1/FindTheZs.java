import java.util.Scanner;

public class FindTheZs 
{
	public static String[] words = new String[5];
	
	public static void main(String[] args)
	{
		fillArray(words);
		printArray(words);
		System.out.println("\nThe words that have 'z' or 'Z' are: " + hasZs(words));
	}
	
	public static void fillArray(String[] str)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter 5 words: ");
		for(int i = 0; i < str.length; i++)
		{
			str[i] = kb.next();
		}
		
		kb.close();
	}
	
	public static void printArray(String[] str)
	{
		for(int i = 0; i < str.length; i++)
		{
			System.out.print(str[i] + ", ");
		}
	}
	
	public static String hasZs(String[] str)
	{
		String strZs = "";
		
		for(String item : str)
		{
			if ( item.indexOf('z') != -1 || item.indexOf('Z') != -1 )
				strZs = strZs + item + ", ";
		}
		
		return strZs;
	}
}
