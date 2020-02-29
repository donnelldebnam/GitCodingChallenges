import java.util.*;

public class Main {

    // fibonacci array
    static long[] fibArray = new long[100];

    public static void main(String[] args) {
        computeAndTimeFibonacci(40);
    }

    public static long fibonacci(int n) {
        
        // Implement a fibonacci algorithm using Dynamic Programming
        //
        // This algorithm should first check if the input has been
        // passed into the function before, and based on that analysis,
        // make one of 2 decisions:
        //      (1) Simply return the value at the nth index of the fibonacci array, OR
        //      (2) Compute fibonacci(n) and store it in the fibonacci array for furure reference
        return 0;
    }

    public static void computeAndTimeFibonacci(int num) {
        long start = System.nanoTime();
        long answer = fibonacci(num);
        long end = System.nanoTime();
        System.out.println("fibonacci(" + num + ") = " + answer);
        System.out.println("The calculations took " + (end - start) / 1000000. + " milliseconds");
    }

}
