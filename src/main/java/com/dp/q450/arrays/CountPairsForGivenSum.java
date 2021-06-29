package com.dp.q450.arrays;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Not the right solution
 */
public class CountPairsForGivenSum {

    public int countPairs(int[] input, int sum) {

        HashSet< Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i< input.length; i++) {
          if(set.contains(sum - input[i])){
              count++;
              set.add(input[i]);
          }
          else set.add(input[i]);
        }
        return count;
    }
}
