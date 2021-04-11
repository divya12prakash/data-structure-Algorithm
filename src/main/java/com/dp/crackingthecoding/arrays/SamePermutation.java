package com.dp.crackingthecoding.arrays;

import java.util.Arrays;

public class SamePermutation {


    public boolean sortArrays(String input1, String input2) {
        char[] ch1 = input1.toCharArray();
        char[] ch2 = input2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i=0; i< ch2.length; i++) {
            if(ch1[i] != ch2[i]) return false;
        }
        return true;
    }


    public boolean extraSpace(String input1, String input2) {

        if(input1.length() != input2.length()) return false;

        int[] letters = new int[128];

        for (int i=0; i< input1.length(); i++) {
            letters[input1.charAt(i)]++;
        }

        for (int j=0; j< input2.length(); j++) {
            letters[input2.charAt(j)]--;

            if(letters[input2.charAt(j)]< 0) return false;
        }

        return true;

    }
}
