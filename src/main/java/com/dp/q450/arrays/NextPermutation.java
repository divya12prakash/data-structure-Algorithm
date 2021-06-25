package com.dp.q450.arrays;


/**
 * The problem can be divided into following logical steps
 * 1. Find the first number from the end where you
 * observe the sequence decreased. This is the point
 * where we need to make a change of digit.
 * 2. Now find the next largest number in the previously scanned
 * numbers to replace them
 * 3. Rearrange rest of the numbers in decreasing order
 * 4. Third requirement if there is no point where there was a decrement
 * then return the smallest value to be returned which would be
 * after reversing the array.
 * [1,2,6,5,3,8] ->
 */
public class NextPermutation {


    public int[] nextPerm(int[] arr) {
        int i = arr.length - 2;

        //loop till the point arr[i] is greater than the other element, the moment the value is less, break the loop
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = arr.length - 1;
            while (j >= 0 && arr[j] <= arr[i]) j--;
            swap(arr, i, j);
        }
        reverse(arr, i + 1);
        return arr;
    }


    private void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
    }

    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }

    }
}
