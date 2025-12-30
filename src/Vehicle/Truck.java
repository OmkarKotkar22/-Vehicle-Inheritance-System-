package Vehicle;

import java.util.*;

public class Truck extends Vehicle{
	double cargoweightlimit;
	
	Scanner sc = new Scanner(System.in);
	
	public Truck(String model, String regNo, double speed, double fuelCapacity, double fuelConsumption, double cargoweightlimit)
	{
		super(model, regNo, speed, fuelCapacity, fuelConsumption);
		this.cargoweightlimit = cargoweightlimit;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Enter the cargo weight limit: "+ cargoweightlimit + " kg");
	}
}
