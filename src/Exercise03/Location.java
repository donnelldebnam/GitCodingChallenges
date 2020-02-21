/**
 * The "Location" class. This will create a structure for
 * us to keep track of the vehicle's location.
 */
public class Location {

    private long latitude = 0;
    private long longitude = 0;

    public Location(long latitude, long longititude) {
        this.latitude = latitude;
        this.longititude = longititude;
    }

    public long getLatitude() {
        return latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLatitude(long lat) {
        latitude = lat;
    }

    public void setLongitude(long lon) {
        longitude = lon;
    }

    /**
     * Task 2: Add a function here to print location in the format of 
     * "(latitude, longitude)" (Hint: toString)
     */

     public void printLocation() {
        System.out.println("(" + latitude + ", " + longitude + ")");
     }

}
