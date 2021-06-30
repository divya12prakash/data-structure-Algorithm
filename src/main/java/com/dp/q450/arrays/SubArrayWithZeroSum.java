package com.dp.q450.arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {


    /**
     * use hashing to find the answer. there would be three conditions
     * 1. Check if an element itself is zero
     * 2. Check if the sum is repeated in the given ds
     * 3. check if the intermediate sum that got calculated was zero
     * @param input
     * @return
     */
    public boolean zeroSumSubArray(int[] input) {

        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for ( int index = 0; index < input.length; index++) {

            sum += input[index];

            if(input[index] == 0 || sum == 0 || set.contains(sum)) return true;
            else set.add(sum);
        }

        return false;

    }
}
