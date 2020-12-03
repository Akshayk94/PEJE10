package classloading;

public class MainApp 
{

	public static void main(String[] args) 
	{
		
		try 
		{
			Class.forName("classloading.Account");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}

	}

}
