package com.dp.q450.strings;

import java.util.Arrays;

public class ReverseString {


    public String reverseString(String input) {
        char[] inputChars = input.toCharArray();

        int i = 0;
        int j = inputChars.length -1 ;


        while (i < j) {
            char temp = inputChars[i];
            inputChars[i] = inputChars[j];
            inputChars[j] = temp;

            i++;
            j--;

        }

        return (inputChars.toString());
    }
}
