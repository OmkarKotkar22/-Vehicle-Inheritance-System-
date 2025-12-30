package Vehicle;

import java.util.*;

public class Vehicle {
	
	Scanner sc = new Scanner(System.in);
	
	private String model;
	private String regNo;
	private double speed;
	private double fuelCapacity;
	private double fuelConsumption;
	
	public Vehicle(String model, String regNo, double speed, double fuelCapacity, double fuelConsumption)
	{
		this.model = model;
		this.regNo = regNo;
		this.speed = speed;
		this.fuelCapacity = fuelCapacity;
		this.fuelConsumption = fuelConsumption;
	}
	
	public double fuelNeeded(double distance)
	{
		return distance / fuelConsumption;
	}
	
	public double distanceCovered(double time)
	{
		return speed * time;
	}
	
	public void display()
	{
//		System.out.println("=======Vehicle Detail=========");
		System.out.println("Vehicle Model: "+ model);
		System.out.println("Vehicle Registration Number: "+ regNo);
		System.out.println("Vehicle Speed: "+ speed + "km/hr");
		System.out.println("Vehicle fuelCapacity: "+ fuelCapacity + "liters");
		System.out.println("Fuel Consumption: "+ fuelConsumption+ "km/l");
//		System.out.println("==============================");
	}
}
