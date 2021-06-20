package com.dp.datastructures.q450;

import com.dp.q450.arrays.FindDuplicatesInArray;
import org.junit.jupiter.api.Test;

public class FindDuplicatesTest {

    int[] input =  {1, 2, 3, 6, 3, 6, 1};

    @Test
            public void test() {
        FindDuplicatesInArray f = new FindDuplicatesInArray();

        System.out.println(f.findDups(input));
    }
}
