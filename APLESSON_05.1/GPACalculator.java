import java.util.Scanner;
public class GPACalculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What grade did you get in Math? ");
		String math = kb.nextLine();
		
		System.out.println("What grade did you get in English? ");
		String english = kb.nextLine();
		
		System.out.println("What grade did you get in Science? ");
		String science = kb.nextLine();
		
		System.out.println("What grade did you get in PE? ");
		String pe = kb.nextLine();
		
		System.out.println("What grade did you get in CompSci? ");
		String compsci = kb.nextLine();
		
		System.out.println("What grade did you get in History? ");
		String history = kb.nextLine();
		
		System.out.println("What grade did you get in Art? ");
		String art = kb.nextLine();
		
		double gPoints = calcPoints(math) + calcPoints(english) + calcPoints(science) + calcPoints(pe) + calcPoints(compsci) + calcPoints(history) + calcPoints(art);
		double gpa = gPoints/7;		
		
		System.out.println("Your GPA is " + gpa);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		return 0.0;
	}
}
