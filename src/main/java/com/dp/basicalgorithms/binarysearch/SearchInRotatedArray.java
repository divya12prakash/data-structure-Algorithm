package com.dp.basicalgorithms.binarysearch;


public class SearchInRotatedArray {

    /**
     * There are two parts, locate and binary search.
     * Under the locate logic, check if the left or the right side is sorted.
     * When you find a sorted half, perform a binary search to see if you can
     * find the value or keep recursing.
     * {5,6,7,1,2,3,4} and target is {6}
     */

    public int locate(int[] array, int low, int high, int target) {

        int mid = low + (high - low) / 2;
        int center = array[mid];

        if(low > high) return  -1;

        if (center == target) return mid;

        // Left side of the array is sorted
        if (array[0] <= center) {
            if (array[0] <= target && target <= center) {
                return binarySearch(array, low, mid - 1, target);
            }
            return locate(array,mid + 1, high, target);
        }

        //Right side of the array is sorted
        if(center < array[high]){
            if(array[mid] <=target && target <= array[high]) {
               return binarySearch(array, mid + 1 , high, target);
            }
            else {
                return locate(array, low, mid - 1, target);
            }
        }

        return -1;


    }

    /**
     * Binary search recursive implementation
     * @param arr
     * @param low
     * @param high
     * @param target
     * @return
     */
    private int binarySearch(int[] arr, int low, int high, int target) {
        if(low <=high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) return mid;
            if (target < arr[mid]) return binarySearch(arr, low, mid - 1, target);
            return binarySearch(arr, mid + 1, high, target);
        }
        return -1;
    }

}
