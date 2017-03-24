public class Car implements Location 
{
	private int ID;
	private double[] location = new double[2];
	
	public Car() 
	{
		super();
		
		ID = (int)(Math.random()*(1000000 - 100000) + 100000);
		
		location[0] = Math.random()*(100 - 1) + 1;
		location[1] = Math.random()*(100 - 1) + 1;
	}

	@Override
	public void move(double x, double y) 
	{
		location[0] = getLoc()[0] + x;
		location[1] = getLoc()[1] + y;
	}
	
	@Override
	public int getID() 
	{
		return ID;
	}
	
	@Override
	public double[] getLoc() 
	{
		return location;
	}

	public void setID(int iD) 
	{
		ID = iD;
	}
}
