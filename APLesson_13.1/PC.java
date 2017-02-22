public class PC extends GameSystem
{
	public PC(String string) {
		// TODO Auto-generated constructor stub
		this.setPlatForm(string);
	}

	public String systemInput()
	{
		return "KeyBoard and Mouse";
	}
	
	public String toString()
	{
		return	"Platform: " + getPlatForm() +
				"\nSerial #: " + getSerialNo() +
				"\nController: " + systemInput();
		
	}
}
