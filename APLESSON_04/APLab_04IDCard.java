import java.util.Scanner;

public class APLab_04IDCard 
{
	public static void main(String[]args)
	{
		APLab_04IDCard IDCard = new APLab_04IDCard();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstName = kb.nextLine();
		
		System.out.println("Enter your last name: ");
		String lastName = kb.nextLine();
		
		System.out.println("Enter your title: ");
		String title = kb.nextLine();
		
		System.out.println("Enter the school site: ");
		String school = kb.nextLine();
		
		System.out.println("Enter the school year: ");
		String year = kb.nextLine();
		
		System.out.println("What is your subject? ");
		String subject = kb.nextLine();
		
		System.out.println("************************************");
		IDCard.format(school, year);
		IDCard.format(firstName, lastName);
		IDCard.format(title, subject);
		System.out.println("************************************");
		
	}
	public void format(String s1, String s2)
	{
		System.out.printf("* %10s %21s *\n", s1, s2);
		
	}
}

