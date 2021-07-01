package com.dp.datastructures.q450;

import com.dp.q450.arrays.LongestConsecutiveSubsequence;
import org.junit.jupiter.api.Test;

public class LongestConsecutiveSubsequenceTest {

    int arr[] = { 1, 9, 3, 10, 4, 20, 2 };


    LongestConsecutiveSubsequence l= new LongestConsecutiveSubsequence();


    @Test
    public void testSeq() {
        System.out.println(l.longestConSeq(arr));
    }
}
