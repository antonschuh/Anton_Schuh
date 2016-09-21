import java.util.Scanner; //import Statement

public class APLab_SelfCalculation 
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user imput
		System.out.println("How many miles did you travel?");
		
		double distance = keyboard.nextDouble();
		
		System.out.println("How many hours did it take you?");
		
		double time = keyboard.nextDouble();
		
		System.out.println("You were traveling at an average speed of " + distance/time + "mph");
	}

}
