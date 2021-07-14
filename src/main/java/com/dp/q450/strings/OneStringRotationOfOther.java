package com.dp.q450.strings;

public class OneStringRotationOfOther {


    /*
    If one string is rotation of other, then second string will be a
    substring to the concatenation of first string to itself
     */


    public boolean checkStringRotation(String input1, String input2) {

        //the strings should be of same length

        return (input1.length() == input2.length() &&
                (input1 + input1).contains(input2));
    }
}

