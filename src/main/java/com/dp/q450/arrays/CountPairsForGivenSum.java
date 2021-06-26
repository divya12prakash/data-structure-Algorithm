package com.dp.q450.arrays;

import java.util.HashMap;

public class CountPairsForGivenSum {

    public int countPairs(int[] input, int sum) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;

        for(int i=0; i < input.length; i++) {
            if(hashMap.containsKey(sum - input[i])){
                count++;
                hashMap.put(input[i], 0);
            } else hashMap.put(input[i], 0);
        }

        return count;
    }
}
