package com.exercise;

public class Spaceship {

    private final float MAX_ALTITUDE = 380000;

    private double speed;
    private Location location;

    public Spaceship(Location location) { this.location = location; }

    // Lifts the Spaceship off by increasing velocity to 8750 mph. The Spaceship
    // also experiences vertical displacement.
    public void liftOff() {
        location = new Location(MAX_ALTITUDE / 2, location.getLongitude());
        speed = 8750;
    }

    // Increases velocity to reach maximum altitude of 380,000 ft. The Spaceship
    // also experiences vertical displacement.
    public void enterSpace() {
        location = new Location(MAX_ALTITUDE, location.getLongitude());
        speed = 17500;
    }


    // Returns the location of the Spaceship.
    public Location getLocation() {
        return location;
    }

    // Returns the Spaceship's speed.
    public double getSpeed() {
        return speed;
    }

    // Returns if current altitude is at max altitude, meaning
    // we're outer space, or in orbit.
    public boolean inOrbit() {
        return location.getLatitude() == MAX_ALTITUDE;
    }

}
