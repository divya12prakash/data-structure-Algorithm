package com.dp.q450.arrays;

public class CountInversion {

    public int bruteForce(int[] input){
        int count = 0;

        for(int i=0; i< input.length - 1; i++) {
            for(int j=i+1; j< input.length; j++) {
                if(input[i] > input[j]) count++;
            }
        }
        return count;
    }
}
