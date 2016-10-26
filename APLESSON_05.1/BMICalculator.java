import java.util.Scanner;

public class BMICalculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height? ");
		double height = kb.nextDouble();
		
		System.out.println("What is your weight?");
		double weight = kb.nextDouble();
		
		double bmi = (weight * 703)/(height * height);
		System.out.println("Your BMI is " + bmi);
		
		System.out.println( calcCondish(bmi) );
		
		
	}
	public static String calcCondish(double bmi)
	{
		
		if (bmi < 18.5)
			return "Condition is underweight";
		else if (bmi > 18.5 && bmi < 24.9)
			return "Condition is normal";
		else if (bmi > 25 && bmi < 29.9)
			return "Overweight";
		else if (bmi > 29.9 && bmi < 34.9)
			return "Obese";
		else if (bmi > 35 && bmi < 39.99)
			return "Very Obese";
		else
			return "Morbidly Obese";
	}
				
}
		