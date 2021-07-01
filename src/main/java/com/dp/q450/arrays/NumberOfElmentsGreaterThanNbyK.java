package com.dp.q450.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfElmentsGreaterThanNbyK {


    public int elementGreaterThanNbyK(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();


        for(int index=0; index < arr.length; index++) {
            if(!map.containsKey(arr[index])) {
                map.put(arr[index], 1);
            } else map.put(arr[index], map.get(arr[index]) + 1);
        }

        int condition = arr.length / k ;

        int count = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > condition) count++;
        }

        return count;
    }
}
