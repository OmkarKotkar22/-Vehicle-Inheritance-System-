package Vehicle;

import java.util.*;

public class Bus extends Vehicle {
	
	Scanner sc = new Scanner(System.in);
	int numberOfPassengers;
	
	public Bus(String model, String regNo, double speed, double fuelCapacity, double fuelConsumption, int numberOfPassengers)
	{
		super(model, regNo, speed, fuelCapacity, fuelConsumption);
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Number of Passengers: "+ numberOfPassengers + " ");
	}
}
