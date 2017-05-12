/**
 * Name: Anton Schuh
 * Date: May 10 2017
 * FileName: ElevensGUIRunner.java
 * GUI interface runner
 */
public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 */
	public static void main(String[] args) 
	{
		Board board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
