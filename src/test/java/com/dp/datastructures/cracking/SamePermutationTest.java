package com.dp.datastructures.cracking;

import com.dp.crackingthecoding.arrays.SamePermutation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class SamePermutationTest {


    SamePermutation samePermutation = new SamePermutation();

    private String i1 = "asedfr";
    private String i2 = "rfdeas";
    private String i3 = "zfdeas";

    @Test
    public void sortArrays() {

        System.out.println(samePermutation.sortArrays(i1, i2));
        System.out.println(samePermutation.sortArrays(i1, i3));

    }
}
