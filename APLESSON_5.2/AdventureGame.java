import java.util.Scanner;
public class AdventureGame 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are a soldier during WW1. "
							+ "What country do you want to fight for?"
							+ "\nGermany or France?");
		String country = kb.nextLine();
		
		if( country.equals("Germany") ) 
		{
			System.out.println("You are now a solider in the Axis of Evil!");
			System.out.println("Would you rather fly a fighter plane or drive a tank?");
			String vehicle = kb.nextLine();
			
			if (vehicle.equals("plane")) 
			{
				System.out.println("You are flying a German Plane");
				System.out.println("You are a Luffwaffe!");
				
				System.out.println("Do you want to fly a Blimp or be a Red Barron?");
				String fighter = kb.nextLine();
				
				if(fighter.equals("Blimp"))
				{
					System.out.println("You didnt study Chemistry and filled your "
										+ "blimp with H2 gas. Lightening striked your blimp, "
										+ " and it exploded and you died.");
				}	
				else
					System.out.println("You died because Charlie Brown didnt feed you!");
			}
			else 
			{ // tank 
				System.out.println("You are driving a German Tank");
				System.out.println("Are you a Panther or a Tiger?");
				String cat = kb.nextLine();
				
				if ( cat.equals("Tiger") )
				{
					System.out.println("You ran out of gas and lost the war.");
				}
				else
				{
					System.out.println("Your Panzer tank broke down and your died.");
				}
			}
		}		
		else 
		{ // France choice
			System.out.println("Viva France!");
			System.out.println("Do you want to be a soldier or a cook?");
			String gender = kb.nextLine();
			
			if (gender.equals("cook"))
			{
				System.out.println("Do you want to cook chicken or "
									+ "steak for the soldiers?");
				String food = kb.nextLine();
				
				if (food.equals("chicken")) 
				{
					System.out.println("Your wild chicken caught feed the soldiers"
										+ "and you won the war");
				}
				else 
				{
					System.out.println("You killed stray cattle to feed the soldiers"
										+ "and you won the war");
				}
			}
			else 
			{
				System.out.println("You are on the front line.");
				System.out.println("Do you want to be a spy or machine gunner?");
				
				String front = kb.nextLine();
				if( front.equals("spy") )
				{
					System.out.println("You are a great spy and got the plans"
										+ "to destroy the DeathStar.");	
				}
				else
				{
					System.out.println("You use the force and light saber machine"
							+ "gun won the war!!!");
				}
			}
		
		}
	}
}
