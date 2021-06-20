package com.dp.datastructures.q450;

import com.dp.q450.arrays.RotateArrayByKelements;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RotateArrayByKelementsTest {

    int[] input = {1,2,3,4,5,6,7,8};

    @Test
    public void test(){
        RotateArrayByKelements r = new RotateArrayByKelements();
        r.rotateArrayByK(input, 3);
        System.out.println(Arrays.toString(input));
    }
}
