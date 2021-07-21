package com.dp.q450.strings;

public class AllSubsequencesOfString {

    /*
    Let us take an example of abcd. We will start with the element from first index i.e. b to the end (d).
    Let us rearrange all the elements within bcd and place it in an array.
    at the end we will add the first element which is 'a' here to the output of the permutation
    of above result array.

    b, c, d, bc, bd, cd, bcd. Then we add 'a' to this result to get the final result.
    ab, ac, ad, abc, abd, acd, abcd ====> total 16 subsequences

    https://www.youtube.com/watch?v=OZiTiLDZJ60
     */


    public int getSubsequence(String str, String[] output) {

        //base case
        if(str.length() == 0) {
            output[0] = "";
            return 1;
        }

        int smallerValue  = getSubsequence(str.substring(1),output);

        for(int index=0; index < smallerValue; index++) {
            output[index+smallerValue] = output[index] + str.charAt(0);
        }

        return 2*smallerValue;
    }
}
