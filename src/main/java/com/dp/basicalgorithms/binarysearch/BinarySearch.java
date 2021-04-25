package com.dp.basicalgorithms.binarysearch;



public class BinarySearch {

    public int findIndex(int[] searchArray, int element){
        int lowerIndex = 0;
        int higherIndex = searchArray.length -1;
        int mid = Math.round((lowerIndex + higherIndex)/2);
        boolean found = false;
        int iterations = 0;
        while(lowerIndex < higherIndex) {
            iterations += 1;
            if (element == searchArray[mid]) {
                found = true;
                break;
            }

            if (element > searchArray[mid]) {
                lowerIndex = mid + 1;
                mid = Math.round(lowerIndex + higherIndex) / 2;
            }

            if (element < searchArray[mid]) {
                higherIndex = mid - 1;
                mid = Math.round((higherIndex + lowerIndex) / 2);
            }
        }
        if(found) {
            System.out.println(iterations);
            return mid;
        }else return -1;
    }
}
