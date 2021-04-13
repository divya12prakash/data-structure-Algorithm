package com.dp.crackingthecoding.arrays;

public class OneAway {

    public boolean oneAway(String input1, String input2) {

            boolean isMatch = false;
            String s1 = input1.length() > input2.length() ? input2 : input1;
            String s2 = input2.length() > input1.length() ? input1 : input2;

            int index1 = 0;
            int index2 = 0;

            while(index1<s1.length() && index2< s2.length()){

                var b = input1.charAt(index1) != input2.charAt(index2);
                if(b && !isMatch){
                    isMatch = true;
                    index1++;
                } else if(isMatch && b) return false;
                else {
                    index1++;
                }
                index2++;
            }

        return true;
    }
}
