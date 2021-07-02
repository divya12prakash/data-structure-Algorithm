package com.dp.datastructures.q450;

import com.dp.q450.arrays.ThreeSum;
import org.junit.jupiter.api.Test;

public class ThreeSumTest {


    int arr[] = {1, 4 ,45 ,8 ,10 };


    ThreeSum t = new ThreeSum();


    @Test
    public void test_TS() {
        System.out.println(t.hashingImplementation(arr, 13));
    }
}
