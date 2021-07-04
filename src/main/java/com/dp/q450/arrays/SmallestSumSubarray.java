package com.dp.q450.arrays;

public class SmallestSumSubarray {


    public int getSubArray(int[] array, int givenSum) {

        int length = Integer.MAX_VALUE;

        int sum = 0;

        int left = 0;


        for(int right = 0; right < array.length; right++) {
            sum += array[right];


            while(sum > givenSum && left <=right){

                length = Math.min(length, right - left + 1);

                sum -= array[left];

                left++;
            }
        }

        return length;
    }
}
