/**
 * This is the "Vehicle" class. We'll use this to later create an instance
 * of the class and have the option to change the license plates, drive,
 * check the milage, and find our location via the GPS.
 */
 import java.lang.Math;
 
public class Vehicle {

	protected long milage = 0;
	protected String licensePlate = "";
	private String model = "";
	protected Location location;

	public Vehicle(String model, String licensePlate, long milage) {
		this.model = model;
		this.licensePlate = licensePlate;
		this.milage = milage;
      location = new Location(0,0);
	}

	public void drive(long latitude, long longitude) {
		// Task 1: Implement a function that uses the old latitude and longitude
		// to account for the amount of new milage. Use the value to then update
		// the previous milage. sqrt (x2 - x1)^2 + (y2 - y1)^2

      milage += (long)Math.sqrt(Math.pow(this.location.getLatitude() - latitude, 2) + Math.pow(this.location.getLongitude() - longitude, 2));
		location.setLatitude(latitude);
      location.setLongitude(longitude);
	}

	void changePlates(String lplate) {
		this.licensePlate = lplate;
	}

	long getMilage() {
		return milage; 
	}

	Location locate() {
		return location;
	}
	
}
