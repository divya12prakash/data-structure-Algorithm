package com.dp.q450.arrays;

public class MoveNegativesToOneSide {


    public int[] moveNegatives(int[] input){
        int start = 0;
        int end = input.length - 1;

        while(start <= end){
            if(input[start] < 0)start++;

            if(input[end] >= 0) end--;

            if(input[start] >= 0 && input[end] < 0){
                input[start] = input[start] ^ input[end] ^ (input[end] = input[start]);
                start++;
                end--;
            }
        }
        return input;
    }
}
