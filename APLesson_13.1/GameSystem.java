import java.util.Random;

public class GameSystem 
{
	
	private String platForm;
	private int serialNo;
	
	public GameSystem(String platForm) 
	{
		this.platForm = platForm;
		
		Random rand = new Random();
		serialNo = rand.nextInt(9000000) + 1000000;
	}

	public GameSystem() 
	{
		// TODO Auto-generated constructor stub
		Random rand = new Random();
		serialNo = rand.nextInt(9000000) + 1000000;
	}

	public String getPlatForm() 
	{
		return platForm;
	}

	public void setPlatForm(String platForm) {
		this.platForm = platForm;
	}

	public int getSerialNo() 
	{
		return serialNo;
	}

	public void setSerialNo(int serialNo) 
	{
		this.serialNo = serialNo;
	}
	
	public String toString()
	{
		return	"Platform: " + getPlatForm() +
				"\nSerial #: " + getSerialNo();
	}
}
