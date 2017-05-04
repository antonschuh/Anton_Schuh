
public class StudentAdvance extends Advanced
{

	public StudentAdvance(int daysLeft) {
		super(daysLeft);
		// TODO Auto-generated constructor stub
	}

	public StudentAdvance() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 25;
	}

	public String toString()
	{
		return 	"\nTicket: " + getSerialNumber() +
				"\nPrice: " + getPrice() +
				"\nStudent ID Required!";
	}
}
