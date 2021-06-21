package com.dp.q450.arrays;

public class MergeTwoSortedArrays {


    public int[] merge(int[] arr1, int[] arr2) {

        int[] output = new int[arr1.length + arr2.length];
        int firstPointer = arr1.length;
        int secondPointer = arr2.length;

        int i = 0, j = 0, k = 0;

        while (i < firstPointer && j < secondPointer) {
            output[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }

        while(i < firstPointer){
            output[k++] = arr1[i++];
        }

        while ( j < secondPointer) {
            output[k++] = arr2[j++];
        }

        return output;
    }
}
