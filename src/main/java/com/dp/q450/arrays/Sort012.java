package com.dp.q450.arrays;

public class Sort012 {

    public int[] sort(int[] input) {

        //Create three indexes. the first two start with zero
        // and the third one remains at the end

        int start = 0;
        int mid = 0;
        int end = input.length - 1;

        while(mid <= end){

            if(input[mid] == 0){
                int temp = input[start];
                input[start] = input[mid];
                input[mid] = temp;
                start++;
                mid++;
            }

            else if(input[mid] == 2){
                int temp = input[end];
                input[end] = input[mid];
                input[mid] = temp;
                end--;
            }else mid++;
        }
        return input;
    }


}
