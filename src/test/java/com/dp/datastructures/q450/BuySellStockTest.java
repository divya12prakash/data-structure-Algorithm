package com.dp.datastructures.q450;

import com.dp.q450.arrays.BuySellStock;
import org.junit.jupiter.api.Test;

public class BuySellStockTest {

    int[] input = {7,1,5,3,6,4};

    int[] input1 = {7,6,4,3,1};


    BuySellStock bss = new BuySellStock();


    @Test
    public void testMaxProfit() {
        System.out.println(bss.maxProfit(input));
        System.out.println(bss.maxProfit(input1));
    }
}
