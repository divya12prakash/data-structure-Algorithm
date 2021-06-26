package com.dp.q450.arrays;

public class BuySellStock {

    /**
     * Max profit is obtained by minimum price and max profit
     */

    public int maxProfit(int[] input) {

        int minPrice = input[0];
        int maxProfit = 0;


        for(int i=0; i < input.length - 1; i++) {
            if(minPrice > input[i]){
                minPrice = input[i];
            }

            maxProfit = Math.max(maxProfit, input[i] - minPrice);
        }

        return maxProfit;
    }
}
