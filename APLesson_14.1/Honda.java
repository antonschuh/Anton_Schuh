import java.util.Random;

public class Honda extends Car 
{
	Random rand = new Random();
	private int ID;
	private double[] location = new double[2];
	
	public Honda(double[] position) 
	{
		ID = rand.nextInt(9000000-1)+1000000;
		location = position;
	}
	
	public int getID() 
	{
		return ID;
	}
	
	public void move(double x, double y) 
	{
		location[0] = location[0] + x;
		location[1] = location[1] + y;
	}
	
	public double[] getLoc() 
	{
		return location;
	}
}
