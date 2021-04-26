package com.dp.datastructures;

import com.dp.basicalgorithms.binarysearch.SmallestInRotatedArray;
import org.junit.jupiter.api.Test;

public class SmallestInRotatedArrayTest {


    int[] input  = { 2, 3, 4, 5, 6, 7, 0, 1 };

    SmallestInRotatedArray sm = new SmallestInRotatedArray();


    @Test
    public void findSmallest() {
        sm.findSmallestIndex(input);
    }
}
