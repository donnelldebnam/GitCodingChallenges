/**
 * This is the "Vehicle" class. We'll use this to later create an instance
 * of the class and have the option to change the license plates, drive,
 * check the milage, and find our location via the GPS.
 */
public class Vehicle {

	private long mileage = 0;
	private String licensePlate = "";
	private String model = "";
	private Location location = new Location(0, 0);

	public Vehicle(String model, String licensePlate, long mileage) {
		this.model = model;
		this.licensePlate = licensePlate;
		this.mileage = mileage;
	}

	void drive(long latitude, long longitude) {
		// Task 1: Implement a function that uses the old latitude and longitude
		// to account for the amount of new milage. Use the value to then update
		// the previous mileage.
      double xDiff = Math.abs(latitude - location.getLatitude());
      double yDiff = Math.abs(longitude - location.getLongitude());
      double distance = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
      
      mileage += distance;
      
		location = new Location(latitude, longitude);
	}

	void changePlates(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	long getMileage() {
		return mileage; 
	}

	Location locate() {
		return location;
	}
	
}
