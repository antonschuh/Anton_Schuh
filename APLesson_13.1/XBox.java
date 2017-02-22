public class XBox extends Console 
{
	public XBox(String string) {
		// TODO Auto-generated constructor stub
		super();
		this.setPlatForm(string);
	}

	@Override
	public String getController() 
	{
		// TODO Auto-generated method stub
		return "PS DualShock 3";
	}
	
	public String getPlatform() 
	{
		return "XBox";
	}

}
