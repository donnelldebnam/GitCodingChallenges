package com.exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseTest {

    @Test
    public void testHelloWorld() {
        Exercise test = new Exercise();
        String result = test.HelloWorld();

        assertEquals("Hello World.",result);
    }

}