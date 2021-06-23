package com.dp.datastructures.q450;

import com.dp.q450.arrays.NextPermutation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NextPermutationTest {

    int[] input = {0,1,2,5,3,3,0};

    NextPermutation np = new NextPermutation();


    @Test
    public void testPerm(){
        final var ints = np.nextPerm(input);
        System.out.println(Arrays.toString(ints));
    }
}
