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

    /**
     * DP approach. The logic is to store the max value from right side
     * and min value difference from left side. ultimately add the two
     * values in the new array to find the final maximum profit
     * The max profit will always be arr[n-1]
     */

    public int getProfitDP(int arr[]) {
        int[] dp = new int[arr.length];

        int n = arr.length;

        int max=arr[arr.length - 1], min = arr[0];

        for(int index = 0; index < arr.length; index++) dp[index] = 0;

        //Iterate from right to left to find maximum value from right side

        for(int i= n-1; i >=0; i--) {
            if(arr[i] > max) max = arr[i];
            dp[i] = Math.max(dp[i+1], max - arr[i]);
        }

        for(int i=1; i < n; i++) {
            if(min < arr[i]) min = arr[i];
            dp[i] = Math.max(dp[i-1], dp[i] + (arr[i] - min));
        }

        return dp[n-1];
    }
}
