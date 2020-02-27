package com.exercise;

public class Location {

    private float latitude;
    private float longitude;

    public Location(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != Location.class) return false;
        return ((Location)(obj)).latitude == latitude &&
                ((Location)(obj)).longitude == longitude;
    }
}
