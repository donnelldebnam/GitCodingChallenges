/**
 * This will function as the program's driver. We would like to use this
 * in order to create a new Vehicle object, change the license plate on the 
 * vehicle, and then drive to a specific location.
 */
import java.util.*;

public class Exercise03 {

	public static void main(String[] args) throws NullPointerException{

		Vehicle car = new Vehicle("2006 Honda Accord", "", 990);
		
      car.licensePlate = "9650H";

		car.drive(-4376, 9902);

		System.out.println("We're now at " + car.locate().toString());

	}

}
