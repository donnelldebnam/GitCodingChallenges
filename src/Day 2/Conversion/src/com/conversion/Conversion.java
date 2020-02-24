package com.conversion;

public class Conversion {

    // Converts between Fahrenheit and Celsius.
    double temperatureConversion(double temperature, String unit) {
        return unit.equals("F") ? (temperature - 32) * (5.0/9.0) : (temperature * (9.0/5.0)) + 32.0;
    }

}
