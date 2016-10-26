import java.util.Scanner;

public class Password 
{
	static String realUser = "Anton";
	static String realPass = "Ern";
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your Username: ");
		String username = kb.nextLine();
		
		System.out.println("Please enter your Passowrd: ");
		String password = kb.nextLine();
		
		System.out.println( checkPassword(username, password) );
	}
	
	public static String checkPassword(String name, String pass)
	{
		if ( !realUser.equals(name) && realPass.equals(pass))
			return "Your Username is Incorrect";
		else if ( !realPass.equals(pass) && realUser.equals(name))
			return "Your Password is Incorrect";
		else if ( !realUser.equals(name) && !realPass.equals(pass))
			return "Your Password and Username are Incorrect!";
		else
			return "Access Granted";
	}
	

}
