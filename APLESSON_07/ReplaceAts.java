import java.util.Scanner;
public class ReplaceAts 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Write a sentence containg the letter 'a' at least once: ");
		
		String sent = kb.nextLine();
		
		System.out.println(replace(sent));
		
	}
	
	public static String replace(String sentence)
	{
		sentence = sentence.replace("A", "@");
		sentence = sentence.replaceAll("a", "@");
		
		return sentence;
	}
}
