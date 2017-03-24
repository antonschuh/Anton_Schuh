import java.util.Random;
import java.util.Random;

public class GMC extends Car 
{
	Random rand = new Random();
	private int ID = 0;
	private double[] location = new double[2];
	
	public GMC() 
	{
		super();
		ID = rand.nextInt(9000000-1)+1000000;
	}
  
	public GMC(double locX, double locY) 
	{
		super();
		ID = rand.nextInt(9000000-1)+1000000;
		
		location[0] = locX;
		location[1] = locY;
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
	
	public void move(double x, double y) 
	{
		location[0] = location[0] + x;
		location[1] = location[1] + y;
	}
}
