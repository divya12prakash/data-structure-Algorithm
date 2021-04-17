package com.dp.crackingthecoding.arrays;

public class StringRotation {

    public boolean isRotation(String s1, String s2) {

        if(s1.length() != s2.length()) return false;

        return ((s1 + s2).contains(s2));
    }
}
