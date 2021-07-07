package com.dp.q450.twoDArray;

public class SearchInSortedMatrix {

    /*
    It really is a simple binary search. The array can be thought of as
    a 1d array with all the sorted elements. Find the element in that sorted array
     */

    public boolean search(int[][] array, int m, int n, int element) {

        int low = 0;
        int high = (m*n - 1);

        while(low <=high) {

            int mid = low + (high - low)/2;

            if(element == array[mid/n][mid%n]) return true;

            if(array[mid/n][mid%n] > element) high = mid - 1;
            else low = mid + 1;
        }

        return false;
    }
}
