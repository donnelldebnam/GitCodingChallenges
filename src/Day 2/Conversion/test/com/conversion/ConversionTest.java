package com.conversion;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversionTest {

    @Test
    public void testCelsiusToFahrenheit() throws Throwable {

        Conversion test = new Conversion();

        // When
        double temperature = 80.0;
        String unit = "";
        double result = test.temperatureConversion(temperature, unit);

        // Then - assertions for result of method tempConversion(double, String)
        // --> assertEquals(expected, actual, delta);
        assertEquals(176.0, result, 0.1);
    }

    @Test
    public void testFahrenheitToCelsius() throws Throwable {

        Conversion test = new Conversion();

        // When
        double temperature = 80;
        String unit = "F";
        double result = test.temperatureConversion(temperature, unit);

        assertEquals(26.7, result, 0.1);

    }

}
