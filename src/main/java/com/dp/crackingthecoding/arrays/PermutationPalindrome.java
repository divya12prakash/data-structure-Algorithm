package com.dp.crackingthecoding.arrays;

public class PermutationPalindrome {


    public boolean check(String input){


        int[] table = new int[26];
        char[] chars = input.toCharArray();

        for(int i=0; i< chars.length; i++) {
            table[chars[i] -'a'] += 1;
        }
        boolean isOdd = false;
        for(int j=0; j<table.length; j++){
            if(table[j] % 2 == 1){
                if(isOdd) return false;
                isOdd = true;
            }
        }

        return true;
    }

}
