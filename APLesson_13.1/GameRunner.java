public class GameRunner 
{
	public static void main(String[] args)
	{
		GameSystem Atari = new GameSystem("Frogger");
		
		PlayStation Sony = new PlayStation("Sega");
		XBox MicroSoft = new XBox("XBox");
		
		PC WarCraft = new PC("Dell");
		
		System.out.println("\n" + Atari.toString() );
		System.out.println("\n" + Sony.toString() );
		System.out.println("\n" + MicroSoft.toString() );
		System.out.println("\n" + WarCraft.toString() );
	}
}
