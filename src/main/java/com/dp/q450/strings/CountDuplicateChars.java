package com.dp.q450.strings;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChars {

    /*
    1. First method is to use an array of 256 charaters and increase the
    count every time a char is encountered. But this approach might use a lot of
    unutilized memory.
    2. We use a hash map to count the characters of the string
     */


    public void countDupChars(String input) {

        Map<Character, Integer> map = new HashMap<>();


        for(char character : input.toCharArray()) {
            if(!map.containsKey(character)) map.put(character, 1);
            else map.put(character, map.get(character) + 1);
        }


        map.keySet().iterator()
                .forEachRemaining(System.out::println);

    }
}
