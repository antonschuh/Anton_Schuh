import java.util.Random;

public class Toyota extends Car 
{
	Random rand = new Random();
	private int ID;
	private double[] location = new double[2];
	
	public Toyota(String str) 
	{
		ID = rand.nextInt(9000000-1)+1000000;
		String[] position = str.split(", ");
		
		location[0] = Double.parseDouble(position[0]); 
		location[1] = Double.parseDouble(position[1]); 
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
