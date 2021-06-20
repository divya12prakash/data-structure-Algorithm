package com.dp.datastructures.q450;

import com.dp.q450.arrays.ContiguousArraySum;
import org.junit.jupiter.api.Test;

public class ContiguousSumTest {

    int[] input = {-2,-3,4,-1,-2,1,5,-3};
    int[] input1 = {-2,1,2,3};

    @Test
    public void test(){
        ContiguousArraySum c = new ContiguousArraySum();
        System.out.println(c.contiguousSum(input1));
        System.out.println(c.contiguousSum(input));
    }
}
