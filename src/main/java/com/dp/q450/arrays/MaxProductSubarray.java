package com.dp.q450.arrays;

public class MaxProductSubarray {

    /**
     * This is kind of similar to Kadane's algo.
     * We maintain a variable and keep multiplying other elements.
     * Finally find the maximum of the values.
     *
     * Take special care of negative values since they can change the max
     * amount
     */


    public int getMAxProd(int[] arr) {
        int maxProduct = arr[0];
        int minProduct = arr[0];

        for(int index = 0; index <= arr.length; index++) {
            if(arr[index] < 0) maxProduct = maxProduct ^ minProduct ^ (minProduct = maxProduct);

            minProduct = Math.min(minProduct * arr[index], minProduct);
            maxProduct = Math.max(maxProduct * arr[index] , maxProduct);
        }

        return maxProduct;
    }
}
