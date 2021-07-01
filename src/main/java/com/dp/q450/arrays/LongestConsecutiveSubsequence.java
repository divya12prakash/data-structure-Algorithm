package com.dp.q450.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {


    /**
     * This solution uses extra space. Store all the element of the array in hashset.
     * Iterate through the elements of the array and check if the next sequence is
     * present in the hashset. Update the answer accordingly based on the
     * longest sequence that is received as answer
     */

    public int longestConSeq(int[] arr){

        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for(int index = 0; index < arr.length; index++) set.add(arr[index]);

        for(int index = 0; index < arr.length; index++) {
            if(!set.contains(arr[index] -1)) {

                int count = arr[index];

                while(set.contains(count)){
                    count++;
                }
                answer = Math.max(answer, count - arr[index]);
            }
        }

        return answer;
    }
}
