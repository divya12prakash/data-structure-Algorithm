package com.dp.datastructures.q450;

import com.dp.q450.arrays.Sort012;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Sort012Test {

    int[] input = {1,2,0,2,2,1,0,0,0,1};

    @Test
    public void test_sort(){
        Sort012 sort012 = new Sort012();
        sort012.sort(input);
        System.out.println(Arrays.toString(input));
    }
}
