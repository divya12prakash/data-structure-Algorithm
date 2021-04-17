package com.dp.datastructures.cracking;

import com.dp.crackingthecoding.arrays.OneAway;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class OneAwayTest {

    String i1 = "pack";
    String i2 = "dbck";

    OneAway oneAway = new OneAway();


    int[][] input = {{1,2,3},{4,5,6},{7,8,9}};



    @Test
    public void  rotate(){
        for(int i=0; i< input[0].length; i++){
            System.out.print(input[0][i]);
        }
    }

    @Test
    public void testSameLength(){
        System.out.println(oneAway.oneAway(i1, i2));
    }
}
