package com.dp.datastructures.q450;

import com.dp.q450.arrays.NumberOfElmentsGreaterThanNbyK;
import org.junit.jupiter.api.Test;

public class NumberOfElmentsGreaterThanNbyKTest {


    int []a = new int[]{ 1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };
    NumberOfElmentsGreaterThanNbyK n = new NumberOfElmentsGreaterThanNbyK();


    @Test
    public void test(){
        System.out.println(n.elementGreaterThanNbyK(a, 4));
    }
}
