package com.dp.datastructures.cracking;

import com.dp.crackingthecoding.arrays.OneAway;
import org.junit.jupiter.api.Test;

public class OneAwayTest {

    String i1 = "pack";
    String i2 = "dbck";

    OneAway oneAway = new OneAway();


    @Test
    public void testSameLength(){
        System.out.println(oneAway.oneAway(i1, i2));
    }
}
