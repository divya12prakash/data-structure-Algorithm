package com.dp.datastructures.q450;

import com.dp.q450.arrays.ThreeWayPartitioning;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ThreewayPatitioningTest {

    int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32,10,11,12};


    @Test
    public void test() {
        ThreeWayPartitioning t = new ThreeWayPartitioning();

        System.out.println(Arrays.toString(t.threeWayNeedsDebug(arr, 10,20)));
        System.out.println(Arrays.toString(t.threeWay(arr, 10,20)));
    }
}
