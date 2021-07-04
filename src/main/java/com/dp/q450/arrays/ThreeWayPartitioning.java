package com.dp.q450.arrays;

public class ThreeWayPartitioning {

    /**
     * My idea is find out the values in the range and push to left or right
     * or keep at the same position till end of the array
     */


    public int[] threeWayNeedsDebug(int[] array, int start, int end) {

        int left = 0;
        int mid = 0;
        int right = array.length - 1;

        while(left <= right) {

            if(array[left] < start) left++;

            else if(array[right] > end) right --;

            else if(array[left] > start ){
                array[left] = array[left] ^ array[mid] ^ (array[mid] = array[left]);
                left++;
            }

            else if (array[right] < end ){
                array[right] = array[right] ^ array[mid] ^ (array[mid] = array[right]);
                right--;
            }

        }

        return array;
    }


    public int[] threeWay(int[] array, int start, int end) {
        int low = 0;
        int high  = array.length - 1;


        for(int index = 0; index < array.length - 1 ; index++) {

            if(array[index] < start) {
                array[low]  = array[low] ^ array[index] ^ (array[index] = array[low]);
                low++;
            }

            else if(array[index] > end) {
                array[high] = array[index] ^ array[high] ^ (array[high] = array[index]);
                end--;
                index--;
            }

        }


        return array;

    }
}
