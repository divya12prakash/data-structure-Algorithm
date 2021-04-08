package com.dp.crackingthecoding.arrays;

/**
 * Exercise 1.1 find unique characters in a string
 */
public class UniqueCharacters {


    /**
     * do not use O(N2)
     * @param input
     * @return
     */
    public boolean bruteForce(String input){
        char[] chars = new char[input.length()];

        for(int i=0; i<input.length(); i++){
            chars[i] = input.charAt(i);
        }
        for(int i=0; i< chars.length; i++){
            for(int j=i+1; j < chars.length; j++){
                if(chars[i] == chars[j]) return false;
            }
        }
        return true;
    }



}
