package com.dp.datastructures.q450;

import com.dp.q450.arrays.MergeTwoSortedArrays;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeTwoSortedArraysTest {

    int[] i1 = {1,3,4,6};

    int[] i2 = {2,5,7,9};

    @Test
    public void merge_test() {
        MergeTwoSortedArrays m = new MergeTwoSortedArrays();

        final var merge = m.merge(i1, i2);
        System.out.println(Arrays.toString(merge));
    }
}
