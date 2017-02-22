public class PlayStation extends Console
{
	public PlayStation(String string) {
		// TODO Auto-generated constructor stub
		super();
		this.setPlatForm(string);
	}

	public String getController() 
	{
		// TODO Auto-generated method stub getController
		return "PS DualShock 3";
	}
	
	public String getPlatForm() 
	{
		return "PlayStation";
	}
}
