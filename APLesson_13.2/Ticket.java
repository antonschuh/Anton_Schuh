import java.util.Random;

public abstract class Ticket 
{
	private int serialNumber;

	public Ticket() 
	{
		super();
		
		Random rand = new Random();
		this.serialNumber 
				=  rand.nextInt(9000000-1)+1000000;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNo) {
		this.serialNumber = serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return	"\nTicket: " + serialNumber +
				"\nPrice: " + getPrice();
	}
}
