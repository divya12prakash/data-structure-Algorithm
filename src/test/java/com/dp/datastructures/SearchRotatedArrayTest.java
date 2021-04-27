package com.dp.datastructures;

import com.dp.basicalgorithms.binarysearch.SearchInRotatedArray;
import org.junit.jupiter.api.Test;

public class SearchRotatedArrayTest {

    SearchInRotatedArray search = new SearchInRotatedArray();

    int[] array = {5,6,7,1,2,3,4};


    @Test
    public void testSearch(){
        System.out.println(search.locate(array, 0, 6, 9));
    }
}
