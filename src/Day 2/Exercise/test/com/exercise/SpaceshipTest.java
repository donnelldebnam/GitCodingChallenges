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

    public void testLocation() {
        // Task 1: Implement tests for getLocation()
        Spaceship test = new Spaceship(new Location(5,405435885));
        Location testLocation = test.getLocation();


    }

        public void testLiftOff() {
            // Task 2: Implement tests for liftOff()
        Spaceship test = new Spaceship(new Location(4,435956838));
          test.liftOff();
            
    }
        public void enterSpace() {
            // Task 3: Implement tests for enterSpace()
            
            Spaceship test = new Spaceship(new Location(3,569384529));
            test.enterSpace();
            
            
        }
        public void inOrbit() {
            // Task 4: Implement tests for inOrbit()
            Spaceship test = new Spaceship(new Location(2,234923869));
            boolean testinOrbit = test.inOrbit();
            
            
        }

}
