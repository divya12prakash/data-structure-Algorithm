package com.dp.datastructures.q450;

import com.dp.q450.arrays.MoveNegativesToOneSide;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MoveNegativesTest {

    int[] input = {0,1,2,-1,2,-3,-4};

    @Test
    public void testLogic(){
        MoveNegativesToOneSide m = new MoveNegativesToOneSide();
        final var ints = m.moveNegatives(input);
        System.out.println(Arrays.toString(ints));
    }

}
