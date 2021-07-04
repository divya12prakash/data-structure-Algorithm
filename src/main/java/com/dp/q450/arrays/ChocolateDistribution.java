package com.dp.q450.arrays;

import java.util.Arrays;

public class ChocolateDistribution {

    /**
     * The logic is to determine the minimum difference between the elements
     * We can sort the array and find the two elements that have minimum difference
     */


    private int minDiff(int[] array, int n, int k) {

        int minDifference = Integer.MAX_VALUE;

        Arrays.sort(array);

        for(int index = 0; index + k - 1 < n; index++) {
            int difference = array[index+k-1] - array[index];

            minDifference = Math.min(minDifference, difference);

        }

        return minDifference;
    }
}
