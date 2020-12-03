package designpatterns;

import java.util.Scanner;

//Utilization Layer
public class MainApp 
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("SELECT VEHILCE TYPE");
		System.out.println("CAR");
		System.out.println("BIKE");
		String choice=sc1.next();
		
		VehicleFactory factory=new VehicleFactory();
		
		Vehicle v=factory.getVehicleObject(choice);
		
		//Access functionality
		v.getVehicleType();
		v.getVehiclePrice();
	}
}
