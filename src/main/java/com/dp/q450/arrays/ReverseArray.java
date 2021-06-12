package com.dp.q450.arrays;

public class ReverseArray {


    public void reverse(int[] array){

        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int temp;
            temp = array[low];
            array[low] = array[high];
            array[high] = temp;

            low++;
            high--;
        }
    }
}
