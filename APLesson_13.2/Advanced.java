
public class Advanced extends Ticket
{
	private int daysLeft;
	
	public Advanced(int daysLeft) 
	{
		super();
		this.daysLeft = daysLeft;
	}

	public Advanced() {
		// TODO Auto-generated constructor stub
	}

	public int getDaysLeft() 
	{
		return daysLeft;
	}

	public void setDaysLeft(int daysLeft) 
	{
		this.daysLeft = daysLeft;
	}

	@Override
	public double getPrice() 
	{
		if(daysLeft > 10)
			return 30;
		else
			return 40;
	}
	
}
