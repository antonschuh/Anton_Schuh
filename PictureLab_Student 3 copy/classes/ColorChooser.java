import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
  
/** 
 * A helper class to helps pick a color more user friendly.
 * Lets a user pick a color and returns the picked color object.
 */
public class ColorChooser 
{
	/**
	 * Method to let the user pick a color and return
	 * the color object. 
	 * @return the picked color or red is default.
	 */
	public static Color pickAColor() {
		Color color = Color.white;
    
		// Create a JFrame to be the parent of the color chooser 
		// to see the dialog
		JFrame frame = new JFrame();
		frame.setAlwaysOnTop(true);
    
		// Use the GUI color chooser to pick the color
		color = JColorChooser.showDialog(frame, "Pick a color", color);
    
		return color;
  	}
  
	/** 
	 * Main function for testing the ColorChooser Class 
	 */
	public static void main(String[] args) {
		Color pickedColor = ColorChooser.pickAColor();
		System.out.println(pickedColor);
	} 
}
