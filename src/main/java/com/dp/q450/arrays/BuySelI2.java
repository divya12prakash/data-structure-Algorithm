package com.dp.q450.arrays;

public class BuySelI2 {


    /**
     * Get maximum profit by buying and selling stocks
     * on different days. The approach being used is valley- peak approach.
     * We create a variable as profit and compare every element with previous element
     * If there is peak between current and previous then we are making
     * profit else do not add to the profit.
     */


    public int getMaxProfit(int arr[]) {
        int maxProfit = 0;

        for(int i=1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) maxProfit += arr[i];
        }

        return maxProfit;
    }
}
