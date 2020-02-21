/**
 * The "Location" class. This will create a structure for
 * us to keep track of the vehicle's location.
 */
public class Location {

    public long latitude = 1;
    public long longitude = 1;

    public Location(long latitude, long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public long getLatitude(){
      return this.latitude;
    }
    
    public long getLongitude(){
      return this.longitude;
    }
    
    public void setLatitude(long lat){
      this.latitude = lat;
    }
    
    public void setLongitude(long lon){
      this.longitude = lon;
    }

    /**
     * Task 2: Add a function here to print location in the format of 
     * "(latitude, longitude)" (Hint: toString)
     */
     
     public String toString(){
       return "Latitude = "+this.latitude+"\nLongitude = "+this.longitude;
     }
    

}
