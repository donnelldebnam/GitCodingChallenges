/**
 * This is the "Vehicle" class. We'll use this to later create an instance
 * of the class and have the option to change the license plates, drive,
 * check the milage, and find our location via the GPS.
 */
public class Vehicle {

	private long milage = 0;
	private String licensePlate = "";
	private String model = "";
	private Location location;

	public Vehicle(String model, String licensePlate, long milage) {
		this.model = model;
		this.licensePlate = licensePlate;
		this.milage = milage;
	}

	void drive(long latitude, long longitude) {
		// Task 1: Implement a function that uses the old latitude and longitude
		// to account for the amount of new milage. Use the value to then update
		// the previous milage.
		location = new Location(latitude, longitude);
	}

	void changePlates(String lplate) {
		this.licensePlate = licensePlate;
	}

	long getMilage() {
		return milage; 
	}

	Location locate() {
		return location;
	}
	
}
