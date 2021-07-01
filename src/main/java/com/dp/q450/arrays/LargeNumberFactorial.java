package com.dp.q450.arrays;

public class LargeNumberFactorial {

    /**
     * Factorial is calculated based on simple school mathematics
     * Take an array/linkedList. Linked list saves memory since we do not know the size of
     * the result. In the logic, multiply and keep taking the carry forward.
     * Keep updating the size while the carry value is increasing.
     */


    public int[] findFactorial(int num) {
        int res[] = new int[500];

        res[0] = 1;
        int resSize = 1;

        for(int i=2; i< num; i++) {
            resSize = multiply(res, i, resSize);
        }

        return res;
    }

    private int  multiply(int[] res, int value, int resSize) {

        int carry = 0;

        for( int i=0; i < resSize; i++) {
            int product = res[i] * value + carry;
            res[i] = product % 10;
            carry = product / 10;
        }

        while(carry != 0) {
            res[resSize] = carry %10;
            carry = carry / 10;
            resSize++;
        }

        return resSize;
    }
}
