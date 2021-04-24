package com.dp.datastructures;

import com.dp.basicalgorithms.MergeSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {

    MergeSort mergeSort = new MergeSort(8);

    int arr[] = {2,6,5,8,3,4,1,9};

    @Test
    public void test_sorting(){
        mergeSort.mergeSor(arr, 0, 7);

        Arrays.stream(arr).forEach(System.out::println);

    }
}
