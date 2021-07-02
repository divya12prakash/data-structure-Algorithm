package com.dp.q450.arrays;

import java.util.Arrays;

public class ThreeSum {

    /**
     * Two pointer approach. This requires the array to be sorted.
     * We start the first loop and fix the first element. Start with two
     * pointers and find the sum of all the three values. IF the given sum
     * is less than the required sum then increment left pointer else
     * decrement right pointer. If there is a match, we have the solution there.
     */


    public boolean twoPointer(int[] arr, int sum) {

        Arrays.sort(arr);
        for(int firstIndex = 0; firstIndex < arr.length - 2; firstIndex++) {

            int l = firstIndex + 1;
            int r = arr.length - 1;

            while (l <= r) {
                if(sum == arr[firstIndex] + arr[l] + arr[r]) return true;

                if(sum > arr[firstIndex] + arr[l] + arr[r]) l++;
                else r--;
            }
        }
        return false;
    }
}
