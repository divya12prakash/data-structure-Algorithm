package com.dp.q450.arrays;

import java.util.Arrays;

/**
 * We increase/decrease each element of the array. Sort the array first.
 * Increase the first index and decerase the second index. Then find the difference of two.
 * Replace the result if the difference is lesser during the loop
 */
public class MinimizeHeights {


    public int minimzHeights(int[] input, int k) {

        Arrays.sort(input);
        int minHeight = input[input.length - 1] - input[0];

        int smallest = input[0] + k;
        int largest = input[input.length - 1] - k;

        int min, max;


        for(int i = 0; i< input.length; i++) {
            min = Math.min(smallest, input[i+1] - k);
            max = Math.max(largest, input[i] + k);

            if(min < 0) continue;

            minHeight = Math.min(minHeight, max - min);
        }

        return minHeight;
    }
}
