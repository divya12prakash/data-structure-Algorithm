package com.dp.q450.twoDArray;

public class FindRowWithMax1s {


    /**
     * Binary search to find the 1 in each row and update the maximum
     * variable
     */

    public int max1s(int[][] array, int row, int col) {

        int maxRowIndex = -1;
        int maxIndexForSpecificRow = 0;


        for (int index = 0; index < row; index++) {

            int latestIndex = search(array[index], 0, col - 1);

            if(latestIndex != -1 && col - latestIndex > maxIndexForSpecificRow) {
                maxIndexForSpecificRow = col - latestIndex;
                maxRowIndex = index;
            }
        }


        return maxRowIndex;
    }

    private int search(int[] ints, int low, int high) {


        if(low > high) return -1 ;

        int mid = low + (high - low) / 2 ;

        if( ints[mid] == 1 && ints[mid - 1] == 0) return mid;

        else if( ints[mid] == 0) return search(ints, mid+1, high);

        else return search(ints, low, mid - 1);

    }
}

