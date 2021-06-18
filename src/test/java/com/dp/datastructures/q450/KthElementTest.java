package com.dp.datastructures.q450;

import com.dp.q450.arrays.KthElement;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class KthElementTest {

    int[] input = {1,4,5,6,8,2,3,0,9};

    KthElement kthElement = new KthElement();

    @Test
    public void testKthElement(){
        final var element = kthElement.kthElement(input, 4);
        System.out.println(element);

    }
}
