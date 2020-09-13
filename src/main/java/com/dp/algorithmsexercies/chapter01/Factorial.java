package com.dp.algorithmsexercies.chapter01;

public class Factorial {


    public static int factorial(int number) {

        if (number == 1) return 1;

        return factorial(number - 1) * number;
    }
}
