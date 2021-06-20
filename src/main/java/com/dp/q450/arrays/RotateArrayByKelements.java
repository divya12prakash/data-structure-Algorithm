package com.dp.q450.arrays;

public class RotateArrayByKelements {

    /**
     * To rotate an array by K elements, reverse the array first
     * then reverse the K elements at the front
     * Reverse rest of the elements
     */

    public void rotateArrayByK(int[] input, int k){

        reverseArray(input, 0,input.length - 1);
        reverseArray(input, 0, k);
        reverseArray(input, input.length - k - 1, input.length - 1);


    }

    private void reverseArray(int[] input, int l, int r) {
        int start = l;
        int end = r;

        while(start <= end){
            input[start] = input[start] ^ input[end] ^ (input[end] = input[start]);
            start++;
            end--;
        }
    }
}
