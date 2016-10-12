public class Lesson_05DiceRoll
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		 player = (int)(Math.random()*6)+1;
		 computer = (int)(Math.random()*6)+1;
		 
		 System.out.println("You rolled a " + player);
		 System.out.println("Computer rolled a " + computer);
		 diceRoll();
		 
	}
	
	public static void diceRoll()
	{
		if(player>computer)
			System.out.println("You are the winner!");
		
		if(!(player>computer))
			System.out.println("The computer is the winner!");
			
	}
}