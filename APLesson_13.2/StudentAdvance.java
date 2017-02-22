
public class StudentAdvance extends Ticket
{

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
