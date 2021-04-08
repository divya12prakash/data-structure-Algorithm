package com.dp.datastructures.cracking;

import com.dp.crackingthecoding.arrays.UniqueCharacters;
import org.junit.jupiter.api.Test;

public class UniqueStringTest {

    private UniqueCharacters uniqueCharacters = new UniqueCharacters();

    @Test
    public void testBruteForce(){
        String input = "dasha";
        System.out.println(uniqueCharacters.bruteForce(input));
    }


    @Test
    public void testsorted(){
        String input = "dash";
        System.out.println(uniqueCharacters.sortAndCompare(input));
    }

    @Test
    public void testExtraSpace(){
        String input = "dasha";
        System.out.println(uniqueCharacters.declareArray(input));
    }
}
