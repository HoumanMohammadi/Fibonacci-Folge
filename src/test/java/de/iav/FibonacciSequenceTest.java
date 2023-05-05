package de.iav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciSequenceTest {

    @Test

    public void ifInputEqualsFive_ThenOutputIs_01123(){
        //given
        int FibonacciIndex=5;
        //when
        int[] fibonacciSequence=FibonacciSequence.createFibonacciSequence(FibonacciIndex);
        int [] expectedSequence= new int[]{0, 1, 1, 2, 3};
        //then
        Assertions.assertArrayEquals(fibonacciSequence,expectedSequence);

    }
}