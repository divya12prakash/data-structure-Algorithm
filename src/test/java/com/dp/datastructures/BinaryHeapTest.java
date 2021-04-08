package com.dp.datastructures;

import com.dp.coredatastructures.BinaryHeap;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;


@SpringBootTest
public class BinaryHeapTest {

    @Test
    void testHeap() {

        var list = new ArrayList<>();
        list.add(0,1);
        list.add(1,4);
        list.add(2,3);
        list.add(3,5);
        list.add(4,7);
        list.add(5,2);
        list.add(6,1);
        list.add(7,8);

        BinaryHeap binaryHeap = new BinaryHeap(list);

    }
}
