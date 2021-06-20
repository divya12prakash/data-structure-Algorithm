package com.dp.q450.arrays;

public class ContiguousArraySum {

    /**
     * The concept is to maintain two variables as always for max/min
     * kind of problems. start with the first element, and then check if the sum
     * is greater than the actual element. Save it in a variable, whichever is greater.
     * After the end of iteration, you get the max contiguous sum
     */

    public int contiguousSum(int[] input){
        int maxSoFar = input[0];
        int curr_max = input[0];

        for(int i=1; i< input.length; i++){
            curr_max = (input[i] > curr_max + input[i])? input[i] : curr_max + input[i];
            maxSoFar = Math.max(curr_max, maxSoFar);
        }

        return maxSoFar;
    }
}
