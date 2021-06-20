package com.dp.q450.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {

    public List<Integer> findDups(int[] inputs) {
        List<Integer> output = new ArrayList<>();

        for (int i=0; i < inputs.length; i++) {
            int j = Math.abs(inputs[i]);

            if(inputs[j] > 0) inputs[j] = -inputs[j];
            else output.add(Math.abs(inputs[j]));
        }

        return output;
    }


    /**
     * Using Floyd's algorithm. You start with fast and slow pointers
     * Detect the first position where the two intersect. Get rid of the fast
     * pointer there.
     * Next step is to start with another slow pointer from the beginning
     * Move both slow pointers and find the position where they will
     * intersect next.
     */


    public int floydsAlgo(int[] input) {
        int fast = input[input[0]];
        int slow = input[0];


        while(slow != fast) {
            slow = input[slow];
            fast = input[input[fast]];
        }

        fast = 0;

        while(slow != fast) {
            slow = input[slow];
            fast = input[fast];
        }

        return slow;
    }

}
