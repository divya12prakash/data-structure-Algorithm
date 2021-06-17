package com.dp.datastructures.q450;

import com.dp.q450.arrays.MaxMinOfArray;
import org.junit.jupiter.api.Test;

public class MaxMinArrayTEst {

    int[] input = {1,4,5,6,8,2,3,0,9};
    MaxMinOfArray maxMinOfArray = new MaxMinOfArray();

    @Test
    public void test_max_min(){
        MaxMinOfArray.Pair pair = maxMinOfArray.max_min_brute_force(input);
        System.out.println(pair);
    }

    @Test
    public void test_max_min_grpoup(){
        MaxMinOfArray.Pair pair = maxMinOfArray.max_min_groupCompare(input);
        System.out.println(pair);
    }
}
