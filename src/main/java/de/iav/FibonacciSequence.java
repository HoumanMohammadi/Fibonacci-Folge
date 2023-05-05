package de.iav;

import java.sql.SQLOutput;
import java.util.Arrays;

public class FibonacciSequence {


    public static int createFibonacciNum(int fibonacciIndex) {

        switch (fibonacciIndex) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return createFibonacciNum(fibonacciIndex - 1) + createFibonacciNum(fibonacciIndex - 2);
        }
    }


    public static int [] createFibonacciSequence(int fibonacciIndex) {
        int [] fibonacciSequence = new int[fibonacciIndex];

        for (int i=0; i<fibonacciIndex; i++) {
            fibonacciSequence[i] = createFibonacciNum(i);
        }
        return fibonacciSequence;
    }

}
