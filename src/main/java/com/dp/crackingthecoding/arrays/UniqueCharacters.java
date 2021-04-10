package com.dp.crackingthecoding.arrays;

import java.util.Arrays;

/**
 * Exercise 1.1 find if a string has all unique characters
 */
public class UniqueCharacters {


    /**
     * do not use O(N2)
     *
     * @param input
     * @return
     */
    public boolean bruteForce(String input) {
        char[] chars = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) return false;
            }
        }
        return true;
    }

    /**
     * nlogn complexity
     * @param input
     * @return
     */
    public boolean sortAndCompare(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) return false;
        }
        return true;
    }

    /**
     * O(N)
     * @param input
     * @return
     */
    public boolean declareArray(String input){

        int max = 256;

        boolean[] boo = new boolean[max];
        Arrays.fill(boo, false);

        for(int i=0; i < input.toCharArray().length ; i++){
            int index = input.charAt(i);
            if(!boo[index]) {
                boo[index] = true;
            } else {
                return false;
            }
        }

        return true;
    }




}
