package com.dp.datastructures.q450;

import com.dp.q450.arrays.SubArrayWithZeroSum;
import org.junit.jupiter.api.Test;

public class SubArrayWithZeroSumTest {

    int[] input = {1,2,3,-1,1,5};

    @Test
    public void testSum(){
        SubArrayWithZeroSum s = new SubArrayWithZeroSum();
        System.out.println(s.zeroSumSubArray(input));
    }
}
