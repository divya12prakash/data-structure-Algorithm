package com.dp.datastructures;

import com.dp.basicalgorithms.search.BinarySearch;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BinarySearchTest {

    @Test
    public void test_binarySearch() {

    BinarySearch binarySearch = new BinarySearch();

    int[] sample = {1, 2, 3, 4, 5, 6, 7, 8, 89, 90,91};

        System.out.println(binarySearch.findIndex(sample, 89));
}
}
