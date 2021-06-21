package com.dp.q450.arrays;

public class MinJumps {

    public int minJumps(int[] arr) {

        if(arr.length <= 1) return 0;
        if(arr[0] == 0) return -1;

        int maxSoFar = arr[0];
        int steps = arr[0];
        int jumps = 1;


        for(int i=0; i< arr.length; i++) {
            if(i == arr.length - 1) return jumps;

            maxSoFar = Math.max(maxSoFar, i + arr[i]);

            steps--;

            if(steps == 0 ) {
                jumps++;
                if(i> maxSoFar) return -1;
                steps = maxSoFar - i;
            }
        }
        return jumps;

    }
}
