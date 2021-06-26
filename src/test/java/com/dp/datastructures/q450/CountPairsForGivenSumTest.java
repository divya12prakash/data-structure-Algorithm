package com.dp.datastructures.q450;

import com.dp.q450.arrays.CountPairsForGivenSum;
import org.junit.jupiter.api.Test;

public class CountPairsForGivenSumTest {

    int[] input = {1, 5, 7, 1};
    int[] input1 = {1, 1, 1, 1};

    @Test
    public void testCountPairs(){
        CountPairsForGivenSum c = new CountPairsForGivenSum();

        System.out.println(c.countPairs(input, 6));
        System.out.println(c.countPairs(input1, 2));
    }
}
