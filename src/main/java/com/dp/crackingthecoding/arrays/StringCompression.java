package com.dp.crackingthecoding.arrays;

public class StringCompression {

    public String countString(String input){

        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<input.length(); i++) {
            count++;
            if(i+1 >= input.length() || input.charAt(i) != input.charAt(i+1)){

                stringBuilder.append(input.charAt(i)).append(count);
                count = 0;
            }
        }
        return stringBuilder.toString();
    }
}
