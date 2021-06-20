package com.dp.q450.arrays;

public class CanJump {

    /**
     * We need to check if we can reach the end of array with
     * the number of steps defined in the array inputs.
     * The concept here is, you start moving thru the array,
     * check for every possible number of steps you can take. IF you reach a point where
     * you cannot go forward, it is false else you can jump
     * thru to the end of array
     *
     * @param input
     * @return
     * https://www.youtube.com/watch?v=muDPTDrpS28
     */
    public boolean canJump(int[] input) {

        int length = input.length;
        int reachable = 0;

        for(int i=0; i < length; i++) {

            if(reachable < i) return false;
            else reachable = Math.max(reachable, i + input[i]);
        }
        return true;


    }
}
