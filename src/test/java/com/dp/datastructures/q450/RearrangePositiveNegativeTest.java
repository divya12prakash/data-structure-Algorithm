package com.dp.datastructures.q450;

import com.dp.q450.arrays.RearrangePositiveNegative;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RearrangePositiveNegativeTest {

    int[] input = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

    @Test
    public void test(){
        RearrangePositiveNegative r = new RearrangePositiveNegative();

        System.out.println(Arrays.toString(r.rearrange(input)));
    }
}
