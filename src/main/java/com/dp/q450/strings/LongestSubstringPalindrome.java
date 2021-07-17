package com.dp.q450.strings;


/*
This will have two cases, one for the odd length and one for even length
Now,
 */
public class LongestSubstringPalindrome {


    public String longestSubPalin(String input) {

        if(input == null || input.length() == 0) return "";

        int start = 0;
        int end = 0;

        for (int index = 0; index < input.length(); index++) {
            int l1 = maxLengthPalindrome(input, index, index);
            int l2 = maxLengthPalindrome(input, index, index+1);

            int l = Math.max(l1, l2);

            if(l > end - start) {
                start = index - ((l - 1)/2);
                end  = index + (l/2);
            }
        }

        return input.substring(start, end + 1);


    }

    private int maxLengthPalindrome(String s, int start, int end) {
        if (s == null || s.length() == 0) return 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start + 1;
    }
}
