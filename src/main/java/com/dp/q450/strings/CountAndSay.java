package com.dp.q450.strings;

public class CountAndSay {

    /*
    You have to find the nth sequence for the count.
     */

    public String countAndSay(int n) {

        int i = 1;

        String output = "1";


        /*
        every number, check every digit and count the number of digits.
        Then put the count and the digit together
         */

        while (i < n) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < n; j++) {
                if (output.charAt(j) == output.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(output.charAt(j - 1));
                    count = 1;
                }
            }

            sb.append(count);
            sb.append(output.charAt(output.length() - 1));
            output = sb.toString();
            i++;
        }

        return output;

    }
}
