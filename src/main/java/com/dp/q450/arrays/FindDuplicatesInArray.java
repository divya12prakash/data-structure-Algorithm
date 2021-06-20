package com.dp.q450.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {

    public List<Integer> findDups(int[] inputs) {
        List<Integer> output = new ArrayList<>();

        for (int i=0; i < inputs.length; i++) {
            int j = Math.abs(inputs[i]);

            if(inputs[j] > 0) inputs[j] = -inputs[j];
            else output.add(Math.abs(inputs[j]));
        }

        return output;
    }

}
