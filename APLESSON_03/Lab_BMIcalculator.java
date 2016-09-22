import java.util.Scanner; //import Statement

public class Lab_BMIcalculator
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user imput
		System.out.println("What is your height?");
		
		double height = keyboard.nextDouble();
		
		System.out.println("What is your weight?");
		
		double weight = keyboard.nextDouble();
		
		System.out.println("Your BMI is " + (weight * 703)/(height * height));
	}
}