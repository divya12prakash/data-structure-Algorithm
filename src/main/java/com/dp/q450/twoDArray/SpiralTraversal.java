package com.dp.q450.twoDArray;

public class SpiralTraversal {

    /*
    The idea is to traverse in different directions and move on to the next one
     */

    public void spiralTraversal(int[][] array, int row, int col) {

        int left = 0; //row index
        int top = 0; //column index


        while(left < row && top < col) {

            // Print the elements from left to right

            for(int index = top; index < row; index++) {
                System.out.println(array[left][index]);
            }

            left++;

            for(int index = left; index < col; index++) {
                System.out.println(array[index][col - 1]);
            }

            col--;

            if(left < row) {
                for (int index = col - 1; index >= top; index--){
                    System.out.println(array[row - 1][index]);
                }
                row -- ;
            }

            if(top < col) {
                for(int index = row - 1; index >= left; index--){
                    System.out.println(array[index][left]);
                }
                top++;
            }

        }



    }
}
