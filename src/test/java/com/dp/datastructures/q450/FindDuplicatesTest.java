package com.dp.datastructures.q450;

import com.dp.q450.arrays.FindDuplicatesInArray;
import org.junit.jupiter.api.Test;

public class FindDuplicatesTest {

    int[] input = {1, 2, 3, 6, 3, 6, 1};

    int[] inputFld = {1,2,3,3};

    FindDuplicatesInArray f = new FindDuplicatesInArray();


    @Test
    public void test() {
        System.out.println(f.findDups(input));
    }


    @Test
    public void testFloys() {

        System.out.println(f.floydsAlgo(inputFld));

    }
}
