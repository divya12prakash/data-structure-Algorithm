package com.dp.datastructures.q450;

import com.dp.q450.arrays.CountInversion;
import org.junit.jupiter.api.Test;

public class CountInversionTest {

    int[] input = {1,20,6,4,5};
    CountInversion ci = new CountInversion();

    @Test
    public void testBruteForce() {
        System.out.println(ci.bruteForce(input));
        int[] aux_array = new int[input.length];

        System.out.println(ci.mergeSortMethod(input, aux_array,0, input.length - 1));
    }
}
