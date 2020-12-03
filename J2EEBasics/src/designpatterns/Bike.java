package designpatterns;

//Implementation Layer
public class Bike implements Vehicle 
{

	@Override
	public void getVehicleType()
	{
		System.out.println("VEHICLE TYPE IS BIKE");
	}

	@Override
	public void getVehiclePrice() 
	{
		System.out.println("VEHICLE PRICE IS 85000");
	}

}
