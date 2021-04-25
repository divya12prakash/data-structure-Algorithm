package com.dp.basicalgorithms.binarysearch;

public class SquareRoot {

    int answer;

    public int sqrt(int[] array, int number) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int mid = low + (high -low)/2;

            if(array[mid] * array[mid] == number){
                return array[mid];
            } else if( array[mid] * array[mid] > number ) high = mid - 1;
            else {
                answer = array[mid];
                low = mid + 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8};
        SquareRoot squareRoot = new SquareRoot();
        System.out.println(squareRoot.sqrt(input, 25));
    }

}
