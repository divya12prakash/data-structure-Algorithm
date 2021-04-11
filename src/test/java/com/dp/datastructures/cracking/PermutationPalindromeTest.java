package com.dp.datastructures.cracking;

import com.dp.crackingthecoding.arrays.PermutationPalindrome;
import org.junit.jupiter.api.Test;

public class PermutationPalindromeTest {

    PermutationPalindrome pp = new PermutationPalindrome();

    String input = "malayalam";
    String input2 = "asderff";

    @Test
    public void testPalin(){

        System.out.println(pp.check(input2));

    }
}
