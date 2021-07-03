package com.dp.datastructures.q450;

import com.dp.q450.arrays.TrappingRainWater;
import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {

    int[] input = {3,0,0,2,0,4};


    @Test
    public void test(){
        TrappingRainWater t = new TrappingRainWater();

        System.out.println(t.tappingWater(input));
        System.out.println(t.getTrappedWater(input));
    }
}
