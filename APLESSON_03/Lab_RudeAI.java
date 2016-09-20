import java.util.Scanner; //import Statement

public class Lab_RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Hi, my name is RudeAI\nI'd like to ask you a few questions.\nWhat is your name?");
		
		String name = keyboard.next();
		
		System.out.println(name + "?!!! Why would anone name a baby that?\nHow old are you, "+ name + "?");
		
		int age = keyboard.nextInt();
		
		System.out.println("Oooooo!!! " + age + " is getting up there.\nWhat do you do for fun, " + name + "?" );
		
		String fun = keyboard.next();
		
		System.out.println("I thought only nerds like to " + fun + "\nWhat kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println("Boooo!!! i wouldn't wish the sound of " + music + " on my worst enemy.\nHow many siblings do you have?");
		
		int siblings = keyboard.nextInt();
		
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking.\nWhat do you want to be when you grow up?");
		
		String job = keyboard.next();
		
		System.out.println("I think you'd have to be smarter to be a " + job +".\nSo " + name + ", you're " + age + "...\nYou like to " + fun + " and listen to " + music + "...\nGood luck becoming a " + job + ".\nI'm only kiddin' " + name + ".");
		
		
	}
}