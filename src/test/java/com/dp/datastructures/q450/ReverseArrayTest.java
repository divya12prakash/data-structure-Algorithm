package com.dp.datastructures.q450;

import com.dp.q450.arrays.ReverseArray;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ReverseArrayTest {

    @Test
    public void test_reverse(){
        int array[] = {1,2,3,4,5,6};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(array);
        Stream.of(array).forEach(System.out::println);

    }
}
