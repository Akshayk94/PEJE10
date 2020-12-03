package designpatterns;

//Factory class
public class VehicleFactory 
{
	//Factory method
	public Vehicle getVehicleObject(String choice)
	{
		Vehicle v1=null;
		
		if(choice.equalsIgnoreCase("car"))
		{
			v1=new Car(); //upcasting
		}
		else if(choice.equalsIgnoreCase("bike"))
		{
			v1=new Bike();//upcasting
		}
		return v1;
	}
}
