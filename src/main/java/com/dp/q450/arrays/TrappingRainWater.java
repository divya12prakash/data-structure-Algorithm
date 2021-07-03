package com.dp.q450.arrays;

public class TrappingRainWater {


    /**
     * the concept is to find the max to the left and max to the right
     * of a given index. Once we find these values, take the value that is minimum of these two
     * the resultant water would be the difference between the value and the arr[i]
     * Time complexity O(n2)
     */
    public int tappingWater(int[] arr) {

        int totalVolume = 0;


        for(int index=1; index < arr.length - 1; index++) {

            int left = arr[index];

            for( int j=0; j < index; j++){
                if(arr[j] > left) left = arr[j];
            }

            int right = arr[index];

            for( int j= index+1; j < arr.length; j++){
                if(arr[j] > right) right = arr[j];
            }

            totalVolume += (Math.min(left, right) - arr[index]);

        }

        return totalVolume;


    }
}
