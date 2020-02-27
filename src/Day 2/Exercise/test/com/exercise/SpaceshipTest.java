package com.exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpaceshipTest {


    @Test
    public void testInitialSpeed() {
        Spaceship test = new Spaceship(new Location(0,40183787));
        double testSpeed = test.getSpeed();

        assertEquals(0, testSpeed,0);
    }

    // Task 1: Implement tests for getLocation()

    // Task 2: Implement tests for liftOff()

    // Task 3: Implement tests for enterSpace()

    // Task 4: Implement tests for inOrbit()

}