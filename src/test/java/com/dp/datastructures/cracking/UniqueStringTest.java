package com.dp.datastructures.cracking;

import com.dp.crackingthecoding.arrays.UniqueCharacters;
import org.junit.jupiter.api.Test;

public class UniqueStringTest {

    UniqueCharacters uniqueCharacters = new UniqueCharacters();

    @Test
    public void testBruteForce(){
        String input = "dasha";
        System.out.println(uniqueCharacters.bruteForce(input));
    }
}
