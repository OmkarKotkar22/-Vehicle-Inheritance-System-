package Vehicle;

import java.util.*;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the model: ");
		String model = sc.next();
		sc.nextLine();
		
		System.out.println("Enter the Registration Number: ");
		String regNo = sc.next();
		sc.nextLine();
		
		System.out.println("Enter the Speed: ");
		double speed = sc.nextDouble();
		
		System.out.println("Enter the Fuel Capacity: ");
		double fuelCapacity = sc.nextDouble();
		
		System.out.println("Enter the Fuel Consumption: ");
		double fuelConsumption = sc.nextDouble();
		
		System.out.println("Cargo Weight Limit");
		double cargoweightlimit = sc.nextDouble();
		
		System.out.println("Enter the Number of Passengers: ");
		int numberOfPassengers = sc.nextInt();
		
//		System.out.println("Fuel Needed: ");
//		int distance = sc.nextInt();
//		
//		System.out.println("Enter the time: ");
//		int time = sc.nextInt();
		
		Truck t = new Truck(model, regNo, speed, fuelCapacity, fuelConsumption, cargoweightlimit);
		System.out.println("======Truck Testing========");
		System.out.println("Fuel needed for 500 km: " + t.fuelNeeded(500));
		System.out.println("Distance covered in 5 hours: "+ t.distanceCovered(5));
		t.display();
		
		System.out.println("======Bus Testing========");
		System.out.println("Fuel needed for 500 km: " + t.fuelNeeded(500));
		System.out.println("Distance covered in 5 hours: "+ t.distanceCovered(5));
		Bus b = new Bus(model, regNo, speed, fuelCapacity, fuelConsumption, numberOfPassengers);
		b.display();
		
		
	}

}