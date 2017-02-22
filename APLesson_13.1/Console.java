
public abstract class Console extends GameSystem 
{
	public Console() 
	{
		super();
	}

	public abstract String getController();
	
	public String toString()
	{
		return	"Platform: " + getPlatForm() +
				"\nSerial #: " + getSerialNo() +
				"\nController: " + getController();
		
	}
}
